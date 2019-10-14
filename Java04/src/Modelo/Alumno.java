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
public class Alumno {
    
    private int codigoAlumno;
    private String apeNom;
    private GregorianCalendar fechaNacimiento;
    private String proAlumno;

    public Alumno()
    {
        
    }
    
    public Alumno(int codigoAlumno, String apeNom, GregorianCalendar fechaNacimiento, String proAlumno) {
        this.codigoAlumno = codigoAlumno;
        this.apeNom = apeNom;
        this.fechaNacimiento = fechaNacimiento;
        this.proAlumno = proAlumno;
    }

    
    public int getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(int codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getApeNom() {
        return apeNom;
    }

    public void setApeNom(String apeNom) {
        this.apeNom = apeNom;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProAlumno() {
        return proAlumno;
    }

    public void setProAlumno(String proAlumno) {
        this.proAlumno = proAlumno;
    }

    
    
}
