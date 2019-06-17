/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import Model.Question;
import DAO.QuestionDAO;
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
public class Editprocess extends HttpServlet 
{
     protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
    
    String Ques    = (String)request.getSession(false).getAttribute("Question");
    String Option1 = request.getParameter("Option1");
    String Option2 = request.getParameter("Option2"); 
    String Option3 = request.getParameter("Option3");
    String Option4 = request.getParameter("Option4");
    String Ans     = request.getParameter("Ans");
    QuestionDAO qsk=new QuestionDAO();
    Question q=qsk.fetchQuestion(Ques);
    q.setOption1(Option1);
    q.setOption2(Option2);
    q.setOption3(Option3);
    q.setOption4(Option4);
    q.setAns(Ans);
    qsk.updateQuestion(q);
       /*
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
      out.print("<table border='1' width='100%'");   
                 out.print("<tr><td>"+"</td><td>"+q.getQuestion()+"</td><td>"+q.getOption1()+"</td></tr>");   
        out.print("</table>");   
        out.close();  
    */
    RequestDispatcher view = request.getRequestDispatcher("/Konedit");
    view.forward(request, response);
             
}
}
