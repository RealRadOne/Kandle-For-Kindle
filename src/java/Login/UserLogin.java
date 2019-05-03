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
    @Override
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
            response.sendRedirect("UserSuccessfulLogin.jsp");
        } 
        else if (status==-1)
        {
            response.sendRedirect("UserUnsuccessfulLogin1.jsp");
        }
        else 
        {
            response.sendRedirect("UserUnsuccessfulLogin2.jsp");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        doPost(request,response);
    }
}
