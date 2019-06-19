package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aUpdateProfilePicture_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Upload Profile Picture</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background-color: black;\r\n");
      out.write("            }\r\n");
      out.write("            .bg {\r\n");
      out.write("                background-image: url(\"Assets/4070831354.png\");\r\n");
      out.write("                height: 540px; \r\n");
      out.write("                background-position: center;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("            }\r\n");
      out.write("            .Label {\r\n");
      out.write("                font-weight: bolder;\r\n");
      out.write("                font-family: Comic Sans MS, cursive, sans-serif;\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("                text-shadow: -2px 0 #424242, 0 2px #424242, 2px 0 #424242, 0 -2px #424242;\r\n");
      out.write("                padding: 12px 20px;\r\n");
      out.write("                color: white;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .label1 {\r\n");
      out.write("                font-family: Comic Sans MS, cursive, sans-serif;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-size: 25px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                margin: 20px 0;\r\n");
      out.write("            }\r\n");
      out.write("            input[type=submit] {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                font-family: Comic Sans MS, cursive, sans-serif;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                padding: 15px 25px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                margin: -28px 200px;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                -ms-transform: translate(-50%, -50%);\r\n");
      out.write("                transform: translate(-50%, -50%);\r\n");
      out.write("                color: #FFFFFF;\r\n");
      out.write("                background-color: #000000;\r\n");
      out.write("                border: outset;\r\n");
      out.write("            }\r\n");
      out.write("            input[type=file] {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                font-family: Comic Sans MS, cursive, sans-serif;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                padding: 15px 25px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                margin: -28px 200px;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                -ms-transform: translate(-50%, -50%);\r\n");
      out.write("                transform: translate(-50%, -50%);\r\n");
      out.write("                color: #FFFFFF;\r\n");
      out.write("                background-color: #000000;\r\n");
      out.write("                border: outset;\r\n");
      out.write("            }\r\n");
      out.write("            .Upload {\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("                background-color: #FFFFFF; \r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                margin: 20px 0;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                height: 400px;\r\n");
      out.write("                width: 400px;\r\n");
      out.write("                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\r\n");
      out.write("                top: 55%;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                -ms-transform: translate(-50%, -50%);\r\n");
      out.write("                transform: translate(-50%, -50%);\r\n");
      out.write("                background: rgba(255,255,255, 0.5);\r\n");
      out.write("            }\r\n");
      out.write("            .Upload:hover {\r\n");
      out.write("                background: rgba(255,255,255, 0.7);\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"Label\">\r\n");
      out.write("            <label for=\"Kandle\">Kandle</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bg\">\r\n");
      out.write("            <div class=\"Upload\">\r\n");
      out.write("                <div class=\"label1\">\r\n");
      out.write("                    <label for=\"ProfilePicture\">Profile Picture:</label><br><br><br><br><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form action = \"aFileServlet\" method = \"post\" enctype = \"multipart/form-data\">\r\n");
      out.write("                    <input type=\"file\" name=\"file\" id=\"file\" class=\"inputfile\" data-buttonText=\"Choose Profile Picture\"><br><br><br><br><br>\r\n");
      out.write("                    <input type=\"submit\" value=\"Upload\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
