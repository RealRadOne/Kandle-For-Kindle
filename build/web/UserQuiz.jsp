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
            .Time {
                border-radius: 5px;
                 
                font-size: 18px;
                font-family: Comic Sans MS, cursive, sans-serif;
                font-weight: bold;
                padding: 20px;
                
                margin-top: 40px;
               
                position: relative;
                
                width: 400px;
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
               
                left: 50%;
                text-align: center;
                -ms-transform: translate(-50%, 0%);
                transform: translate(-50%, 0%);
                background: rgba(255,255,255, 0.8);
            }
            .quiz {
                border-radius: 5px;
                background-color: #FFFFFF; 
                padding: 20px;
                margin-top: 30px;
               
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
            input[type=submit] {
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
        <title>Quiz</title>
        <script type="text/javascript">
            var sec=parseInt(sessionStorage.getItem("second"));
            var min=parseInt(sessionStorage.getItem("minute"));
            var hour=parseInt(sessionStorage.getItem("hour"));
            function button1()
            {
                var a=document.getElementsByClassName('Answer');
                a[0].value="1";
                form.action="ButtonClick";
                form.submit();
            }
            function button2()
            {
                var a=document.getElementsByClassName('Answer');
                a[0].value="2";
                form.action="ButtonClick";
                form.submit();
            }
            function button3()
            {
                var a=document.getElementsByClassName('Answer');
                a[0].value="3";
                form.action="ButtonClick";
                form.submit();
            }
            function button4()
            {
                var a=document.getElementsByClassName('Answer');
                a[0].value="4";
                form.action="ButtonClick";
                form.submit();
            }
            function next(form)
            {
                if (<%=Integer.parseInt(request.getSession().getAttribute("size").toString())%>===<%=Integer.parseInt(request.getSession().getAttribute("iterator").toString())%>)
                {
                    form.action="SubmitCall";
                    form.submit();
                }
                else
                {
                    form.action="InBetweenNextCall";
                    form.submit();
                }
            }
            function back()
            {
                window.location.href="InBetweenBackCall";
            }
        </script>
    </head>
    <body>
        <div id="change">
            <div class="Label">
                <label for="Quiz">Quiz</label>
            </div> 
            <div class="Time">
                <label for="time"> Time Remaining: <label class="tmhour"></label>:<label class="tmmin"></label>:<label class="tmsec"></label> </label>
            </div>
                <div class="quiz">
                    <form method="post">
                        <div class="question">
                            <label for="Question"><label class="question"></label></label><br><br>
                        </div>
                        <div class="options">
                            <label class="o"><label class="option1"></label>
                                <input type="button" name="choice" class="Option1">
                                <input type="radio" name="choice" class="Option1" value="Option1">
                                <span class="oc"></span>
                            </label>
                            <label class="o"><label class="option2"></label>
                                <input type="radio" name="choice" class="Option2" value="Option2">
                                <span class="oc"></span>
                            </label>
                            <label class="o"><label class="option3"></label>
                                <input type="radio" name="choice" class="Option3" value="Option3">
                                <span class="oc"></span>
                            </label>
                            <label class="o"><label class="option4"></label>
                                <input type="radio" name="choice" class="Option4" value="Option4">
                                <span class="oc"></span>
                            </label>
                        </div><br><br><br><br>
                <div>
                    <button type="button" class="Back" value="Back" onclick="back()">Back</button>
                </div>
                <div>
                    <input type="button" class="Next" value="" onclick="next(this.form)">
                </div>
                    <input type="hidden" class="Answer" name="Answer" value="0">
                    </form>
            </div>
        </div>
    </body>
    <script type="text/javascript">
        var x=document.getElementsByClassName("question");
        x[0].innerHTML="Qs "+"<%=(request.getSession().getAttribute("iterator").toString())%>"+". "+"<%=(request.getSession().getAttribute(request.getSession().getAttribute("iterator").toString()+"question").toString())%>";
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
            x[0].value="Submit";
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
        if (a===1)
        {
            //change background of button
            var x=document.getElementsByClassName("Option1");
            x[0].checked = true;
        }
        else if (a===2)
        {
            var x=document.getElementsByClassName("Option2");
            x[0].checked = true;
        }
        else if (a===3)
        {
            var x=document.getElementsByClassName("Option3");
            x[0].checked = true;
        }
        else if (a===4)
        {
            var x=document.getElementsByClassName("Option4");
            x[0].checked = true;
        }
        var th,tm,ts;
        var total=sec+60*min+3600*hour;
        if (hour>9)
            th=hour.toString();
        else
            th='0'+hour.toString();
        if (sec>9)
            ts=sec.toString();
        else
            ts='0'+sec.toString();
        if (min>9)
            tm=min.toString();
        else
            tm='0'+min.toString();
        if (total<=300)
        {
            var x=document.getElementsByClassName("Time");
            x[0].style.color="red";
        }
        var x=document.getElementsByClassName("tmhour");
        x[0].innerHTML=th;
        var x=document.getElementsByClassName("tmmin");
        x[0].innerHTML=tm;
        var x=document.getElementsByClassName("tmsec");
        x[0].innerHTML=ts;
        function Redirect()
        {
            if (sec>0)
            {
                sec=sec-1;
            }
            else
            {
                if (min>0)
                {
                    if (min===5 && hour===0)
                    {
                        var x=document.getElementsByClassName("Time");
                        x[0].style.color="red";
                    }
                    min=min-1;
                    sec=59;
                }
                else
                {
                    if (hour>0)
                    {
                        hour=hour-1;
                        min=59;
                        sec=59;
                    }
                    else
                    {
                        window.location="QuizAnswer";
                    }
                }
            }
            if (hour>9)
                th=hour.toString();
            else
                th='0'+hour.toString();
            if (sec>9)
                ts=sec.toString();
            else
                ts='0'+sec.toString();
            if (min>9)
                tm=min.toString();
            else
                tm='0'+min.toString();
            if (total<=300)
            {
                var x=document.getElementsByClassName("Time");
                x[0].style.color="red";
            }
            var x=document.getElementsByClassName("tmhour");
            x[0].innerHTML=th;
            var x=document.getElementsByClassName("tmmin");
            x[0].innerHTML=tm;
            var x=document.getElementsByClassName("tmsec");
            x[0].innerHTML=ts;
            sessionStorage.setItem("second", sec);
            sessionStorage.setItem("minute", min);
            sessionStorage.setItem("hour", hour);
        }
        var myvar=setInterval('Redirect()', 1000);
    </script>
</html>