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
public class AlumnoDam extends Alumno{
    
    private float notaMovil;
    
    public AlumnoDam()
    {
        
    }
    
    public AlumnoDam(int codigoAlumno, String apeNom, GregorianCalendar fechaNacimiento, String proAlumno) {
        super(codigoAlumno, apeNom, fechaNacimiento, proAlumno);
    }

    public float getNotaMovil() {
        return notaMovil;
    }

    public void setNotaMovil(float notaMovil) {
        this.notaMovil = notaMovil;
    }
    
    
    
}
