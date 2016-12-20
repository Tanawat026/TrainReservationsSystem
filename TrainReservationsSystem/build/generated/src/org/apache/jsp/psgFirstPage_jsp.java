package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class psgFirstPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"dist/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"theme.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Train ticket</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <BODY background=\"images/t4.jpg\"></BODY>\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-inverse\"> \r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <a  class=\"navbar-brand\"  href=\"#\">Train Reservations</a> \r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li> \r\n");
      out.write("                        <form class=\"navbar-form navbar-right\" method=\"POST\" action=\"LoginController\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"sr-only\">Email address</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"sr-only\">Password</label>\r\n");
      out.write("                                <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    <center>\r\n");
      out.write("        <title>Train Reservations</title>\r\n");
      out.write("        ");

            try {
                String message = request.getParameter("message");
                if (message != null) {
        
      out.write("\r\n");
      out.write("        <div class=\"alert alert-danger\" role=\"alert\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-exclamation-sign\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Error:</span>\r\n");
      out.write("            Enter a valid email address or password\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("        <font color=\"white\"><h1>Train Reservations</h1> </font>\r\n");
      out.write("        \r\n");
      out.write("       <font color=\"white\">จองตั๋วรถไฟ <br><br></font> \r\n");
      out.write("        <font color=\"white\">(คุณสามารถขึ้นที่สถานีใดก็ได้ภายในจังหวัดนั้น) <br><br></font>\r\n");
      out.write("        <font color=\"#3371FF\"><h1>Register</h1></font>\r\n");
      out.write("        <form class=\"form-inline\" method=\"POST\" action=\"RegisterController\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"firstname\" placeholder=\"Firstname\"> &nbsp;&nbsp;&nbsp;            \r\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"lastname\" placeholder=\"Lastname\"><br><br> \r\n");
      out.write("            <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\"><br><br>            \r\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\"><br><br>\r\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"repassword\" placeholder=\"Confirm password\"><br><br> \r\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"tel\" placeholder=\"Telephone\"><br><br>\r\n");
      out.write("            ");

                String check = request.getParameter("check");
                if (check != null) {
            
      out.write("\r\n");
      out.write("            <span class=\"label label-danger\">Password not match!!</span>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("            ");

                String data = request.getParameter("data");
                if (data != null) {
            
      out.write(" \r\n");
      out.write("            <span class=\"label label-danger\">All data require!!!</span>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("            ");

                String save = request.getParameter("save");
                if (save != null) {
                    if (save.equals("yes")) {
            
      out.write("\r\n");
      out.write("            <span class=\"label label-success\">Now you can login</span>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <span class=\"label label-danger\">Please try again</span>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            ");

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\">Register</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </cancle>\r\n");
      out.write("</body>\r\n");
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
