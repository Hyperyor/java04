/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author alumno
 */
public class AlumnoDaw extends Alumno{
    
    private float notaWeb;
    
    public AlumnoDaw()
    {
        super();
    }
    
    public AlumnoDaw(int codigoAlumno, String apeNom, GregorianCalendar fechaNacimiento, String proAlumno) {
        super(codigoAlumno, apeNom, fechaNacimiento, proAlumno);
    }

    public float getNotaWeb() {
        
        return notaWeb;
    }

    public void setNotaWeb(float notaWeb) {
        this.notaWeb = notaWeb;
    }
    
    
    
}
