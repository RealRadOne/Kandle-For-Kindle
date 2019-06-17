<%-- 
    Document   : imagetest
    Created on : 7 Jun, 2019, 11:44:11 AM
    Author     : Akanksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
      <h3>File Upload:</h3>
      Select a file to upload: <br />
      <form action = "FileServlet" method = "post" enctype = "multipart/form-data">
         <input type = "file" name = "file" size = "50" />
         <br />
         <input type = "submit" value = "Upload File" />
      </form>
   </body>
</html>
