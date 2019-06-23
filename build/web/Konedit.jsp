<%-- 
    Document   : Konedit
    Created on : May 8, 2019, 9:57:32 PM
    Author     : Sakshi Sinha
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Quiz"%>
<%@page import="Model.Question"%>
<%@page import="java.util.*"%>
<html>
<head>
<style>	
body{
  background-color: #37474F;
  /*overflow: scroll;*/
 }
.bg-2 { 
    background-color: #000000; /* Dark Black */
    color: #ffffff;
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
.ml10 {
  position: relative;
  font-weight: 900;
  font-size: 4em;
}
</style>
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
       <link rel="stylesheet" href="css/akstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">       
        <title>List</title>
</head>
<body background="Assets/leaderbak.jpg">
<button class="w3-button w3-black w3-xxlarge" onclick="w3_open()" style="float:left;">&#9776;</button>
 <div class="w3-sidebar w3-bar-block w3-black w3-animate-left" style="display:none;top:0px; width:25%" id="mySidebar">
  <button class="w3-bar-item w3-button w3-large w3-red" onclick="w3_close()">Close </button>
  <img  src="images.jpg" class="w3-bar-item w3-button w3-xlarge w3-padding-16 w3-black" alt="book" style="width:100%; height: 40%; padding-right: 10px; padding-left: 10px;">
  <a href="AuthorIndex.jsp" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Home</a>
  <a href="BasicQuiz.jsp" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Create Konnect</a>
  <a href="AuthKonList" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Edit Konnects</a>
  <a href="aUpdateProfilePicture.jsp" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Upload Profile Picture</a>
  <a href="#" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Logout</a>
</div>
    <div class="container-fluid bg-2 text-center">
       <div class="row">
           <div class="col-sm-12">
               <h4 class="text-left" style=" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;">
               <h1 class="ml10">
                     <span class="letters">Question List</span>
                     </span>
                     </h1>
                 </h4>
           </div>
       </div>
   </div>
       <br><br>
        <%
            ArrayList<Question>qsk=(ArrayList<Question>)request.getAttribute("Questions");
            String QID=(String)request.getAttribute("QuizID");
            //request.setAttribute("QID",QID);
        %>
   <%
   for(Question qrk:qsk)
   {
    List<String>data=new ArrayList<String>();
    String QName=qrk.getQuestion();
    data.add(QName);
    String Option1=qrk.getOption1();
    data.add(Option1);
    String Option2=qrk.getOption2();
    data.add(Option2);
    String Option3=qrk.getOption3();
    data.add(Option3);
    String Option4=qrk.getOption4();
    data.add(Option4);
    String Ans=qrk.getAns();
    data.add(Ans);
    session.setAttribute("QuizID",QID);
    session.setAttribute("QDat",data);
   %>
   <div class="col-sm-6">
      <div class="row">
      <section class="card-container" style="margin-left: 100px;"> 
      <article class="card" style="padding-right: 60px;">
       <div class="row">
       <div class="col-sm-8">
       <h4 class="card-title"><%=QID%></h4>
       <p class="card-text"><%=QName%></p>
       <a href="Editlog.jsp" class="btn btn-primary">Edit</a> 
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

