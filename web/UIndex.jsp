<%-- 
    Document   : UIndex
    Created on : May 26, 2019, 9:00:04 AM
    Author     : Sakshi Sinha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <style>
.bg-2 
{ 
    background-color: #000000; /* Dark Black */
    color: #ffffff;
}
.bg-3 
{ 
    background-color: #ffffff;
    color: #555555;
}
.container-fluid 
{
  padding-top: 70px;
  padding-bottom: 70px;
}
.img-fluid
{
    max-width: 150px;
    max-height:200px;
}
.card-container 
{
    display: grid;
    padding: 1rem;
    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));
    grid-gap: 1rem;
}
.card 
{
    display: grid;
}
</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="css/akstyle.css">
  
  <title>User Page</title>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
  <body>
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
 
  <%
            String Uname=(String)request.getSession().getAttribute("Name");
            String UID=(String)request.getSession().getAttribute("UserID");
            Double Points=(Double)request.getSession().getAttribute("Points");
            String Level=(String)request.getSession().getAttribute("Level");
            request.getSession().setAttribute("Name",Uname);
            request.getSession().setAttribute("UID",UID);
   %>
   <div class="container-fluid bg-2 text-center">

   <div class="row">
   <div class="col-sm-8">

    <section class="card-container" style="margin-left: 100px;">
 
    <article class="card" style="padding-right: 60px;">
    	<figure class="card__thumbnail">
        <center><img id="z1" src="Assets/learning.png"></center>
        </figure>
        <header class="card__title">
            <h3><%=Uname%></h3>
        </header>
        <main class="card__description">
           User Name
        </main>
    </article>

   <article class="card" style="padding-right: 60px;">
   	<figure class="card__thumbnail">
        <center><img  id="z1" src="Assets/battery.png"></center>
    </figure>
        <header class="card__title">
            <h3><%=Points%></h3>
        </header>
        <main class="card__description">
           Kindle Points
        </main>
    </article>

   <article class="card" style="padding-right: 60px;">
   	<figure class="card__thumbnail">
        <center><img id="z1" src="Assets/library.png"></center>
    </figure>
        <header class="card__title">
            <h3><%=UID%></h3>
        </header>
        <main class="card__description">
          User ID
        </main>
    </article>

    <article class="card" style="padding-right: 20px;">
    <figure class="card__thumbnail">
        <center><img id="z1" src="Assets/review.png"></center>
    </figure>
        <header class="card__title">
            <h3><%=Level%></h3>
        </header>
        <main class="card__description">
           User Level
        </main>
    </article>
</section>
<br><br>

</div>

   <div class="col-sm-4">
       <img src="Assets/DP/<%=UID%>.jpg" class="img-fluid img-circle" alt="User">
   </div>
   </div>
   </div>
   <div class="container-fluid bg-3 text-center" style="background-color: #c7d2e2">  
       <center style=" margin-top: -50px; margin-bottom: 50px" ><h3 style="font-family:Comic Sans MS, cursive, sans-serif;  font-weight: bolder; font-size: 30px; text-shadow: -2px 0 black, 0 2px black, 2px 0 black, 0 -2px black;">RECENT READS</h3></center>
    <div class="row">
    <div class="col-sm-3">
    
    <img src="Assets/logo.jpg" class="img-responsive" id="zoom" alt="Image">
    
    </div>
    <div class="col-sm-3">
    
    <img src="Assets/logo.jpg" class="img-responsive" id="zoom" alt="Image">
    </div>
    

    <div class="col-sm-3">
   
    <img src="Assets/logo.jpg" class="img-responsive" id="zoom" alt="Image">
    
    </div>
    <div class="col-sm-3">
    
    <img src="Assets/logo.jpg" class="img-responsive" id="zoom" alt="Image">
    </div>
    </div>
    </div>

</body>

  
  </html>

