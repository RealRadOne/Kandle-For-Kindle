<!DOCTYPE html>

<%@page import="Model.*;" %>
<%@page import="java.util.*" %>
<%@page import="com.google.gson.Gson" %>
<html>
<head>
 <style>
 body{
  /*background-color: black;*/
  background-image:url(Assets/goalbk.jpeg);
  background-repeat: no-repeat;
  background-size: 100%;
  /*overflow: scroll;*/
 }

 
.inp{
    margin-right : 5px;
   }
#evc{
    padding: 5px;
    
    transition-duration: all 0.1s ease-out;
    margin-top: -100px;
    margin-left: 45px;
    background-color: #c2cad6;
    width:450px;
    height:35px;
    border:1px solid black;
    z-index: 1;
    
}
#evc:hover{
    transition: all 0.2s ease-in;
    border-color: #0d81b4ea;
    background-color: #c2cad6;
    
}
.button {
  
  margin-top: -35px;
  margin-left: 570px;
  padding: 5px 18px;
  font-size: 20px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: #19681d;
  border: none;
  border-radius: 15px;
  box-shadow: 0 0 1px 1px #263238;
  position: fixed;
  
  
}
.card {
  box-shadow: 0 4px 8px 0 rgba(72, 80, 84, 0.2);
  width:675px;
  height:125px;
  text-align: center;
  font-family: arial;
  background-color:rgba(178, 111, 96,0.7);
  /*background-image: url(Assets/goalbk2.jpg);*/
  padding: 10px;
  margin: 10px;
    
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


.card:hover{
    box-shadow: 0 4px 8px 0 rgba(14, 98, 140, 0.8);
    border: 0.2px solid #0e628c;
    background-color:rgba(117, 133, 160,0.8);
}
.button:hover {box-shadow: 0 0 18px 3px #263238;
background-color: #29993a;}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 -2px 18px 3px #263238;
  transform: translateY(4px);
}
.ev{
    /*z-index:2;*/
   position:absolute;
}
.cc{
    max-height: 500px;
        
}
li{
  /*  position: absolute;*/
  /*margin-top: 50px;
*/  list-style-type: none;
    z-index : 1;
    
}
ul{
    position:fixed;
    height: 450px;
    overflow-y: auto;
    margin-top: 60px;
    
}
form{
    position: absolute;
    margin-left: 15px;
}

::-webkit-scrollbar {
  width: 20px;
}

/* width */
::-webkit-scrollbar {
  width: 10px;
}

/* Track */
::-webkit-scrollbar-track {
  box-shadow: inset 0 0 5px grey; 
  border-radius: 10px;
}
 
/* Handle */
::-webkit-scrollbar-thumb {
  background: #a6cfdb; 
  border-radius: 10px;
}

/* Handle on hover */
::-webkit-scrollbar-thumb:hover {
  background: #749ca8; 
}

#close{
   border-radius: 5px;
   width:100px;
   height:40px;
   right: 20px;
   background: #7a0402;
   border:none;
   margin-top: 65px;
   color:white;
   position: absolute;
   font-size: 20px;
   
}
#close:hover{
    background-color: #ad0401;
}
#timer{
     border:none;
     right:20px;
     position: absolute;
     margin-top: 10px;
     background-color: #0e8c20;
     color: white;
}
#timer:hover{
    background-color: #066613;
}
.bimg{
    width: 85px;
    height: 85px;
    float :left;
    margin:5px;
    
}
.finals{
    
    border-radius: 50%;
    border: none;
    color: white;
    padding: 24px;
    font-size: 20px;
    position: absolute;
    transition:all 0.05s linear;
    margin-left: 800px;
    margin-top: -30px;
    background-color:#1c4770;
}
.finals:hover{
    transition:all 0.09s linear;
    box-shadow: 2px 2px 40px 3px #888;
    -moz-box-shadow:    3px 3px 5px 6px #ccc;
     background-color: #063787;
}
#content1{
    float:left;
    color:black;
    font-size: 13px;
    
}
b{
  font-size: 13px;  
}
#content2{
    float:left;
    color:black;
    margin-left: -17px;
    margin-top:40px;
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
td{
    align: left;
    padding :2px;
}
tr{
    height:1px;
}
table,td,tr{
   
    height:10%;
    color:white;
}
.head1{
    font-weight:bold;
}
.cont{
    position:absolute;
    margin-top: 5px;
    margin-left:90px;
}
#date1{
    margin-left:393px;
    margin-top:22px;
}
  </style>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">  
  <title>Set Goal</title>
  
 
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script> 
 
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script type="text/javascript">
    $(document).ready(function(){
  $("#form1").submit(function(){
   
  $.ajax({
type: $("#form1").attr('method'),
url: $("#form1").attr('action'),
data: $("#form1").serialize(),
success: function (data) {
var result=data;
alert("Goal is set");
 document.location.reload(true);
//$('#result').attr("value",result);
}
});
return false;
});   
});   

 function func(x)
{
   document.getElementById("evc").value=x.value;
    document.getElementById("ev").innerHTML="";
    
}
  function fun(x)
{
if(x.value!=""){
 if (window.XMLHttpRequest) {
    // code for IE7+, Firefox, Chrome, Opera, Safari
    xmlhttp=new XMLHttpRequest();
  } else { // code for IE6, IE5
    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
  xmlhttp.onreadystatechange=function() {
    if (this.readyState==4 && this.status==200) {
      document.getElementById("ev").innerHTML=this.responseText;
    }
  }
 
  xmlhttp.open("GET","AjaxHelper?q="+x.value+"&type=BOOK",true);
  xmlhttp.send();
  }
}
</script>
  <body>
      
   <script>
var app = angular.module("myShoppingList", []); 
app.controller("myCtrl", function($scope,$http) {
	/*var a={name:'ak',points:'hgfds'}
    var b={name:'ad',points:'aaaa'}*/
   
    $scope.products = [];
        //$scope.products =[];
   
    $scope.addItem = function() {
        if(document.getElementById("evc").value=="")
            alert("Please fill the field");
        else{
           $http({
            url : 'AddItems?q='+document.getElementById("evc").value+"&type=BOOK",
            method : "GET"
            
        }).then(function(response) {
            console.log(response.data);
            if(response.data==="{No}")
            {
                alert("Goal limit reached");
            }
            else{
                console.log("in else");
                 $scope.products.push(angular.fromJson(response.data));
            }
        }, function(response) {
            //fail case
            console.log(response);
            $scope.message = response;
        });
        document.getElementById("evc").value="";
        }
    };

    $scope.removeItem = function (x) {
        $scope.products.splice(x, 1);
    }
    
});
</script>

  


<div class="top-head">
  <button class="w3-button w3-black w3-xxlarge" onclick="w3_open()" style="float:left;">&#9776;</button>
  <h1 class="title">SET GOAL  </h1>
  <div class="w3-sidebar w3-bar-block w3-black w3-animate-left" style="display:none;top:0px; width:25%" id="mySidebar">
  <button class="w3-bar-item w3-button w3-large w3-red"
  onclick="w3_close()">Close </button>
  <img  src="images.jpg" class="w3-bar-item w3-button w3-xlarge w3-padding-16 w3-black" alt="book" style="width:100%; height: 40%; padding-right: 10px; padding-left: 10px;">
  <a href="#" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Read A Book</a>
  <div class="w3-dropdown-click">
    <button class="w3-button w3-large w3-padding-16 w3-border w3-black" onclick="myDropFunc()">Goals <i class="fa fa-caret-down"></i></button>
    <div id="demoDrop" class="w3-dropdown-content w3-bar-block w3-white w3-card-4">
      <a href="SetGoalbb.jsp" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">Set Goal for books</a>
      <a href="SetGoalba.jsp" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">Set Goal for authors</a>
      <a href="#" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">Set Goal for genres</a>
      <a href="GoalViewer" class="w3-bar-item w3-button w3-padding-16 w3-border w3-black">View your goals</a>
    </div>
  </div>
  <a href="#" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Account Settings</a>
  <a href="#" class="w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black">Logout</a>
</div>
 </div>
<div ng-app="myShoppingList"  ng-controller="myCtrl" style="margin-top:100px;">
 <!--div class="inp"-->
 <form action="GoalController" method="post" id="form1" name="form1">
     
        <button type="submit" class="finals" >SET GOAL </button>
        <input type="text" name="evc" placeholder="Search Book" id="evc" onkeyup="fun(this)" autocomplete="off" >
        <button  id="test1" type="button" ng-click="addItem()" class="button">Add Book</button>
        <input  type="hidden" name="type" id="type" value="BOOK" readonly>
        <div id="ev" name="ev"></div>
     
 
  <!--div class="test"></div-->
    <div class="cc">
        <ul style="position:fixed" >
            <li  ng-repeat="x in products">
                <div class="card">
                    <img src="Assets/Book/{{x.Name}}.jpg" class="bimg">
                    <table class="cont">
                        <tr>
                            <td align="left" class="head1">Book Name:</td> <td align="left">{{x.Name}}</td>
                        </tr>
                        <tr>
                            <td align="left" class="head1">Book Author:</td> <td align="left">{{x.author}}</td>
                        </tr>
                        <tr>
                            <td align="left" class="head1">Book Points:</td> <td  align="left">{{x.KindlePoints}}</td>
                        </tr>
                    </table>
                    <p style="position:absolute; margin-left:489px; margin-top:-2px; font-weight: bold; color:white">Enter End Date</p>
                    <input type="date"  placeholder="END DATE" id="date1" name="d1"  required="required">
                    <input  type="hidden" name="bookid" id="bookid" value={{x.BookID}} readonly>
                    <Button id="close" ng-click="removeItem($index)">Delete &#10799;</button>
                  </div>
            </li>
        </ul>
    </div>
 </form> 
<div id="test" style="color:white;"></div>

   

 
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
  </body>
  
  </html>
