<%-- 
    Document   : ViewGoals
    Created on : 6 May, 2019, 9:59:49 PM
    Author     : Akanksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.*" %>
<%
List<String>alist=new ArrayList<String>();
alist=(List<String>)session.getAttribute("Author");
List<Book>blist=new ArrayList<Book>();
blist=(List<Book>)session.getAttribute("Book");
List<Integer> adays=new ArrayList<Integer>();
adays=(List<Integer>)session.getAttribute("adays");
List<Integer> bdays=new ArrayList<Integer>();
bdays=(List<Integer>)session.getAttribute("bdays");
List<String> gid=new ArrayList<String>();
gid=(List<String>)session.getAttribute("gid");
List<String> bid=new ArrayList<String>();
bid=(List<String>)session.getAttribute("bid");

%>
<!DOCTYPE html>
<html>
    <head>
	<title>View Goals</title>
</head>
<style type="text/css">
body{
  background-image:url(Assets/viewgoal.jpg);
  background-repeat: no-repeat;
  background-size: 100%;  /*overflow: scroll;*/
  background-attachment: fixed;
 }
.card {
  box-shadow: 0 4px 8px 0 rgba(72, 80, 84, 0.2);
  width:825px;
  height:130px;
  text-align: center;
  font-family: arial;
  background-color:#3d5a77;
  background-image: url(Assets/goalbk2.jpg);
  padding: 10px;
  margin-bottom: 30px;
  margin-left: 100px;
    
}
.card:hover{
    box-shadow: 0 4px 8px 0 rgba(14, 98, 140, 0.8);
    border: 0.2px solid #0e628c;
    background-color:#3d5a77;
}
 .title {
  color: white;
  font-size: 30px;
  display: inline-block;
  font-weight: bolder;
  width: 300px;
  font-family:Comic Sans MS, cursive, sans-serif;
  font-weight: bolder;
  font-size: 30px;
  text-shadow: -1.5px 0 #a7b0bc, 0 1.5px #a7b0bc, 1.5px 0 #a7b0bc, 0 -1.5px #a7b0bc;
}
.top-head{
    background-color: #000;
    position: fixed; 
    top: 0px; 
    left:0px; 
    width:100%; 
    text-align: center; 
    padding-bottom: 5px;
    z-index: 100;
}
.head1{
    font-weight:bold;
}
.cc{
  width:1100px;
  margin-top: 90px;
  background-color: rgba(56, 57, 58,0.5);
 
  padding: 20px;
  overflow-y: auto;
 
 /* overflow: scroll;*/
}
td{
    align-self: left;
    padding :3px;

}
tr{
    height:1px;
}
table,td,tr{
   
    height:12%;
    color:white;
    padding:5px;
}
.head1{
    font-weight:bold;
}
.cont{
    position:absolute;
    margin-top: 5px;
    margin-left:90px;
}
.bimg{
    width: 85px;
    height: 85px;
    float :left;
    margin:5px;
    margin-top: 13px;
}
.timg{


float :right;
margin-top:-105px;
    
}
.btime{
  color:red;
  margin-left: 70px;
  font-family:Comic Sans MS, cursive, sans-serif;
  font-weight: bolder;
  font-size: 30px;
  text-shadow: -1.5px 0 #771105, 0 1.5px #771105, 1.5px 0 #771105, 0 -1.5px #771105;

}
.atime{
  
  color:#1d9321;
  margin-left: 70px;
  font-family:Comic Sans MS, cursive, sans-serif;
  font-weight: bolder;
  font-size: 30px;
  text-shadow: -1.5px 0 #034c05, 0 1.5px #034c05, 1.5px 0 #034c05, 0 -1.5px #034c05;
}

