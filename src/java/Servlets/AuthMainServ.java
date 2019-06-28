package Servlets;
import DAO.AuthorDAO;
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
public class AuthMainServ extends HttpServlet 
{
//This servlet makes calls to all functions important for making the Index page dynamic
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{ 
    response.setContentType("text/html");
    //UName And UserID will be taken from session in final deployment
    String AuthorID=(String)request.getSession().getAttribute("AuthorID");
    String Name=(String)request.getSession().getAttribute("Name");
    if(AuthorID==null)
    {
        response.sendRedirect("Signup.html");
    }
    else
    {
    request.getSession().setAttribute("AuthName",Name);
    request.getSession().setAttribute("AuthID",AuthorID);
    AuthorDAO ausa=new AuthorDAO();
    int kona=ausa.totKonnects(AuthorID);
    request.getSession().setAttribute("Konnects", kona);
    RequestDispatcher rd=request.getRequestDispatcher("AuthorIndex.jsp");
    rd.forward(request, response); 
    }
}
}