<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz</title>
        <script>
            var sec=<%=Integer.parseInt(request.getSession().getAttribute("second").toString())%>;
            var min=<%=Integer.parseInt(request.getSession().getAttribute("minute").toString())%>;
            var hour=<%=Integer.parseInt(request.getSession().getAttribute("hour").toString())%>;
            sessionStorage.setItem("second", sec);
            sessionStorage.setItem("minute", min);
            sessionStorage.setItem("hour", hour);
            window.location="UserQuiz.jsp";
        </script>
    </head>
    <body>
    </body>
</html>