/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import command.GestorTareas;
import command.SuperTarea;
import command.TareaActualizarEstado;
import command.TareaActualizarMonto;
import dao.DAOTarjeta;
import entidades.Tarjeta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ABEL
 */
@WebServlet(name = "ServletsRecargas", urlPatterns = {"/ServletsRecargas"})
public class ServletsRecargas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
              
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
        String id = request.getParameter("idTarjeta");
        int idTarjeta = Integer.parseInt(id);
       
        String estado = request.getParameter("estado");
        
        String idUsu = request.getParameter("idUsuario");
        int idUsuario = Integer.parseInt(idUsu);
        
        String montoR = request.getParameter("monto");
        int monto = Integer.parseInt(montoR);
        
        System.out.println(idTarjeta+" "+estado+" "+idUsuario+" "+monto);
        
        DAOTarjeta dao = new DAOTarjeta();
        int valorAntes = dao.obtenerMonto(idTarjeta);
        String eltipowe = dao.obtenerEstadoTarjeta(idTarjeta);
        
        PrintWriter out = response.getWriter();
        
        if(eltipowe.equalsIgnoreCase("on")){
            
            int montoActual=0;
            montoActual=valorAntes+monto;
            
            SuperTarea st= new SuperTarea();
            st.addTarea(new TareaActualizarEstado());
            st.addTarea(new TareaActualizarMonto());
            GestorTareas gt= new GestorTareas();
            Tarjeta tarjeta = new Tarjeta(idTarjeta,montoActual,estado,idUsuario,"1");
            gt.ejecutar(st,tarjeta,montoActual,estado);
            
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println(" $(document).ready(function(){");
            out.println("swal ('Recarga Exitosa','','success');");
            out.println(" });");
            out.println("</script>");
            RequestDispatcher rd = request.getRequestDispatcher("recargarTarjetas.jsp");
            rd.include(request,response);
            
        }else{
            
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println(" $(document).ready(function(){");
            out.println("swal ('Tarjeta fuera de servicio','','error');");
            out.println(" });");
            out.println("</script>");
            RequestDispatcher rd = request.getRequestDispatcher("recargarTarjetas.jsp");
            rd.include(request,response);
        }
        
  
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
