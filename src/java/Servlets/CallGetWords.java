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
   String UID=(String)request.getSession().getAttribute("UID");
   if(UID==null)
   {
       response.sendRedirect("Login.html");
   }
   else
   {
   response.setContentType("text/html");  
   UserDAO qDAO=new UserDAO();
   List<Dictionary> qlist=qDAO.GetWords(UID);
   request.setAttribute("Words",qlist);
   RequestDispatcher rd=request.getRequestDispatcher("WordList.jsp");
   rd.forward(request, response); 
   }
}
}