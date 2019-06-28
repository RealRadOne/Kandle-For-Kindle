<%-- 
    Document   : LeaderBoard
    Created on : May 23, 2019, 2:59:12 PM
    Author     : Sakshi Sinha
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Quiz"%>
<%@page import="java.util.*"%>
<html>
<head>
<style>
@import url(https://fonts.googleapis.com/css?family=Raleway:400,500,800);
figure.snip0078 {
  font-family: 'Raleway', Arial, sans-serif;
  color: #fff;
  position: relative;
  float: left;
  margin: 10px 1%;
  min-width: 220px;
  max-width: 310px;
  max-height: 310px;
  margin-right: 30px;
  width: 100%;
  text-align: center;
}
figure.snip0078 * {
  -webkit-box-sizing: padding-box;
  box-sizing: padding-box;
}
figure.snip0078 img {
  opacity: 1;
  max-width: 100%;
  border: 10px solid #000000;
  -webkit-transition: all 0.3s;
  transition: all 0.3s;
  -webkit-transform: scale(0.85);
  transform: scale(0.85);
  -webkit-transform-origin: 0 0;
  transform-origin: 0 0;
}
figure.snip0078 figcaption {
  bottom: 0;
  width: 60%;
  right: 0;
  position: absolute;
  background: #000000;
  padding: 20px;
  -webkit-transition: all 0.3s;
  transition: all 0.3s;
  -webkit-transform: translateY(0);
  transform: translateY(0);
  box-shadow: 0 0px 10px -10px #000000;
}
figure.snip0078 figcaption h2,
figure.snip0078 figcaption p {
  color: #ffffff;
}
figure.snip0078 figcaption h2 {
  font-weight: 400;
  text-transform: uppercase;
}
figure.snip0078 figcaption h2 span {
  font-weight: 800;
}
figure.snip0078 figcaption p {
  font-size: 0.9em;
  font-weight: 500;
  opacity: 0.65;
}
figure.snip0078 a {
  left: 50px;
  right: 50px;
  top: 50px;
  bottom: 50px;
  position: absolute;
  z-index: 1;
}
figure.snip0078.blue figcaption {
  background: #000000;
}
figure.snip0078.blue img {
  border: 10px solid #000000;
}
.ml10 {
  position: relative;
  font-weight: 900;
  font-size: 4em;
}

.ml10 .text-wrapper {
  position: relative;
  display: inline-block;
  padding-top: 0.2em;
  padding-right: 0.05em;
  padding-bottom: 0.1em;
  overflow: hidden;
}

.ml10 .letter {
  display: inline-block;
  line-height: 1em;
  transform-origin: 0 0;
}
.bg-2 
{ 
    background-color: #000000; /* Dark Black */
    color: #ffffff;
}
.bg-3
{
    background-image: "Assets/leaderbak.jpg";
}
</style>
       <link rel="stylesheet" href="css/akstyle.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <script src="https://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,900,700italic,700,600italic,600,400italic"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.min.js"></script>
        <title>List</title>
</head>
<body background="Assets/leaderbak.jpg">
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
  function myDropFunc2() {
  var x = document.getElementById("demoDrop2");
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
 <div class="w3-sidebar w3-bar-block w3-black w3-animate-left" style="display:none; width:25%" id="mySidebar">
  <button class="w3-bar-item w3-button w3-large w3-red"
  onclick="w3_close()">Close </button>
     <a href="MainServ" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Home</a>
   <a href="CallGetWords" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">My Vocabulary</a>
  <div class="w3-dropdown-click">
    <button class="w3-button w3-large w3-padding-16 w3-border w3-black" onclick="myDropFunc()">Goals <i class="fa fa-caret-down"></i></button>
    <div id="demoDrop" class="w3-dropdown-content w3-bar-block w3-white w3-card-4">
      <a href="SetGoalbb.jsp" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">Set Goal for books</a>
      <a href="SetGoalba.jsp" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">Set Goal for authors</a>
      <a href="#" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">Set Goal for genres</a>
      <a href="GoalViewer" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">View your goals</a>
    </div>
  </div>
  <a href="UpdateProfilePicture.jsp" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Upload Profile Picture</a>
  <div class="w3-dropdown-click">
  <button class="w3-button w3-large w3-padding-16 w3-border w3-black" onclick="myDropFunc2()">Konnects <i class="fa fa-caret-down"></i></button>
  <div id="demoDrop2" class="w3-dropdown-content w3-bar-block w3-white w3-card-4">
      <a href="KonnectList" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">View Ongoing Konnects</a>
      <a href="Unrlist" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">View Enrolled Konnects</a>
      <a href="#" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">View LeaderBoard</a>
    </div>
  </div>
  <a href="Signup.html" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Logout</a>
</div>



<div style="position: fixed; top: 5px; left:5px; ">
  <button class="w3-button w3-black w3-xxlarge" onclick="w3_open()">&#9776;</button>
 </div>
   <div class="container-fluid bg-2 text-center">
       <div class="row">
           <div class="col-sm-12">
                 <h4 class="text-left" style=" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;">
                     <h1 class="ml10">
                     <span class="text-wrapper">
                     <span class="letters">KonnectBoard</span>
                     </span>
                     </h1>
                 </h4>
           </div>
       </div>
   </div>
        <%
            ArrayList<Quiz>qsk=(ArrayList<Quiz>)request.getAttribute("LeaderBoard");
        %>
   <%
   for(Quiz qrk:qsk)
   {
   String Uname=qrk.getUserID();
   int Points=qrk.getScore();
   %>
    
    <figure class="snip0078 hover blue">
        <img src="Assets/DP/<%=Uname%>.jpg" alt="sampl45" />
    <figcaption>
    <h2><span><%=Uname%></span></h2>
    <p><%=Points%></p>
    </figcaption>
    <a href="#"></a>
    </figure>
   
   <%
   }
   %>
<script>
  $('.ml10 .letters').each(function(){
  $(this).html($(this).text().replace(/([^\x00-\x80]|\w)/g, "<span class='letter'>$&</span>"));
});

anime.timeline({loop: true})
  .add({
    targets: '.ml10 .letter',
    rotateY: [-90, 0],
    duration: 1300,
    delay: function(el, i) {
      return 45 * i;
    }
  }).add({
    targets: '.ml10',
    opacity: 0,
    duration: 1000,
    easing: "easeOutExpo",
    delay: 1000
  });
</script>
</body>
</html>

