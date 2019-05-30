package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Quiz;
import java.util.*;

public final class LeaderBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(".ml10 {\n");
      out.write("  position: relative;\n");
      out.write("  font-weight: 900;\n");
      out.write("  font-size: 4em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ml10 .text-wrapper {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding-top: 0.2em;\n");
      out.write("  padding-right: 0.05em;\n");
      out.write("  padding-bottom: 0.1em;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ml10 .letter {\n");
      out.write("  display: inline-block;\n");
      out.write("  line-height: 1em;\n");
      out.write("  transform-origin: 0 0;\n");
      out.write("}\n");
      out.write(".bg-2 \n");
      out.write("{ \n");
      out.write("    background-color: #000000; /* Dark Black */\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write(".bg-3\n");
      out.write("{\n");
      out.write("    background-image: \"Assets/leaderbak.jpg\";\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("       <link rel=\"stylesheet\" href=\"css/akstyle.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,900,700italic,700,600italic,600,400italic\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.min.js\"></script>\n");
      out.write("        <title>List</title>\n");
      out.write("</head>\n");
      out.write("<body background=\"Assets/leaderbak.jpg\">\n");
      out.write("   <div class=\"container-fluid bg-2 text-center\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("           <div class=\"col-sm-12\">\n");
      out.write("                 <h4 class=\"text-left\" style=\" font-family: 'Open Sans', sans-serif;font-weight: 900;font-size: 20px;\">\n");
      out.write("                     <h1 class=\"ml10\">\n");
      out.write("                     <span class=\"text-wrapper\">\n");
      out.write("                     <span class=\"letters\">LeaderBoard</span>\n");
      out.write("                     </span>\n");
      out.write("                     </h1>\n");
      out.write("                 </h4>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("   </div>\n");
      out.write("        ");

            ArrayList<Quiz>qsk=(ArrayList<Quiz>)request.getAttribute("LeaderBoard");
        
      out.write("\n");
      out.write("   ");

   for(int i=0;i<4;i++)
   {
   Quiz qrk=qsk.get(i);
   String Uname=qrk.getUserID();
   int Points=qrk.getScore();
   
      out.write("\n");
      out.write("          \n");
      out.write("   ");

   }
   
      out.write("\n");
      out.write("<script>\n");
      out.write("  $('.ml10 .letters').each(function(){\n");
      out.write("  $(this).html($(this).text().replace(/([^\\x00-\\x80]|\\w)/g, \"<span class='letter'>$&</span>\"));\n");
      out.write("});\n");
      out.write("\n");
      out.write("anime.timeline({loop: true})\n");
      out.write("  .add({\n");
      out.write("    targets: '.ml10 .letter',\n");
      out.write("    rotateY: [-90, 0],\n");
      out.write("    duration: 1300,\n");
      out.write("    delay: function(el, i) {\n");
      out.write("      return 45 * i;\n");
      out.write("    }\n");
      out.write("  }).add({\n");
      out.write("    targets: '.ml10',\n");
      out.write("    opacity: 0,\n");
      out.write("    duration: 1000,\n");
      out.write("    easing: \"easeOutExpo\",\n");
      out.write("    delay: 1000\n");
      out.write("  });\n");
      out.write("</script>\n");
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