.time{
margin-left: 200px;
}
#close{
   border-radius: 5px;
   width:100px;
   height:40px;
   margin-left: 180px;
   margin-top: -70px;
   background: #26a50d;
   border:none;
   color:white;
   position: absolute;
   font-size: 20px;
   
}
#close:hover{
    background-color: #1a8405;
}
</style>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script>
    function fun(x)
{
    //alert(x);
    //alert("yes i m called");
 if (window.XMLHttpRequest) {
    // code for IE7+, Firefox, Chrome, Opera, Safari
    xmlhttp=new XMLHttpRequest();
  } else { // code for IE6, IE5
    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
  xmlhttp.onreadystatechange=function() {
    if (this.readyState==4 && this.status==200) {
        alert("Goal is completed");
     window.location.href = "http://localhost:8080/Final/GoalViewer";
    }
  }
 
  xmlhttp.open("GET","CompleteGoal?q="+x,true);
  xmlhttp.send();
  
}
</script>
<body>
<div class="top-head">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
<body>
<div class="top-head">
 <button class="w3-button w3-black w3-xxlarge" onclick="w3_open()" style="float:left;">&#9776;</button>
  <h1 class="title">MY GOALS </h1>
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

</div>
</div>

  <div class="cc">
      <%
          int i=0;
          for(i=0;i<alist.size();i++){
              String []g;
              g=alist.get(i).split(",");
              if(adays.get(i)<=10){
                  %>
    <div class="card">
     <img src="Assets/DP/<%=g[0]%>.jpg" class="bimg">
                    <table class="cont">
                        <tr>
                            <td align="left" class="head1">Author Name:</td> <td align="left"><%=g[0]%></td>
                        </tr>
                        <tr>
                            <td align="left" class="head1">Num of Books:</td> <td align="left"><%=g[1]%></td>
                        </tr>
                        
                    </table>
    <div class="time">
      <p class="btime"><%=adays.get(i)%> Days to End</p>
      <Button id="close" class="bimg" onclick="fun('<%=gid.get(i)%>')">Complete</Button>
    </div>
    </div>
<% }
else{
%>
<div class="card">
     <img src="Assets/DP/<%=g[0]%>.jpg" class="bimg">
                    <table class="cont">
                        <tr>
                            <td align="left" class="head1">Author Name:</td> <td align="left"><%=g[0] %></td>
                        </tr>
                        <tr>
                            <td align="left" class="head1">Num of Books:</td> <td align="left"><%=g[1] %></td>
                        </tr>
                        
                    </table>
    <div class="time">
      <p class="atime"><%=adays.get(i)%> Days to End</p>
      <Button id="close" class="bimg" onclick="fun('<%=gid.get(i)%>')">Complete</Button>
    </div>
    </div>
<%
}
          }
 for(i=0;i<blist.size();i++){
              Book b=new Book();
              b=(Book)blist.get(i);
               System.out.println(b.getAuthor()+","+b.getName());
              if(bdays.get(i)<=10){         
%>
<div class="card">
     <img src="Assets/Book/<%=b.getName()%>.jpg" class="bimg">
                    <table class="cont">
                        <tr>
                            <td align="left" class="head1">Book Name:</td> <td align="left"><%=b.getName()%></td>
                        </tr>
                        <tr>
                            <td align="left" class="head1">Book Author:</td> <td align="left"><%=b.getAuthor()%></td>
                        </tr>
                        <tr>
                            <td align="left" class="head1">Book Points:</td> <td  align="left"><%=b.getKindlePoints()%></td>
                        </tr>
                    </table>
    <div class="time">
      <p class="btime"><%=bdays.get(i)%> Days to End</p>
      <Button id="close" class="bimg" onclick="fun('<%=bid.get(i)%>')">Complete</Button>
    </div>

    
    </div>
      <%
          }
else{
%>
<div class="card">
     <img src="Assets/Book/<%=b.getName()%>.jpg" class="bimg">
                    <table class="cont">
                        <tr>
                            <td align="left" class="head1">Book Name:</td> <td align="left"><%=b.getName()%></td>
                        </tr>
                        <tr>
                            <td align="left" class="head1">Book Author:</td> <td align="left"><%=b.getAuthor()%></td>
                        </tr>
                        <tr>
                            <td align="left" class="head1">Book Points:</td> <td  align="left"><%=b.getKindlePoints()%></td>
                        </tr>
                    </table>
    <div class="time">
      <p class="atime"><%=bdays.get(i)%> Days to End</p>
      <Button id="close" onclick="fun('<%=bid.get(i)%>')">Complete</Button>
    </div>
</div>
      <%
}
}
          %>
    
    
  </div>
</body>
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
</html>
