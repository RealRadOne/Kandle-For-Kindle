<%-- 
    Document   : Unrlist
    Created on : May 18, 2019, 3:59:53 PM
    Author     : Sakshi Sinha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Quiz"%>
<%@page import="java.util.*"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
.ml10 {
  position: relative;
  font-weight: 900;
  font-size: 4em;
}
* {
  box-sizing: border-box;
}

.title {
  text-align: center;
  font-family: 'Oswald';
  font-weight: 100;
  font-size: 3.75rem;
  letter-spacing: 5px;
  background: linear-gradient(rgba(255, 0, 0, 0), #444, rgba(255, 0, 0, 0));
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  margin-bottom: 0;
}
@media screen and (min-width: 37.5em) {
  .title {
    font-size: 4.75rem;
  }
}

p {
  margin: 0 auto 2rem;
  text-align: center;
  font-family: 'oswald';
  font-size: 1.25rem;
  color: #444;
  font-weight: 100;
  width: 90%;
}
@media screen and (min-width: 37.5em) {
  p {
    height: 70%;
  }
}

.case-study-gallery {
  margin-top: 20px;
  width: 100%;
}

.case-study {
  position: relative;
  display: block;
  width: 90%;
  height: 100px;
  margin: 0 auto 2rem;
  background-size: cover;
  border-radius: 10px;
  box-shadow: 0px 25px 50px rgba(0, 0, 0, 0.5);
  overflow: hidden;
  transition: all .4s ease;
}
@media screen and (min-width: 37.5em) {
  .case-study {
    height: 200px;
  }
}
@media screen and (min-width: 45em) {
  .case-study {
    display: inline-block;
    width: 100%;
    margin-left: 25px;
  }
}

.case-study__img {
  width: 90%;
  display: block;
  margin-top: 50%;
  transform: translateY(50%);
  margin: 0 auto;
}

.case-study__overlay {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 0;
  z-index: 10;
}
.case-study__overlay:after {
  content: '';
  width: 100%;
  border-radius: 10px;
  height: 100%;
  background-color: #202020;
  opacity: 0;
  position: absolute;
  top: 0;
  z-index: -10;
  left: 0;
  transition: all .3s ease;
}

.case-study__title {
  position: relative;
  top: -200px;
  margin-bottom: 2rem;
  margin-top: 4rem;
  font-size: 2.25rem;
  font-family: 'Oswald';
  font-weight: 100;
  color: white;
  text-align: center;
  letter-spacing: 5px;
  transition: all 0.3s cubic-bezier(0.3, 0, 0, 1.3);
}

.case-study__link {
  position: relative;
  display: block;
  width: 60%;
  top: 200px;
  padding: 10px;
  margin: 0 auto;
  font-family: 'Oswald';
  color: white;
  letter-spacing: 3px;
  text-decoration: none;
  text-align: center;
  border: 2px solid white;
  border-radius: 3px;
  font-size: 1.25em;
  transition: all 0.3s cubic-bezier(0.3, 0, 0, 1.3);
}
.case-study__link:hover {
  background-color: white;
  color: #202020;
}

.case-study:hover .case-study__title {
  top: 0;
}
.case-study:hover .case-study__link {
  top: 0;
}
.case-study:hover .case-study__overlay:after {
  opacity: .75;
}

.study1 {
  background-image: url("Assets/quizzo.jpg");
}
</style>
       <link rel="stylesheet" href="css/akstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>List</title>
</head>
<body background="Assets/leaderbak.jpg">
    <div class="container-fluid bg-2 text-center">
       <div class="row">
           <div class="col-sm-12">
               <h4 class="text-left" style=" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;">
               <h1 class="ml10">
                     <span class="letters">Your Enrolled Konnects</span>
                     </span>
                     </h1>
                 </h4>
           </div>
       </div>
   </div>
       <br><br>
        <%
            ArrayList<Quiz>qsk=(ArrayList<Quiz>)request.getAttribute("Konnects");
        %>
   <%
   for(Quiz qrk:qsk)
   {
   String QID=qrk.getQuizID();
   String QName=qrk.getQuizName();
   SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
   String today=myFormat.format(new Date());
   String due=qrk.getDate();
   int days=0;
	       Date dateBefore = myFormat.parse(today);
	       Date dateAfter = myFormat.parse(due);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       float daysBetween = (difference / (1000*60*60*24));
               days=(int)daysBetween;
   %>
 <%
   if(days>0)
   {
 %>  
   <div class="case-study-gallery">
     <div class="case-study study1">
	<figure>
		<img class="case-study__img" src="Assets/Quiz.png" />
	</figure>
         <div class="case-study__overlay">
  	<h2 class="case-study__title"><%=QID%></h2>
        <h2 class="case-study__title"><%=QName%></h2>
        <a class="case-study__link" href="#">Days Remaining:<%=days%></a>
        </div>
    </div>
 <%
   }
     if(days==0)
     {
  %>
   <div class="case-study study1">
        <figure>
		<img class="case-study__img" src="Assets/Quiz.png" />
	</figure>
       <div class="case-study__overlay">
  	<h2 class="case-study__title"><%=QID%></h2>
        <h2 class="case-study__title"><%=QName%></h2>
       <form name="sender" method="GET" action="QuizPortal"> 
       <input type="hidden" name="QuizID" value=<%=QID%>>
       <input type="hidden" name="QuizName" value=<%=QName%>>
       <a class="case-study__link"><input type="submit" class="btn btn-primary" value="Enter"></a>
       </form>
       </div>
   </div>
   <%
   }
   %>
   
   </div>
   
  <%
   }
  %>
</body>
</html>

