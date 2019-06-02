/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import Model.Question;
import DAO.QuestionDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sakshi Sinha
 */
public class Konedit extends HttpServlet 
{
   protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        out.println("<h1>Konnect List</h1>");  
        QuestionDAO qDAO=new QuestionDAO();
        List<Question> qlist=qDAO.QuesByQuiz("Tester020");
        request.setAttribute("QuizID","Tester020");
        request.setAttribute("Questions",qlist);
        RequestDispatcher rd=request.getRequestDispatcher("Konedit.jsp");
        rd.forward(request, response); 
} 
}