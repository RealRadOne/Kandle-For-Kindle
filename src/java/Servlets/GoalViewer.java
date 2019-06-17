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
import java.util.List;
import Interfaces.*;
import Model.*;
import Utility.*;
import java.util.ArrayList;
import java.util.Date;
import DAO.AuthorDAO;

/**
 *
 * @author Akanksha
 */
public class GoalViewer extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        GoalbyAUTHOR g1=new GoalbyAUTHOR();
        List<Goal> temp=g1.ViewGoals("U0005");
        List<String> gba=new ArrayList<String>();
        Date current=new Date();
        List<Integer> daysa=new ArrayList<Integer>();
        List<String> idgs=new ArrayList<String>();
        if(temp!=null){
        for(Goal a:temp){
            GoalbyAuthor tmp=(GoalbyAuthor)a;
            Date tmpd=tmp.getDate();
             long diff=tmpd.getTime()-current.getTime();
             long day=diff/(1000*60*60*24);
             daysa.add(Integer.parseInt(String.valueOf(day)));
             AuthorDAO ado=new AuthorDAO();
             idgs.add(tmp.getGoalId());
             gba.add((ado.findAuthor(tmp.getAuthorId())).getName()+","+tmp.getNum());
        }}
        request.getSession().setAttribute("Author", gba);
        request.getSession().setAttribute("adays", daysa);
        request.getSession().setAttribute("gid", idgs);
        GoalbyBOOK g2=new GoalbyBOOK();
        List<Goal> temp2=g2.ViewGoals("U0005");
        
        List<Book> gbb=new ArrayList<Book>();
        List<Integer> daysb=new ArrayList<Integer>();
        List<String> idbs=new ArrayList<String>();
        for(Goal a:temp2){
            GoalbyBook tmp=(GoalbyBook)a;
            Date tmpd=tmp.getDate();
            long diff=tmpd.getTime()-current.getTime();
             long day=diff/(1000*60*60*24);
             daysb.add(Integer.parseInt(String.valueOf(day)));
             Book b1=new Book();
             idbs.add(tmp.getGoalId());
             b1=Getbooks.GetbookbyId(tmp.getBookID());
             System.out.println(b1.getAuthor()+","+b1.getName());
            gbb.add(b1);
            
        }
        System.out.println(gbb);
        request.getSession().setAttribute("Book", gbb);
        request.getSession().setAttribute("bdays", daysb);
        request.getSession().setAttribute("bid", idbs);
        response.sendRedirect("ViewGoals.jsp");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GoalViewer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GoalViewer at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
