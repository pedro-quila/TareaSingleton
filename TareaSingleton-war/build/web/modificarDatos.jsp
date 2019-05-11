<%-- 
    Document   : modificarDatos
    Created on : 07-05-2019, 1:22:08
    Author     : pedro.quila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar datos alumno</title>
    </head>
    <body>
        <form action="sModificar">
            Rut      <input type="text" name="rut" placeholder="Rut" readonly value="${param.rut}"><br>
            Nombre   <input type="text" name="nom" placeholder="Nombre" required value="${param.nom}"><br>
            Apellido <input type="text" name="ap" placeholder="Apellido" required value="${param.ap}"><br>
            Edad     <input type="text" name="ed" placeholder="Edad" required value="${param.ed}"><br>
            <input type="submit" value="Modificar"><br>
        </form><br>
        
        <form action="sListado">
            <input type="submit" value="Volver">               
        </form>
    </body>
</html>
