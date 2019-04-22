package Signup;
import DAO.UserDAO;
import Model.User;
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
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String un = request.getParameter("userID");
        String name = request.getParameter("name");
        String email = request.getParameter("emailID");
        String pwd = request.getParameter("password");
        MongoClient mongo = new MongoClient("localhost", 27017);
        Author author=new Author();
        author.setAuthorID(un);
        author.setName(name);
        author.setEmailID(email);
        author.setPassword(pwd);
        AuthorDAO authorDAO=new AuthorDAO();
        int status=authorDAO.checkStatus(author);
        if (status==-1)
        {
            authorDAO.createAuthor(author);
            response.sendRedirect("login.html");
        }
        else
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('This username already exists. Please type another username.');");
            out.println("</script>");
            rd.include(request, response);
        }
    }
}