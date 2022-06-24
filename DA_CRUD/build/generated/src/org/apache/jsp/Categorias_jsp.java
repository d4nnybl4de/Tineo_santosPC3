package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Modelo.Categorias;
import DAO.CategoriaDAO;

public final class Categorias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    CategoriaDAO dao;
    Categorias cat = null;
    String msje = "";

    if (request.getParameter("txtNombre") != null) {
        cat = new Categorias();
        cat.setNomCat(request.getParameter("txtNombre"));

        dao = new CategoriaDAO();
        try {
            dao.Registrar(cat);
            response.sendRedirect("Categorias.jsp");
        } catch (Exception e) {
            msje = "No se pudo registrar la categoría";
            if (e != null && e.getMessage() != null) {
                msje = e.getMessage();
            } else {
                msje = "Valor nulo";
            }
        } finally {
            dao = null;
        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>IDAT DESARROLLO WEB</title>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"bootstrap/js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/simple-sidebar.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/default.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/alertify.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"d-flex\" id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <div class=\"bg-light border-right\" id=\"sidebar-wrapper\">\n");
      out.write("                <div class=\"sidebar-heading\">Sistema Web</div>\n");
      out.write("                <div class=\"list-group list-group-flush\">\n");
      out.write("                    <a href=\"index.html\" class=\"list-group-item list-group-item-action bg-light\">Inicio</a>\n");
      out.write("                    <a href=\"Categorias.jsp\" class=\"list-group-item list-group-item-action bg-light\">Categorias</a>\n");
      out.write("                    <a href=\"Productos.jsp\" class=\"list-group-item list-group-item-action bg-light\">Productos</a>\n");
      out.write("                    <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Contacto</a>\n");
      out.write("                    <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Soporte</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Page Content -->\n");
      out.write("            <div id=\"page-content-wrapper\">\n");
      out.write("\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-light border-bottom\">\n");
      out.write("                    <button class=\"btn btn-primary\" id=\"menu-toggle\">Ocultar Sidebar</button>\n");
      out.write("\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav ml-auto mt-2 mt-lg-0\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">Iniciar Sesion <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <h1>Registrar Categorias</h1>\n");
      out.write("                        ");

                            if (msje.length() > 0) {
                                out.print("<div class=\"error\">" + msje + "</div>");
                            }
                        
      out.write("\n");
      out.write("                        <form name=\"frmCategorias\" action=\"Categorias.jsp\" method=\"post\" onsubmit=\"return validar_nombre()\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Nombre de la categoria</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control col-md-4\" name=\"txtNombre\" onkeypress=\"return validarTexto(event)\" \n");
      out.write("                                       placeholder=\"Ingrese Categoria\" value=\"");
      out.print( (cat != null ? cat.getNomCat(): ""));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group form-check\">\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" name=\"chkVigencia\">\n");
      out.write("                                <label class=\"form-check-label\">Activo</label>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Registrar</button>\n");
      out.write("                            <a href=\"index.html\" class=\"btn btn-danger btn-icon-split\"><span class=\"icon text-white-50\">\n");
      out.write("                            <i class=\"fas fa-check\"></i></span>\n");
      out.write("                            <span class=\"text\">Cancelar</span></a>\n");
      out.write("                        </form><br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h1>Listado de Categorias</h1>\n");
      out.write("                        <div class=\"table-responsive\">                                 \n");
      out.write("                            <table class=\"table table-hover table-striped table-bordered\">\n");
      out.write("                                <thead class=\"btn-info\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th class=\"text-center\">N°</th>\n");
      out.write("                                        <th class=\"text-center\">Categoria</th>\n");
      out.write("                                        <th class=\"text-center\">Estado</th>\n");
      out.write("                                        <th class=\"text-center\">Acciones</th>              \n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>  \n");
      out.write("                                ");

                                    CategoriaDAO daocate = new CategoriaDAO();
                                    List<Categorias> categorias = null;
                                    int i = 1;

                                    try {
                                        categorias = daocate.listar();
                                        for (Categorias cate : categorias) {
                                            out.print("<tr>"
                                                    + "<td>" + i + "</td>"
                                                    + "<td>" + cate.getNomCat()+ "</td>"
                                                   
                                                    + "<td class=\"text-center\"><a class=\"btn btn-warning btn-sm\" href=\"editarcategoria.jsp?cod="
                                                    + cate.getIdCat()+ "\"> Editar</a></td>"
                                                    + "</tr>");
                                            i++;
                                        }

                                    } catch (Exception e) {
                                        out.print("<tr><td colspan=\"3\">"
                                                + e.getMessage() + "No se pudo listar las categorias</td></tr>");
                                    } finally {
                                        dao = null;
                                        if (categorias != null) {
                                            categorias.clear();
                                        }
                                        categorias = null;
                                    }
                                
      out.write("                                                          \n");
      out.write("                                <!-- <a class=\"icon-pencil2\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Editar\" href=\"Controlador\"></a>\n");
      out.write("                                </td>-->\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /#page-content-wrapper -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"css/alertify.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- Menu Toggle Script -->\n");
      out.write("        <script>\n");
      out.write("                                    $(\"#menu-toggle\").click(function (e) {\n");
      out.write("                                        e.preventDefault();\n");
      out.write("                                        $(\"#wrapper\").toggleClass(\"toggled\");\n");
      out.write("                                    });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function validar_nombre() {\n");
      out.write("                nom = document.frmCategorias.txtNombre.value;\n");
      out.write("                if (nom.length == 0) {\n");
      out.write("                    alertify.alert(\"Error\", \"Ingrese Nombre de la Categoria\").set('label', 'Ok');\n");
      out.write("                    return false;\n");
      out.write("                } else {\n");
      out.write("                    alertify.success(\"Categoria Registrada\");\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function validarTexto(e) {\n");
      out.write("                tecla = e.keyCode;\n");
      out.write("                teclado = String.fromCharCode(tecla);\n");
      out.write("\n");
      out.write("                if ((teclado < 'A' || teclado > 'z') && teclado != \" \") {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
