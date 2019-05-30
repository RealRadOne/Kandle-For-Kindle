<%-- 
    Document   : g
    Created on : 16 Mar, 2019, 7:20:30 PM
    Author     : Akanksha
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.*" %>
<%@page import="Model.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style type="text/css">
	option{
		cursor: pointer;
                background-color: rgb(204, 212, 226);
	}
	option:hover{
		background-color: rgb(99, 135, 198);
	}
	.drop{
		background-color: rgb(204, 212, 226);
		 position: absolute;
  		 margin-left: 45px;
                 margin-top:-10px;
                 z-index:100;
                 display:block;
                 width:450px;
                height:35px;
                
	}
</style>
    <body>
        <%
           List<Book>list=new ArrayList<Book>();
          list=(List<Book>)session.getAttribute("Books");
            %>
              
<div class="drop">
           <%
for(Book ddd:list){
%>
<option value="<%=ddd.getName()%>" onclick="func(this)"><%=ddd.getName() %> </option>
<%
    }
%>
</div>
    </body>
</html>
