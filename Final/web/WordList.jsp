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
	<%@page import="Model.Dictionary" %>
	<%@page import="Servlets.CallGetWords" %>
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
	  width: 480px;
	  height: 80px;
	  perspective: 1000px;
	  display: inline-block;
	  margin-top: 20px;
	  margin-bottom: 20px;
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
  text-align: center;
  vertical-align: middle;
	  position: absolute;
	  width: 100%;
	  height: 100%;
	  backface-visibility: hidden;
	}
	
	.flip-card-front {
	  font-size: 120%;
	  font-weight: bold;
	
	  color: black;
	  z-index: 2;
	  padding-top: 10px;
	}
	
	.flip-card-back {
	  font-size: 100%;
	  font-weight: lighter;
	  background-color: #a7b0bc;
	  color: black;
	  padding-top: 10px;
	  transform: rotateY(180deg);
	  z-index: 1;
	}
	.text1{
	  margin-top: 9px;
  word-wrap: break-word;
  font-family: monospace;
}
	.text1[data-len="16"]{
	  font-size: calc(2vw * 1);
	}
	.text1[data-len="15"]{
	  font-size: calc(2vw * 16/15);
	}
	.text1[data-len="14"]{
	  font-size: calc(2vw * 16/14);
	}
	.text1[data-len="13"]{
	  font-size: calc(2vw * 16/13);
	}
	.text1[data-len="12"]{
	  font-size: calc(2vw * 16/12);
	}
	.text1[data-len="11"]{
	  font-size: calc(2vw * 16/11);
	}
	.text1[data-len="10"]{
	  font-size: calc(2vw * 16/10);
	}
	.text1[data-len="9"]{
	  font-size: calc(2vw * 16/9);
	}
	.text1[data-len="8"]{
	  font-size: calc(2vw * 16/8);
	}
	.text1[data-len="7"]{
	  font-size: calc(2vw * 16/7);
	}
	.text1[data-len="6"]{
	  font-size: calc(2vw * 16/6);
	}
	.text1[data-len="5"]{
	  font-size: calc(2vw * 16/5);
	}
	.text1[data-len="4"]{
	  font-size: calc(2vw * 16/4);
	}
	.text1[data-len="3"]{
	  font-size: calc(2vw * 16/3);
	}
	.text1[data-len="2"]{
	  font-size: calc(2vw * 16/2);
	}
	.text1[data-len="1"]{
	  font-size: calc(2vw * 16);
	}
	.text2{
	  margin-top: 0.5px;
	  word-wrap: break-word;
	  font-family: monospace;
	}
	.text2[data-len="16"]{
	  font-size: calc(2vw * 1);
	}
	.text2[data-len="15"]{
	  font-size: calc(2vw * 16/15);
	}
	.text2[data-len="14"]{
	  font-size: calc(2vw * 16/14);
	}
	.text2[data-len="13"]{
	  font-size: calc(2vw * 16/13);
	}
	.text2[data-len="12"]{
	  font-size: calc(2vw * 16/12);
	}
	.text2[data-len="11"]{
	  font-size: calc(2vw * 16/11);
	}
	.text2[data-len="10"]{
	  font-size: calc(2vw * 16/10);
	}
	.text2[data-len="9"]{
	  font-size: calc(2vw * 16/9);
	}
	.text2[data-len="8"]{
	  font-size: calc(2vw * 16/8);
	}
	.text2[data-len="7"]{
	  font-size: calc(2vw * 16/7);
	}
	.text2[data-len="6"]{
	  font-size: calc(2vw * 16/6);
	}
	.text2[data-len="5"]{
	  font-size: calc(2vw * 16/5);
	}
	.text2[data-len="4"]{
	  font-size: calc(2vw * 16/4);
	}
	.text2[data-len="3"]{
	  font-size: calc(2vw * 16/3);
	}
	.text2[data-len="2"]{
	  font-size: calc(2vw * 16/2);
	}
	.text2[data-len="1"]{
	  font-size: calc(2vw * 16);
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
List<Dictionary>list=new ArrayList<Dictionary>();
    try{
        list=(List<Dictionary>)session.getAttribute("Words");
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
        <p class="text1" data-len=""><%//=ddd.getWord()%>${dictionary.word}</p>
    </div>
    <div class="flip-card-back">
      <p class="text2" data-len=""><%//=ddd.getMeaning()%>${dictionary.meaning}</p>
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
      <p class="text1" data-len=""><%//=ddd.getWord()%>${dictionary.word}</p>
    </div>
    <div class="flip-card-back">
      <p class="text2" data-len="">${dictionary.meaning}</p>
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
var els = document.getElementsByClassName("text1"),
  l = els.length;
for (var i = 0; i < l; i++) {
  els[i].dataset.len = els[i].firstChild.nodeValue.length;
  console.log(els[i].dataset.len);
}
var els = document.getElementsByClassName("text2"),
  l = els.length;
for (var i = 0; i < l; i++) {
  els[i].dataset.len = els[i].firstChild.nodeValue.length;
  console.log(els[i].dataset.len);
}
</script>
</html>
