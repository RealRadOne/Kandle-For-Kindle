<%-- 
    Document   : Editlog
    Created on : May 12, 2019, 5:27:44 PM
    Author     : Sakshi Sinha
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Quiz"%>
<%@page import="Model.Question"%>
<%@page import="java.util.*"%>
<html>
<head>
<style>
body, html {
  height: 100%;
  margin: 0;
}
.bg {
  /* The image used */
   background-image: url("Assets/quizzo.jpg");

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
.bg-2 { 
    background-color: #000000; /* Dark Black */
    color: #ffffff;
}
.loginBox
{
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%,-50%);
  width: 350px;
  padding: 80px 40px;
  box-sizing: border-box;
  height: 500px;
  background: rgba(0,0,0,.6);
}
.user 
{
    width: 100px;
    height: 100px;
    border-radius: 50%;
    overflow: hidden;
    position: absolute;
    top: calc(-100px/2);
    left: calc(50% - 50px);
}
.loginBox p
{
  margin: 0;
  padding: 0;
  font-weight: bold;
  color: #fff;
}
.loginBox input
{
  width: 100%;
  margin-bottom: 20px;
}
.loginBox input[type="text"],
.loginBox input[type="Password"]
{
  border: none;
  border-bottom: 1px solid #fff;
  outline: none;
  height: 40px;
  background: transparent;
  color: #fff;
  font-size: 16px;
}
::placeholder
{
  color: rgba(255,255,255,.5);
}
.form-group label{
    font-family: 'Lato', sans-serif;
    font-weight: 900;
    font-size: 20px;
    color: #fff;
}
</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
    <%
        List<String>data=new ArrayList<String>();
        //String QID=(String)session.getAttribute("QuizID");
        data= (ArrayList<String>)session.getAttribute("QDat");
        String Ques=data.get(0);
        String Op1=data.get(1);
        String Op2=data.get(2);
        String Op3=data.get(3);
        String Op4=data.get(4);
        //String Ans=data.get(5);
        session.setAttribute("Question",Ques);
        //request.setAttribute("Question",Ques);
    %>
<div class="bg">
<div class="loginBox">
       <form action="Editprocess" method="GET" name="myForm">
       <div class="form-group">
       <label for="Option1">Option1:</label>
       <%=Op1%><input type="text" class="form-control" id="Option1" name="Option1">
       </div>
       <div class="form-group">
       <label for="BookName">Option2</label>
       <%=Op2%><input type="text" class="form-control" id="Option2" name="Option2">
       </div>
       <div class="form-group">
       <label for="Option3">Option3:</label>
       <%=Op3%><input type="text" class="form-control" id="Option3" name="Option3">
       </div>
       <div class="form-group">
       <label for="Option4">Option4</label>
       <%=Op4%><input type="text" class="form-control" id="Option4" name="Option4">
       </div>
       <a href="Konedit" class="btn btn-primary btn-lg">Back</a>
       <button class="btn btn-primary btn-lg" type="submit">Submit</button>
      </form>
</div>
</div>
</body>
</html>
