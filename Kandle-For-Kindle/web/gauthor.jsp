<%-- 
    Document   : gauthor
    Created on : 2 May, 2019, 5:33:26 PM
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
           List<Author>list=new ArrayList<Author>();
          list=(List<Author>)session.getAttribute("Authors");
            %>
              
<div class="drop">
           <%
for(Author ddd:list){
%>
<option value="<%=ddd.getName()%>" onclick="func(this)"><%=ddd.getName() %> </option>
<%
    }
%>
</div>
    </body>
</html>

