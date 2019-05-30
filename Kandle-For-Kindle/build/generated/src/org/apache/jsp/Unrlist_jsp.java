package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Quiz;
import java.util.*;
import java.time.LocalDateTime;

public final class Unrlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\t\r\n");
      out.write(".lasvegas {\r\n");
      out.write("  font-family: 'Pacifico', cursive;\r\n");
      out.write("  font-size:60px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: #FFFFFF;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".neon {\r\n");
      out.write("  font-family: neon;\r\n");
      out.write("  color: #FB4264;\r\n");
      out.write("  font-size: 9vw;\r\n");
      out.write("  line-height: 9vw;\r\n");
      out.write("  text-shadow: 0 0 3vw #F40A35;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("  background-color: #37474F;\r\n");
      out.write("  width:100%;\r\n");
      out.write("  background-image: url(\"Assets/capbak.jpg\");\r\n");
      out.write("  /*overflow: scroll;*/\r\n");
      out.write(" }\r\n");
      out.write(".bg\r\n");
      out.write("{\r\n");
      out.write("    background:transparent;\r\n");
      out.write("    background-image: url(\"Assets/capbak.jpg\");\r\n");
      out.write("    width:100%;\r\n");
      out.write("}\r\n");
      out.write(".bg-2 { \r\n");
      out.write("    background-color: #000000; /* Dark Black */\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write(".card-img-top {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 15vw;\r\n");
      out.write("    object-fit: cover;\r\n");
      out.write("}\r\n");
      out.write(".card-container {\r\n");
      out.write("    display: grid;\r\n");
      out.write("    padding: 1rem;\r\n");
      out.write("    width:800px;\r\n");
      out.write("    height:3 00px;\r\n");
      out.write("    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));\r\n");
      out.write("    grid-gap: 1rem;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    background:transparent;\r\n");
      out.write("    background-image: url(\"Assets/trial.jpeg\");\r\n");
      out.write("    outline: 1px solid black;\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("    margin-left: 50px;\r\n");
      out.write("    margin-right: 50px;\r\n");
      out.write("}\r\n");
      out.write(".container-fluid\r\n");
      out.write("{\r\n");
      out.write("    width:100%;\r\n");
      out.write("    height:150px;\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write(".card {\r\n");
      out.write("    display: grid;\r\n");
      out.write("}\r\n");
      out.write(".left\r\n");
      out.write("{\r\n");
      out.write("    dislpay:inline; \r\n");
      out.write("    float:left\r\n");
      out.write("}\r\n");
      out.write("img {\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write(".card-title\r\n");
      out.write("{\r\n");
      out.write(" font-family: \"Times\", Times New Roman, serif;\r\n");
      out.write(" font-size: 30px;\r\n");
      out.write(" color:#FFFFFF;\r\n");
      out.write(" display: inline-block;\r\n");
      out.write(" clear: both;\r\n");
      out.write(" position: relative;\r\n");
      out.write("}\r\n");
      out.write(".sub-text\r\n");
      out.write("{\r\n");
      out.write(" font-size: 20px;\r\n");
      out.write(" color:#FFFFFF;\r\n");
      out.write(" display: inline-block;\r\n");
      out.write(" clear: both;\r\n");
      out.write(" position: relative;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("       <link rel=\"stylesheet\" href=\"css/akstyle.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.onesignal.com/sdks/OneSignalSDKWorker.js\"></script>\r\n");
      out.write("        <script src=\"https://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,900,700italic,700,600italic,600,400italic\"></script>\r\n");
      out.write("        <title>List</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"container-fluid bg-2 text-center\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("           <div class=\"col-sm-12\">\r\n");
      out.write("                 <h4 class=\"text-left\" style=\" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;\">\r\n");
      out.write("                     <div class=\"lasvegas\">\r\n");
      out.write("                     Your Enrolled Konnects\r\n");
      out.write("                     </div>\r\n");
      out.write("                 </h4>\r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("        ");

            ArrayList<Quiz>qsk=(ArrayList<Quiz>)request.getAttribute("Konnects");
        
      out.write("\r\n");
      out.write("   ");

   for(Quiz qrk:qsk)
   {
   String QID=qrk.getQuizID();
   String QName=qrk.getQuizName();
   Date due=qrk.getDate();
   Date cur=new Date();
   long diff =  (due.getTime()-cur.getTime())/86400000;
   
      out.write("\r\n");
      out.write("   <div class=\"col-sm-12\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("      <section class=\"card-container\" style=\"margin-left: 100px;\"> \r\n");
      out.write("      <article class=\"card\" style=\"padding-right: 60px;\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("      <div class=\"col-sm-8\">\r\n");
      out.write("          <h4 class=\"card-title\">");
      out.print(QID);
      out.write("</h4><br>\r\n");
      out.write("          <p class=\"sub-text\">");
      out.print(QName);
      out.write("</p>\r\n");
      out.write("          <p class=\"card-text\">Days Remaining<br>  <div class=\"neon\"> ");
      out.print(diff);
      out.write("</div></p>\r\n");
      out.write("      <div id=\"timer\">\r\n");
      out.write("      <div id=\"days\"></div>\r\n");
      out.write("      <div id=\"hours\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-4\">\r\n");
      out.write("      <img src=\"Assets/usmino.jpg\" alt=\"Avatar\"  style=\"width:200px\" style=\"height:150px\">\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </article>\r\n");
      out.write("      </section>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   ");

   }
   
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
