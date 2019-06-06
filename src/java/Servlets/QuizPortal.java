package Servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import DAO.QuestionDAO;
import DAO.QuizDAO;
import Model.Question;
import Model.Quiz;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name = "QuizPortal", urlPatterns = {"/QuizPortal"})
public class QuizPortal extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //String quizid=request.getParameter("Q0001");
        String quizid = "Q0001";
        QuestionDAO q=new QuestionDAO();
        List<Question> l=new ArrayList<Question>();
        Question q1=new Question();
        l=q.readQuizQuestions(quizid);
        Quiz q2=new Quiz();
        QuizDAO q3=new QuizDAO();
        q2=q3.readThisQuiz(quizid);
        request.getSession().setAttribute("iterator", 1);
        request.getSession().setAttribute("size", l.size());
        request.getSession().setAttribute("attemptedno", 0);
        request.getSession().setAttribute("score", 0);
        request.getSession().setAttribute("hour",q2.getHour());
        request.getSession().setAttribute("minute",q2.getMinute());
        request.getSession().setAttribute("second",q2.getSecond());
        System.out.println("SIZE OF LIST IS "+l.size());
        for (int i=0;i<l.size();i++)
        {
            q1=l.get(i);
            request.getSession().setAttribute(Integer.toString(i+1)+"question",q1.getQuestion());
            request.getSession().setAttribute(Integer.toString(i+1)+"option1",q1.getOption1());
            request.getSession().setAttribute(Integer.toString(i+1)+"option2",q1.getOption2());
            request.getSession().setAttribute(Integer.toString(i+1)+"option3",q1.getOption3());
            request.getSession().setAttribute(Integer.toString(i+1)+"option4",q1.getOption4());
            request.getSession().setAttribute(Integer.toString(i+1)+"answer",q1.getAns());
            request.getSession().setAttribute(Integer.toString(i+1)+"useranswer",0);
        }
        response.sendRedirect("Start.jsp");
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
    }// </editor-fold>
}