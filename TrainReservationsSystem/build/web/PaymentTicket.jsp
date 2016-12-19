<%-- 
    Document   : PaymentTicket
    Created on : Dec 19, 2016, 1:59:33 PM
    Author     : Filmm
--%>

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
        <form name ="payment" action = "PaymentController">
            <%
                int psgId = (int) session.getAttribute("psgId");
                int trainTravelId = (int) session.getAttribute("trainTravelId");
                String departuredate = (String) session.getAttribute("departuredate");
                String status = (String) session.getAttribute("status");
                int psgQuantity = (int) session.getAttribute("psgQuantity");
                int price = (int) session.getAttribute("price");
                String trainname = (String) session.getAttribute("trainname");
                String fromlocation = (String) session.getAttribute("fromlocation");
                String tolocation = (String) session.getAttribute("tolocation");
                String departuretime = (String) session.getAttribute("departuretime");
                String arrivaltime = (String) session.getAttribute("arrivaltime");
                int ticketId = (int) session.getAttribute("ticketId");
            %>
            -----------------  Ticket Detail :  -----------------
            หมายเลขตั๋ว : <input type ="text" name = "ticketId" value="<%= ticketId %>" disabled>
            <input type ="text" name = "psgId" value="<%= psgId %>" hidden>
            <input type ="text" name = "trainTravelId" value="<%= trainTravelId %>" hidden>
            <input type ="text" name = "psgQuantity" value="<%= psgQuantity %>" hidden>
            ชื่อรถไฟ : <input type ="text" name = "trainname" value="<%= trainname %>" disabled>
            วันออกเดินทาง : <input type ="text" name = "departuredate" value="<%= departuredate %>" disabled>
            ต้นทาง : <input type ="text" name = "fromlocation" value="<%= fromlocation %>" disabled>  ปลายทาง : <input type ="text" name = "tolocation" value="<%= tolocation %>" disabled>
            เวลาออก : <input type ="text" name = "departuretime" value="<%= departuretime %>" disabled>
            เวลาถึง : <input type ="text" name = "arrivaltime" value="<%= arrivaltime %>" disabled>
            ราคา : <input type ="text" name = "price" value="<%= price %>" disabled>
            <h1> Payment <h1>
            Card Name : <input type ="text" name="cardname" value=""><br>
            Card Number : <input type ="text" name="cardnumber" value=""><br>
            Expired Month : <input type ="text" name="empmonth" value=""><br>
            Expired Year : <input type ="text" name="empyear" value=""><br>
            <input type ="submit" name ="summit" value ="Confirm payment"><br>
            <a href ="Home.jsp">Home<a>
        </form>
    </body>
</html>
