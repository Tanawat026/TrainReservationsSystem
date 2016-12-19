<%-- 
    Document   : psgFirstPage
    Created on : Dec 19, 2016, 11:40:14 AM
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
        <title>Train ticket</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse"> 
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <a class="navbar-brand" href="#">Train Reservations</a>
                <ul class="nav navbar-nav">
                    <li> 
                        <form class="navbar-form navbar-right" method="POST" action="LoginController">
                            <div class="form-group">
                                <label class="sr-only">Email address</label>
                                <input type="text" class="form-control" name="username" placeholder="Email">
                            </div>
                            <div class="form-group">
                                <label class="sr-only">Password</label>
                                <input type="password" name="password" class="form-control" placeholder="Password">
                            </div>

                            <button type="submit" class="btn btn-primary">Sign in</button>
                        </form>
                        </li>
                </ul>
            </div>
        </nav>
    <center>
        <title>Train Reservations</title>
        <%
            try {
                String message = request.getParameter("message");
                if (message != null) {
        %>
        <div class="alert alert-danger" role="alert">
            <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
            <span class="sr-only">Error:</span>
            Enter a valid email address or password
        </div>
        <%
            }
        %>
        <h1>Train Reservations</h1>
        จองตั๋วรถไฟ <br><br>
        (คุณสามารถขึ้นที่สถานีใดก็ได้ภายในจังหวัดนั้น) <br><br>
        <h1>Register</h1>
        <form class="form-inline" method="POST" action="RegisterController">
            <input type="text" class="form-control" name="firstname" placeholder="Firstname"> &nbsp;&nbsp;&nbsp;            
            <input type="text" class="form-control" name="lastname" placeholder="Lastname"><br><br> 
            <input type="email" class="form-control" name="email" placeholder="Email"><br><br>            
            <input type="password" class="form-control" name="password" placeholder="Password"><br><br>
            <input type="password" class="form-control" name="repassword" placeholder="Confirm password"><br><br> 
            <input type="text" class="form-control" name="tel" placeholder="Telephone"><br><br>
            <%
                String check = request.getParameter("check");
                if (check != null) {
            %>
            <span class="label label-danger">Password not match!!</span>
            <br><br>
            <%
                }
            %>
            <%
                String data = request.getParameter("data");
                if (data != null) {
            %> 
            <span class="label label-danger">All data require!!!</span>
            <br><br>
            <%
                }
            %>
            <%
                String save = request.getParameter("save");
                if (save != null) {
                    if (save.equals("yes")) {
            %>
            <span class="label label-success">Now you can login</span>
            <br><br>
            <%
            } else {
            %>
            <span class="label label-danger">Please try again</span>
            <br><br>
            <%
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
            <button type="submit" class="btn btn-success">Register</button>
        </form>
    </cancle>
</body>
</html>
