package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hiber.Service;
import hiber.Ticketinfo;

public final class PaymentTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Payment</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body> <center>\r\n");
      out.write("        <BODY background=\"images/ww.jpg\"></BODY>\r\n");
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
      out.write("        <font color=\"White\"><h1>Payment</h1></font>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("            ");

               Ticketinfo ticketinfo = (Ticketinfo) session.getAttribute("ticketinfo");
                String trainname = (String) session.getAttribute("trainname");
                String fromlocation = (String) session.getAttribute("fromlocation");
                String tolocation = (String) session.getAttribute("tolocation");
                String departuretime = (String) session.getAttribute("departuretime");
                String arrivaltime = (String) session.getAttribute("arrivaltime");
                Service service = new Service();
               int ticketId = service.getAllTicketinfo() + 1;
               int price = ticketinfo.getPriceAll();
               //out.println("-----------------------------------"+price+"----------------------------------------");
            
      out.write("\r\n");
      out.write("            <font color=\"White\">Ticket Detail <br><br></font>\r\n");
      out.write("            \r\n");
      out.write("            <form name =\"payment\"  class=\"form-inline\" action = \"TicketAddController\">\r\n");
      out.write("            <input type =\"text\" name = \"ticketId\" value=\"");
      out.print( ticketId );
      out.write("\" hidden>\r\n");
      out.write("           <input type =\"text\" name = \"psgId\" value=\"");
      out.print( ticketinfo.getPsgId() );
      out.write("\" hidden>\r\n");
      out.write("            <input type =\"text\" name = \"trainTravelId\" value=\"");
      out.print( ticketinfo.getTrainTravelId() );
      out.write("\" hidden>\r\n");
      out.write("            <input type =\"text\" name = \"departuredate\" value=\"");
      out.print( ticketinfo.getDepartureDate() );
      out.write("\" hidden>\r\n");
      out.write("            <input type =\"text\" name = \"psgQuantity\" value=\"");
      out.print( ticketinfo.getPsgQuantity() );
      out.write("\" hidden>\r\n");
      out.write("            <input type =\"text\" name = \"priceall\" value=\"");
      out.print( ticketinfo.getPriceAll() );
      out.write("\" hidden>\r\n");
      out.write("            \r\n");
      out.write("            <font color=\"White\"> Ticket Number : </font>&nbsp; <input type =\"text\" class=\"form-control\" name = \"ticketid\" value=\"");
      out.print( ticketId );
      out.write("\" disabled> <br>\r\n");
      out.write("            \r\n");
      out.write("            <font color=\"White\"> Train Name : </font>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type =\"text\" class=\"form-control\" name = \"trainname\" value=\"");
      out.print( trainname );
      out.write("\" disabled><br>\r\n");
      out.write("            \r\n");
      out.write("           <font color=\"White\">  Departure Date :</font>  <input type =\"text\" class=\"form-control\" name = \"departureDate\" value=\"");
      out.print( ticketinfo.getDepartureDate() );
      out.write("\" disabled><br>\r\n");
      out.write("            \r\n");
      out.write("           <font color=\"White\"> Origin : </font>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            &nbsp;<input type =\"text\"  class=\"form-control\" name = \"fromlocation\" value=\"");
      out.print( fromlocation );
      out.write("\" disabled>  <br>\r\n");
      out.write("            \r\n");
      out.write("           <font color=\"White\"> Destination : </font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type =\"text\" class=\"form-control\" name = \"tolocation\" value=\"");
      out.print( tolocation );
      out.write("\" disabled><br>\r\n");
      out.write("            \r\n");
      out.write("           <font color=\"White\"> Departure Time : </font>  <input type =\"text\"  class=\"form-control\" name = \"departuretime\" value=\"");
      out.print( departuretime );
      out.write("\" disabled><br>\r\n");
      out.write("            \r\n");
      out.write("           <font color=\"White\"> Arrival Time : </font>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type =\"text\" class=\"form-control\"  name = \"arrivaltime\" value=\"");
      out.print( arrivaltime );
      out.write("\" disabled><br>\r\n");
      out.write("            \r\n");
      out.write("           <font color=\"White\"> Price : </font>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input type =\"text\" class=\"form-control\" name = \"price\" value=\"");
      out.print( price );
      out.write("\" disabled>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("           <font color=\"White\"> <h1> Payment </h1> </font> \r\n");
      out.write("          <font color=\"White\"> Card Name :  </font>  &nbsp;&nbsp;&nbsp;&nbsp; <input type =\"text\" class=\"form-control\" name=\"cardname\" value=\"\"><br>\r\n");
      out.write("          <font color=\"White\"> Card Number : </font>  &nbsp; <input type =\"text\" class=\"form-control\" name=\"cardnumber\" value=\"\"><br>\r\n");
      out.write("          <font color=\"White\"> Expired Month : </font>   <input type =\"text\" class=\"form-control\" name=\"expmonth\" value=\"\"><br>\r\n");
      out.write("          <font color=\"White\"> Expired Year : </font>   &nbsp; &nbsp;<input type =\"text\" class=\"form-control\" name=\"expyear\" value=\"\"><br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type =\"submit\" name =\"summit\" class=\"btn btn-primary\" value =\"Confirm payment\"><br>\r\n");
      out.write("         <br><br><br>\r\n");
      out.write("        </form>\r\n");
      out.write("    </center>\r\n");
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
