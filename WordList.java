/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@Author Sakshi Sinha
 */
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import utility.*;
import dbutils.*;
import classes.*;
/**
 *
 * @author Sakshi Sinha
 */
@WebServlet(urlPatterns={"/WordList"})

public class WordList extends HttpServlet {
     private static final long serialVersionUID = 1L;
     
     public WordList(){
         super();
     }
   

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
{
    
    
    String UserID="5";
    
    Connection conn = (Connection)request.getAttribute("ATTRIBUTE_FOR_CONNECTION");
    
    String errorString=null;
    List<dictionary>list=null;
    try{
        list=Dbutils.getWords(conn,UserID);
    }
      catch(SQLException e){
        e.printStackTrace();
        errorString=e.getMessage();
    }
    request.setAttribute(errorString, conn);
    request.setAttribute("WordList",list);
    System.out.println("Success");
    RequestDispatcher dispatcher=request.getServletContext().getNamedDispatcher("WEB-INF/views/WordList.jsp");
    dispatcher.forward(request,response);
}
@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
    doGet(request,response);
}
    
}
