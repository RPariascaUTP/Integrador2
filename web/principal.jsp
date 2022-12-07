<%-- 
    Document   : principal.jsp
    Created on : 01/12/2022, 10:36:06 AM
    Author     : nelynoe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <title>CONTROL DE CUENTAS POR PAGAR</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-info">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a style="margin-left: 10px ; border: none" class="nav-link active" aria-current="page" href="#">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px ; border: none" class="btn btn-outline-light" href="Controlador?menu=Comprobante&accion=Listar" target="myFrame">Comprobantes</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px ; border: none" class="btn btn-outline-light" href="Controlador?menu=Empleado&accion=Listar" target="myFrame">Empleados</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px ; border: none" class="btn btn-outline-light" href="Controlador?menu=Proveedor&accion=Listar" target="myFrame">Proveedores</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px ; border: none" class="btn btn-outline-light" href="Controlador?menu=NuevoComprobante" target="myFrame">Nuevo comprobante</a>
                    </li>
                </ul>
            </div>  
            <div class="dropdown">
                <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownbutton" data-bs-toggle="dropdown" aria-expanded="false">
                    ${usuario.getNom()}
                </button>
                <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
                    <a class="dropdown-item" href="#">
                        <img src="img/User00.jpg" alt="60" width="60"/>
                    </a>
                    <a class="dropdown-item" href="#">${usuario.getUser()}</a>
                    <a class="dropdown-item" href="#">Email</a>
                    <div class="dropdown-divider" ></div>
                    <form action="Validar" method="POST">
                        <button name="accion" value="Salir" class="dropdown-item" href="#">Salir</button>
                    </form>
                </div>
            </div>

        </nav>
        <div class="m-4" style="height: 450px;">
            <iframe name="myFrame" style="height: 100%; width: 100%; border:none">  </iframe>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    </body>
</html>
