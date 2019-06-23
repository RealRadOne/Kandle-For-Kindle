/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.*;
import Utility.*;
import com.google.gson.Gson;
/**
 *
 * @author Akanksha
 */
public class Addbook extends HttpServlet { 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String s=request.getParameter("q");
        Book b=Getbooks.Getthisbook(s);
        String objJSON = new Gson().toJson(b);
        /*Book b=new Book();
b.setName("Saranya");
b.setKindlePoints(20);
b.setAuthor("AUGUTHA");*/
        //request.getSession().setAttribute("book",b);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //out.print("{\"name\":\""+b.getName()+"\",\"points\":"+b.getKindlePoints()+"\"}");
            out.print(objJSON);
            
        }
         
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
       doGet(request, response);
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
