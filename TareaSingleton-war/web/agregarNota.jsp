<%-- 
    Document   : agregarNota
    Created on : 07-05-2019, 1:22:17
    Author     : pedro.quila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar notas alumno</title>
    </head>
    <body>
        <form action="sNota">
            <h4>"${param.nom} ${param.ap}:"</h4><br>
            Rut    <input type="text" name="rut" placeholder="Rut" readonly value="${param.rut}"><br>
            Nota 1 <input type="number" name="n1" min="1" max="7" step="0.01" required placeholder="Nota 1" value="${param.n1}"><br>
            Nota 2 <input type="number" name="n2" min="1" max="7" step="0.01" required placeholder="Nota 2" value="${param.n2}"><br>
            Nota 3 <input type="number" name="n3" min="1" max="7" step="0.01" required placeholder="Nota 3" value="${param.n3}"><br>
            Nota 4 <input type="number" name="n4" min="1" max="7" step="0.01" required placeholder="Nota 4" value="${param.n4}"><br>
            <input type="submit" value="Agregar Nota(s)"><br>
        </form><br>
            
        <form action="sListado">
            <input type="submit" value="Volver">               
        </form>
    </body>
</html>
