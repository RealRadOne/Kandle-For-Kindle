package Servlets;
import  Model.Quiz;
import DAO.QuizDAO;
import java.util.List;
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
        String Uname=(String)request.getSession().getAttribute("Name");
        String UID=(String)request.getSession().getAttribute("UID");
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        out.println("<h1>Konnect List</h1>");  
        QuizDAO qDAO=new QuizDAO();
        List<Quiz> qlist=qDAO.readAllQuiz();
        request.setAttribute("Konnects",qlist);
        RequestDispatcher rd=request.getRequestDispatcher("Konnects.jsp");
        request.getSession().setAttribute("Name",Uname);
        request.getSession().setAttribute("UID",UID);
        rd.forward(request, response); 
}    
}