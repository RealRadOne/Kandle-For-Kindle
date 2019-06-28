package Signup;
import DAO.UserDAO;
import Model.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class UserSignup extends HttpServlet 
{
    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        String un = request.getParameter("userID");
        String name = request.getParameter("name");
        String email = request.getParameter("emailID");
        String pwd = request.getParameter("password");
        User user=new User();
        user.setUserId(un);
        user.setUserName(name);
        user.setEmail(email);
        user.setPassword(pwd);
        user.setKindlePoints(0.0);
        user.setLevel("Bronze");
        UserDAO userDAO=new UserDAO();
        int status=userDAO.checkStatus(user);
        if (status==-1)
        {
        userDAO.createUser(user);
        response.sendRedirect("UserSuccessfulSignup.jsp");
        }
        else
        {
            response.sendRedirect("UserUnsuccessfulSignup1.jsp");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        doPost(request,response);
    }
}