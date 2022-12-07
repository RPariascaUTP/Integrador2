<%-- 
    Document   : comprobante
    Created on : 04/12/2022, 10:15:37 PM
    Author     : nelynoe
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <title>Ingreso de datos Comprobante</title>
    </head>
    <body>
        <div class="d-flex">
            
        
        <div class="card col-sm-3">
            <div class="card-body">
                <form action="Controlador?menu=Empleado" method="POST">
                    <div class="form-group">
                        <label>Nro Comprob</label>
                        <input type="text" value="${comprobante.getNroComp()}" name="txtNroComp" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Fecha Emision</label>
                        <input type="text" value="${comprobante.getFecEmi()}" name="txtFecEmi" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Nro Orden</label>
                        <input type="text" value="${comprobante.getNroOrden()}" name="txtNroOrden" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Estado</label>
                        <input type="text" value="${comprobante.getEstc()}" name="txtEstc" class="form-control">
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
                        <th>NRO COMPROBANTE</th>
                        <th>FECHA EMISION</th>
                        <th>NRO ORDEN</th>
                        <th>ESTADO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="comp" items="${comprobantes}">
                    <tr>
                        <td>${comp.getIdc()}</td>
                        <td>${comp.getNroComp()}</td>
                        <td>${comp.getFecEmi()}</td>
                        <td>${comp.getNroOrden()}</td>
                        <td>${comp.getEstc()}</td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?menu=Proveedor&accion=Editar&id=${comp.getIdc()}">Editar</a>
                            <a class="btn btn-danger" href="Controlador?menu=Proveedor&accion=Delete&id=${comp.getIdc()}">Delete</a>
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
