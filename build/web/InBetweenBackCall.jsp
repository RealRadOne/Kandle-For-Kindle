<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.getSession().setAttribute("iterator",Integer.parseInt(request.getSession().getAttribute("iterator").toString())-1);
            request.getSession().setAttribute("attemptedno",Integer.parseInt(request.getSession().getAttribute("attemptedno").toString())-1);
            response.sendRedirect("UserQuiz.jsp");
        %>
    </body>
</html>
