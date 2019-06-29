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
        int n=Integer.parseInt(request.getSession().getAttribute("size").toString());
        System.out.println("size="+n);
        for (int i=0;i<n;i++)
        {
            String a1 = Integer.toString(i+1);
            System.out.println("a1="+a1);
            String a2=request.getSession().getAttribute(a1+"useranswer").toString();
            System.out.println("a2="+a2);
            String a3=request.getSession().getAttribute(a1+"answer").toString();
            System.out.println("a3="+a3);
            int b1,b2;
            b1=Integer.valueOf(a2);
            b2=Integer.valueOf(a3);
            System.out.println("b1="+b1);
            System.out.println("b2="+b2);
            if (b1==b2)
            {
                score++;
            }
            System.out.println("score="+score);
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