package Login;
import java.io.IOException;
import DAO.*;
import Model.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AuthorLogin extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        String un = request.getParameter("authorID");
        String pwd = request.getParameter("authorpassword");
        AuthorDAO authorDAO = new AuthorDAO();
        Author author=new Author();
        author.setAuthorID(un);
        author.setPassword(pwd);
        int status=authorDAO.checkStatus(author);
        if (status==1)
        {
            Author fin=authorDAO.findByID(un);
            request.getSession().setAttribute("Name",fin.getName());
            request.getSession().setAttribute("AuthorID",un);
            response.sendRedirect("AuthorSuccessfulLogin.jsp"); 
        } 
        else if (status==-1)
        {
            response.sendRedirect("AuthorUnsuccessfulLogin1.jsp");
        }
        else 
        {
            response.sendRedirect("AuthorUnsuccessfulLogin2.jsp");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        doPost(request,response);
    }
}