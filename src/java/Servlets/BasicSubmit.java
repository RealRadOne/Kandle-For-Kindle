/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import Model.Quiz;
import DAO.QuizDAO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author Sakshi Sinha
 */
public class BasicSubmit extends HttpServlet 
{ 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
     String AuthName=(String)request.getSession().getAttribute("AuthName");
     String AuthID=(String)request.getSession().getAttribute("AuthID");
     String QuizID=request.getParameter("QuizID");
     String QuizName = request.getParameter("Name");
     String BookName = request.getParameter("BookName");
     String Date = (String)request.getParameter("date");
     Quiz q=new Quiz();
     q.setQuizID(QuizID);
     q.setAuthorID(AuthID);
     q.setQuizName(QuizName);
     q.setDate(Date);
     QuizDAO qd=new QuizDAO();
     qd.createQuiz(q);
     request.getSession().setAttribute("AuthName",AuthName);
     request.getSession().setAttribute("AuthID",AuthID);
     request.getSession().setAttribute("QuizName",QuizName);
     RequestDispatcher rd=request.getRequestDispatcher("Create.jsp");
     rd.forward(request, response); 
    }
}
