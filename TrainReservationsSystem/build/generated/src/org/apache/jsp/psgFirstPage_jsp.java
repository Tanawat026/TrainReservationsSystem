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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"dist/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"theme.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"assets/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Train ticket</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form class=\"form-inline\" method=\"POST\" action=\"LoginController\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"sr-only\">Email address</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Email\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"sr-only\">Password</label>\n");
      out.write("                <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            try {
                String message = request.getParameter("message");
                if (message != null) {
        
      out.write("\n");
      out.write("        <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("            <span class=\"glyphicon glyphicon-exclamation-sign\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Error:</span>\n");
      out.write("            Enter a valid email address or password\n");
      out.write("        </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <h1>Register</h1>\n");
      out.write("        <form class=\"form-inline\" method=\"POST\" action=\"RegisterController\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"firstname\" placeholder=\"Firstname\"> &nbsp;&nbsp;&nbsp;            \n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"lastname\" placeholder=\"Lastname\"><br><br> \n");
      out.write("            <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\"><br><br>            \n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\"><br><br>\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"repassword\" placeholder=\"Confirm password\"><br><br> \n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"tel\" placeholder=\"Telephone\"><br><br>\n");
      out.write("            ");

                String check = request.getParameter("check");
                if (check != null) {
            
      out.write("\n");
      out.write("            <span class=\"label label-danger\">Password not match!!</span>\n");
      out.write("            <br><br>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            ");

                String data = request.getParameter("data");
                if (data != null) {
            
      out.write(" \n");
      out.write("            <span class=\"label label-danger\">All data require!!!</span>\n");
      out.write("            <br><br>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            ");

                String save = request.getParameter("save");
                if (save != null) {
                    if (save.equals("yes")) {
            
      out.write("\n");
      out.write("            <span class=\"label label-success\">Now you can login</span>\n");
      out.write("            <br><br>\n");
      out.write("            ");

            } else {
            
      out.write("\n");
      out.write("            <span class=\"label label-danger\">Please try again</span>\n");
      out.write("            <br><br>\n");
      out.write("            ");

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\">Register</button>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
