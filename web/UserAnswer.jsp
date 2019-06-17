<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "DAO.QuestionDAO" %>
<%@ page import = "Model.Question" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "java.io.*" %>
<%@ page import = "javax.servlet.ServletException" %>
<%@ page import = "javax.servlet.annotation.WebServlet" %>
<%@ page import = "javax.servlet.http.HttpServlet" %>
<%@ page import = "javax.servlet.http.HttpServletRequest" %>
<%@ page import = "javax.servlet.http.HttpServletResponse" %>
<%@ page import = "javax.servlet.http.HttpSession" %>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            html {
                background-image: url("Assets/star-background-3728.png");
            }
            body {
                background-position: center;
                background-repeat: repeat;
                background-size: cover;
            }
            .Label {
                background-color: black;
                font-weight: bolder;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-size: 30px;
                text-shadow: -2px 0 #424242, 0 2px #424242, 2px 0 #424242, 0 -2px #424242;
                padding: 12px 20px;
                margin: 0;
                height: 46px;
                color: white;
                text-align: center;
            }
            .quiz {
                border-radius: 5px;
                background-color: #FFFFFF; 
                padding: 20px;
                margin-top: 100px;
                margin-bottom: 100px;
                position: relative;
               
                width: 800px;
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
                
                left: 50%;
                -ms-transform: translate(-50%, 0%);
                transform: translate(-50%, 0%);
                background: rgba(255,255,255, 0.8);
            }
            .question {
                display: block;
                position: relative;
                padding-left: 35px;
                margin-bottom: 12px;
                cursor: pointer;
                font-size: 20px;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-weight: bold;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                
            }
            .Result {
                display: block;
                position: relative;
                padding-left: 35px;
                margin-bottom: 12px;
                cursor: pointer;
                font-size: 20px;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-weight: bold;
                color: green;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                left: 27%;
                
            }
            .o {
                display: block;
                position: relative;
                padding-left: 100px;
                margin-bottom: 12px;
                cursor: pointer;
                font-size: 15px;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-weight: bold;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                border-radius: 50%;
               
            }
            .o input {
                position: absolute;
                opacity: 0;
                cursor: pointer;
            }
            .oc {
                position: absolute;
                top: 0;
                left: 0;
                height: 25px;
                width: 25px;
                margin-left: 60px;
                background-color: #bababa;
                border-radius: 50%;
            }
            .o:hover input ~ .oc {
                background-color: #9e9e9e;
            }
            .o input:checked ~ .oc {
                background-color: #2196F3;
            }
            .oc:after {
                content: "";
                position: absolute;
                display: none;
            }
            .o input:checked ~ .oc:after {
                display: block;
            }
            .o .oc:after {
                top: 9px;
                left: 9px;
                width: 8px;
                height: 8px;
                border-radius: 50%;
                background: white;
            } 
            input[type=button] {
                text-align: center;
                display: inline-block;
                position: relative;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-size: 15px;
                font-weight: bold;
                padding: 15px 25px;
                cursor: pointer;
                margin: -28px 340px;
                position: absolute;
                -ms-transform: translate(-50%, -50%);
                transform: translate(-50%, -50%);
                color: #FFFFFF;
                background-color: #000000;
                border: outset;
            }
            .Next {
                left: 35%;
            }
            .Back {
                text-align: center;
                display: inline-block;
                position: relative;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-size: 15px;
                font-weight: bold;
                padding: 15px 25px;
                cursor: pointer;
                margin: -28px 340px;
                position: absolute;
                -ms-transform: translate(-50%, -50%);
                transform: translate(-50%, -50%);
                color: #FFFFFF;
                background-color: #000000;
                border: outset;
                left: -15%;
            }
        </style>
        <title>Answers</title>
        <script type="text/javascript">
            function next(form)
            {
                if (<%=Integer.parseInt(request.getSession().getAttribute("size").toString())%>===<%=Integer.parseInt(request.getSession().getAttribute("iterator").toString())+1%>)
                {
                    var x=document.getElementsByClassName("Next");
                    x[0].value="Home";
                    window.location.href="InBetweenAnswerNextCall";
                }
                else if (<%=Integer.parseInt(request.getSession().getAttribute("size").toString())%>===<%=Integer.parseInt(request.getSession().getAttribute("iterator").toString())%>)
                {
                    form.action="MainServ";
                    form.submit();
                }
                else
                {
                    window.location.href="InBetweenAnswerNextCall";
                }
            }
            function back()
            {
                window.location.href="InBetweenAnswerBackCall";
            }
        </script>
    </head>
    <body>
        <div id="change">
            <div class="Label">
                <label for="Quiz">Answer</label>
            </div> 
                <div class="quiz">
                    <form method="post">
                        <div class="question">
                            <label for="Question"><label class="question"></label></label><br><br>
                        </div>
                        <div class="options">
                            <label class="o"><div class="o1"><label class="option1"></label></div>
                                <input type="checkbox" name="o" class="Option1" value="Option1">
                                <span class="oc"></span>
                            </label>
                            <label class="o"><div class="o2"><label class="option2"></label></div>
                                <input type="checkbox" name="o" class="Option2" value="Option2">
                                <span class="oc"></span>
                            </label>
                            <label class="o"><div class="o3"><label class="option3"></label></div>
                                <input type="checkbox" name="o" class="Option3" value="Option3">
                                <span class="oc"></span>
                            </label>
                            <label class="o"><div class="o4"><label class="option4"></label></div>
                                <input type="checkbox" name="o" class="Option4" value="Option4">
                                <span class="oc"></span>
                            </label><br>
                            <label class="Result"></label>
                        </div><br><br><br>
                <div>
                    <button type="button" class="Back" value="Back" onclick="back()">Back</button>
                </div>
                <div>
                    
                </div>
                <div>
                    <input type="button" class="Next" value="" onclick="next(this.form)">
                </div>
                </form>
            </div>
        </div>
    </body>
    <script type="text/javascript">
        var x=document.getElementsByClassName("question");
        x[0].innerHTML="Qs "+"<%=request.getSession().getAttribute("iterator").toString()%>"+". "+"<%=request.getSession().getAttribute(request.getSession().getAttribute("iterator").toString()+"question").toString()%>";
        var x=document.getElementsByClassName("option1");
        x[0].innerHTML="<%=(request.getSession().getAttribute(request.getSession().getAttribute("iterator").toString()+"option1").toString())%>";
        var x=document.getElementsByClassName("option2");
        x[0].innerHTML="<%=(request.getSession().getAttribute(request.getSession().getAttribute("iterator").toString()+"option2").toString())%>";
        var x=document.getElementsByClassName("option3");
        x[0].innerHTML="<%=(request.getSession().getAttribute(request.getSession().getAttribute("iterator").toString()+"option3").toString())%>";
        var x=document.getElementsByClassName("option4");
        x[0].innerHTML="<%=(request.getSession().getAttribute(request.getSession().getAttribute("iterator").toString()+"option4").toString())%>";
        if (<%=(Integer.parseInt(request.getSession().getAttribute("size").toString()))%>===<%=(Integer.parseInt(request.getSession().getAttribute("iterator").toString()))%>)
        {
            var x=document.getElementsByClassName("Next");
            x[0].value="Home";
        }
        else
        { 
            var x=document.getElementsByClassName("Next");
            x[0].value="Next";
        }
        if (<%=Integer.parseInt(request.getSession().getAttribute("iterator").toString())%>===1)
        {
            var x=document.getElementsByClassName("Back");
            x[0].disabled = true;
            x[0].style.backgroundColor='#282829';
        }
        else
        {
            var x=document.getElementsByClassName("Back");
            x[0].disabled = false;
        }
        var a=<%=Integer.parseInt(request.getSession().getAttribute(request.getSession().getAttribute("iterator").toString()+"useranswer").toString())%>;
        <%
            String a3=request.getSession().getAttribute(request.getSession().getAttribute("iterator").toString()+"answer").toString();
            int b2;
            String a5;
            if (!a3.equals("0"))
            {
                a5=a3.substring(1,a3.length()-1);
                b2=Integer.valueOf(a5);
            }
            else
            {
                b2=0;
            }
        %>
        var b=<%=b2%>;
        if (a===0 && b===1)
        {
            var x=document.getElementsByClassName("Option1");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option1");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="No Answer";
            x[0].style.color = "blue";
        }
        else if (a===0 && b===2)
        {
            var x=document.getElementsByClassName("Option2");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option2");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="No Answer";
            x[0].style.color = "blue";
        }
        else if (a===0 && b===3)
        {
            var x=document.getElementsByClassName("Option3");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option3");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="No Answer";
            x[0].style.color = "blue";
        }
        else if (a===0 && b===4)
        {
            var x=document.getElementsByClassName("Option4");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option4");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="No Answer";
            x[0].style.color = "blue";
        }
        else if (a===1 && b===1)
        {
            var x=document.getElementsByClassName("Option1");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option1");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Correct Answer";
        }
        else if (a===2 && b===2)
        {
            var x=document.getElementsByClassName("Option2");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option2");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Correct Answer";
        }
        else if (a===3 && b===3)
        {
            var x=document.getElementsByClassName("Option3");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option3");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Correct Answer";
        }
        else if (a===4 && b===4)
        {
            var x=document.getElementsByClassName("Option4");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option4");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Correct Answer";
        }
        else if (a===1 && b===2)
        {
            var x=document.getElementsByClassName("Option1");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("option1");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Option2");
            x[0].style.backgroundColor="green";
            x[0].checked = true;
            var x=document.getElementsByClassName("option2");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===1 && b===3)
        {
            var x=document.getElementsByClassName("Option1");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("option1");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Option3");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option3");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===1 && b===4)
        {
            var x=document.getElementsByClassName("Option1");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option4");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option4");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option1");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===2 && b===1)
        {
            var x=document.getElementsByClassName("Option2");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option1");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option1");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option2");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===2 && b===3)
        {
            var x=document.getElementsByClassName("Option2");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option3");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option3");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option2");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===2 && b===4)
        {
            var x=document.getElementsByClassName("Option2");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option4");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option4");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option2");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            var x=document.getElementsByClassName("Result");
            x[0].style.color = "red";
        }
        else if (a===3 && b===1)
        {
            var x=document.getElementsByClassName("Option3");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option1");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option1");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option3");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===3 && b===2)
        {
            var x=document.getElementsByClassName("Option3");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option2");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option2");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option3");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===3 && b===4)
        {
            var x=document.getElementsByClassName("Option3");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option4");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option4");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option3");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===4 && b===1)
        {
            var x=document.getElementsByClassName("Option4");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option1");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option1");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option4");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===4 && b===2)
        {
            var x=document.getElementsByClassName("Option4");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option2");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option2");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option4");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
        else if (a===4 && b===3)
        {
            var x=document.getElementsByClassName("Option4");
            x[0].checked = true;
            x[0].style.backgroundColor="red";
            var x=document.getElementsByClassName("Option3");
            x[0].checked = true;
            x[0].style.backgroundColor="green";
            var x=document.getElementsByClassName("option3");
            x[0].style.color = "green";
            var x=document.getElementsByClassName("option4");
            x[0].style.color = "red";
            var x=document.getElementsByClassName("Result");
            x[0].innerHTML="Wrong Answer";
            x[0].style.color = "red";
        }
    </script>
</html>