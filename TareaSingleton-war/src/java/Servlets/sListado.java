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
import java.text.DecimalFormat;
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
@WebServlet(name = "sListado", urlPatterns = {"/sListado"})
public class sListado extends HttpServlet {

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
            DecimalFormat df=new DecimalFormat("#.##");
            out.println("<ul>");
            double acc=0, promG=0;
            out.println("<h3>Lista de Alumnos</h3>");
            for (Alumno a : controlAlumno.lista()) {
                out.print("<li>"+a.getNom()+" "+a.getAp()+". Promedio: "+a.getProm()+"</li>");
                out.print("<a href=sBuscar?rut="+a.getRut()+">>Detalles</a> ");
                out.print("<a href=modificarDatos.jsp?rut="+a.getRut()+"&nom="+a.getNom()+"&ap="+a.getAp()+"&ed="+a.getEd()+">>Modificar Datos</a> ");
                out.print("<a href=agregarNota.jsp?rut="+a.getRut()+"&nom="+a.getNom()+"&ap="+a.getAp()+"&n1="+a.getN1()+"&n2="+a.getN2()+"&n3="+a.getN3()+"&n4="+a.getN4()+">>Agregar nota(s)</a> ");
                out.print("<a href=sEliminar?rut="+a.getRut()+">>Eliminar</a><br>");
                acc = acc+a.getProm();
                promG=acc/controlAlumno.lista().size();
            }
            
            out.println("</ul>");
            out.println("<h4>Promedio General: "+df.format(Double.parseDouble(controlAlumno.promedioGeneral()))+"</h4>");
            
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
