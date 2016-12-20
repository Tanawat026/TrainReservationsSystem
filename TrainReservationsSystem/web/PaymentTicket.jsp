<%-- 
    Document   : PaymentTicket
    Created on : Dec 19, 2016, 1:59:33 PM
    Author     : Filmm
--%>

<%@page import="hiber.Service"%>
<%@page import="hiber.Ticketinfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="dist/css/bootstrap-theme.min.css" rel="stylesheet">
        <link href="assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
        <link href="theme.css" rel="stylesheet">
        <script src="assets/js/ie-emulation-modes-warning.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment</title>
    </head>
    <body> <center>
        <BODY background="images/ww.jpg"></BODY>
        <nav class="navbar navbar-inverse"> 
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li> <a  class="navbar-brand" href="Home.jsp">Train Reservations</a> </li>
                    <li> <a  href="ProfilePage.jsp">Profile</a> </li>
                    <li> <a  href="AddCreditCard.jsp">History Ticket</a> </li>
                    <li> <a  href="LogoutController">Sign out</a> </li>
                </ul>
            </div>
        </nav>   
        <font color="White"><h1>Payment</h1></font>
        
        
            <%
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
            %>
            <font color="White">Ticket Detail <br><br></font>
            
            <form name ="payment"  class="form-inline" action = "TicketAddController">
            <input type ="text" name = "ticketId" value="<%= ticketId %>" hidden>
           <input type ="text" name = "psgId" value="<%= ticketinfo.getPsgId() %>" hidden>
            <input type ="text" name = "trainTravelId" value="<%= ticketinfo.getTrainTravelId() %>" hidden>
            <input type ="text" name = "departuredate" value="<%= ticketinfo.getDepartureDate() %>" hidden>
            <input type ="text" name = "psgQuantity" value="<%= ticketinfo.getPsgQuantity() %>" hidden>
            <input type ="text" name = "priceall" value="<%= ticketinfo.getPriceAll() %>" hidden>
            
            <font color="White"> Ticket Number : </font>&nbsp; <input type ="text" class="form-control" name = "ticketid" value="<%= ticketId %>" disabled> <br>
            
            <font color="White"> Train Name : </font>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" class="form-control" name = "trainname" value="<%= trainname %>" disabled><br>
            
           <font color="White">  Departure Date :</font>  <input type ="text" class="form-control" name = "departureDate" value="<%= ticketinfo.getDepartureDate() %>" disabled><br>
            
           <font color="White"> Origin : </font>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;<input type ="text"  class="form-control" name = "fromlocation" value="<%= fromlocation %>" disabled>  <br>
            
           <font color="White"> Destination : </font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type ="text" class="form-control" name = "tolocation" value="<%= tolocation %>" disabled><br>
            
           <font color="White"> Departure Time : </font>  <input type ="text"  class="form-control" name = "departuretime" value="<%= departuretime %>" disabled><br>
            
           <font color="White"> Arrival Time : </font>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" class="form-control"  name = "arrivaltime" value="<%= arrivaltime %>" disabled><br>
            
           <font color="White"> Price : </font>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type ="text" class="form-control" name = "price" value="<%= price %>" disabled>
            
            
           <font color="White"> <h1> Payment </h1> </font> 
          <font color="White"> Card Name :  </font>  &nbsp;&nbsp;&nbsp;&nbsp; <input type ="text" class="form-control" name="cardname" value=""><br>
          <font color="White"> Card Number : </font>  &nbsp; <input type ="text" class="form-control" name="cardnumber" value=""><br>
          <font color="White"> Expired Month : </font>   <input type ="text" class="form-control" name="expmonth" value=""><br>
          <font color="White"> Expired Year : </font>   &nbsp; &nbsp;<input type ="text" class="form-control" name="expyear" value=""><br>
            <br>
            <input type ="submit" name ="summit" class="btn btn-primary" value ="Confirm payment"><br>
         <br><br><br>
        </form>
    </center>
    </body>
</html>
