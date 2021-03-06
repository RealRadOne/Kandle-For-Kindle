package Signup;
import DAO.*;
import Model.*;
import com.mongodb.MongoClient;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthorSignup extends HttpServlet 
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
        Author author=new Author();
        author.setAuthorID(un);
        author.setName(name);
        author.setEmail(email);
        author.setPassword(pwd);
        AuthorDAO authorDAO=new AuthorDAO();
        int status=authorDAO.checkStatus(author);
        if (status==-1)
        {
            authorDAO.createAuthor(author);
            response.sendRedirect("AuthorSuccessfulSignup.jsp");
        }
        else
        {
            response.sendRedirect("AuthorUnsuccessfulSignup1.jsp");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        doPost(request,response);
    }
}