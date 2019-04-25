<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">



/*  {appid =} lang=35&lon=139*/
var key = "c467a51ad8b7075e645266c97d051df0";
var weatheruri = "http://api.openweathermap.org/data/2.5/forecast";
	$(document).ready(function() {
		$("#btn").on("click", function() {
			$.ajax(
			{
			url: weatheruri,
			type:"get",
			dataType:"json",
			data: {
				appid:key,
				id:"1835848",
				units:"metric",
				cnt:"5"
				
				
			},
			success:function(data) {
				console.log(data);
				console.log(data.list);
				console.log(data.list[0].main);
				var list = data.list;
				console.log(list);
			$.each(list, function(index, element) {
				console.log(element.main.temp);
				console.log(index);
				
				/* if(index == 0) {$(".box1").html(element.main.temp);}
				if(index == 1) {$(".box2").html(element.main.temp);}
				if(index == 2) {$(".box3").html(element.main.temp);}
				if(index == 3) {$(".box4").html(element.main.temp);}
				if(index == 4) {$(".box5").html(element.main.temp);} */
				
				
				
				
				
				
				
				
				
			});
			},
				
				
			
				
			
				
				
			}		
			
			)
			
			
			
			
			
		});
	});



</script>
<style>

html, body {
	width:100%;
	height:100%;
}

.box {
	display:flex;
	border : 1px solid black;
	height: 100%;
	
}

.box1, .box2, .box3, .box4, .box5 {
	display: flex;
	flex-grow: 1;
	text-align:center;
	
}

.box1, .box2, .box3, .box4 {
	border-right: 1px solid black;
}
</style>
</head>
<body>
		
		
		<div class = "box">
		
			<div class = "box1">1번</div>
			<div class = "box2">2번</div>
			<div class = "box3">3번</div>
			<div class = "box4">4번</div>
			<div class = "box5">5번</div>
			
		
		
		</div>
		<button id = "btn">버튼입니당!</button>
</body>
</html>