<%-- 
    Document   : Categorias
    Created on : 23/06/2022, 10:22:15 PM
    Author     : Daniel
--%>

<%@page import="java.util.List"%>
<%@page import="Modelo.Categorias"%>
<%@page import="DAO.CategoriaDAO"%>
<%
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
%>

<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>IDAT DESARROLLO WEB</title>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="bootstrap/js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/simple-sidebar.css" rel="stylesheet">
        <link href="css/default.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/alertify.min.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>

        <div class="d-flex" id="wrapper">

            <!-- Sidebar -->
            <div class="bg-light border-right" id="sidebar-wrapper">
                <div class="sidebar-heading">Sistema Web</div>
                <div class="list-group list-group-flush">
                    <a href="index.html" class="list-group-item list-group-item-action bg-light">Inicio</a>
                    <a href="Categorias.jsp" class="list-group-item list-group-item-action bg-light">Categorias</a>
                    <a href="Productos.jsp" class="list-group-item list-group-item-action bg-light">Productos</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Contacto</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Soporte</a>
                </div>
            </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">

                <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
                    <button class="btn btn-primary" id="menu-toggle">Ocultar Sidebar</button>

                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                            <li class="nav-item active">
                                <a class="nav-link" href="index.html">Home <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="#">Iniciar Sesion <span class="sr-only">(current)</span></a>
                            </li>

                        </ul>
                    </div>
                </nav>

                <div class="container-fluid">
                    <div class="col-md-8">
                        <h1>Registrar Categorias</h1>
                        <%
                            if (msje.length() > 0) {
                                out.print("<div class=\"error\">" + msje + "</div>");
                            }
                        %>
                        <form name="frmCategorias" action="Categorias.jsp" method="post" onsubmit="return validar_nombre()">
                            <div class="form-group">
                                <label>Nombre de la categoria</label>
                                <input type="text" class="form-control col-md-4" name="txtNombre" onkeypress="return validarTexto(event)" 
                                       placeholder="Ingrese Categoria" value="<%= (cat != null ? cat.getNomCat(): "")%>">
                            </div>
                            <div class="form-group form-check">
                                <input type="checkbox" class="form-check-input" name="chkVigencia">
                                <label class="form-check-label">Activo</label>
                            </div>
                            <button type="submit" class="btn btn-primary">Registrar</button>
                            <a href="index.html" class="btn btn-danger btn-icon-split"><span class="icon text-white-50">
                            <i class="fas fa-check"></i></span>
                            <span class="text">Cancelar</span></a>
                        </form><br>
                    </div>
                    <div class="col-md-12">
                        <h1>Listado de Categorias</h1>
                        <div class="table-responsive">                                 
                            <table class="table table-hover table-striped table-bordered">
                                <thead class="btn-info">
                                    <tr>
                                        <th class="text-center">N°</th>
                                        <th class="text-center">Categoria</th>
                                        <th class="text-center">Estado</th>
                                        <th class="text-center">Acciones</th>              
                                    </tr>
                                </thead>  
                                <%
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
                                %>                                                          
                                <!-- <a class="icon-pencil2" data-toggle="tooltip" data-placement="right" title="Editar" href="Controlador"></a>
                                </td>-->
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /#page-content-wrapper -->
        </div>
        <!-- /#wrapper -->

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="css/alertify.min.js" type="text/javascript"></script>

        <!-- Menu Toggle Script -->
        <script>
                                    $("#menu-toggle").click(function (e) {
                                        e.preventDefault();
                                        $("#wrapper").toggleClass("toggled");
                                    });
        </script>
        <script>
            function validar_nombre() {
                nom = document.frmCategorias.txtNombre.value;
                if (nom.length == 0) {
                    alertify.alert("Error", "Ingrese Nombre de la Categoria").set('label', 'Ok');
                    return false;
                } else {
                    alertify.success("Categoria Registrada");
                    return true;
                }
            }
            function validarTexto(e) {
                tecla = e.keyCode;
                teclado = String.fromCharCode(tecla);

                if ((teclado < 'A' || teclado > 'z') && teclado != " ") {
                    return false;
                }
            }
        </script>
    </body>

</html>

