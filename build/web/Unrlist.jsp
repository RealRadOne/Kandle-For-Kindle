<%-- 
    Document   : Unrlist
    Created on : May 18, 2019, 3:59:53 PM
    Author     : Sakshi Sinha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Quiz"%>
<%@page import="Model.Question"%>
<%@page import="java.util.*"%>
<%@page import="java.time.LocalDateTime"%>
<html>
<head>
<style>	
span {
  display: block;
  font-size: 20px;
  color: white;
}

#days {
  font-size: 100px;
  color: #db4844;
}
#hours {
  font-size: 100px;
  color: #f07c22;
}
#minutes {
  font-size: 100px;
  color: #f6da74;
}
body{
  background-color: #37474F;
   background-image: url("Assets/qbak.jpg");
  /*overflow: scroll;*/
 }
.bg
{
    background:transparent;
    background-image: url("Assets/qbak.jpg");
    width:100%;
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
    width:400px;
    height:200px;
    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));
    grid-gap: 1rem;
    color: #ffffff;
    background:transparent;
    background-image: url("Assets/quizzo.jpg");
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
.left{dislpay:inline; float:left}
.img-fluid{
    max-width: 150px;
    height: auto;
}
</style>
       <link rel="stylesheet" href="css/akstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <script src="https://cdn.onesignal.com/sdks/OneSignalSDKWorker.js"></script>
        <script src="https://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,900,700italic,700,600italic,600,400italic"></script>
        <title>List</title>
</head>
<body>
   <div class="container-fluid bg-2 text-center">
        <div class="row">
       <div class="row">
           <div class="col-sm-12">
                 <h4 class="text-left" style=" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;">
                 Your Enrolled Konnects
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
   %>
   <div class="col-sm-6">
      <div class="row">
      <section class="card-container" style="margin-left: 100px;"> 
      <article class="card" style="padding-right: 60px;">
      <div class="row">
      <div class="col-sm-8">
      <h4 class="card-title"><%=QID%></h4>
      <p class="card-text"><%=QName%></p>
      <p class="card-text"><%=due%></p>
      <div id="timer">
      <div id="days"></div>
      <div id="hours"></div>
      </div>
      </div>
      <div class="col-sm-4">
      <img src="Assets/Quiz.png" class="img-fluid img-circle" alt="User">
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

