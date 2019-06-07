<%-- 
    Document   : Konnects
    Created on : May 3, 2019, 11:20:34 AM
    Author     : Sakshi Sinha
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Quiz"%>
<%@page import="Model.Question"%>
<%@page import="java.util.*"%>
<html>
<style>
body{
  background-color: #37474F;
  /*overflow: scroll;*/
 }
.bg-2 { 
    background-color: #000000; /* Dark Black */
    color: #ffffff;
}
.bg-3
{
    background-image: "Assets/leaderbak.jpg";
}
.card-img-top {
    width: 100%;
    height: 15vw;
    object-fit: cover;
}
.card-container {
    display: grid;
    padding: 1rem;
    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));
    grid-gap: 1rem;
    color: #ffffff;
    background:transparent;
    background-image: url("Assets/quizzo.jpg");
    outline: 1px solid black;
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
.ml10 {
  position: relative;
  font-weight: 900;
  font-size: 4em;

</style>
 <head>
        <link rel="stylesheet" href="css/akstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>List</title>
<script>
function output()
{
$.ajax({
   url:'Enroll',
   data:{name:'abc'},
   type:get,
   success:function(){
       alert('Data sent');
   },
   error:function(data){
       alert('error');
       $('#somediv').text(responseText); 
   }    
});
};
</script>
 </head>
   <body background="Assets/leaderbak.jpg">
    <div class="container-fluid bg-2 text-center">
       <div class="row">
           <div class="col-sm-12">
               <h4 class="text-left" style=" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;">
               <h1 class="ml10">
                     <span class="letters">Ongoing Konnects</span>
                     </span>
                     </h1>
                 </h4>
           </div>
       </div>
   </div>
       <br><br>
        <%
            session.setAttribute("UserID","U0001");
            ArrayList<Quiz>qsk=(ArrayList<Quiz>)request.getAttribute("Konnects");
        %>
   <%
   for(Quiz qrk:qsk)
   {
    String QID=qrk.getQuizID();
    String QName=qrk.getQuizName();  
   %>
    
      <div class="col-sm-12">
      <section class="card-container" style="margin-left: 100px;"> 
      <article class="card" style="padding-right: 60px;">
       <div class="row">
       <div class="col-sm-8">
       <div id="infodiv">
       <h4 class="card-title">
       <%=QID%>
       </h4>
       <p class="card-text">
       <%=QName%>
       </p>
       </div>
       <form name="sender" method="GET" action="Enroll"> 
       <input type="hidden" name="QuizID" value=<%=QID%>>
       <input type="hidden" name="QuizName" value=<%=QName%>>
       <input type="submit" class="btn btn-primary" value="Enroll"> 
       </form>
       </div>
       <div class="col-sm-4">
       <img src="Assets/Quiz.png" class="img-fluid img-circle" alt="User">
       </div>
      </div>
      </article>
      </section>
      </div>
   <%
   }
   %>   
    </body>
</html>
