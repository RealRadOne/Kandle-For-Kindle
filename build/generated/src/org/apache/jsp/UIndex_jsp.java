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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <style>\r\n");
      out.write(".bg-2 \r\n");
      out.write("{ \r\n");
      out.write("    background-color: #000000; /* Dark Black */\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write(".bg-3 \r\n");
      out.write("{ \r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    color: #555555;\r\n");
      out.write("}\r\n");
      out.write(".container-fluid \r\n");
      out.write("{\r\n");
      out.write("  padding-top: 70px;\r\n");
      out.write("  padding-bottom: 70px;\r\n");
      out.write("}\r\n");
      out.write(".img-fluid\r\n");
      out.write("{\r\n");
      out.write("    max-width: 150px;\r\n");
      out.write("    height: auto;\r\n");
      out.write("}\r\n");
      out.write(".card-container \r\n");
      out.write("{\r\n");
      out.write("    display: grid;\r\n");
      out.write("    padding: 1rem;\r\n");
      out.write("    grid-template-columns: repeat(auto-fit, minmax(100px, 1fr));\r\n");
      out.write("    grid-gap: 1rem;\r\n");
      out.write("}\r\n");
      out.write(".card \r\n");
      out.write("{\r\n");
      out.write("    display: grid;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/akstyle.css\">\r\n");
      out.write("  \r\n");
      out.write("  <title>User Page</title>\r\n");
      out.write("  \r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("  <body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  function w3_open() {\r\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"block\";\r\n");
      out.write("}\r\n");
      out.write("function w3_close() {\r\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("function myDropFunc() {\r\n");
      out.write("  var x = document.getElementById(\"demoDrop\");\r\n");
      out.write("  if (x.className.indexOf(\"w3-show\") == -1) {\r\n");
      out.write("    x.className += \" w3-show\";\r\n");
      out.write("    x.previousElementSibling.className += \" w3-green\";\r\n");
      out.write("  } else { \r\n");
      out.write("    x.className = x.className.replace(\" w3-show\", \"\");\r\n");
      out.write("    x.previousElementSibling.className = \r\n");
      out.write("    x.previousElementSibling.className.replace(\" w3-green\", \"\");\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("  function myDropFunc2() {\r\n");
      out.write("  var x = document.getElementById(\"demoDrop2\");\r\n");
      out.write("  if (x.className.indexOf(\"w3-show\") == -1) {\r\n");
      out.write("    x.className += \" w3-show\";\r\n");
      out.write("    x.previousElementSibling.className += \" w3-green\";\r\n");
      out.write("  } else { \r\n");
      out.write("    x.className = x.className.replace(\" w3-show\", \"\");\r\n");
      out.write("    x.previousElementSibling.className = \r\n");
      out.write("    x.previousElementSibling.className.replace(\" w3-green\", \"\");\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write(" <div class=\"w3-sidebar w3-bar-block w3-black w3-animate-left\" style=\"display:none; width:25%\" id=\"mySidebar\">\r\n");
      out.write("  <button class=\"w3-bar-item w3-button w3-large w3-red\"\r\n");
      out.write("  onclick=\"w3_close()\">Close </button>\r\n");
      out.write("  <img  src=\"images.jpg\" class=\"w3-bar-item w3-button w3-xlarge w3-padding-16 w3-black\" alt=\"book\" style=\"width:100%; height: 40%; padding-right: 10px; padding-left: 10px;\">\r\n");
      out.write("  <a href=\"CallGetWords\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">My Vocabulary</a>\r\n");
      out.write("  <div class=\"w3-dropdown-click\">\r\n");
      out.write("    <button class=\"w3-button w3-large w3-padding-16 w3-border w3-black\" onclick=\"myDropFunc()\">Goals <i class=\"fa fa-caret-down\"></i></button>\r\n");
      out.write("    <div id=\"demoDrop\" class=\"w3-dropdown-content w3-bar-block w3-white w3-card-4\">\r\n");
      out.write("      <a href=\"SetGoalbb.jsp\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">Set Goal for books</a>\r\n");
      out.write("      <a href=\"SetGoalba.jsp\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">Set Goal for authors</a>\r\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">Set Goal for genres</a>\r\n");
      out.write("      <a href=\"GoalViewer\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">View your goals</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <a href=\"UpdateProfilePicture.jsp\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">Upload Profile Picture</a>\r\n");
      out.write("  <div class=\"w3-dropdown-click\">\r\n");
      out.write("  <button class=\"w3-button w3-large w3-padding-16 w3-border w3-black\" onclick=\"myDropFunc2()\">Konnects <i class=\"fa fa-caret-down\"></i></button>\r\n");
      out.write("  <div id=\"demoDrop2\" class=\"w3-dropdown-content w3-bar-block w3-white w3-card-4\">\r\n");
      out.write("      <a href=\"KonnectList\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">View Ongoing Konnects</a>\r\n");
      out.write("      <a href=\"Unrlist\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">View Enrolled Konnects</a>\r\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-border w3-black\">View LeaderBoard</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">Logout</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: fixed; top: 5px; left:5px; \">\r\n");
      out.write("  <button class=\"w3-button w3-black w3-xxlarge\" onclick=\"w3_open()\">&#9776;</button>\r\n");
      out.write(" </div>\r\n");
      out.write(" \r\n");
      out.write("  ");

            String Uname=(String)request.getSession().getAttribute("UName");
            String UID=(String)request.getSession().getAttribute("UserID");
            Double Points=(Double)request.getSession().getAttribute("Points");
            String Level=(String)request.getSession().getAttribute("Level");
   
      out.write("\r\n");
      out.write("   <div class=\"container-fluid bg-2 text-center\">\r\n");
      out.write("\r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("   <div class=\"col-sm-8\">\r\n");
      out.write("\r\n");
      out.write("    <section class=\"card-container\" style=\"margin-left: 100px;\">\r\n");
      out.write(" \r\n");
      out.write("    <article class=\"card\" style=\"padding-right: 60px;\">\r\n");
      out.write("    \t<figure class=\"card__thumbnail\">\r\n");
      out.write("        <center><img id=\"z1\" src=\"Assets/learning.png\"></center>\r\n");
      out.write("        </figure>\r\n");
      out.write("        <header class=\"card__title\">\r\n");
      out.write("            <h3>");
      out.print(Uname);
      out.write("</h3>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main class=\"card__description\">\r\n");
      out.write("           User Name\r\n");
      out.write("        </main>\r\n");
      out.write("    </article>\r\n");
      out.write("\r\n");
      out.write("   <article class=\"card\" style=\"padding-right: 60px;\">\r\n");
      out.write("   \t<figure class=\"card__thumbnail\">\r\n");
      out.write("        <center><img  id=\"z1\" src=\"Assets/battery.png\"></center>\r\n");
      out.write("    </figure>\r\n");
      out.write("        <header class=\"card__title\">\r\n");
      out.write("            <h3>");
      out.print(Points);
      out.write("</h3>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main class=\"card__description\">\r\n");
      out.write("           Kindle Points\r\n");
      out.write("        </main>\r\n");
      out.write("    </article>\r\n");
      out.write("\r\n");
      out.write("   <article class=\"card\" style=\"padding-right: 60px;\">\r\n");
      out.write("   \t<figure class=\"card__thumbnail\">\r\n");
      out.write("        <center><img id=\"z1\" src=\"Assets/library.png\"></center>\r\n");
      out.write("    </figure>\r\n");
      out.write("        <header class=\"card__title\">\r\n");
      out.write("            <h3>");
      out.print(UID);
      out.write("</h3>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main class=\"card__description\">\r\n");
      out.write("          User ID\r\n");
      out.write("        </main>\r\n");
      out.write("    </article>\r\n");
      out.write("\r\n");
      out.write("    <article class=\"card\" style=\"padding-right: 20px;\">\r\n");
      out.write("    <figure class=\"card__thumbnail\">\r\n");
      out.write("        <center><img id=\"z1\" src=\"Assets/review.png\"></center>\r\n");
      out.write("    </figure>\r\n");
      out.write("        <header class=\"card__title\">\r\n");
      out.write("            <h3>");
      out.print(Level);
      out.write("</h3>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main class=\"card__description\">\r\n");
      out.write("           User Level\r\n");
      out.write("        </main>\r\n");
      out.write("    </article>\r\n");
      out.write("</section>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("   <div class=\"col-sm-4\">\r\n");
      out.write("   <img src=\"Assets/user.jpg\" class=\"img-fluid img-circle\" alt=\"User\">\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"container-fluid bg-3 text-center\" style=\"background-color: #c7d2e2\">  \r\n");
      out.write("       <center style=\" margin-top: -50px; margin-bottom: 50px\" ><h3 style=\"font-family:Comic Sans MS, cursive, sans-serif;  font-weight: bolder; font-size: 30px; text-shadow: -2px 0 black, 0 2px black, 2px 0 black, 0 -2px black;\">RECENT READS</h3></center>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm-3\">\r\n");
      out.write("    \r\n");
      out.write("    <img src=\"Assets/logo.jpg\" class=\"img-responsive\" id=\"zoom\" alt=\"Image\">\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-3\">\r\n");
      out.write("    \r\n");
      out.write("    <img src=\"Assets/logo.jpg\" class=\"img-responsive\" id=\"zoom\" alt=\"Image\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-sm-3\">\r\n");
      out.write("   \r\n");
      out.write("    <img src=\"Assets/logo.jpg\" class=\"img-responsive\" id=\"zoom\" alt=\"Image\">\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-3\">\r\n");
      out.write("    \r\n");
      out.write("    <img src=\"Assets/logo.jpg\" class=\"img-responsive\" id=\"zoom\" alt=\"Image\">\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </html>\r\n");
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
