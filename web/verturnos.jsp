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
        <link href="estilos/verTurnos.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <form action="ServletTurnos" method="post">
            <div class="box">
                <h1 margin-left="20px">DNI del conductor</h1>
                <br>
                <br>
            <input type="text" class="entrada" name="dni" required autofocus/>
            <input type="submit" value="Enviar" id="boton"/>
                
            </div>
        </form>
        
    </body>
</html>