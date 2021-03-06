<%-- 
    Document   : AuthorIndex
    Created on : May 6, 2019, 11:09:20 PM
    Author     : Sakshi Sinha
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>

.bg-2 { 
    background-color: #000000; /* Dark Black */
    color: #ffffff;
}
.bg-3 { 
    background-color: #ffffff;
    color: #555555;
}
  .container-fluid {
  padding-top: 70px;
  padding-bottom: 70px;
}
.img-fluid{
    max-width: 150px;
    height: auto;
}

.card-container {
    display: grid;
    padding: 1rem;
    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));
    grid-gap: 1rem;
    color: #ffffff;
    background:transparent;
    border: 1px solid black;
}
.card {
    display: grid;
}

.card-img-bottom {
  color: #fff;
  height: 30rem;
  background: url(Assets/original.gif) center no-repeat;
  background-size: cover;
}
.left{dislpay:inline; float:left}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Author Index</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="css/akstyle.css">
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
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
</script>
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
<div style="position: fixed; top: 5px; left:5px; ">
  <button class="w3-button w3-black w3-xxlarge" onclick="w3_open()">&#9776;</button>
 </div>
   <%
            String AuthName=(String)request.getSession().getAttribute("AuthName");
            String AuthID=(String)request.getSession().getAttribute("AuthID");
            Integer Konnects=(Integer)request.getSession().getAttribute("Konnects");
            session.setAttribute("AuthName",AuthName);
            session.setAttribute("AuthID",AuthID);
   %>
   <div class="container-fluid bg-2 text-center">

   <div class="row">
   <div class="col-sm-8">

    <section class="card-container" style="margin-left: 100px;">
 
    <article class="card" style="padding-right: 60px;">
    	<figure class="card__thumbnail">
        <center><img id="z1" src="Assets/pen.png"></center>
        </figure>
        <header class="card__title">
            <h3><%=AuthName%></h3>
        </header>
        <main class="card__description">
           User Name
        </main>
    </article>

   <article class="card" style="padding-right: 60px;">
   	<figure class="card__thumbnail">
        <center><img  id="z1" src="Assets/drinks.png"></center>
    </figure>
        <header class="card__title">
            <h3><%=Konnects%></h3>
        </header>
        <main class="card__description">
           Konnects
        </main>
    </article>

   <article class="card" style="padding-right: 60px;">
   	<figure class="card__thumbnail">
        <center><img id="z1" src="Assets/teamwork.png"></center>
    </figure>
        <header class="card__title">
            <h3><%=AuthID%></h3>
        </header>
        <main class="card__description">
          User ID
        </main>
    </article>
    <article class="card" style="padding-right: 20px;">
    <figure class="card__thumbnail">
        <center></center>
    </figure>
        <header class="card__title">
        </header>
        <main class="card__description">
           
        </main>
    </article>
    </section>
    <br><br>

   </div>

   <div class="col-sm-4">
       <img src="Assets/DP/<%=AuthID%>.jpg" class="img-fluid img-circle" alt="User">
   </div>
   </div>
   </div>
   <div class="container-fluid bg-2 text-center">  
  
   <section>
  <div class="container">
    <div class="card">
      <div class="row">
        <div class="col-md-4">
          <div class="card-block">
            <h4 class="text-left" style=" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;">
            CREATE A CONNECT</h4>
            <p class="text-left" style=" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;">
            Let's Make Your Pre-Release Special
            </p>
            <p class="text-left">Connect with your fans better with Amazon Connect</p>
            <div class="left"> 
            <a href="BasicQuiz.jsp" class="btn btn-primary btn-lg">ENTER</a>
            </div>
            </div>
            </div>
          <div class="col-md-8">
          <div class="card-img-bottom">
          </div>
          </div>
          </div>
          </div>
         </div>
         </section>
    </div>
    </body>
</html>
