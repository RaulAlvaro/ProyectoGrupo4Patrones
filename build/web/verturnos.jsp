<%-- 
    Document   : verturnos
    Created on : 20/11/2018, 06:58:56 AM
    Author     : RAUL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="ServletTurnos" method="post">
            <label id="subtitulo1">DNI del conductor</label>
                <br>
                <br>
            <input type="text" class="entrada" name="dni" required autofocus/>
            <input type="submit" value="Enviar" id="boton"/>
        </form>
        
    </body>
</html>
