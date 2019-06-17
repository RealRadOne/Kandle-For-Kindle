package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.util.List;
import java.util.*;
import Model.Dictionary;
import Servlets.CallGetWords;

public final class WordList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    
    
   

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("  \r\n");
      out.write("  background-color: black;\r\n");
      out.write("}\r\n");
      out.write(".all{\r\n");
      out.write("  padding-top: 70px;\r\n");
      out.write("  padding-left: 50px;\r\n");
      out.write("  padding-bottom: 70px;\r\n");
      out.write("  padding-right: 50px;\r\n");
      out.write("}\r\n");
      out.write(".flip-card {\r\n");
      out.write("  background-color: transparent;\r\n");
      out.write("  width: 430px;\r\n");
      out.write("  height: 80px;\r\n");
      out.write("  perspective: 1000px;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  margin-top: 15px;\r\n");
      out.write("  margin-bottom: 15px;\r\n");
      out.write("  margin-right: 35px;\r\n");
      out.write("  margin-left: 70px;\r\n");
      out.write("}\r\n");
      out.write(".flip-card-inner {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  transition: transform 1s;\r\n");
      out.write("  transform-style: preserve-3d;\r\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\r\n");
      out.write("}\r\n");
      out.write(".flip-card:hover .flip-card-inner {\r\n");
      out.write("  transform: rotateY(180deg);\r\n");
      out.write("}\r\n");
      out.write(".flip-card-front, .flip-card-back {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  backface-visibility: hidden;\r\n");
      out.write("}\r\n");
      out.write(".flip-card-front {\r\n");
      out.write("  font-size: 170%;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write(" \r\n");
      out.write("  color: black;\r\n");
      out.write("  z-index: 2;\r\n");
      out.write("  padding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write(".flip-card-back {\r\n");
      out.write("  font-size: 130%;\r\n");
      out.write("  font-weight: lighter;\r\n");
      out.write("  background-color: #a7b0bc;\r\n");
      out.write("  color: black;\r\n");
      out.write("  padding-top: 10px;\r\n");
      out.write("  transform: rotateY(180deg);\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("}\r\n");
      out.write(".text1{\r\n");
      out.write("  margin-top: 9px;\r\n");
      out.write("}\r\n");
      out.write("#f1{\r\n");
      out.write("   background-color: #c0cfdb;\r\n");
      out.write("}\r\n");
      out.write("#f2{\r\n");
      out.write("   background-color: #e8d3a9;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/akstyle.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"w3-sidebar w3-bar-block w3-black w3-animate-left\" style=\"display:none; width:25%\" id=\"mySidebar\">\r\n");
      out.write("  <button class=\"w3-bar-item w3-button w3-large w3-red\"\r\n");
      out.write("  onclick=\"w3_close()\">Close </button>\r\n");
      out.write("  <img  src=\"images.jpg\" class=\"w3-bar-item w3-button w3-xlarge w3-padding-16 w3-black\" alt=\"book\" style=\"width:100%; height: 40%; padding-right: 10px; padding-left: 10px;\">\r\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">Read A Book</a>\r\n");
      out.write("  <a href=\"CallGetWords\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">My Vocabulary</a>\r\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">Set Goal</a>\r\n");
      out.write("  <a href=\"MainServ\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">Home</a>\r\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-large w3-padding-16 w3-border w3-black\">Logout</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"all\">\r\n");
      out.write("<div style=\"position: fixed; top: 5px; left:5px; \">\r\n");
      out.write("  <button class=\"w3-button w3-black w3-xxlarge\" onclick=\"w3_open()\">&#9776;</button>\r\n");
      out.write(" </div>\r\n");

//PrintWriter out = response.getWriter();
int i=1;
List<Dictionary>list=new ArrayList<Dictionary>();
    try{
        list=(List<Dictionary>)session.getAttribute("Words");
                //(List<dictionary>)request.getAttribute("WordListak");
     }
    catch(NullPointerException a){
        
    }
//if(list!=null){
//out.println("<p>"+list+"</p>");
//}

      out.write('\r');
      out.write('\n');
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Words}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("dictionary");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write('\r');
            out.write('\n');
/*<c:forEach items="${Words}" var="dictionary" >
${dictionary.word}
${dictionary.meaning}
*/
            out.write('\r');
            out.write('\n');

//for(dictionary ddd:list){
if(i<=2){
 
            out.write("\r\n");
            out.write(" \r\n");
            out.write("<div class=\"flip-card\">\r\n");
            out.write("  <div class=\"flip-card-inner\" >\r\n");
            out.write("    <div class=\"flip-card-front\" id=\"f1\">\r\n");
            out.write("        <p class=\"text1\">");
//=ddd.getWord()
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dictionary.word}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("    </div>\r\n");
            out.write("    <div class=\"flip-card-back\">\r\n");
            out.write("      <p class=\"text2\">");
//=ddd.getMeaning()
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dictionary.meaning}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("    </div>\r\n");
            out.write("  </div>\r\n");
            out.write("</div>\r\n");

 }
else{

            out.write("\r\n");
            out.write("<div class=\"flip-card\">\r\n");
            out.write("  <div class=\"flip-card-inner\">\r\n");
            out.write("    <div class=\"flip-card-front\" id=\"f2\">\r\n");
            out.write("      <p class=\"text1\">");
//=ddd.getWord()
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dictionary.word}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("    </div>\r\n");
            out.write("    <div class=\"flip-card-back\">\r\n");
            out.write("      <p class=\"text2\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dictionary.meaning}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("    </div>\r\n");
            out.write("  </div>\r\n");
            out.write("</div>\r\n");
            out.write(" ");

  }
i++;
if(i==5)
i=1;
//}
 
            out.write('\r');
            out.write('\n');
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  function w3_open() {\r\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"block\";\r\n");
      out.write("}\r\n");
      out.write("function w3_close() {\r\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
