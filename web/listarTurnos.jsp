<%-- 
    Document   : listarTurnos
    Created on : 20/11/2018, 01:02:55 PM
    Author     : RAUL
--%>

<%@page import="java.util.List"%>
<%@page import="entidades.Turnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Turnos</title>
   
        <link href="estilos/listaTurnos.css" rel="stylesheet" type="text/css"/>
   
    </head>
    <body>
        
        <table align="center">
        
            <tr><td id="header" colspan="4">
                    
                    <h1>Lista de Turnos del Conductor</h1>
                
                </td></tr>
          
            <tr>
               <th>ID</th>
               <th>FECHA</th>
               <th>HORA INICIO</th>
               <th>HORA FIN</th>
            
            </tr>
  
         <% 
            List<Turnos> listaturnos = null;
            listaturnos =  (List<Turnos>) request.getAttribute("listaTurnos");
            
            for(Turnos turnos: listaturnos ){
                %>
             <tr> 
               
             <td><% out.print(turnos.getIdturnos());%></td>   
             <td><% out.print(turnos.getFecha());%></td>
             <td><% out.print(turnos.getHorainicio());%></td>
             <td><% out.print(turnos.getHorafin());%></td>
  
            </tr> 
             <% 
            }
              %>
        <tr>
       </table>
           
    </body>
</html>
