package Servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ButtonClick extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (Integer.parseInt(request.getSession().getAttribute(request.getSession().getAttribute("iterator").toString()+"useranswer").toString())==0)
        {
            request.getSession().setAttribute(request.getSession().getAttribute("iterator").toString()+"useranswer",Integer.parseInt(request.getParameter("Answer")));
        }
        else if (Integer.parseInt(request.getParameter("Answer"))!=0)
        {
            request.getSession().setAttribute(request.getSession().getAttribute("iterator").toString()+"useranswer",Integer.parseInt(request.getParameter("Answer")));
        }
        response.sendRedirect("UserQuiz.jsp");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}