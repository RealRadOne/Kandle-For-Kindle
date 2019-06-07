package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Quiz;
import Model.Question;
import java.util.*;

public final class Konnects_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
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
      out.write(".card-container {\n");
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
      out.write("\n");
      out.write("</style>\n");
      out.write(" <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/akstyle.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>List</title>\n");
      out.write(" </head>\n");
      out.write("    <body>\n");
      out.write("   <div class=\"container-fluid bg-2 text-center\">\n");
      out.write("\n");
      out.write("   <div class=\"row\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("           <div class=\"col-sm-12\">\n");
      out.write("                 <h4 class=\"text-left\" style=\" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;\">\n");
      out.write("                 Ongoing Connects\n");
      out.write("                 </h4>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("   <br><br>  \n");
      out.write("        ");

            ArrayList<Quiz>qsk=(ArrayList<Quiz>)request.getAttribute("Konnects");
        
      out.write("\n");
      out.write("   ");

   for(Quiz qrk:qsk)
   {String QID=qrk.getQuizID();
    String QName=qrk.getQuizName();
   
      out.write("\n");
      out.write("    <div class=\"col-sm-12\">\n");
      out.write("\n");
      out.write("      <section class=\"card-container\" style=\"margin-left: 100px;\"> \n");
      out.write("      <article class=\"card\" style=\"padding-right: 60px;\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-8\">\n");
      out.write("       <h4 class=\"card-title\">");
      out.print(QID);
      out.write("</h4>\n");
      out.write("       <p class=\"card-text\">");
      out.print(QName);
      out.write("</p>\n");
      out.write("       <a href=\"#\" class=\"btn btn-primary\">Enroll</a> \n");
      out.write("      </div>\n");
      out.write("       <div class=\"col-sm-4\">\n");
      out.write("       <img src=\"Assets/Quiz.png\" class=\"img-fluid img-circle\" alt=\"User\">\n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("      </article>\n");
      out.write("      </section>\n");
      out.write("      </div>\n");
      out.write("   ");

   }
   
      out.write("\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
