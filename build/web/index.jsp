<%-- 
    Document   : index.jsp
    Created on : 01/12/2022, 10:34:38 AM
    Author     : nelynoe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Pantalla Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  </head>
  <body>
      <div class="container mt-4 col-lg-4">
          <div class="card" col-sm-10>
              <div class="card-body">
                  <form class="form-sign" action="Validar" method="POST">
                      <div class="form-group">
                          <CENTER><h1>Login</h1></CENTER>
                          <center><img src="img/Users01.png" alt="120" width="220"/></center>
                          <label><h3>BIENVENIDOS AL SISTEMA DE CUENTAS POR PAGAR</h3></label>
                      </div>
                      <br>
                      <div class="form-group">
                          <label>Usuario:</label>
                          <input type="text" name="txtuser" class="form-control">
                      </div>
                      <div class="form-group">
                          <label>Contraseña:</label>
                          <input type="password" name="txtpass" class="form-control">
                      </div>
                      <br>
                      <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">                          
                  </form>
              </div>
          </div>
      </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  </body>
</html>