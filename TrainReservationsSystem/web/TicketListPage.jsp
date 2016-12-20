<%-- 
    Document   : TicketListPage
    Created on : Dec 20, 2016, 12:17:44 AM
    Author     : Filmm
--%>

<%@page import="hiber.Train"%>
<%@page import="hiber.Ticketinfo"%>
<%@page import="java.util.List"%>
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
        <title>History Ticket</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse"> 
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li> <a  class="navbar-brand" href="Home.jsp">Train Reservations</a> </li>
                    <li> <a  href="ProfilePage.jsp">Profile</a> </li>
                    <li> <a  href="TicketHistoryController" >History Ticket</a> </li>
                </ul>
                <p class="navbar-text navbar-right"><a  href="LogoutController" >Sign out</a> &nbsp;&nbsp;&nbsp;</p>
            </div>
        </nav>   
        <h1> My History </h1>
        <%
            List<Object[]> tkStory = (List<Object[]>) session.getAttribute("ticketHistory");
        %>
        <table class="table table-striped">
            <tr class="info">
                <td>Ticket Number</td>
                <td>Train Name</td>
                <td>Departure Date</td>
                <td>Origin</td>
                <td>Destination</td>
                <td>Departure Time</td>
                <td>Arrival Time</td>
                <td>Price</td>
            </tr>

            <%
                if (tkStory != null) {
                    for (Object[] story : tkStory) {
                        Ticketinfo tinfo = (Ticketinfo) story[0];
                        Train train = (Train) story[1];
            %>
            <tr>
                <td><% out.println(tinfo.getTicketId()); %></td>
                <td><% out.println(train.getTrainname()); %></td>
                <td><% out.println(tinfo.getDepartureDate()); %></td>
                <td><% out.println(train.getFromLocation()); %></td>
                <td><% out.println(train.getToLocation()); %></td>
                <td><% out.println(train.getDepartureTime()); %></td>
                <td><% out.println(train.getArrivalTime()); %></td>
                <td><% out.println(tinfo.getPriceAll()); %></td>
            </tr>
            <%
                }
            %>
        </table>
        <%
            }
        %>
        <br><a href="Home.jsp" class="btn btn-default">Back</a>
    </body>
</html>
