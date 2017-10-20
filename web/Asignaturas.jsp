<%@ page import="Controlador.ControladorAsignatura" %><%--
  Created by IntelliJ IDEA.
  User: L3oNeT
  Date: 19/10/2017
  Time: 09:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear asignatura</title>
    <link href="css/materialize.min.css" rel="stylesheet">
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
<div class="container">
    <h2>Asignatura</h2>
    <%ControladorAsignatura cp = new ControladorAsignatura();%>
    <%= cp.getViewAsignaturas()%>
</div>
</body>
</html>
