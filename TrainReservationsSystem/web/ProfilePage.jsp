<%-- 
    Document   : ProfilePage
    Created on : Dec 20, 2016, 12:45:02 AM
    Author     : Span
--%>

<%@page import="java.util.List"%>
<%@page import="hiber.Passenger"%>
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
        <title>JSP Page</title>
    </head>
    <body> <center>

        <BODY background="images/tt.jpg"></BODY>
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
        <%
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
        %>
        <font color="white"><br><br> <h1>My Profile</h1></font>

        <form method="GET" action="RequestEditAccountControl" class="form-inline">
            <table border ="0">
                <tr>

                    <td><font color="white">Firstname </font></td><td><input class="form-control" type="text" value="<%= passenger.getFirstname()%>" readonly></td>
                </tr>
                <tr>

                    <td><font color="white">Lastname</font></td><td><input class="form-control" type="text" value="<%= passenger.getLastname()%>" readonly></td>
                </tr>
                <tr>

                    <td><font color="white">Email</font></td><td> <input class="form-control" type="text" value="<%= passenger.getEmail()%>" readonly></td>
                </tr>
                <tr>

                    <td><font color="white">Telephone</font></td><td> <input class="form-control" type="text" value="<%= passenger.getTelNo()%>" readonly></td>
                </tr>
            </table>
            <br>
            <input type="submit" class="btn btn-primary" value="Edit my profile"> 
            <a href="RequestCngPwController" class="btn btn-primary">Change password</a>
        </form>
        <%
            if (update.equals("true")) {
        %>
        <div class="alert alert-success" role="alert">
            <span class="label label-success">Success</span>
        </div>
        <%
        } else if (update.equals("fail")) {
        %>
        <div class="alert alert-danger" role="alert">
            <span class="label label-danger">Please try again!!</span>
        </div>
        <%
            }
        } else if (requestChange.equals("E#i!Ac6")) {
        %>
        <form method="POST" action="EditPassengerControl" class="form-inline">
            <font color="white"> <h1>My Profile</h1>  </font>
            <input type="text" name="id" value="<%= passenger.getPsgId()%>" hidden>
            <table border ="0">
                <tr>
                    <td><font color="white">Firstname </font></td><td><input name="firstname" class="form-control" type="text" value="<%= passenger.getFirstname()%>"></td>
                </tr>
                <tr>
                    <td><font color="white">Lastname </font></td><td><input name="lastname" class="form-control" type="text" value="<%= passenger.getLastname()%>"></td>
                </tr>
                <tr>
                    <td><font color="white">Email </font> </td><td><input name="email" class="form-control" type="text" value="<%= passenger.getEmail()%>"></td>
                </tr>
                <tr>
                    <td><font color="white">Telephone </font> </td><td><input name="tel" class="form-control" type="text" value="<%= passenger.getTelNo()%>"><br></td>
                </tr>
            </table>
            <br>
            <input type="submit" class="btn btn-success" value="Confirm"> 
            <a href="ProfilePage.jsp" class="btn btn-danger">Cancel</a>
        </form>

        <%
        } else if (requestChange.equals("C!2ng99wd")) {
        %>
        <font color="white"><h1>Change My Password</h1> </font> 

        <form method="POST" action="ChangePwdController" class="form-inline">
            <input type="text" name="id" value="<%= passenger.getPsgId()%>" hidden>
            <table border="0">
                <tr>
                    <td><font color="white"> Old Password</font> </td><td> <input name="oldpass" class="form-control" type="password" ></td>
                </tr>
                <tr>
                    <td><font color="white"> New Password</font> </td><td><input name="newpass" class="form-control" type="password" "></td>
                </tr>
                <tr>
                    <td><font color="white">Confirm Password </font> </td><td><input name="repass" class="form-control" type="password" value=""></td>
                </tr>
            </table>
            <br>
            <input type="submit" class="btn btn-success" value="Change password"> 
            <a href="ProfilePage.jsp" class="btn btn-danger">Cancel</a>
        </form>
        <%
            if (validate.equals("isOldPassword")) {
        %>
        <br><span class="label label-danger">Wrong old password!!</span>
        <%
        } else if (validate.equals("newPasswordBlank")) {
        %>
        <br><span class="label label-danger">Please enter new password!!</span>
        <%
        } else if (validate.equals("isCorrectRewritePassword")) {
        %>
        <br><span class="label label-danger">Please re-enter new password again!!</span>
        <%
                    }
                }
            } catch (Exception e) {

            }
        %>
    </center>
</body>
</html>
