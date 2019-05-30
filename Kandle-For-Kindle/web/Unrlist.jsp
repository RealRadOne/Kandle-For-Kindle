<%-- 
    Document   : Unrlist
    Created on : May 18, 2019, 3:59:53 PM
    Author     : Sakshi Sinha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Quiz"%>
<%@page import="java.util.*"%>
<%@page import="java.time.LocalDateTime"%>
<html>
<head>
<style>	
.neon {
  font-family: neon;
  color: #FB4264;
  font-size: 9vw;
  line-height: 9vw;
  text-shadow: 0 0 3vw #F40A35;
}
.bg-2 { 
    background-color: #000000; /* Dark Black */
    color: #ffffff;
}
.card-img-top {
    width: 100%;
    height: 15vw;
    object-fit: cover;
}
.card-container {
    display: grid;
    padding: 1rem;
    width:800px;
    height:3 00px;
    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));
    grid-gap: 1rem;
    color: #ffffff;
    background:transparent;
    background-image: url("Assets/trial.jpeg");
    outline: 1px solid black;
    margin-bottom: 50px;
    margin-left: 50px;
    margin-right: 50px;
}
.container-fluid
{
    width:100%;
    height:150px;
    margin-bottom: 50px;
}
.card {
    display: grid;
}
.left
{
    dislpay:inline; 
    float:left
}
img {
  border-radius: 50%;
}
.card-title
{
 font-family: "Times", Times New Roman, serif;
 font-size: 30px;
 color:#FFFFFF;
 display: inline-block;
 clear: both;
 position: relative;
}
.sub-text
{
 font-size: 20px;
 color:#FFFFFF;
 display: inline-block;
 clear: both;
 position: relative;
}
.ml10 {
  position: relative;
  font-weight: 900;
  font-size: 4em;
</style>
       <link rel="stylesheet" href="css/akstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <script src="https://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,900,700italic,700,600italic,600,400italic"></script>
        <title>List</title>
</head>
<body background="Assets/leaderbak.jpg">
   <div class="container-fluid bg-2 text-center">
      <div class="row">
       <div class="row">
           <div class="col-sm-12">
                 <h4 class="text-left" style=" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;">
                     <h1 class="ml10">
                     Your Enrolled Konnects
                     <h1>
                 </h4>
           </div>
       </div>
   </div>
   </div>
        <%
            ArrayList<Quiz>qsk=(ArrayList<Quiz>)request.getAttribute("Konnects");
        %>
   <%
   for(Quiz qrk:qsk)
   {
   String QID=qrk.getQuizID();
   String QName=qrk.getQuizName();
   Date due=qrk.getDate();
   Date cur=new Date();
   long diff =  (due.getTime()-cur.getTime())/86400000;
   %>
   <div class="col-sm-12">
      <div class="row">
      <section class="card-container" style="margin-left: 100px;"> 
      <article class="card" style="padding-right: 60px;">
      <div class="row">
      <div class="col-sm-8">
          <h4 class="card-title"><%=QID%></h4><br>
          <p class="sub-text"><%=QName%></p>
          <p class="card-text">Days Remaining<br>  <div class="neon"> <%=diff%></div></p>
      <div id="timer">
      <div id="days"></div>
      <div id="hours"></div>
      </div>
      </div>
      <div class="col-sm-4">
      <img src="Assets/usmino.jpg" alt="Avatar"  style="width:200px" style="height:150px">
      </div>
      </div>
      </article>
      </section>
   </div>
   </div>
   <%
   }
   %>
</body>
</html>

