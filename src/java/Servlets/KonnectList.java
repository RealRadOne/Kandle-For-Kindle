package Servlets;
import  Model.Quiz;
import DAO.QuizDAO;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class KonnectList extends HttpServlet 
{

protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        out.println("<h1>Konnect List</h1>");  
        QuizDAO qDAO=new QuizDAO();
        List<Quiz> qlist=qDAO.readAllQuiz();
        request.setAttribute("Konnects",qlist);
        RequestDispatcher rd=request.getRequestDispatcher("Konnects.jsp");
        rd.forward(request, response); 
}    
}