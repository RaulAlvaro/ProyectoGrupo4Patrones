<%-- 
    Document   : login
    Created on : 14/11/2018, 12:48:50 AM
    Author     : ABEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Design Patterns</title>
        <link href="estilos/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="cuadro">
            <form action="ServletLogin" method="post">
                <p id="titulo">INICIAR SESION</p>
                <hr>
                <br>
                <label id="subtitulo1">NOMBRE DE USUARIO</label>
                <br>
                <br>
                <input type="text" class="entrada" name="usuario" required autofocus/>
                <br>
                <br>
                <label id="subtitulo2">CONTRASEÑA</label>
                <br>
                <br>
                <input type="password" class="entrada" name="password" required/>
                <br>
                <br>
                <input type="submit" value="INICIAR SESION" id="boton"/>
            </form>
        </div>
    </body>
</html>
