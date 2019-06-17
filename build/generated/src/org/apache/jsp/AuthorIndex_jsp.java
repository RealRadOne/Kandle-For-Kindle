package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AuthorIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".bg-2 { \r\n");
      out.write("    background-color: #000000; /* Dark Black */\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write(".bg-3 { \r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    color: #555555;\r\n");
      out.write("}\r\n");
      out.write("  .container-fluid {\r\n");
      out.write("  padding-top: 70px;\r\n");
      out.write("  padding-bottom: 70px;\r\n");
      out.write("}\r\n");
      out.write(".img-fluid{\r\n");
      out.write("    max-width: 150px;\r\n");
      out.write("    height: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-container {\r\n");
      out.write("    display: grid;\r\n");
      out.write("    padding: 1rem;\r\n");
      out.write("    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));\r\n");
      out.write("    grid-gap: 1rem;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    background:transparent;\r\n");
      out.write("    border: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write(".card {\r\n");
      out.write("    display: grid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-img-bottom {\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  height: 30rem;\r\n");
      out.write("  background: url(Assets/original.gif) center no-repeat;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("}\r\n");
      out.write(".left{dislpay:inline; float:left}\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>AuthorIndex</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/akstyle.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("        \r\n");
      out.write("    <body>\r\n");
      out.write("   <div class=\"container-fluid bg-2 text-center\">\r\n");
      out.write("\r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("   <div class=\"col-sm-8\">\r\n");
      out.write("\r\n");
      out.write("    <section class=\"card-container\" style=\"margin-left: 100px;\">\r\n");
      out.write(" \r\n");
      out.write("    <article class=\"card\" style=\"padding-right: 60px;\">\r\n");
      out.write("    \t<figure class=\"card__thumbnail\">\r\n");
      out.write("        <center><img id=\"z1\" src=\"Assets/pen.png\"></center>\r\n");
      out.write("        </figure>\r\n");
      out.write("        <header class=\"card__title\">\r\n");
      out.write("            <h3>RadOne</h3>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main class=\"card__description\">\r\n");
      out.write("           User Name\r\n");
      out.write("        </main>\r\n");
      out.write("    </article>\r\n");
      out.write("\r\n");
      out.write("   <article class=\"card\" style=\"padding-right: 60px;\">\r\n");
      out.write("   \t<figure class=\"card__thumbnail\">\r\n");
      out.write("        <center><img  id=\"z1\" src=\"Assets/drinks.png\"></center>\r\n");
      out.write("    </figure>\r\n");
      out.write("        <header class=\"card__title\">\r\n");
      out.write("            <h3>0</h3>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main class=\"card__description\">\r\n");
      out.write("           Connects\r\n");
      out.write("        </main>\r\n");
      out.write("    </article>\r\n");
      out.write("\r\n");
      out.write("   <article class=\"card\" style=\"padding-right: 60px;\">\r\n");
      out.write("   \t<figure class=\"card__thumbnail\">\r\n");
      out.write("        <center><img id=\"z1\" src=\"Assets/teamwork.png\"></center>\r\n");
      out.write("    </figure>\r\n");
      out.write("        <header class=\"card__title\">\r\n");
      out.write("            <h3>0</h3>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main class=\"card__description\">\r\n");
      out.write("          Upcoming Meets\r\n");
      out.write("        </main>\r\n");
      out.write("    </article>\r\n");
      out.write("    <article class=\"card\" style=\"padding-right: 20px;\">\r\n");
      out.write("    <figure class=\"card__thumbnail\">\r\n");
      out.write("        <center></center>\r\n");
      out.write("    </figure>\r\n");
      out.write("        <header class=\"card__title\">\r\n");
      out.write("        </header>\r\n");
      out.write("        <main class=\"card__description\">\r\n");
      out.write("           \r\n");
      out.write("        </main>\r\n");
      out.write("    </article>\r\n");
      out.write("    </section>\r\n");
      out.write("    <br><br>\r\n");
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <div class=\"col-sm-4\">\r\n");
      out.write("   <img src=\"Assets/user.jpg\" class=\"img-fluid img-circle\" alt=\"User\">\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"container-fluid bg-2 text-center\">  \r\n");
      out.write("  \r\n");
      out.write("   <section>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("          <div class=\"card-block\">\r\n");
      out.write("            <h4 class=\"text-left\" style=\" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;\">\r\n");
      out.write("            CREATE A CONNECT</h4>\r\n");
      out.write("            <p class=\"text-left\" style=\" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;\">\r\n");
      out.write("            Let's Make Your Pre-Release Special\r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"text-left\">Connect with your fans better with Amazon Connect</p>\r\n");
      out.write("            <div class=\"left\"> \r\n");
      out.write("            <a href=\"BasicQuiz.jsp\" class=\"btn btn-primary btn-lg\">ENTER</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          <div class=\"col-md-8\">\r\n");
      out.write("          <div class=\"card-img-bottom\">\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         </section>\r\n");
      out.write("    </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
