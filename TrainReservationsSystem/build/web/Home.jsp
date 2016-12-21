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
    <body>
    <center>
        <BODY background="images/tt1.jpg"></BODY> 
        <nav class="navbar navbar-inverse"> 
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li> <a  class="navbar-brand" href="Home.jsp">Phuket Train Reservations</a> </li>
                    <li> <a  href="ProfilePage.jsp">Profile</a> </li>
                    <li> <a  href="TicketHistoryController" >History Ticket</a> </li>
                </ul>
                <p class="navbar-text navbar-right"><a  href="LogoutController" >Sign out</a> &nbsp;&nbsp;&nbsp;</p>
            </div>
        </nav>   
        <br>
        <font color="white"><h1>Phuket Train Reservations</h1> </font>
        <font color="white">จองตั๋วรถไฟระหว่างจังหวัดภูเก็ต พังงา ระนอง สุราษฎร์ธานี ตรัง <br><br></font> 
        <font color="white">(คุณสามารถขึ้นที่สถานีใดก็ได้ภายในจังหวัดนั้น) <br><br></font>
        <font color="white">บริการดี ราคาไม่แพง เพื่อคนใต้บ้านเรา <br><br></font>

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
        <table class="table table-bordered" >
                <tr>
                    <td ><font color="white">ชื่อรถไฟ</font></td>
                    <td><font color="white">สถานีต้นทาง</font></td>
                    <td><font color="white">สถานีปลายทาง</font></td>
                    <td><font color="white">วันที่ออก</font></td>
                    <td><font color="white">เวลาออก</font></td> 
                    <td><font color="white">เวลาถึง</font></td>
                    <td><font color="white">ราคา(บาท)</font></td>
                    <td><font color="white">จอง</font></td>
                </tr>
            
                <% 

                    for (Object[] obj : trainSearchList) {
                        Train train = (Train) obj[0];
                        TrainDetail traindetail = (TrainDetail) obj[1];
                %> 
                <tr>
                <form action="TicketWaittingController" method="POST" class="form-inline" >
                <input type="text" name="psgId" value ="<%= passenger.getPsgId()%>" hidden>
                <input type="text" name="trainid" value ="<%= traindetail.getTrainTravelId()%>" hidden>
                <input type="text" name="trainTravelId" value ="<%= traindetail.getTrainTravelId()%>" hidden>
                <input type = "text"  name = "trainname" value="<%= train.getTrainname() %>" hidden>
                <input type = "text"  name = "fromlocation" value="<%= train.getFromLocation() %>" hidden>
                <input type = "text"  name = "tolocation" value="<%= train.getToLocation() %>" hidden>
                <input type = "text"  name = "departuredate" value="<%= traindetail.getDepartureDate() %>" hidden>
                <input type = "text"  name = "departuretime" value="<%= train.getDepartureTime() %>" hidden>
                <input type = "text"  name = "arrivaltime" value="<%= train.getArrivalTime() %>" hidden>
                <input type = "text"  name = "price" value="<%= traindetail.getPrice() %>" hidden>
                <td ><font color="white"><% out.println(train.getTrainname()); %></font></td>
                <td><font color="white"><% out.println(train.getFromLocation()); %></font></td>
                <td><font color="white"><% out.println(train.getToLocation()); %></font></td>
                <td><font color="white"><% out.println(traindetail.getDepartureDate()); %></font></td>
                <td><font color="white"><% out.println(train.getDepartureTime()); %></font></td>
                <td><font color="white"><% out.println(train.getArrivalTime()); %></font></td>
                <td><font color="white"><% out.println(traindetail.getPrice()); %></font></td>
                <td><input type ="submit" class="btn btn-primary" name ="submit" value = "จองตั๋วโดยสาร"></td>   
            </form>
            </tr>
            <%}%>
        </table>
        <% }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </center>
</body>
</html>
