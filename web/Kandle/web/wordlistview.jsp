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
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
  word-wrap: break-word;
  font-family: monospace;
}
.text1[data-len="14"]{
  font-size: calc(2vw * 14/14);
}
.text1[data-len="13"]{
  font-size: calc(2vw * 14/13);
}
.text1[data-len="12"]{
  font-size: calc(2vw * 14/12);
}
.text1[data-len="11"]{
  font-size: calc(2vw * 14/11);
}
.text1[data-len="10"]{
  font-size: calc(2vw * 14/10);
}
.text1[data-len="9"]{
  font-size: calc(2vw * 14/9);
}
.text1[data-len="8"]{
  font-size: calc(2vw * 14/8);
}
.text1[data-len="7"]{
  font-size: calc(2vw * 14/7);
}
.text1[data-len="6"]{
  font-size: calc(2vw * 14/6);
}
.text1[data-len="5"]{
  font-size: calc(2vw * 14/5);
}
.text1[data-len="4"]{
  font-size: calc(2vw * 14/4);
}
.text1[data-len="3"]{
  font-size: calc(2vw * 14/3);
}
.text1[data-len="2"]{
  font-size: calc(2vw * 14/2);
}
.text1[data-len="1"]{
  font-size: calc(2vw * 14);
}
.text2{
  word-wrap: break-word;
  font-family: monospace;
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
.text2[data-len="50"]{
  font-size: calc(2vw * 30/50);
}
.text2[data-len="49"]{
  font-size: calc(2vw * 30/49);
}
.text2[data-len="48"]{
  font-size: calc(2vw * 30/48);
}
.text2[data-len="47"]{
  font-size: calc(2vw * 30/47);
}
.text2[data-len="46"]{
  font-size: calc(2vw * 30/46);
}
.text2[data-len="45"]{
  font-size: calc(2vw * 30/45);
}
.text2[data-len="44"]{
  font-size: calc(2vw * 30/44);
}
.text2[data-len="43"]{
  font-size: calc(2vw * 30/43);
}
.text2[data-len="42"]{
  font-size: calc(2vw * 30/42);
}
.text2[data-len="41"]{
  font-size: calc(2vw * 30/41);
}
.text2[data-len="40"]{
  font-size: calc(2vw * 30/40);
}
.text2[data-len="39"]{
  font-size: calc(2vw * 30/39);
}
.text2[data-len="38"]{
  font-size: calc(2vw * 30/38);
}
.text2[data-len="37"]{
  font-size: calc(2vw * 30/37);
}
.text2[data-len="36"]{
  font-size: calc(2vw * 30/36);
}
.text2[data-len="35"]{
  font-size: calc(2vw * 30/35);
}
.text2[data-len="34"]{
  font-size: calc(2vw * 30/34);
}
.text2[data-len="33"]{
  font-size: calc(2vw * 30/33);
}
.text2[data-len="32"]{
  font-size: calc(2vw * 30/32);
}
.text2[data-len="31"]{
  font-size: calc(2vw * 30/31);
}
.text2[data-len="30"]{
  font-size: calc(2vw * 30/30);
}
.text2[data-len="29"]{
  font-size: calc(2vw * 30/29);
}
.text2[data-len="28"]{
  font-size: calc(2vw * 30/28);
}
.text2[data-len="27"]{
  font-size: calc(2vw * 30/27);
}
.text2[data-len="26"]{
  font-size: calc(2vw * 30/26);
}
.text2[data-len="25"]{
  font-size: calc(2vw * 30/25);
}
.text2[data-len="24"]{
  font-size: calc(2vw * 30/24);
}
.text2[data-len="23"]{
  font-size: calc(2vw * 30/23);
}
.text2[data-len="22"]{
  font-size: calc(2vw * 30/22);
}
.text2[data-len="21"]{
  font-size: calc(2vw * 30/21);
}
.text2[data-len="20"]{
  font-size: calc(2vw * 30/20);
}
.text2[data-len="19"]{
  font-size: calc(2vw * 30/19);
}
.text2[data-len="18"]{
  font-size: calc(2vw * 30/18);
}
.text2[data-len="17"]{
  font-size: calc(2vw * 30/17);
}
.text2[data-len="16"]{
  font-size: calc(2vw * 30/16);
}
.text2[data-len="15"]{
  font-size: calc(2vw * 30/15);
}
.text2[data-len="14"]{
  font-size: calc(2vw * 30/14);
}
.text2[data-len="13"]{
  font-size: calc(2vw * 30/13);
}
.text2[data-len="12"]{
  font-size: calc(2vw * 30/12);
}
.text2[data-len="11"]{
  font-size: calc(2vw * 30/11);
}
.text2[data-len="10"]{
  font-size: calc(2vw * 30/10);
}
.text2[data-len="9"]{
  font-size: calc(2vw * 30/9);
}
.text2[data-len="8"]{
  font-size: calc(2vw * 30/8);
}
.text2[data-len="7"]{
  font-size: calc(2vw * 30/7);
}
.text2[data-len="6"]{
  font-size: calc(2vw * 30/6);
}
.text2[data-len="5"]{
  font-size: calc(2vw * 30/5);
}
.text2[data-len="4"]{
  font-size: calc(2vw * 30/4);
}
.text2[data-len="3"]{
  font-size: calc(2vw * 30/3);
}
.text2[data-len="2"]{
  font-size: calc(2vw * 30/2);
}
.text2[data-len="1"]{
  font-size: calc(2vw * 30);
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
var els1 = document.getElementsByClassName("text1"),
  l = els1.length;
for (var i = 0; i < l; i++) {
  els1[i].dataset.len = els1[i].firstChild.nodeValue.length;
  console.log(els1[i].dataset.len);
}
var els2 = document.getElementsByClassName("text2"),
  l = els2.length;
for (var i = 0; i < l; i++) {
  els2[i].dataset.len = els2[i].firstChild.nodeValue.length;
  console.log(els2[i].dataset.len);
}
</script>
</html>
