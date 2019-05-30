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

<body>
<script type="text/javascript">
  
  function output() {
 
  var Question = document.getElementById("Question").value;
  var Option1 = document.getElementById("Option1").value;
  var Option2 = document.getElementById("Option2").value;
  var Option3 = document.getElementById("Option3").value;
  var Option4 = document.getElementById("Option4").value;
  var Ans     = document.getElementById("Ans").value;
  
  
  var table = document.getElementById("table");
  var row = table.insertRow(table).outerHTML = 
   "<tr id='row'><td>" + Question 
            + "</td><td>" + Option1 + "</td><td>" + Option2 
            +"</td><td>" + Option3 + "</td><td>" + Option4 +"</td><td>"+Ans+
            "</td></tr>";            
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
      "Option4": $(tr).find('td:eq(4)').text()
    }//tableData[row]
  });
  

            
  TableData.shift(); // first row will be empty - so remove
 
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
    },
    error:function()
    {
               alert('error');
    }
  });  
};

   
</script>
</head>


<body>

   <div class="container-fluid bg-2 text-center">

   <div class="row">
   </div>
   <br><br>

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
   </div>
   </div>
   </div>
    </div>
    </div>
</body>
</html>
