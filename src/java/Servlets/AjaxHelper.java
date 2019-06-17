/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import java.util.List;
import java.util.ArrayList;
import Model.*;
import Converter.*;
import DAO.*;
import Utility.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akanksha
 */
public class AjaxHelper extends HttpServlet {
public AjaxHelper(){
         super();
}

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String s=request.getParameter("q");
        //int a=getgoalsl.getnumgoals("U0005");
        //request.getSession().setAttribute("Num", a);
        String type=request.getParameter("type");
        if(type.equalsIgnoreCase("BOOK"))
        {
            List<Book> l=new ArrayList<Book>();
            l=Getbooks.GetBooks(s); 
            request.getSession().setAttribute("Books", l);
            response.sendRedirect("gbook.jsp");
        }
        if(type.equalsIgnoreCase("AUTHOR"))
        {
            List<Author> l=new ArrayList<Author>();
            l=Getauthors.GetAuthors(s); 
            request.getSession().setAttribute("Authors", l);
            response.sendRedirect("gauthor.jsp");
        }
        if(type.equalsIgnoreCase("GENRE"))
        {
            List<Author> l=new ArrayList<Author>();
            l=Getauthors.GetAuthors(s); 
            request.getSession().setAttribute("Authors", l);
            response.sendRedirect("ggenre.jsp");
        }
        
       
       // processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        doGet(request,response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
