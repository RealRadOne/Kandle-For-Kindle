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
public class AuthorLogin extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String un = request.getParameter("authorID");
        String pwd = request.getParameter("authorpassword");
        AuthorDAO authorDAO = new AuthorDAO();
        Author author=new Author();
        author.setAuthorID(un);
        author.setPassword(pwd);
        int status=authorDAO.checkStatus(author);
        if (status==1)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", un);
            response.sendRedirect("AuthorIndex.html"); // Instead of home.jsp, the webpage which should open for successful login should open
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