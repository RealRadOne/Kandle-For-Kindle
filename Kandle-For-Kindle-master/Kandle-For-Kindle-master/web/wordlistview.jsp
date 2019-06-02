<%-- 
    Document   : wordlistview
    Created on : 27 Feb, 2019, 8:50:43 PM
    Author     : Akanksha
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="classes.dictionary" %>
<%@page import="Servlets.WordList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    
    
   
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  
  background-color: black;
}
.all{
  padding-top: 70px;
  padding-left: 50px;
  padding-bottom: 70px;
  padding-right: 50px;
}
.flip-card {
  background-color: transparent;
  width: 430px;
  height: 80px;
  perspective: 1000px;
  display: inline-block;
  margin-top: 15px;
  margin-bottom: 15px;
  margin-right: 35px;
  margin-left: 70px;
}

.flip-card-inner {
  position: relative;
  width: 100%;
  height: 100%;
  text-align: center;
  transition: transform 1s;
  transform-style: preserve-3d;
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
}

.flip-card:hover .flip-card-inner {
  transform: rotateY(180deg);
}

.flip-card-front, .flip-card-back {
  position: absolute;
  width: 100%;
  height: 100%;
  backface-visibility: hidden;
}

.flip-card-front {
  font-size: 170%;
  font-weight: bold;
 
  color: black;
  z-index: 2;
  padding-top: 10px;
}

.flip-card-back {
  font-size: 130%;
  font-weight: lighter;
  background-color: #a7b0bc;
  color: black;
  padding-top: 10px;
  transform: rotateY(180deg);
  z-index: 1;
}
.text1{
  margin-top: 9px;
}
#f1{
   background-color: #c0cfdb;
}
#f2{
   background-color: #e8d3a9;
}


</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="css/akstyle.css">
</head>
<body>
<div class="w3-sidebar w3-bar-block w3-black w3-animate-left" style="display:none; width:25%" id="mySidebar">
  <button class="w3-bar-item w3-button w3-large w3-red"
  onclick="w3_close()">Close </button>
  <img  src="images.jpg" class="w3-bar-item w3-button w3-xlarge w3-padding-16 w3-black" alt="book" style="width:100%; height: 40%; padding-right: 10px; padding-left: 10px;">
  <a href="#" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Read A Book</a>
  <a href="wordlistview.jsp" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">My Vocabulary</a>
  <a href="#" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Set Goal</a>
  <a href="index.html" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Home</a>
  <a href="#" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Logout</a>
</div>

<div class="all">
<div style="position: fixed; top: 5px; left:5px; ">
  <button class="w3-button w3-black w3-xxlarge" onclick="w3_open()">&#9776;</button>
 </div>
<%
//PrintWriter out = response.getWriter();
int i=1;
List<dictionary>list=new ArrayList<dictionary>();
    try{
        list=(List<dictionary>)session.getAttribute("Words");
                //(List<dictionary>)request.getAttribute("WordListak");
     }
    catch(NullPointerException a){
        
    }
//if(list!=null){
//out.println("<p>"+list+"</p>");
//}
%>
<c:forEach items="${Words}" var="dictionary" >
<%/*<c:forEach items="${Words}" var="dictionary" >
${dictionary.word}
${dictionary.meaning}
*/%>
<%
//for(dictionary ddd:list){
if(i<=2){
 %>
 
<div class="flip-card">
  <div class="flip-card-inner" >
    <div class="flip-card-front" id="f1">
        <p class="text1"><%//=ddd.getWord()%>${dictionary.word}</p>
    </div>
    <div class="flip-card-back">
      <p class="text2"><%//=ddd.getMeaning()%>${dictionary.meaning}</p>
    </div>
  </div>
</div>
<%
 }
else{
%>
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front" id="f2">
      <p class="text1"><%//=ddd.getWord()%>${dictionary.word}</p>
    </div>
    <div class="flip-card-back">
      <p class="text2">${dictionary.meaning}</p>
    </div>
  </div>
</div>
 <%
  }
i++;
if(i==5)
i=1;
//}
 %>
</c:forEach>


</div>
</body>
</script>
<script type="text/javascript">
  function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
}
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
}
</script>
</html>

