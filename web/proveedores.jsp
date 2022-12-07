<%-- 
    Document   : proveedores
    Created on : 04/12/2022, 10:15:16 PM
    Author     : nelynoe
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <title>Ingreso de datos Proveedor</title>
    </head>
    <body>
        <div class="d-flex">
            
        
        <div class="card col-sm-3">
            <div class="card-body">
                <form action="Controlador?menu=Empleado" method="POST">
                    <div class="form-group">
                        <label>RUC</label>
                        <input type="text" value="${proveedor.getRUC()}" name="txtRUC" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Nombre/Razon Social</label>
                        <input type="text" value="${proveedor.getNomp()}" name="txtNomp" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Domicilio</label>
                        <input type="text" value="${proveedor.getDirp()}" name="txtDirp" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Correo electronico</label>
                        <input type="text" value="${proveedor.getEmail()}" name="txtEmail" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Telefono</label>
                        <input type="text" value="${proveedor.getTelp()}" name="txtTelp" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Estado</label>
                        <input type="text" value="${proveedor.getEstp()}" name="txtEstp" class="form-control">
                    </div>
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                </form>
            </div>
        </div>
        <div class="col-sm-12">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>RUC</th>
                        <th>NOMBRE/RAZON SOCIAL</th>
                        <th>DIRECCION</th>
                        <th>E-MAIL</th>
                        <th>TELEFONO</th>
                        <th>ESTADO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="pro" items="${proveedores}">
                    <tr>
                        <td>${pro.getIdp()}</td>
                        <td>${pro.getRUC()}</td>
                        <td>${pro.getNomp()}</td>
                        <td>${pro.getDirp()}</td>
                        <td>${pro.getEmail()}</td>
                        <td>${pro.getTelp()}</td>
                        <td>${pro.getEstp()}</td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?menu=Proveedor&accion=Editar&id=${pro.getIdp()}">Editar</a>
                            <a class="btn btn-danger" href="Controlador?menu=Proveedor&accion=Delete&id=${pro.getIdp()}">Delete</a>
                        </td>
                        
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    </body>
</html>
