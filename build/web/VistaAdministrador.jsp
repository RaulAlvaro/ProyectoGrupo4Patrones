<%-- 
    Document   : VistaAdministrador
    Created on : 20/11/2018, 11:21:49 AM
    Author     : RAUL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Design Patterns</title>
        <!--
        <link href="estilos/menuAsistenteRecargas.css" rel="stylesheet" type="text/css"/>
        -->
        <link href="estilos/menu.css" rel="stylesheet" type="text/css"/>

        <link href="http://fonts.googleapis.com/css?family=Raleway:400,600" rel="stylesheet">

    </head>
    <body>

        <div class="navegacion">
            <nav>
                <ul>
                    <li class="xd"><a href="">ADMINISTRADOR DE MEDIOS DE TRANSPORTE </a></li>
                </ul>
            </nav>
        </div> 

   
        <form action="ServletInfTransp" method="post">
            
            <div class="box">
            <select name="tipotransporte">
                <option>Ver estado</option>
                <option value="1">Buses</option>
                <option value="2">Sistema de Corredores</option>
                <option value="3">Metropolitano</option>
                <option value="4">Tren Eléctrico</option>
            </select>
            </div>
            <button type="submit">Enviar</button>
            
            
        </form>
 



</body>
</html>
