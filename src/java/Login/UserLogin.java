package Login;
import java.io.IOException;
import java.io.PrintWriter;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import DAO.*;
import Model.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class UserLogin extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String un = request.getParameter("userID");
        String pwd = request.getParameter("userpassword");
        UserDAO userDAO = new UserDAO();
        User user=new User();
        user.setUserId(un);
        user.setPassword(pwd);
        int status=userDAO.checkStatus(user);
        if (status==1)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", un);
            response.sendRedirect("home.jsp"); // Instead of home.jsp, the webpage which should open for successful login should open
        } 
        else if (status==-1)
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Username does not exist');");
            out.println("</script>");
            rd.include(request, response);
        }
        else 
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Username or password is incorrect');");
            out.println("</script>");
            rd.include(request, response);
        }
    }
}