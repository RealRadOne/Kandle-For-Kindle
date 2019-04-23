package Servlets;
import Model.*;
import Converter.*;
import DAO.*;
import Listener.*;
import Utility.*;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class CallGetWords extends HttpServlet {
     private static final long serialVersionUID = 1L;
     public CallGetWords(){
         super();
}

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
{
    List<Dictionary>list=new ArrayList<Dictionary>();
    HttpSession session=request.getSession(false); 
    String UserID=(String)session.getAttribute("userID");
    /*dictionary d=new dictionary("1","hello","ahahahah");
    dictionary d2=new dictionary("2","helo","ahhahah");
    dictionary d3=new dictionary("3","hllo","ahahaah");*/
    list=GetWords.getWords(UserID);
            
   /* list.add(d);
    list.add(d2);
    list.add(d3);*/
   // request.setAttribute(errorString, conn);
   request.setAttribute("WordListak",list);
   request.getSession().setAttribute("Words", list);
   response.sendRedirect("wordlistview.jsp");
    //System.out.println("Success");
    try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Success msg " + request.getContextPath() + "</h1>");
            //for(int i=0;i<list.size();i++){
             out.println("<p>"+list+"</p><br>");
             for(Dictionary ddd:list){
                 out.println("<p>"+ddd.getWord()+ddd.getMeaning()+"</p><br>");
             }
            //}
            out.println("</body>");
            out.println("</html>");
    }
     
    /*RequestDispatcher dispatcher=request.getServletContext().getNamedDispatcher("web/wordlistview.jsp");
    dispatcher.forward(request,response);*/
    //request.getRequestDispatcher("wordlistview.jsp").forward(request, response);
}
@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
    doGet(request,response);
}
    
}
