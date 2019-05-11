/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.Alumno;
import java.util.ArrayList;
import javax.ejb.Singleton;

/**
 *
 * @author pedro.quila
 */
@Singleton
public class controlAlumno implements controlAlumnoLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private ArrayList<Alumno> listadoAlumnos = new ArrayList<Alumno>();

    @Override
    public String agregarAlumno(String rut, String nom, String ap, int ed, double n1, double n2, double n3, double n4) {
        listadoAlumnos.add(new Alumno(rut, nom, ap, ed, n1, n2, n3, n4, 1));
        
        return "Alumno "+rut+" ingresado";
    }

    @Override
    public ArrayList<Alumno> lista() {
        return this.listadoAlumnos;
    }

    @Override
    public Alumno buscarAlumno(String rut) {
        for (Alumno a : listadoAlumnos) {
            if (a.getRut().equalsIgnoreCase(rut)) {
                return a;
            }
        }
        
        return null;
    }

    @Override
    public String modificarAlumno(String rut, String nom, String ap, int ed) {
        Alumno a = this.buscarAlumno(rut);
        a.setNom(nom);
        a.setAp(ap);
        a.setEd(ed);
        
        return "Alumno modificado";
    }

    @Override
    public String agregarNota(String rut, double n1, double n2, double n3, double n4) {
        Alumno a = this.buscarAlumno(rut);
        a.setN1(n1);
        a.setN2(n2);
        a.setN3(n3);
        a.setN4(n4);
        double prom = ((n1*0.2)+(n2*0.2)+(n3*0.3)+(n4*0.3));
        a.setProm(prom);
        
        return "Nota(s) ingresada(s)";
    }

    @Override
    public String eliminarAlumno(String rut) {
        Alumno a = this.buscarAlumno(rut);
        listadoAlumnos.remove(a);
        return "Alumno eliminado";
    }

    @Override
    public String promedioGeneral() {
        double acc=0, promG;
        for (Alumno a : listadoAlumnos) {
            a = this.buscarAlumno(a.getRut());
            acc=acc+a.getProm();
        }
        promG = acc/(listadoAlumnos.size());
        return ""+promG+"";
    }

    @Override
    public String validarRut(String rut) {
        for (Alumno a : listadoAlumnos) {
            if (a.getRut().equalsIgnoreCase(rut)) {
                return null;
            }
        }
        return rut;
    }
    
    
}
