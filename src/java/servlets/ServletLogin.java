/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.DAOSesion;
import entidades.Sesion;
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
@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

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
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        
        Sesion sesion = Sesion.getSingletonInstancia(usuario, password);
         
        DAOSesion dao = new DAOSesion();
        
        String eltipowe = dao.obtenerTipoSesion(usuario, password);
        
        request.setAttribute("usuario", usuario);
        request.setAttribute("password",password);
        
        PrintWriter out = response.getWriter();
        
        if(eltipowe.equalsIgnoreCase("1")){
            getServletConfig().getServletContext().getRequestDispatcher("/vistaAsistenteRecargas.jsp").forward(request,response);
        }else if(eltipowe.equalsIgnoreCase("2")){
            getServletConfig().getServletContext().getRequestDispatcher("/vistaAsistenteRRHH.jsp").forward(request,response);
        } else if(eltipowe.equalsIgnoreCase("3")){
            getServletConfig().getServletContext().getRequestDispatcher("/vistaAsistentePersonal.jsp").forward(request,response);
        }
          else if(eltipowe.equalsIgnoreCase("5")){
            getServletConfig().getServletContext().getRequestDispatcher("/VistaAdministrador.jsp").forward(request,response);
        }
        else{
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println(" $(document).ready(function(){");
            out.println("swal ('Incorrecto usuario o password','','error');");
            out.println(" });");
            out.println("</script>");
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.include(request,response);
            
            //getServletConfig().getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
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
