package Servlets;
import Model.Dictionary;
import DAO.UserDAO;
import java.util.List;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
public class CallGetWords extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
{
   response.setContentType("text/html");  
   UserDAO qDAO=new UserDAO();
   List<Dictionary> qlist=qDAO.GetWords("U0001");
   request.setAttribute("Words",qlist);
   RequestDispatcher rd=request.getRequestDispatcher("WordList.jsp");
   rd.forward(request, response); 
}
}