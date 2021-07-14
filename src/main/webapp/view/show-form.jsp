<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-07-2021
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@  taglib prefix="form" uri ="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Form Page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        .errors {
            color: red;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>${message}</h1>
        <h1 style = "text-align: center">Welcome to the Spring World</h1>
        <div class="container" style = "margin: 0px 20px;">
        <form:form action = "/processform" method="post" modelAttribute ="user">
            <div class="form-group">
                <label for="user-name" >Name: </label>
                <form:input type="text" class="form-control" id="user-name" path = "userName"/>
                <form:errors path = "userName" cssClass="errors"></form:errors>
            </div>
            <div class="form-group">
                <label for="pswd" >Password: </label>
                <form:input type="password" class="form-control" id="pswd" path = "password"/>
                <form:errors path = "password" cssClass="errors"></form:errors>

            </div>
            <div class="form-group">
                <label for="age" >Age: </label>
                <form:input type="text" class="form-control" id="age" path = "age"/>
                <form:errors path = "age" cssClass="errors"></form:errors>
            </div>

            <div class="form-group">
                <label for="country">Country:</label>
                <form:select class="form-control" id="country" path="country">
                    <form:option value = "U.S"></form:option>
                    <form:option value = "U.K"></form:option>
                    <form:option value = "Australia"></form:option>
                    <form:option value = "India"></form:option>
                    <form:option value = "Brazil"></form:option>
                    <form:option value = "France"></form:option>
                    <form:option value = "Other"></form:option>
                </form:select>
            </div>
            <div style = "text-align: center">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form:form>
        </div>
    </div>
</body>
</html>
