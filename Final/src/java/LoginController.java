import java.io.IOException;
import java.io.PrintWriter;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import DAO.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginController extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String un = request.getParameter("username");
        String pwd = request.getParameter("password");
        MongoClient mongo = new MongoClient("localhost", 27017);
        UserDAO userDAO = new UserDAO(mongo);
        User checkuser=new User();
        checkuser=userDAO.checkUser(un);
        if (checkuser.getFlag() && un.equals(checkuser.getUserName()) && pwd.equals(checkuser.getPassword()))
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", un);
            response.sendRedirect("home.jsp"); // Instead of home.jsp, the webpage which should open for successful login should open
        } 
        else if (checkuser.getFlag())
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            out.println("<font color=red>User does not exist.</font>");
            rd.include(request, response);
        }
        else 
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(request, response);
        }
    }
}