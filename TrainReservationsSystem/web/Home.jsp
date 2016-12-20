<%-- 
    Document   : Home
    Created on : Dec 19, 2016, 11:48:05 AM
    Author     : Filmm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="hiber.Passenger"%>
<%@page import="java.util.List"%>
<%@page import="hiber.Train"%>
<%@page import="hiber.TrainDetail"%>
<html>
    
    <head>

        <link href="dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="dist/css/bootstrap-theme.min.css" rel="stylesheet">
        <link href="assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
        <link href="theme.css" rel="stylesheet">
        <script src="assets/js/ie-emulation-modes-warning.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Train Reservations</title>
    </head>
    <body><center>
        
        
         <BODY background="images/tt1.jpg"></BODY>
        
        
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
         
         <br>
         <font color="white"><h1>Phuket Trains</h1></font>
         
         
        <font color="white">จองตั๋วรถไฟ <br><br></font>
        
        <font color="white">(คุณสามารถขึ้นที่สถานีใดก็ได้ภายในจังหวัดนั้น) <br><br></font>
        
        
        <form name="SearchTicket" action="TrainSearchController" class="form-inline" >
            <font color="white">สถานีต้นทาง</font> 
            <select class="form-control" name ="TrainFrom">
                <option selected disabled>เลือกต้นทาง</option>
                <option value="Phuket">Phuket</option>
                <option value="Suratthani">Suratthani</option>
                <option value="Krabi">Krabi</option>
                <option value="Trang">Trang</option>
                <option value="Ranong">Ranong</option>
                <option value="Phang-nga">Phang-nga</option>
            </select>&nbsp;&nbsp;&nbsp;
             <font color="white">สถานีปลายทาง</font>
            <select class="form-control" name ="TrainTo">
                <option selected disabled>เลือกปลายทาง</option>
                <option value="Phuket">Phuket</option>
                <option value="Suratthani">Suratthani</option>
                <option value="Krabi">Krabi</option>
                <option value="Trang">Trang</option>
                <option value="Ranong">Ranong</option>
                <option value="Phang-nga">Phang-nga</option>
            </select>&nbsp;&nbsp;&nbsp;
            <input type="submit"  class="btn btn-primary" value="ค้นหาตั๋วโดยสาร" name="searchButton" /> <br><br>
        </form>
        <%
            try {
                // Create a session object if it is already not created.
                List<Object[]> trainSearchList = (List<Object[]>) session.getAttribute("searchResult");
                List psg = (List) session.getAttribute("resultPsg");
                Passenger passenger = null;
                for (Object l : psg) {
                    passenger = (Passenger) l;
                }
                if (trainSearchList != null) {
        %>
        <table class="table table-bordered" > <% //border="1" %>
            <tbody>
                <tr>
                    <td >ชื่อรถไฟ</td>
                    <td>สถานีต้นทาง</td>
                    <td>สถานีปลายทาง</td>
                    <td>วันที่ออก</td>
                    <td>เวลาออก</td> 
                    <td>เวลาถึง</td>
                    
                    <td>ราคา(บาท)</td>
                    <td>จอง</td>
                </tr>
            <form name = "ReservationsTicket" action="TicketWaittingController" method="GET" class="form-inline">
                <% 

                    for (Object[] obj : trainSearchList) {
                        Train train = (Train) obj[0];
                        TrainDetail traindetail = (TrainDetail) obj[1];
                %> 

                <tr>
                <input type="text" name="psgId" value ="<%= passenger.getPsgId()%>" hidden>
                <input type="text" name="trainid" value ="<%= traindetail.getTrainTravelId()%>" hidden>
                <input type="text" name="trainTravelId" value ="<%= traindetail.getTrainTravelId()%>" hidden>
                <td ><input type = "text" class="form-control" name = "trainname" value="<% out.println(train.getTrainname()); %>" readonly</td>
                <td><input type = "text" class="form-control" name = "fromlocation" value="<% out.println(train.getFromLocation()); %>" readonly</td>
                <td><input type = "text" class="form-control" name = "tolocation" value="<% out.println(train.getToLocation()); %>" readonly</td>
                <td><input type = "text" class="form-control" name = "departuredate" value="<% out.println(traindetail.getDepartureDate()); %>" readonly</td>
                <td><input type = "text" class="form-control" name = "departuretime" value="<% out.println(train.getDepartureTime()); %>" readonly</td>
                <td><input type = "text" class="form-control" name = "arrivaltime" value="<% out.println(train.getArrivalTime()); %>" readonly</td>
                <td><input type = "text" class="form-control" name = "price" value="<% out.println(traindetail.getPrice()); %>" readonly</td>
                <td><input type ="submit" class="btn btn-primary" name ="submit" value = "จองตั๋วโดยสาร"></td>
                </tr>
            </form>
            <%}%>
            </tbody>
        </table>
        <% }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </center>
</body>
</html>
