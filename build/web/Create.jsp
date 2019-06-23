<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
}
.card {
    display: grid;
}
table{
        width: 100%;
        margin: 20px 0;
        border-collapse: collapse;
    }
table, th, td{
        border: 1px solid #cdcdcd;
    }
table th, table td{
        padding: 5px;
        text-align: left;
}
div.background {
  background-image: url("Assets/quizzo.jpg");
  border: 2px solid black;
}
div.transbox {
  color: #ffffff;
  background:transparent;
  border: 1px solid black;
  opacity: 0.6;
  filter: alpha(opacity=60); /* For IE8 and earlier */
}
div.transbox p {
  font-weight: bold;
  color: #000000;
}
.ml1 {
  font-weight: 900;
  font-size: 3.5em;
}

.ml1 .letter {
  display: inline-block;
  line-height: 1em;
}

.ml1 .text-wrapper {
  position: relative;
  display: inline-block;
  padding-top: 0.1em;
  padding-right: 0.05em;
  padding-bottom: 0.15em;
}

.ml1 .line {
  opacity: 0;
  position: absolute;
  left: 0;
  height: 3px;
  width: 100%;
  background-color: #fff;
  transform-origin: 0 0;
}

.ml1 .line1 { top: 0; }
.ml1 .line2 { bottom: 0; }
</style>
    
    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>KonnectCreate</title>
<script src="//code.jquery.com/jquery.min.js"></script>
<script src='js/TableToJson.min.js'></script>
<script src="https://code.jquery.com/jquery-1.12.4.min.js">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" type="text/javascript">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="css/akstyle.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.min.js"></script>

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
<script type="text/javascript">
  
  function output() {
 
  var Question = document.getElementById("Question").value;
  var Option1 = document.getElementById("Option1").value;
  var Option2 = document.getElementById("Option2").value;
  var Option3 = document.getElementById("Option3").value;
  var Option4 = document.getElementById("Option4").value;
  var Ans     = document.getElementById("Ans").value;
  var frm = document.getElementsByName('basic')[0];
  
  var table = document.getElementById("table");
  var row = table.insertRow(table).outerHTML = 
   "<tr id='row'><td>" + Question 
            + "</td><td>" + Option1 + "</td><td>" + Option2 
            +"</td><td>" + Option3 + "</td><td>" + Option4 +"</td><td>"+Ans+
            "</td></tr>";   
 frm.reset();  // Reset all form data
 return false;
};
function submit() {
  //Store HTML Table Values into Multidimensional Javascript Array Object
  var TableData = new Array();
  $('#table tr').each(function(row, tr) {
    TableData[row] = {
      "Question": $(tr).find('td:eq(0)').text(),
      "Option1": $(tr).find('td:eq(1)').text(),
      "Option2": $(tr).find('td:eq(2)').text(),
      "Option3": $(tr).find('td:eq(3)').text(),
      "Option4": $(tr).find('td:eq(4)').text(),
      "Ans":$(tr).find('td:eq(5)').text()
    }//tableData[row]
  });
  
            
  //TableData.shift(); // first row will be empty - so remove
 
  var Data;
  Data = JSON.stringify(TableData);
  //alert(Data);
  
  $.ajax({
    type: 'POST',
    url: 'Quizprocess',
    data: {
    jsonData: JSON.stringify(TableData)
    },
    dataType: 'json',
    success:function(jsonObj)
    {
                alert(jsonObj.message);
                //$("#result").value(jsonObj.message);
                alert('Quiz Submitted');
                 var successUrl = "AuthMainServ"; // might be a good idea to return this URL in the successful AJAX call
                 window.location.href = successUrl; 
    },
    error:function()
    {
               alert('error');
    }
  });  
};
   
</script>
</head>
<% 
    String QuizName=(String)request.getSession().getAttribute("QuizName");
    String QuizID=(String)request.getSession().getAttribute("QuizID");
    request.getSession().setAttribute("QuizID",QuizID);
%>

<body>

   <div class="container-fluid bg-2 text-center">

   <div class="row">
  <h1 class="ml1">
  <span class="text-wrapper">
    <span class="line line1"></span>
    <span class="letters"><%=QuizName%></span>
    <span class="line line2"></span>
  </span>
</h1>

   </div>

   </div>
  
   <div class="container-fluid bg-3 text-center" style="background-color:#c7d2e2">  
     
    <div class="row">
    <div class="col-sm-6">
     <div class="background">
     <div class="transbox">
      <div style="margin-top: 10px;">
      <table class="table table-striped projects" id="table">
      <thead>
      <tr>
        <th>Question</th>
        <th>Option1</th>
        <th>Option2</th>
        <th>Option3</th>
        <th>Option4</th>
        <th>Ans</th>
        
      </tr>
    </thead>
    <tbody>
    </tbody>
    </table>
          <button type="button" class="btn btn-primary btn-lg" onclick="submit();">SUBMIT</button>
    </div>
     </div>
    </div>
    </div>
        
   <div class="col-sm-6">
   <div class="background">
   <div class="transbox">
   <form name="basic">
   <div>
   <h5 align="left">Question</h5>
   <input class="w3-input w3-border w3-sand" name="Question" type="text" id="Question">
   </div>
   <div>
   <h5 align="left">Option1</h5>
   <input class="w3-input w3-border w3-sand" name="Option1" type="text" id="Option1">
   </div>
   <div>
       <h5 align="left">Option2</h5>
   <input class="w3-input w3-border w3-sand" name="Option2" type="text" id="Option2">
   </div>
    <div>
       <h5 align="left">Option3</h5>
   <input class="w3-input w3-border w3-sand" name="Option3" type="text" id="Option3">
   </div>
    <div>
       <h5 align="left">Option4</h5>
   <input class="w3-input w3-border w3-sand" name="Option4" type="text" id="Option4">
   </div>
       <h5 align="left">Ans</h5>
   <input class="w3-input w3-border w3-sand" name="Ans" type="text" id="Ans"><br><br>
   <input type="button" class="btn btn-primary btn-lg" onclick="output();" value="Next"/>
   </form>
   </div>
   </div>
   </div>
    </div>
    </div>
<script>
// Wrap every letter in a span
$('.ml1 .letters').each(function(){
  $(this).html($(this).text().replace(/([^\x00-\x80]|\w)/g, "<span class='letter'>$&</span>"));
});

anime.timeline({loop: true})
  .add({
    targets: '.ml1 .letter',
    scale: [0.3,1],
    opacity: [0,1],
    translateZ: 0,
    easing: "easeOutExpo",
    duration: 600,
    delay: function(el, i) {
      return 70 * (i+1)
    }
  }).add({
    targets: '.ml1 .line',
    scaleX: [0,1],
    opacity: [0.5,1],
    easing: "easeOutExpo",
    duration: 700,
    offset: '-=875',
    delay: function(el, i, l) {
      return 80 * (l - i);
    }
  }).add({
    targets: '.ml1',
    opacity: 0,
    duration: 1000,
    easing: "easeOutExpo",
    delay: 1000
  }); 
</script>
</body>
</html>