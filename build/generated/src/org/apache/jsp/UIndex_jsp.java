package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" <style>\n");
      out.write(".bg-2 \n");
      out.write("{ \n");
      out.write("    background-color: #000000; /* Dark Black */\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write(".bg-3 \n");
      out.write("{ \n");
      out.write("    background-color: #ffffff;\n");
      out.write("    color: #555555;\n");
      out.write("}\n");
      out.write(".container-fluid \n");
      out.write("{\n");
      out.write("  padding-top: 70px;\n");
      out.write("  padding-bottom: 70px;\n");
      out.write("}\n");
      out.write(".img-fluid\n");
      out.write("{\n");
      out.write("    max-width: 150px;\n");
      out.write("    height: auto;\n");
      out.write("}\n");
      out.write(".card-container \n");
      out.write("{\n");
      out.write("    display: grid;\n");
      out.write("    padding: 1rem;\n");
      out.write("    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));\n");
      out.write("    grid-gap: 1rem;\n");
      out.write("}\n");
      out.write(".card \n");
      out.write("{\n");
      out.write("    display: grid;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/akstyle.css\">\n");
      out.write("  \n");
      out.write("  <title>User Page</title>\n");
      out.write("  \n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("  <body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("  function w3_open() {\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("}\n");
      out.write("function w3_close() {\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("function myDropFunc() {\n");
      out.write("  var x = document.getElementById(\"demoDrop\");\n");
      out.write("  if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("    x.className += \" w3-show\";\n");
      out.write("    x.previousElementSibling.className += \" w3-green\";\n");
      out.write("  } else { \n");
      out.write("    x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    x.previousElementSibling.className = \n");
      out.write("    x.previousElementSibling.className.replace(\" w3-green\", \"\");\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("  <div class=\"w3-sidebar w3-bar-block w3-black w3-animate-left\" style=\"display:none; width:25%\" id=\"mySidebar\">\n");
      out.write("  <button class=\"w3-bar-item w3-button w3-large w3-red\"\n");
      out.write("  onclick=\"w3_close()\">Close </button>\n");
      out.write("  <img  src=\"images.jpg\" class=\"w3-bar-item w3-button w3-xlarge w3-padding-16 w3-black\" alt=\"book\" style=\"width:100%; height: 40%; padding-right: 10px; padding-left: 10px;\">\n");
      out.write("  <a href=\"CallGetWords\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">My Vocabulary</a>\n");
      out.write("  <div class=\"w3-dropdown-click\">\n");
      out.write("    <button class=\"w3-button w3-large w3-padding-16 w3-border w3-black\" onclick=\"myDropFunc()\">Goals <i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("    <div id=\"demoDrop\" class=\"w3-dropdown-content w3-bar-block w3-white w3-card-4\">\n");
      out.write("      <a href=\"SetGoalbb.jsp\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">Set Goal for books</a>\n");
      out.write("      <a href=\"SetGoalba.jsp\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">Set Goal for authors</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">Set Goal for genres</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">View your goals</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">Account Settings</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">Logout</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"position: fixed; top: 5px; left:5px; \">\n");
      out.write("  <button class=\"w3-button w3-black w3-xxlarge\" onclick=\"w3_open()\">&#9776;</button>\n");
      out.write(" </div>\n");
      out.write(" <!--div class=\"dropdown\" style=\"float:right;\">\n");
      out.write("  <button class=\"dropbtn w3-right\" ><img src=\"avatar.png\" style=\"width: 40px; height: 40px\"></button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("  <a class=\"w3-border\" href=\"#\">Profile Settings</a>\n");
      out.write("  <a class=\"w3-border\" href=\"#\">Bookmarks</a>\n");
      out.write("  <a class=\"w3-border\" href=\"#\">Logout</a>\n");
      out.write("  </div-->\n");
      out.write("   <div class=\"container-fluid bg-2 text-center\">\n");
      out.write("\n");
      out.write("   <div class=\"row\">\n");
      out.write("   <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("    <section class=\"card-container\" style=\"margin-left: 100px;\">\n");
      out.write(" \n");
      out.write("    <article class=\"card\" style=\"padding-right: 60px;\">\n");
      out.write("    \t<figure class=\"card__thumbnail\">\n");
      out.write("        <center><img id=\"z1\" src=\"Assets/learning.png\"></center>\n");
      out.write("        </figure>\n");
      out.write("        <header class=\"card__title\">\n");
      out.write("            <h3>RadOne</h3>\n");
      out.write("        </header>\n");
      out.write("        <main class=\"card__description\">\n");
      out.write("           User Name\n");
      out.write("        </main>\n");
      out.write("    </article>\n");
      out.write("\n");
      out.write("   <article class=\"card\" style=\"padding-right: 60px;\">\n");
      out.write("   \t<figure class=\"card__thumbnail\">\n");
      out.write("        <center><img  id=\"z1\" src=\"Assets/battery.png\"></center>\n");
      out.write("    </figure>\n");
      out.write("        <header class=\"card__title\">\n");
      out.write("            <h3>0</h3>\n");
      out.write("        </header>\n");
      out.write("        <main class=\"card__description\">\n");
      out.write("           Kindle Points\n");
      out.write("        </main>\n");
      out.write("    </article>\n");
      out.write("\n");
      out.write("   <article class=\"card\" style=\"padding-right: 60px;\">\n");
      out.write("   \t<figure class=\"card__thumbnail\">\n");
      out.write("        <center><img id=\"z1\" src=\"Assets/library.png\"></center>\n");
      out.write("    </figure>\n");
      out.write("        <header class=\"card__title\">\n");
      out.write("            <h3>0</h3>\n");
      out.write("        </header>\n");
      out.write("        <main class=\"card__description\">\n");
      out.write("          Books Read\n");
      out.write("        </main>\n");
      out.write("    </article>\n");
      out.write("\n");
      out.write("    <article class=\"card\" style=\"padding-right: 20px;\">\n");
      out.write("    <figure class=\"card__thumbnail\">\n");
      out.write("        <center><img id=\"z1\" src=\"Assets/review.png\"></center>\n");
      out.write("    </figure>\n");
      out.write("        <header class=\"card__title\">\n");
      out.write("            <h3>0</h3>\n");
      out.write("        </header>\n");
      out.write("        <main class=\"card__description\">\n");
      out.write("           User Level\n");
      out.write("        </main>\n");
      out.write("    </article>\n");
      out.write("</section>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   <div class=\"col-sm-4\">\n");
      out.write("   <img src=\"Assets/user.jpg\" class=\"img-fluid img-circle\" alt=\"User\">\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"container-fluid bg-3 text-center\" style=\"background-color: #c7d2e2\">  \n");
      out.write("       <center style=\" margin-top: -50px; margin-bottom: 50px\" ><h3 style=\"font-family:Comic Sans MS, cursive, sans-serif;  font-weight: bolder; font-size: 30px; text-shadow: -2px 0 black, 0 2px black, 2px 0 black, 0 -2px black;\">RECENT READS</h3></center>\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("    \n");
      out.write("    <img src=\"Assets/logo.jpg\" class=\"img-responsive\" id=\"zoom\" alt=\"Image\">\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("    \n");
      out.write("    <img src=\"Assets/logo.jpg\" class=\"img-responsive\" id=\"zoom\" alt=\"Image\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("   \n");
      out.write("    <img src=\"Assets/logo.jpg\" class=\"img-responsive\" id=\"zoom\" alt=\"Image\">\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("    \n");
      out.write("    <img src=\"Assets/logo.jpg\" class=\"img-responsive\" id=\"zoom\" alt=\"Image\">\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  </html>\n");
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
