/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.Alumno;
import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author pedro.quila
 */
@Local
public interface controlAlumnoLocal {

    String agregarAlumno(String rut, String nom, String ap, int ed, double n1, double n2, double n3, double n4);

    ArrayList<Alumno> lista();

    Alumno buscarAlumno(String rut);

    String modificarAlumno(String rut, String nom, String ap, int ed);

    String agregarNota(String rut, double n1, double n2, double n3, double n4);

    String eliminarAlumno(String rut);

    String promedioGeneral();

    String validarRut(String rut);

    
    
}
