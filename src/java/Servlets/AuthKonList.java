/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.QuizDAO;
import Model.Quiz;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sakshi Sinha
 */
public class AuthKonList extends HttpServlet 
{
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        out.println("<h1>Konnect List</h1>");  
        QuizDAO qDAO=new QuizDAO();
        List<Quiz> qlist=qDAO.findByAuthor("RadOne");
        request.setAttribute("Konnects",qlist);
        RequestDispatcher rd=request.getRequestDispatcher("AuthorKonList.jsp");
        rd.forward(request, response); 
} 
}
