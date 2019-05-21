/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.*;
import Converter.*;
import DAO.*;
import Utility.*;
import com.mongodb.MongoClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import Interfaces.*;

/**
 *
 * @author Akanksha
 */
public class GoalController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        
        response.setContentType("text/html;charset=UTF-8");
         HttpSession session=request.getSession(false);
        String type=request.getParameter("type");
        System.out.println(type);
        if(type.equalsIgnoreCase("BOOK")){
            
        String Values[] = request.getParameterValues("bookid"); 
        String Dates[]=request.getParameterValues("d1");
        String UserID=(String)session.getAttribute("userID");
        GoalbyBOOK gbb=new GoalbyBOOK();
        gbb.SetGoal(Values, Dates, "U0008");
        }
        else if(type.equalsIgnoreCase("AUTHOR")){
             String Values[] = request.getParameterValues("Authorid"); 
        String Dates[]=request.getParameterValues("d1");
        String UserID=(String)session.getAttribute("userID");
        String num[]=request.getParameterValues("num");
        for(int i=0;i<Values.length;i++){
            Values[i]=Values[i]+" "+num[i];
        }
        GoalbyAUTHOR gba=new GoalbyAUTHOR();
        gba.SetGoal(Values, Dates, "U0008");
        }
        
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GoalController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GoalController at  </h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(GoalController.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(GoalController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
