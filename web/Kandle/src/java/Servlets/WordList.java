package Servlets;

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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    
    String UserID="U0002";
     List<dictionary>list=new ArrayList<dictionary>();
    Connection conn;
         try {
             conn = connection.getMySQLConnection();
             String errorString=null;
    /*dictionary d=new dictionary("1","hello","ahahahah");
    dictionary d2=new dictionary("2","helo","ahhahah");
    dictionary d3=new dictionary("3","hllo","ahahaah");*/
   
    try{
       list=Dbutils.getWords(conn,UserID);
    }
      catch(SQLException e){
        e.printStackTrace();
        errorString=e.getMessage();
    }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(WordList.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(WordList.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    
   /* list.add(d);
    list.add(d2);
    list.add(d3);*/
   // request.setAttribute(errorString, conn);
    request.setAttribute("WordListak",list);
   request.getSession().setAttribute("Words", list);
    response.sendRedirect("wordlistview.jsp");
    //System.out.println("Success");
    try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Success msg " + request.getContextPath() + "</h1>");
            //for(int i=0;i<list.size();i++){
             out.println("<p>"+list+"</p><br>");
             for(dictionary ddd:list){
                 out.println("<p>"+ddd.getWord()+ddd.getMeaning()+"</p><br>");
             }
            //}
            out.println("</body>");
            out.println("</html>");
    }
     
    /*RequestDispatcher dispatcher=request.getServletContext().getNamedDispatcher("web/wordlistview.jsp");
    dispatcher.forward(request,response);*/
    //request.getRequestDispatcher("wordlistview.jsp").forward(request, response);
}
@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
    doGet(request,response);
}
    
}
