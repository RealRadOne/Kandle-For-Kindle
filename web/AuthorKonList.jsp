<%-- 
    Document   : AuthorKonList
    Created on : May 7, 2019, 2:43:11 PM
    Author     : Sakshi Sinha
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Quiz"%>
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

</style>
 <head>
        <link rel="stylesheet" href="css/akstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>List</title>
 </head>
 <script type="text/javascript">
  function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
}
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
}
function myDropFunc() {
  var x = document.getElementById("demoDrop");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
    x.previousElementSibling.className += " w3-green";
  } else { 
    x.className = x.className.replace(" w3-show", "");
    x.previousElementSibling.className = 
    x.previousElementSibling.className.replace(" w3-green", "");
  }
}
</script>
    <body>
    <button class="w3-button w3-black w3-xxlarge" onclick="w3_open()" style="float:left;">&#9776;</button>
   <div class="w3-sidebar w3-bar-block w3-black w3-animate-left" style="display:none;top:0px; width:25%" id="mySidebar">
  <button class="w3-bar-item w3-button w3-large w3-red"
  onclick="w3_close()">Close </button>
  <img  src="images.jpg" class="w3-bar-item w3-button w3-xlarge w3-padding-16 w3-black" alt="book" style="width:100%; height: 40%; padding-right: 10px; padding-left: 10px;">
  <a href="AuthorIndex.jsp" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Home</a>
  <a href="BasicQuiz.jsp" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Create Konnect</a>
  <a href="AuthKonList" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Edit Konnects</a>
  <a href="aUpdateProfilePicture.jsp" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Upload Profile Picture</a>
  <a href="#" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Logout</a>
</div>
   <div class="container-fluid bg-2 text-center">

   <div class="row">
       <div class="row">
           <div class="col-sm-12">
                 <h4 class="text-left" style=" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;">
                 Ongoing Connects
                 </h4>
           </div>
       </div>
   <br><br>  
        <%
            ArrayList<Quiz>qsk=(ArrayList<Quiz>)request.getAttribute("Konnects");
        %>
   <%
   for(Quiz qrk:qsk)
   {String QID=qrk.getQuizID();
    String QName=qrk.getQuizName();
   %>
    <div class="col-sm-12">

      <section class="card-container" style="margin-left: 100px;"> 
      <article class="card" style="padding-right: 60px;">
       <div class="row">
      <form action="Konedit" method="get">
      <div class="col-sm-8">
       <h4 class="card-title"><%=QID%></h4>
       <p class="card-text"><%=QName%></p> 
      <input type="hidden" id="QName" name="QName" value=<%=QName%>>
      <input type="hidden" id="QID" name="QID" value=<%=QID%>>
      <input type="Submit" class="btn btn-primary" value="Ëdit">
      </div>
       <div class="col-sm-4">
       <img src="Assets/Quiz.png" class="img-fluid img-circle" alt="User">
       </div>
      </form>
      </div>
      </article>
      </section>
      </div>
   <%
   }
   %>
   </div>
   </div>
   
    </body>
</html>

