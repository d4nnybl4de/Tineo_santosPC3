package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.CategoriaDAO;
import java.util.List;
import Modelo.Categorias;

public final class Productos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("        <title> DESARROLLO WEB</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/simple-sidebar.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/alertify.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/default.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
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
      out.write("                        <h1>Registrar Productos</h1>\n");
      out.write("                        <form name=\"frmProductos\" action=\"Productos.jsp\" method=\"post\" onsubmit=\"return validar(this)\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Categoria</label>\n");
      out.write("                                        <div>\n");
      out.write("                                            <select class=\"form-control\" id=\"cboCategoriaProducto\"  name=\"cboCategoria\">\n");
      out.write("                                                ");
 List<Categorias> categorias = (List<Categorias>) request.getAttribute("categoriaslis");
                                                    if (categorias != null)//ESTO TMBN ES IMPORTANTE 
                                                        for (Categorias cat : categorias) {
      out.write("\n");
      out.write("                                                        <option value=\"");
      out.print(cat.getIdCat() );
      out.write('"');
      out.write('>');
      out.print(cat.getNomCat() );
      out.write("</option>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Nombre del Producto</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"txtNombre\" \n");
      out.write("                                               placeholder=\"Ingrese Nombre\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Marca</label>\n");
      out.write("                                        <div>\n");
      out.write("                                            <select class=\"form-control\" name=\"cboMarca\">\n");
      out.write("                                                <option>Eliga una Marca</option>\n");
      out.write("                                                ");
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Modelo</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"txtDescripcion\" placeholder=\"Ingrese Descripcion\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Descripcion</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"txtDescripcion\" placeholder=\"Ingrese Descripcion\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>                \n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Cantidad</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"txtPrecio\" \n");
      out.write("                                               placeholder=\"Ingrese Cantindad\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Precio</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"txtPrecioM\" \n");
      out.write("                                               placeholder=\"Ingrese Precio\">\n");
      out.write("                                    </div> \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" name=\"btnRegistrar\" value=\"Registrar\">\n");
      out.write("                            <a href=\"index.html\" class=\"btn btn-danger\">Cancelar</a>\n");
      out.write("                        </form><br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h1>Listado de Productos</h1>\n");
      out.write("                        <form name=\"frmBuscar\" action=\"Productos.jsp\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"form-inline\">                                    \n");
      out.write("                                    <input type=\"text\" class=\"form-control col-md-10 col-sm-8\" placeholder=\"Escriba el nombre del producto\" name=\"txtProducto\" value=\"");
      out.write("\" >\n");
      out.write("                                    <input type=\"submit\" name=\"btnBuscar\" class=\"btn btn-dark col-md-2 col-sm-8\" value=\"Buscar Producto\">                               \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"table-responsive\" >                                 \n");
      out.write("                            <table class=\"table table-hover table-striped table-bordered\">\n");
      out.write("                                <thead class=\"btn-info\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th class=\"text-center\">N°</th>\n");
      out.write("                                        <th class=\"text-center\">Categoria</th>\n");
      out.write("                                        <th class=\"text-center\">Producto</th>\n");
      out.write("                                        <th class=\"text-center\">Marca</th>\n");
      out.write("                                        <th class=\"text-center\">Modelo</th>\n");
      out.write("                                        <th class=\"text-center\">Descripcion</th>\n");
      out.write("                                        <th class=\"text-center\">Cantidad</th>\n");
      out.write("                                        <th class=\"text-center\">Precio</th>\n");
      out.write("                                        <th class=\"text-center\">Acciones</th>              \n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <style>\n");
      out.write("                                    .roci{\n");
      out.write("                                        color: white;                                      \n");
      out.write("                                    }\n");
      out.write("                                </style>\n");
      out.write("                                ");
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
      out.write("        <script src=\"JavaScript/ValidarProducto.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Menu Toggle Script -->\n");
      out.write("        <script>\n");
      out.write("                            $(\"#menu-toggle\").click(function (e) {\n");
      out.write("                                e.preventDefault();\n");
      out.write("                                $(\"#wrapper\").toggleClass(\"toggled\");\n");
      out.write("                            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
