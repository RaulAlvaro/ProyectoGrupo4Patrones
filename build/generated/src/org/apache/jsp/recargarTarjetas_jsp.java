package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recargarTarjetas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"estilos/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Lato:400,900\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"estilos/reset.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("            <div class=\"form__top\">\r\n");
      out.write("                <h2><span>Recarga de Tarjetas</span></h2>\r\n");
      out.write("            </div>\t\t\r\n");
      out.write("            <form action=\"ServletsRecargas\" method=\"post\" class=\"form__reg\">\r\n");
      out.write("            \r\n");
      out.write("            <select name=\"estado\" class=\"input\">\r\n");
      out.write("                <option value=\"on\">ON</option>\r\n");
      out.write("                <option value=\"off\">OFF</option>\r\n");
      out.write("            </select> \r\n");
      out.write("            \r\n");
      out.write("                <input name=\"idTarjeta\" class=\"input\" type=\"text\" placeholder=\"&#128100;  Ingresar ID Tarjeta\" required autofocus>\r\n");
      out.write("            \r\n");
      out.write("            <input name=\"idUsuario\" class=\"input\" type=\"text\" placeholder=\"&#128100;  Ingresar ID Usuario\" required autofocus>\r\n");
      out.write("            \r\n");
      out.write("            <select name=\"tipo\" class=\"input\">\r\n");
      out.write("                <option value=\"normal\">Normal</option>\r\n");
      out.write("                <option value=\"uni\">Universitario</option>\r\n");
      out.write("                <option value=\"escolar\">Escolar</option>\r\n");
      out.write("            </select> \r\n");
      out.write("            \r\n");
      out.write("            <input name=\"monto\" class=\"input\" type=\"number\" placeholder=\"Ingresar Monto\" required>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"btn__form\">\r\n");
      out.write("            \t<input class=\"btn__submit\" type=\"submit\" value=\"RECARGAR\">\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
