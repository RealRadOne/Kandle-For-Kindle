package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Quiz;
import java.util.*;

public final class BasicQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("body, html {\n");
      out.write("  height: 100%;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write(".bg {\n");
      out.write("  /* The image used */\n");
      out.write("   background-image: url(\"Assets/pract.gif\");\n");
      out.write("\n");
      out.write("  /* Full height */\n");
      out.write("  height: 100%; \n");
      out.write("\n");
      out.write("  /* Center and scale the image nicely */\n");
      out.write("  background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write(".bg-2 { \n");
      out.write("    background-color: #000000; /* Dark Black */\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write(".loginBox\n");
      out.write("{\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%,-50%);\n");
      out.write("  width: 350px;\n");
      out.write("  padding: 80px 40px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  height: 500px;\n");
      out.write("  background: rgba(0,0,0,.6);\n");
      out.write("}\n");
      out.write(".user \n");
      out.write("{\n");
      out.write("    width: 100px;\n");
      out.write("    height: 100px;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    overflow: hidden;\n");
      out.write("    position: absolute;\n");
      out.write("    top: calc(-100px/2);\n");
      out.write("    left: calc(50% - 50px);\n");
      out.write("}\n");
      out.write(".loginBox p\n");
      out.write("{\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".loginBox input\n");
      out.write("{\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".loginBox input[type=\"text\"],\n");
      out.write(".loginBox input[type=\"Password\"]\n");
      out.write("{\n");
      out.write("  border: none;\n");
      out.write("  border-bottom: 1px solid #fff;\n");
      out.write("  outline: none;\n");
      out.write("  height: 40px;\n");
      out.write("  background: transparent;\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 16px;\n");
      out.write("}\n");
      out.write("::placeholder\n");
      out.write("{\n");
      out.write("  color: rgba(255,255,255,.5);\n");
      out.write("}\n");
      out.write(".form-group label{\n");
      out.write("    font-family: 'Lato', sans-serif;\n");
      out.write("    font-weight: 900;\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"bg\">\n");
      out.write("<div class=\"loginBox\">\n");
      out.write("       <form action=\"Editprocess\" method=\"GET\" name=\"myForm\">\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("       <label for=\"Name\">Name:</label>\n");
      out.write("       <input type=\"text\" class=\"form-control\" id=\"Name\" name=\"Name\">\n");
      out.write("       </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("       <label for=\"BookName\">Book-Name:</label>\n");
      out.write("       <input type=\"text\" class=\"form-control\" id=\"BookName\" name=\"BookName\">\n");
      out.write("       </div>\n");
      out.write("       <div class=\"form-group\">  \n");
      out.write("       <label for=\"Date\">Date:</label>\n");
      out.write("       <input class=\"form-control\" id=\"date\" name=\"date\" placeholder=\"MM/DD/YYY\" type=\"text\"/>\n");
      out.write("       </div>\n");
      out.write("       <a href=\"Konedit\" class=\"btn btn-primary btn-lg\">Back</a>\n");
      out.write("       <button class=\"btn btn-primary btn-lg\" type=\"submit\">Submit</button>\n");
      out.write("      </form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("      var date_input=$('input[name=\"date\"]'); //our date input has the name \"date\"\n");
      out.write("      var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : \"body\";\n");
      out.write("      var options={\n");
      out.write("        format: 'mm/dd/yyyy',\n");
      out.write("        container: container,\n");
      out.write("        todayHighlight: true,\n");
      out.write("        autoclose: true,\n");
      out.write("      };\n");
      out.write("      date_input.datepicker(options);\n");
      out.write("    })\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
