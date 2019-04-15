<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% response.setCharacterEncoding("UTF-8"); %>
<html>
<style type="text/css">
*[role="form"] {
    max-width: 530px;
    height :100%;
    padding: 15px;
    margin: 0 auto;
    border-radius: 0.3em;
    background-color: #f2f2f2;
}
body {
     
    background-size: cover;
    background-color: rgb(110, 104, 109);
}

*[role="form"] h2 { 
    font-family: 'Open Sans' , sans-serif;
    font-size: 40px;
    font-weight: 600;
    color: #000000;
    margin-top: 5%;
    text-align: center;
    text-transform: uppercase;
    letter-spacing: 4px;
}

.gg {
	border: 2px solid black;
}

</style>
<body>
<div class = "gg">
<jsp:include page="/common/Top.jsp"></jsp:include>
</div>

<jsp:include page="/common/Left.jsp"></jsp:include>
<div class="container">




            <form class="form-horizontal" role="form" action="Ex02_JDBC_Main.jsp">
                <h2>Registration</h2>
                
                <div class="form-group"  style = "padding:20px">
                    <label for="userid" class="col-sm-3 control-label">ID</label>
                    <div class="col-sm-9"|>
                        <input type="text" id="userid" placeholder="ID를 입력하세요" class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group"  style = "padding:20px">
                    <label for="pwd" class="col-sm-3 control-label">PWD</label>
                    <div class="col-sm-9">
                        <input type="password" id="pwd" placeholder="password를 입력해주세요" class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group" style = "padding:20px">
                    <label for="name" class="col-sm-3 control-label">이름 </label>
                    <div class="col-sm-9">
                        <input type="text" id="name" placeholder="이름을 입력하세요" class="form-control" name= "name">
                    </div>
                </div>
                <div class="form-group"  style = "padding:20px">
                    <label for="age" class="col-sm-3 control-label">나이</label>
                    <div class="col-sm-9">
                        <input type="text" id="age" placeholder="나이를 입력하세요" class="form-control">
                    </div>
                </div>
                <div class="form-group"  style = "padding:20px">
                    <label for="gender" class="col-sm-3 control-label">성별</label>
                    <div class="col-sm-9">
                    	남성<input type="radio" name="gender" id="gender">
                    	여성<input type="radio" name="gender" id="gender">
                    </div>
                </div>
                <div class="form-group"  style = "padding:20px">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <input type="email" id="email" class="form-control">
                    </div>
                </div>
                <div class="form-group"  style = "padding:20px">
                <button type="submit" class="btn btn-primary btn-block" style="width: 500px; height: 50px; text-align: center" >Register</button>
               </div>
            </form> <!-- /form -->
            
        </div> <!-- ./container -->
      </body>  
</html>