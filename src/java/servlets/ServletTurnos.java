/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.DAOTurnos;
import dao.DAOUsuario;
import entidades.Turnos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RAUL
 */
@WebServlet(name = "ServletTurnos", urlPatterns = {"/ServletTurnos"})
public class ServletTurnos extends HttpServlet {

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

        int idUsuario;

        String dniconductor = request.getParameter("dni");
        System.out.println(dniconductor);
        DAOUsuario daou = new DAOUsuario();

        idUsuario = daou.obtenerIdUsuarioByDni(dniconductor);

        if (idUsuario == 0) {
            PrintWriter out = response.getWriter();
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println(" $(document).ready(function(){");
            out.println("swal ('DNI NO ENCONTRADO','','error');");
            out.println(" });");
            out.println("</script>");
            RequestDispatcher rd = request.getRequestDispatcher("verturnos.jsp");
            rd.include(request, response);

        } else {
            DAOTurnos daoturnos = new DAOTurnos();
            List<Turnos> listaturnos = daoturnos.obtenerTurnosporDNI(idUsuario);

            for (Turnos turno : listaturnos) {
                System.out.println(turno.getFecha());
                System.out.println(turno.getHorainicio());
                System.out.println(turno.getHorafin());
            }

            request.setAttribute("listaTurnos", listaturnos);
            getServletConfig().getServletContext().getRequestDispatcher("/listarTurnos.jsp").forward(request, response);

        }

        System.out.println("El id del usuario es: " + idUsuario);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
