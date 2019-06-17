package Servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "QuizAnswer", urlPatterns = {"/QuizAnswer"})
public class QuizAnswer extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int score=0;
        for (int i=0;i<Integer.parseInt(request.getSession().getAttribute("size").toString());i++)
        {
            if ((String)(request.getSession().getAttribute((i+1)+"useranswer"))==(String)(request.getSession().getAttribute((i+1)+"answer")))
            {
                score++;
            }
        }
        request.getSession().setAttribute("score",score);
        response.sendRedirect("ShowResult.jsp");
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