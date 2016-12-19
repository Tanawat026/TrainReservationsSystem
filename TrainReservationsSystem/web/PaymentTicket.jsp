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
        <title>Add Credit Card</title>
    </head>
    <body>
        <h1>Payment</h1>
        
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
               out.println("-----------------------------------"+price+"----------------------------------------");
            %>
            -----------------  Ticket Detail :  -----------------
            <form name ="payment" action = "TicketAddController">
            <input type ="text" name = "ticketId" value="<%= ticketId %>" disabled>
           <input type ="text" name = "psgId" value="<%= ticketinfo.getPsgId() %>" hidden>
            <input type ="text" name = "trainTravelId" value="<%= ticketinfo.getTrainTravelId() %>" hidden>
            <input type ="text" name = "departuredate" value="<%= ticketinfo.getDepartureDate() %>" hidden>
            <input type ="text" name = "psgQuantity" value="<%= ticketinfo.getPsgQuantity() %>" hidden>
            <input type ="text" name = "priceall" value="<%= ticketinfo.getPriceAll() %>" hidden>
            หมายเลขตั๋ว : <input type ="text" name = "ticketid" value="<%= ticketId %>" disabled> <br>
            ชื่อรถไฟ : <input type ="text" name = "trainname" value="<%= trainname %>" disabled><br>
            วันออกเดินทาง : <input type ="text" name = "departureDate" value="<%= ticketinfo.getDepartureDate() %>" disabled><br>
            ต้นทาง : <input type ="text" name = "fromlocation" value="<%= fromlocation %>" disabled>  ปลายทาง : <input type ="text" name = "tolocation" value="<%= tolocation %>" disabled><br>
            เวลาออก : <input type ="text" name = "departuretime" value="<%= departuretime %>" disabled><br>
            เวลาถึง : <input type ="text" name = "arrivaltime" value="<%= arrivaltime %>" disabled><br>
            ราคา : <input type ="text" name = "price" value="<%= price %>" disabled><br>
            <h1> Payment <h1>
            Card Name : <input type ="text" name="cardname" value=""><br>
            Card Number : <input type ="text" name="cardnumber" value=""><br>
            Expired Month : <input type ="text" name="expmonth" value=""><br>
            Expired Year : <input type ="text" name="expyear" value=""><br>
            <input type ="submit" name ="summit" value ="Confirm payment"><br>
            <a href ="Home.jsp">Home<a>
        </form>
    </body>
</html>
