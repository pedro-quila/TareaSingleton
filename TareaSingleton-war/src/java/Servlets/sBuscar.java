/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Control.controlAlumnoLocal;
import Clases.Alumno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro.quila
 */
@WebServlet(name = "sBuscar", urlPatterns = {"/sBuscar"})
public class sBuscar extends HttpServlet {

    @EJB
    private controlAlumnoLocal controlAlumno;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String rut = request.getParameter("rut");
            Alumno a = controlAlumno.buscarAlumno(rut);
            out.println("<h3>Búsqueda de Alumnos</h3>");
            if (a != null) {
                out.print("<h4>Encontrado: </h4>");
                out.print("<h4>Rut: "+a.getRut()+" Nombre: "+a.getNom()+" "+a.getAp()+". Edad: "+a.getEd()+"</h4>");
                out.print("<h4>Nota 1: "+a.getN1()+". Nota 2: "+a.getN2()+". Nota 3: "+a.getN3()+". Nota 4: "+a.getN4()+"</h4>");
                out.println("<a href=modificarDatos.jsp?rut="+a.getRut()+"&nom="+a.getNom()+"&ap="+a.getAp()+"&ed="+a.getEd()+"> >Modificar Datos</a>");
                out.println("<a href=agregarNota.jsp?rut="+a.getRut()+"&nom="+a.getNom()+"&ap="+a.getAp()+"&n1="+a.getN1()+"&n2="+a.getN2()+"&n3="+a.getN3()+"&n4="+a.getN4()+"> >Agregar nota(s)</a>");
                out.println("<a href=sEliminar?rut="+a.getRut()+"> >Eliminar</a>");
            }else{
                out.print("<h4>No encontrado</h4>");
            }
            
            out.print("<form action=index.html>");
            out.print("<input type=submit value=Volver>");
            out.print("</form>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
