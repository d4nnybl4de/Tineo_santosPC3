<%-- 
    Document   : Productos
    Created on : 22/06/2022, 02:34:59 PM
    Author     : Daniel
--%>

<%@page import="DAO.CategoriaDAO"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Categorias"%>





<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title> DESARROLLO WEB</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/simple-sidebar.css" rel="stylesheet">
        <link href="css/alertify.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/default.min.css" rel="stylesheet" type="text/css"/>

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
                        <h1>Registrar Productos</h1>
                        <form name="frmProductos" action="Productos.jsp" method="post" onsubmit="return validar(this)">
                            <%--
                                if (msje.length() > 0) {
                                    out.print("<div class=\"error\">" + msje + "</div>");
                                }
                            --%>
                            <div class="row">

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Categoria</label>
                                        <div>
                                            <select class="form-control" id="cboCategoriaProducto"  name="cboCategoria">
                                                <% List<Categorias> categorias = (List<Categorias>) request.getAttribute("categoriaslis");
                                                    if (categorias != null)//ESTO TMBN ES IMPORTANTE 
                                                        for (Categorias cat : categorias) {%>
                                                        <option value="<%=cat.getIdCat() %>"><%=cat.getNomCat() %></option>
                                                <%}%>
                                            </select>
                                        </div>
                                    </div>
                                </div>


                                <%--<div class="form-group form-group-lg col-md-6">
                                    <label class="col-sm-2 control-label" for="lg" for="cboCategoriaProducto" >Categoria</label>
                                    <div class="col-sm-4">   

                                        <select class="form-control" id="cboCategoriaProducto" name="cboCategoriaProducto">
                                            <% List<Categorias> categorias = (List<Categorias>) request.getAttribute("categoriaslis");
                                                if (categorias != null)//ESTO TMBN ES IMPORTANTE 
                                                    for (Categorias cat : categorias) {%>
                                            <option value=<%=cat.getNomCat()%></option>
                                            <%}%>
                                        </select>

                                    </div>
                                </div>--%>


                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Nombre del Producto</label>
                                        <input type="text" class="form-control" name="txtNombre" 
                                               placeholder="Ingrese Nombre">
                                    </div>
                                </div>
                            </div>
                            <div class="row">

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Marca</label>
                                        <div>
                                            <select class="form-control" name="cboMarca">
                                                <option>Eliga una Marca</option>
                                                <%--
                                                    DAOCategoria dao = new DAOCategoria();
                                                    List<Categoria> cats = null;

                                                    try {
                                                        cats = dao.listar();
                                                        for (Categoria cat : cats) {
                                                            out.print("<option value=\"" + cat.getCategoria() + "\" "
                                                                    + (prod != null
                                                                    && cat.getCategoria() == prod.getCategoria().getCategoria()
                                                                    ? "selected" : "") + ">"
                                                                    + cat.getNombre() + "</option>");
                                                        }
                                                    } catch (Exception e) {
                                                        out.print("<option value=\"0\">No se pudo listar"
                                                                + "las categorías</option>");
                                                    } finally {
                                                        cats = null;
                                                        dao = null;
                                                    }
                                                --%>
                                            </select>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Modelo</label>
                                        <input type="text" class="form-control" name="txtDescripcion" placeholder="Ingrese Descripcion">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label>Descripcion</label>
                                        <input type="text" class="form-control" name="txtDescripcion" placeholder="Ingrese Descripcion">
                                    </div>
                                </div>

                            </div>                


                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Cantidad</label>
                                        <input type="text" class="form-control" name="txtPrecio" 
                                               placeholder="Ingrese Cantindad">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Precio</label>
                                        <input type="text" class="form-control" name="txtPrecioM" 
                                               placeholder="Ingrese Precio">
                                    </div> 
                                </div>
                            </div>
                            <input type="submit" class="btn btn-success" name="btnRegistrar" value="Registrar">
                            <a href="index.html" class="btn btn-danger">Cancelar</a>
                        </form><br>
                    </div>
                    <div class="col-md-12">
                        <h1>Listado de Productos</h1>
                        <form name="frmBuscar" action="Productos.jsp" method="post">
                            <div class="form-group">
                                <div class="form-inline">                                    
                                    <input type="text" class="form-control col-md-10 col-sm-8" placeholder="Escriba el nombre del producto" name="txtProducto" value="<%--=buscar--%>" >
                                    <input type="submit" name="btnBuscar" class="btn btn-dark col-md-2 col-sm-8" value="Buscar Producto">                               
                                </div>

                            </div>
                        </form>
                        <div class="table-responsive" >                                 
                            <table class="table table-hover table-striped table-bordered">
                                <thead class="btn-info">
                                    <tr>
                                        <th class="text-center">N°</th>
                                        <th class="text-center">Categoria</th>
                                        <th class="text-center">Producto</th>
                                        <th class="text-center">Marca</th>
                                        <th class="text-center">Modelo</th>
                                        <th class="text-center">Descripcion</th>
                                        <th class="text-center">Cantidad</th>
                                        <th class="text-center">Precio</th>
                                        <th class="text-center">Acciones</th>              
                                    </tr>
                                </thead>
                                <style>
                                    .roci{
                                        color: white;                                      
                                    }
                                </style>
                                <%--
                                    DAOProducto daoprod = new DAOProducto();
                                    List<Producto> productos = null;
                                    int i = 1;

                                    try {
                                        productos = daoprod.listar();
                                        for (Producto product : productos) {
                                            out.print("<tr>"
                                                    + "<td>" + i + "</td>"
                                                    + "<td>" + product.getProducto() + "</td>"
                                                    + "<td>" + product.getDescripcion() + "</td>"
                                                    + "<td>" + product.getPrecio() + "</td>"
                                                    + "<td>" + product.getPreciominimo() + "</td>"
                                                    + "<td>" + product.getCategoria().getNombre() + "</td>"
                                                    + "<td class=\"text-center\">"
                                                    + "<a class=\"btn btn-warning btn-sm\" href=\"editarproducto.jsp?cod="
                                                    + product.getCodigoproducto() + "\"> Editar</a> "
                                                    + "<a class=\"btn btn-danger btn-sm roci\" href=\"eliminarproducto.jsp?cod="
                                                    + product.getCodigoproducto() + "\"> Eliminar</a>"
                                                    + "</td>"
                                                    + "</tr>");
                                            i++;
                                        }

                                    } catch (Exception e) {
                                        out.print("<tr><td colspan=\"3\">"
                                                + e.getMessage() + "No se pudo listar las productos</td></tr>");
                                    } finally {
                                        dao = null;
                                        if (productos != null) {
                                            productos.clear();
                                        }
                                        productos = null;
                                    }
                                --%>                                                          
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
        <script src="JavaScript/ValidarProducto.js" type="text/javascript"></script>
        <!-- Menu Toggle Script -->
        <script>
                            $("#menu-toggle").click(function (e) {
                                e.preventDefault();
                                $("#wrapper").toggleClass("toggled");
                            });
        </script>
    </body>
</html>
