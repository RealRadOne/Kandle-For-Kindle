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
public class AddItems extends HttpServlet 
{

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String UserID=(String)request.getSession().getAttribute("UserID");
        int a=getgoalsl.getnumgoals(UserID);
        String objJSON="";
        if(a<6){
        String s=request.getParameter("q");
        String type=request.getParameter("type");
        System.out.println(s);
        
        if(type.equalsIgnoreCase("BOOK")){
            Book b=Getbooks.Getthisbook(s);
            objJSON = new Gson().toJson(b);
        }
        if(type.equalsIgnoreCase("AUTHOR")){
            Author b=Getauthors.Getthisauthor(s);
            objJSON = new Gson().toJson(b);
        }}
       
        try (PrintWriter out = response.getWriter()) 
        {
 
            if(a<6)
            out.print(objJSON);
            else
                out.print("{No}");
            
        }
         
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
