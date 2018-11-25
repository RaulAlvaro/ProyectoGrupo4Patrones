<%-- 
    Document   : listarVehiculos
    Created on : 20/11/2018, 01:19:49 PM
    Author     : RAUL
--%>

<%@page import="entidades.Vehiculo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="estilos/listarVehiculos.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <table align="center">
        
            <tr><td id="header" colspan="4">
                    
                    <h1>Lista de Vehiculos</h1>
                
                </td></tr>
          
            <tr>
               <th>ID</th>
               <th>PLACA</th>
               <th>CAPACIDAD</th>
               <th>ESTADO</th>
            
            </tr>
  
         <% 
            List<Vehiculo> listavehiculos = null;
            listavehiculos =  (List<Vehiculo>) request.getAttribute("listaVehiculos");
            
            for(Vehiculo vehiculo: listavehiculos ){
                %>
             <tr> 
               
             <td><% out.print(vehiculo.getIdvehiculo());%></td>   
             <td><% out.print(vehiculo.getPlaca());%></td>
             <td><% out.print(vehiculo.getCapacidad());%></td>
             
             <% if(vehiculo.getEstado().equalsIgnoreCase("0")){
                 
                 %>
             
             <td>En estacion</td>
             <%} else if(vehiculo.getEstado().equalsIgnoreCase("1")){
                 %>
              <td>Circulando</td>
              
              <%} else if(vehiculo.getEstado().equalsIgnoreCase("2")){
                 %>
              <td>Disponible</td>
              <% } %>
              
            </tr> 
             <% 
            }
              %>
        <tr>
       </table>
    </body>
</html>
