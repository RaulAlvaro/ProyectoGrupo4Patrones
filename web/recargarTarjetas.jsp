<%-- 
    Document   : recargarTarjetas
    Created on : 14/11/2018, 12:30:35 PM
    Author     : ABEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos/main.css" rel="stylesheet" type="text/css"/>
	<link href="https://fonts.googleapis.com/css?family=Lato:400,900" rel="stylesheet">
        <link href="estilos/reset.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
       <div class="container">
            <div class="form__top">
                <h2><span>Recarga de Tarjetas</span></h2>
            </div>		
            <form action="ServletsRecargas" method="post" class="form__reg">
            
            <select name="estado" class="input">
                <option value="on">ON</option>
                <option value="off">OFF</option>
            </select> 
            
                <input name="idTarjeta" class="input" type="text" placeholder="&#128100;  ID TARJETA" required autofocus>
            
            <input name="idUsuario" class="input" type="text" placeholder="&#128100;  ID USUARIO" required autofocus>
            
            <select name="tipo" class="input">
                <option value="normal">Normal</option>
                <option value="uni">Universitario</option>
                <option value="escolar">Escolar</option>
            </select> 
            
            <input name="monto" class="input" type="number" placeholder="  MONTO" required>
            
            <div class="btn__form">
            	<input class="btn__submit" type="submit" value="RECARGAR">
            </div>
		</form>
</div>
    </body>
</html>
