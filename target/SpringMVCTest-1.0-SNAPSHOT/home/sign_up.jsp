<%--
  Created by IntelliJ IDEA.
  User: quangdung
  Date: 30/05/2016
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sign Up</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
  <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet"
        type="text/css">
  <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css" rel="stylesheet"
        type="text/css">
</head>
<body>
  <div class="section">
    <div class="container">
      <div class="row text-right">
        <div class="col-xs-3"><a><i class="fa fa-5x fa-fw fa-twitter"></i></a></div>
        <div class="col-xs-3"><a><i class="fa fa-5x fa-fw fa-facebook"></i></a></div>
        <div class="col-xs-3 text-right"><a><i class="fa fa-5x fa-fw fa-github"></i></a></div>
      </div>
    </div>
  </div>
  <div class="section">
    <div class="container">
      <div class="row">
        <div class="col-md-8">
          <form role="form">
            <div class="form-group"><label class="control-label" for="exampleInputEmail1">Email address</label><input
                    class="form-control" id="exampleInputEmail1" placeholder="Enter email" type="email"></div>
            <div class="form-group"><label class="control-label" for="exampleInputPassword1">Password</label><input
                    class="form-control" id="exampleInputPassword1" placeholder="Password" type="password"></div>
            <div class="form-group"><label class="control-label">Confirm password<br></label><input class="form-control"
                                                                                                    type="password"></div>
            <div class="form-group"><label class="control-label">Username</label><input class="form-control" type="text">
            </div>
            <button type="submit" class="btn btn-default btn-lg" data-toggle="modal">Submit</button>
          </form>
        </div>
        <div class="col-md-4">
          <ol class="lead list-unstyled text-primary">
            <li>One</li>
            <li>Two</li>
            <li>Three</li>
          </ol>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
