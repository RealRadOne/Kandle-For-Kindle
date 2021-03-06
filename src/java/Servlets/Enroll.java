/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import Model.Quiz;
import DAO.QuizDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sakshi Sinha
 */
public class Enroll extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
  {
     String UID     = (String)request.getSession().getAttribute("UserID");
     String QID     =request.getParameter("QuizID");
     String QName   =request.getParameter("QuizName");
     QuizDAO qDAO=new QuizDAO();
     Quiz qr=qDAO.FindQuiz(QID);
     Quiz q=new Quiz();
     q.setAuthorID(qr.getAuthorID());
     q.setBookID(qr.getBookID());
     q.setUserID(UID);
     q.setDate(qr.getDate());
     q.setQuizID(QID);
     q.setQuizName(QName);
     q.setMinute(qr.getMinute());
     qDAO.createQuiz(q);
     qDAO.updateQuiz(qr);
     /*
       PrintWriter out=response.getWriter();  
       out.print("<table border='1' width='100%'");  
        {  
                 out.print("<tr><td>"+qr.getQuizID()+"</td><td>"+qr.getUserID()+"</td><td>"+qr.getQuizName()+"</td></tr>");   
        }  
        out.print("</table>");   
        out.close();  
     */
     RequestDispatcher rd = request.getRequestDispatcher("/KonnectList");
     rd.forward(request, response);

  }
}
