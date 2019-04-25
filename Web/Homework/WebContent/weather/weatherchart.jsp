<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Document</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- jquery ui -->
    <link
      rel="stylesheet"
      href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css"
    />
    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
    <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>

    <!-- jQuery UI 국제화 대응을 위한 라이브러리 (다국어) -->
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/i18n/jquery-ui-i18n.min.js"></script>

    <!-- datepicker 한국어로 -->
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/i18n/datepicker-ko.js"></script>

    <!-- chart -->
    <script src="https://code.highcharts.com/highcharts.js"></script>
    <script src="https://code.highcharts.com/modules/exporting.js"></script>
    <script src="https://code.highcharts.com/modules/export-data.js"></script>
    <style media="screen">
      body {
        background-color: #f5f5f5;
      }
      .in-line {
        width: 350px;
        height: 40px;
      }
      input {
        margin: 0;
      }
      input[type="text"] {
        width: 70%;
        height: 100%;
        border: none;
        font-size: 1em;
        padding-left: 5px;
        font-style: oblique;
        display: inline;
        outline: none;
        box-sizing: border-box;
        color: black;
      }
      input[type="submit"] {
        width: 30%;
        height: 100%;
        background-color: lightgray;
        border: none;
        background-color: white;
        font-size: 1em;
        color: #042aac;
        outline: none;
        display: inline;
        margin-left: -10px;
        box-sizing: border-box;
      }
      input[type="submit"]:hover {
        background-color: lightgray;
      }
      #chartdiv {
        width: 100%;
        height: 500px;
      }
    </style>
    <script type="text/javascript">
      $(function() {
        var chart = "<div id='container' style='min-width: 310px; height: 400px; margin: 0 auto'  ></div>"
        $.datepicker.setDefaults($.datepicker.regional["ko"]); //datepicker 한국어로 사용하기 위한 언어설정
        $("#date").datepicker({ dateFormat: "yymmdd" });

        $("#btn").click(function() {
          $('#chart').empty();
          var nameTemp = [];
          var cntTemp = [];
          var audiAcc = [];
    
          let flickerAPI =
            "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=6624eeed975e2734c6dd329911451502&";
          //tags=raccoon&tagmode=any&format=json&

          $.getJSON(
            flickerAPI,
            { targetDt: $("#date").val(), itemPerPage: 10 },
            function(data, textStatus, xhr) {
              var arr = data.boxOfficeResult.dailyBoxOfficeList;
              // console.log(arr);

              // $("#chart").empty(); //자식요소를 다비움
              $.each(arr, function(index, obj) {
            	  console.log(arr[index].movieNm);
                nameTemp.push(arr[index].movieNm);
                cntTemp.push(Number(arr[index].audiCnt));
                audiAcc.push(Number(arr[index].audiAcc));
              });
              
              
              $('#chart').html(chart);
              var data = [];
              for(var i = 0; i < 10; i++){
                data.push(nameTemp[i]);
                
                
              }

              
              
              Highcharts.chart("container", {
                chart: {
                  zoomType: "xy"
                },
                title: {
                  text: "영화 관객수"
                },
                subtitle: {
                  text: "뿅뿅"
                },
                xAxis: [
                  {
                    categories: nameTemp,
                    crosshair: true
                  }
                ],
                yAxis: [
                  {
                    // Primary yAxis
                    labels: {
                      format: "",
                      style: {
                        color: Highcharts.getOptions().colors[1]
                      }
                    },
                    title: {
                      text: "누적 관객 수(백만)",
                      style: {
                        color: Highcharts.getOptions().colors[1]
                      }
                    }
                  },
                  {
                    // Secondary yAxis
                    title: {
                      text: "당일 관객 수(천)",
                      style: {
                        color: Highcharts.getOptions().colors[0]
                      }
                    },
                    labels: {
                      format: "",
                      style: {
                        color: Highcharts.getOptions().colors[0]
                      }
                    },
                    opposite: true
                  }
                ],
                tooltip: {
                  shared: true
                },
                legend: {
                  layout: "vertical",
                  align: "left",
                  x: 120,
                  verticalAlign: "top",
                  y: 100,
                  floating: true,
                  backgroundColor:
                    (Highcharts.theme && Highcharts.theme.legendBackgroundColor) ||
                    "rgba(255,255,255,0.25)"
                },
                series: [
                  {
                    name: "당일 관객 수",
                    type: "column",
                    yAxis: 1,
                    data: cntTemp,
                    tooltip: {
                      valueSuffix: "명"
                    }
                  },
                  {
                    name: "누적 관객 수",
                    type: "spline",
                    data: audiAcc,
                    tooltip: {
                      valueSuffix: "명"
                    }
                  }
                ]
              });
            }
          );
        });

        
      });
    </script>
  </head>
  <body>
    <div id="chart">
    <!-- <div
      id="container"
      style="min-width: 310px; height: 400px; margin: 0 auto"
    ></div> -->
  </div>
    <br><br>
    
    <div class="in-line">
      <input type="text" name="name" value="" placeholder="yyymmdd" id="date" />
      <input type="submit" name="name" value="JOIN" id="btn" />
    </div>
  </body>
</html>