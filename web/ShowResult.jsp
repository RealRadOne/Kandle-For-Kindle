<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
        <style>
body {
  background-color: black;
}
.bg {
  background-image: url("Assets/shivbaba.jpg");
  height: 540px; 
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
.Score {
  border-radius: 5px;
  background-color: #FFFFFF; 
  padding: 20px;
  margin: 20px 0;
  position: absolute;
  height: 240px;
  width: 400px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  top: 55%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
  background: rgba(255,255,255, 0.7);
}
.Label {
  font-weight: bolder;
  font-family: Comic Sans MS, cursive, sans-serif;
  font-size: 30px;
  text-shadow: -2px 0 #424242, 0 2px #424242, 2px 0 #424242, 0 -2px #424242;
  padding: 12px 20px;
  color: white;
  text-align: center;
}
.label1 {
  font-family: Comic Sans MS, cursive, sans-serif;
  text-align: center;
  font-size: 25px;
  font-weight: bold;
  margin: 0 0 20px;
}
input[type=submit] {
  text-align: center;
  //display: inline-block;
  position: relative;
  font-family: Comic Sans MS, cursive, sans-serif;
  font-size: 17px;
  padding: 15px 25px;
  cursor: pointer;
  margin: -12px 310px;
  position: absolute;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
  color: #FFFFFF;
  background-color: #000000;
  border: outset;
}
a {
  font-family: Comic Sans MS, cursive, sans-serif;
  font-size: 17px;
  //display: inline-block;
  background-color: black;
  color: white;
  margin: -40px 25px;
  padding: 15px 25px;
  text-align: center;
  border: outset;
  text-decoration: none;
}
</style>
    </head>
    <body>
        <% request.getSession().setAttribute("iterator",1);%>
        <div id="change">
<div class="Label">
  <label for="Kandle">Kandle</label>
</div>
<div class="bg"> 
<div class="Score">
  <form method="post" action="UserAnswer.jsp">
    <div class="label1">
        <label for="Score">Your score is</label><br><br>
    </div>
    <div class="label1">
        <label for="Score"><%=request.getSession().getAttribute("score").toString()%>/<%=request.getSession().getAttribute("size").toString()%></label><br><br>
    </div>
    <div class="Home">
        <a href="MainServ">Home Page</a>
    </div>
    <div class="Submit">
        <input type="submit" value="See Answers">
    </div>
    </div>
  </form>
</div>
</div>
</div>
</body>
</html>