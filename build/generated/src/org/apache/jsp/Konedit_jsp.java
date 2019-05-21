package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Quiz;
import Model.Question;
import java.util.*;

public final class Konedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\t\n");
      out.write("body{\n");
      out.write("  background-color: #37474F;\n");
      out.write("  /*overflow: scroll;*/\n");
      out.write(" }\n");
      out.write(".bg-2 { \n");
      out.write("    background-color: #000000; /* Dark Black */\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write(".card-img-top {\n");
      out.write("    width: 100%;\n");
      out.write("    height: 15vw;\n");
      out.write("    object-fit: cover;\n");
      out.write("}\n");
      out.write(".styler {\n");
      out.write("    display: grid;\n");
      out.write("    padding: 1rem;\n");
      out.write("    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));\n");
      out.write("    grid-gap: 1rem;\n");
      out.write("    color: #ffffff;\n");
      out.write("    background:transparent;\n");
      out.write("    background-image: url(\"Assets/quizzo.jpg\");\n");
      out.write("    outline: 1px solid black;\n");
      out.write("    margin-bottom: 50px;\n");
      out.write("}\n");
      out.write(".card {\n");
      out.write("    display: grid;\n");
      out.write("}\n");
      out.write(".left{dislpay:inline; float:left}\n");
      out.write(".img-fluid{\n");
      out.write("    max-width: 150px;\n");
      out.write("    height: auto;\n");
      out.write("}\n");
      out.write(".center {\n");
      out.write("    margin: auto;\n");
      out.write("    width: 60%;\n");
      out.write("    padding: 20px;\n");
      out.write("    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("       <link rel=\"stylesheet\" href=\"css/akstyle.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>List</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <div class=\"container-fluid bg-2 text-center\">\n");
      out.write("\n");
      out.write("   <div class=\"row\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("           <div class=\"col-sm-12\">\n");
      out.write("                 <h4 class=\"text-left\" style=\" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;\">\n");
      out.write("                 Your Kindle Konnects\n");
      out.write("                 </h4>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("   <br><br>  \n");
      out.write("        ");

            ArrayList<Question>qsk=(ArrayList<Question>)request.getAttribute("Questions");
            String QID=(String)request.getAttribute("QuizID");
        
      out.write("\n");
      out.write("   ");

   for(Question qrk:qsk)
   {
    List<String>data=new ArrayList<String>();
    String QName=qrk.getQuestion();
    data.add(QName);
    String Option1=qrk.getOption1();
    data.add(Option1);
    String Option2=qrk.getOption2();
    data.add(Option2);
    String Option3=qrk.getOption3();
    data.add(Option3);
    String Option4=qrk.getOption4();
    data.add(Option4);
    String Ans=qrk.getAns();
    data.add(Ans);
    session.setAttribute("QuizID",QID);
    session.setAttribute("QDat",data);
   
      out.write("\n");
      out.write("   <div class=\"col-sm-12\">\n");
      out.write("      <section class=\"styler\" style=\"margin-left: 100px;\"> \n");
      out.write("       <div class=\"row\">\n");
      out.write("       <div class=\"col-sm-8\"> \n");
      out.write("           <div id=\"card\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <p class=\"card-title\">");
      out.print(QName);
      out.write("</p>\n");
      out.write("            <a href=\"Editlog.jsp\" class=\"btn btn-primary btn-lg\">Edit</a>\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"col-sm-4\">\n");
      out.write("       <img src=\"Assets/Quiz.png\" class=\"img-fluid img-circle\" alt=\"User\">\n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      </section>\n");
      out.write("      </div>\n");
      out.write("   ");

   }
   
      out.write("\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
