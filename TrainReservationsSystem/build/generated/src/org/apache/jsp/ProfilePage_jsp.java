package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import hiber.Passenger;

public final class ProfilePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body> <center>\r\n");
      out.write("        \r\n");
      out.write("        <BODY background=\"images/tt.jpg\"></BODY>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-inverse\"> \r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li> <a  class=\"navbar-brand\" href=\"Home.jsp\">Train Reservations</a> </li>\r\n");
      out.write("                    <li> <a  href=\"ProfilePage.jsp\">Profile</a> </li>\r\n");
      out.write("                    <li> <a  href=\"AddCreditCard.jsp\">History Ticket</a> </li>\r\n");
      out.write("                    <li> <a  href=\"LogoutController\">Sign out</a> </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>   \r\n");
      out.write("        ");

            try {
                List psg = (List) session.getAttribute("resultPsg");
                Passenger passenger = null;
                for (Object l : psg) {
                    passenger = (Passenger) l;
                }
                String validate = request.getParameter("validate");
                String update = request.getParameter("update");
                String requestChange = request.getParameter("requestChange");
                if (requestChange == null) {
        
      out.write("\r\n");
      out.write("        <font color=\"white\"><br><br> <h1>My Profile</h1></font>\r\n");
      out.write("        \r\n");
      out.write("        <form method=\"GET\" action=\"RequestEditAccountControl\" class=\"form-inline\">\r\n");
      out.write("            <table border =\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    \r\n");
      out.write("             <td><font color=\"white\">Firstname </font></td><td><input class=\"form-control\" type=\"text\" value=\"");
      out.print( passenger.getFirstname());
      out.write("\" readonly></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    \r\n");
      out.write("             <td><font color=\"white\">Lastname</font></td><td><input class=\"form-control\" type=\"text\" value=\"");
      out.print( passenger.getLastname());
      out.write("\" readonly></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <td><font color=\"white\">Email</font></td><td> <input class=\"form-control\" type=\"text\" value=\"");
      out.print( passenger.getEmail());
      out.write("\" readonly></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <td><font color=\"white\">Telephone</font></td><td> <input class=\"form-control\" type=\"text\" value=\"");
      out.print( passenger.getTelNo());
      out.write("\" readonly></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary\" value=\"Edit my profile\"> \r\n");
      out.write("            <a href=\"RequestCngPwController\" class=\"btn btn-primary\">Change password</a>\r\n");
      out.write("        </form>\r\n");
      out.write("        ");

            if (update.equals("true")) {
        
      out.write("\r\n");
      out.write("        <div class=\"alert alert-success\" role=\"alert\">\r\n");
      out.write("            <span class=\"label label-success\">Success</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

        } else if (update.equals("fail")) {
        
      out.write("\r\n");
      out.write("        <div class=\"alert alert-danger\" role=\"alert\">\r\n");
      out.write("            <span class=\"label label-danger\">Please try again!!</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

            }
        } else if (requestChange.equals("E#i!Ac6")) {
        
      out.write("\r\n");
      out.write("        <form method=\"POST\" action=\"EditPassengerControl\" class=\"form-inline\">\r\n");
      out.write("            <font color=\"white\"> <h1>My Profile</h1>  </font>\r\n");
      out.write("            <input type=\"text\" name=\"id\" value=\"");
      out.print( passenger.getPsgId());
      out.write("\" hidden>\r\n");
      out.write("            <table border =\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><font color=\"white\">Firstname </font></td><td><input name=\"firstname\" class=\"form-control\" type=\"text\" value=\"");
      out.print( passenger.getFirstname());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><font color=\"white\">Lastname </font></td><td><input name=\"lastname\" class=\"form-control\" type=\"text\" value=\"");
      out.print( passenger.getLastname());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><font color=\"white\">Email </font> </td><td><input name=\"email\" class=\"form-control\" type=\"text\" value=\"");
      out.print( passenger.getEmail());
      out.write("\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><font color=\"white\">Telephone </font> </td><td><input name=\"tel\" class=\"form-control\" type=\"text\" value=\"");
      out.print( passenger.getTelNo());
      out.write("\"><br></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-success\" value=\"Confirm\"> \r\n");
      out.write("            <a href=\"ProfilePage.jsp\" class=\"btn btn-danger\">Cancel</a>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        ");

        } else if (requestChange.equals("C!2ng99wd")) {
        
      out.write("\r\n");
      out.write("        <font color=\"white\"><h1>Change My Password</h1> </font> \r\n");
      out.write("        \r\n");
      out.write("        <form method=\"POST\" action=\"ChangePwdController\" class=\"form-inline\">\r\n");
      out.write("            <input type=\"text\" name=\"id\" value=\"");
      out.print( passenger.getPsgId());
      out.write("\" hidden>\r\n");
      out.write("            <table border=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><font color=\"white\"> Old Password</font> </td><td> <input name=\"oldpass\" class=\"form-control\" type=\"password\" ></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><font color=\"white\"> New Password</font> </td><td><input name=\"newpass\" class=\"form-control\" type=\"password\" \"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><font color=\"white\">Confirm Password </font> </td><td><input name=\"repass\" class=\"form-control\" type=\"password\" value=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-success\" value=\"Change password\"> \r\n");
      out.write("            <a href=\"ProfilePage.jsp\" class=\"btn btn-danger\">Cancel</a>\r\n");
      out.write("        </form>\r\n");
      out.write("        ");

            if (validate.equals("isOldPassword")) {
        
      out.write("\r\n");
      out.write("        <br><span class=\"label label-danger\">Wrong old password!!</span>\r\n");
      out.write("        ");

        } else if (validate.equals("newPasswordBlank")) {
        
      out.write("\r\n");
      out.write("        <br><span class=\"label label-danger\">Please enter new password!!</span>\r\n");
      out.write("        ");

        } else if (validate.equals("isCorrectRewritePassword")) {
        
      out.write("\r\n");
      out.write("        <br><span class=\"label label-danger\">Please re-enter new password again!!</span>\r\n");
      out.write("        ");

                    }
                }
            } catch (Exception e) {

            }
        
      out.write("\r\n");
      out.write("        </center>\r\n");
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
