/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.DAOLinea;
import dao.DAOVehiculo;
import entidades.Vehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RAUL
 */
@WebServlet(name = "ServletInfTransp", urlPatterns = {"/ServletInfTransp"})
public class ServletInfTransp extends HttpServlet {

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
        
        String tipotransporte = request.getParameter("tipotransporte");
        System.out.println(tipotransporte);
        DAOLinea daolinea = new DAOLinea();
        List<Integer> listalineas = daolinea.idLineaByIdTipoTrans(tipotransporte);
        
        DAOVehiculo daovehiculo = new DAOVehiculo();
        
        List<Vehiculo> listavehiculosinterm = new ArrayList<Vehiculo>();
        List<Vehiculo> listavehiculosfinal = new ArrayList<Vehiculo>();
        
        for (Integer linea : listalineas) {
            listavehiculosinterm = daovehiculo.obtenerVehiculosporIdLinea(linea);
            for (Vehiculo vehiculo : listavehiculosinterm) {
                listavehiculosfinal.add(vehiculo);
            }
        }
        
        for (Vehiculo vehiculo : listavehiculosfinal) {
            System.out.println(vehiculo.getPlaca());
            
        }
        
        request.setAttribute("listaVehiculos", listavehiculosfinal);
        getServletConfig().getServletContext().getRequestDispatcher("/listarVehiculos.jsp").forward(request, response);
        
        
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
