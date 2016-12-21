package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hiber.Passenger;
import java.util.List;
import hiber.Train;
import hiber.TrainDetail;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"dist/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"theme.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Train Reservations</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
      out.write("        <BODY background=\"images/tt1.jpg\"></BODY>\r\n");
      out.write("        <nav class=\"navbar navbar-inverse\"> \r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li> <a  class=\"navbar-brand\" href=\"Home.jsp\">Train Reservations</a> </li>\r\n");
      out.write("                    <li> <a  href=\"ProfilePage.jsp\">Profile</a> </li>\r\n");
      out.write("                    <li> <a  href=\"TicketHistoryController\" >History Ticket</a> </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <p class=\"navbar-text navbar-right\"><a  href=\"LogoutController\" >Sign out</a> &nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>   \r\n");
      out.write("        <br>\r\n");
      out.write("        <font color=\"white\"><h1>Phuket Trains</h1></font>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <font color=\"white\">จองตั๋วรถไฟ <br><br></font>\r\n");
      out.write("\r\n");
      out.write("        <font color=\"white\">(คุณสามารถขึ้นที่สถานีใดก็ได้ภายในจังหวัดนั้น) <br><br></font>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form name=\"SearchTicket\" action=\"TrainSearchController\" class=\"form-inline\" >\r\n");
      out.write("            <font color=\"white\">สถานีต้นทาง</font> \r\n");
      out.write("            <select class=\"form-control\" name =\"TrainFrom\">\r\n");
      out.write("                <option selected disabled>เลือกต้นทาง</option>\r\n");
      out.write("                <option value=\"Phuket\">Phuket</option>\r\n");
      out.write("                <option value=\"Suratthani\">Suratthani</option>\r\n");
      out.write("                <option value=\"Krabi\">Krabi</option>\r\n");
      out.write("                <option value=\"Trang\">Trang</option>\r\n");
      out.write("                <option value=\"Ranong\">Ranong</option>\r\n");
      out.write("                <option value=\"Phang-nga\">Phang-nga</option>\r\n");
      out.write("            </select>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <font color=\"white\">สถานีปลายทาง</font>\r\n");
      out.write("            <select class=\"form-control\" name =\"TrainTo\">\r\n");
      out.write("                <option selected disabled>เลือกปลายทาง</option>\r\n");
      out.write("                <option value=\"Phuket\">Phuket</option>\r\n");
      out.write("                <option value=\"Suratthani\">Suratthani</option>\r\n");
      out.write("                <option value=\"Krabi\">Krabi</option>\r\n");
      out.write("                <option value=\"Trang\">Trang</option>\r\n");
      out.write("                <option value=\"Ranong\">Ranong</option>\r\n");
      out.write("                <option value=\"Phang-nga\">Phang-nga</option>\r\n");
      out.write("            </select>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input type=\"submit\"  class=\"btn btn-primary\" value=\"ค้นหาตั๋วโดยสาร\" name=\"searchButton\" /> <br><br>\r\n");
      out.write("        </form>\r\n");
      out.write("        ");

            try {
                // Create a session object if it is already not created.
                List<Object[]> trainSearchList = (List<Object[]>) session.getAttribute("searchResult");
                List psg = (List) session.getAttribute("resultPsg");
                Passenger passenger = null;
                for (Object l : psg) {
                    passenger = (Passenger) l;
                }
                if (trainSearchList != null) {
        
      out.write("\r\n");
      out.write("        <table class=\"table table-bordered\" >\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td color=\"white\">ชื่อรถไฟ</td>\r\n");
      out.write("                    <td color=\"white\">สถานีต้นทาง</td>\r\n");
      out.write("                    <td color=\"white\">สถานีปลายทาง</td>\r\n");
      out.write("                    <td color=\"white\">วันที่ออก</td>\r\n");
      out.write("                    <td color=\"white\">เวลาออก</td> \r\n");
      out.write("                    <td color=\"white\">เวลาถึง</td>\r\n");
      out.write("                    <td color=\"white\">ราคา(บาท)</td>\r\n");
      out.write("                    <td color=\"white\">จอง</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            \r\n");
      out.write("                ");
 

                    for (Object[] obj : trainSearchList) {
                        Train train = (Train) obj[0];
                        TrainDetail traindetail = (TrainDetail) obj[1];
                
      out.write(" \r\n");
      out.write("                <tr>\r\n");
      out.write("                <form action=\"TicketWaittingController\" method=\"POST\" class=\"form-inline\" >\r\n");
      out.write("                <input type=\"text\" name=\"psgId\" value =\"");
      out.print( passenger.getPsgId());
      out.write("\" hidden>\r\n");
      out.write("                <input type=\"text\" name=\"trainid\" value =\"");
      out.print( traindetail.getTrainTravelId());
      out.write("\" hidden>\r\n");
      out.write("                <input type=\"text\" name=\"trainTravelId\" value =\"");
      out.print( traindetail.getTrainTravelId());
      out.write("\" hidden>\r\n");
      out.write("                <input type = \"text\"  name = \"trainname\" value=\"");
      out.print( train.getTrainname() );
      out.write("\" hidden>\r\n");
      out.write("                <input type = \"text\"  name = \"fromlocation\" value=\"");
      out.print( train.getFromLocation() );
      out.write("\" hidden>\r\n");
      out.write("                <input type = \"text\"  name = \"tolocation\" value=\"");
      out.print( train.getToLocation() );
      out.write("\" hidden>\r\n");
      out.write("                <input type = \"text\"  name = \"departuredate\" value=\"");
      out.print( traindetail.getDepartureDate() );
      out.write("\" hidden>\r\n");
      out.write("                <input type = \"text\"  name = \"departuretime\" value=\"");
      out.print( train.getDepartureTime() );
      out.write("\" hidden>\r\n");
      out.write("                <input type = \"text\"  name = \"arrivaltime\" value=\"");
      out.print( train.getArrivalTime() );
      out.write("\" hidden>\r\n");
      out.write("                <input type = \"text\"  name = \"price\" value=\"");
      out.print( traindetail.getPrice() );
      out.write("\" hidden>\r\n");
      out.write("                <td >");
 out.println(train.getTrainname()); 
      out.write("</td>\r\n");
      out.write("                <td>");
 out.println(train.getFromLocation()); 
      out.write("</td>\r\n");
      out.write("                <td>");
 out.println(train.getToLocation()); 
      out.write("</td>\r\n");
      out.write("                <td>");
 out.println(traindetail.getDepartureDate()); 
      out.write("</td>\r\n");
      out.write("                <td>");
 out.println(train.getDepartureTime()); 
      out.write("</td>\r\n");
      out.write("                <td>");
 out.println(train.getArrivalTime()); 
      out.write("</td>\r\n");
      out.write("                <td>");
 out.println(traindetail.getPrice()); 
      out.write("</td>\r\n");
      out.write("                <td><input type =\"submit\" class=\"btn btn-primary\" name =\"submit\" value = \"จองตั๋วโดยสาร\"></td>   \r\n");
      out.write("            </form>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        ");
 }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\r\n");
      out.write("    </center>\r\n");
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
