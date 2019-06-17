package Servlets;
import Model.User;
import DAO.UserDAO;
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
public class MainServ extends HttpServlet 
{
//This servlet makes calls to all functions important for making the Index page dynamic
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{ 
    response.setContentType("text/html");
    //UName And UserID will be taken from session in final deployment
    request.getSession().setAttribute("UName","RadOne");
    request.getSession().setAttribute("UserID","U0001");
    double Points;
    String Level;
    User u=new User();
    u.setUserId("RadOne");
    u.setUserName("U0001");
    UserDAO ud=new UserDAO();
    int status=ud.checkStatus(u);
    if(status!=1)
    {
        Points=0.0;
        Level="Bronze";
        u.setKindlePoints(0.0);
        u.setLevel("Bronze");
        ud.createUser(u);
    }
    else
    {
       Points=ud.totPoints("RadOne");
       Level=ud.ULevel("RadOne"); 
    }
    request.getSession().setAttribute("Points",Points);
    request.getSession().setAttribute("Level",Level);
    RequestDispatcher rd=request.getRequestDispatcher("UIndex.jsp");
    rd.forward(request, response); 
}
}