package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AuthorSuccessfulLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Successful Login</title>\r\n");
      out.write("        <style>\r\n");
      out.write("\t    body, html {\r\n");
      out.write("\t\theight: 100%;\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t    }\r\n");
      out.write("            .background {\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("\t\theight: 100%;\r\n");
      out.write("\t\topacity: 0.3;\r\n");
      out.write("\t\tbackground-size: cover;\r\n");
      out.write("\t\tbackground-position: center;\r\n");
      out.write("            }\r\n");
      out.write("            .image {\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\ttop: 50%;\r\n");
      out.write("\t\tleft: 50%;\r\n");
      out.write("\t\t-ms-transform: translate(-50%, -50%);\r\n");
      out.write("\t\ttransform: translate(-50%, -50%);\r\n");
      out.write("\t\tbox-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <script type = \"text/javascript\">\r\n");
      out.write("            <!--\r\n");
      out.write("                function Redirect() {\r\n");
      out.write("                    window.location = \"AuthMainServ\";\r\n");
      out.write("                }            \r\n");
      out.write("                setTimeout('Redirect()', 3000);\r\n");
      out.write("            //-->\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<img src='Assets/AuthorBackgroundSuccessful.png' class='background'>\r\n");
      out.write("        \t<div class='Success'>\r\n");
      out.write("            \t\t<img src='Assets/SuccessLogin.png'class='image'>\r\n");
      out.write("        \t</div>\r\n");
      out.write("\t</div>\r\n");
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
