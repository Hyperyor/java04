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
public class Profesor {
    
    private String dni;
    private String nombre;
    private int edad;
    private GregorianCalendar fechaIncorporacion;
    private float mediaAlumnos; 
    private String foto;

    public Profesor()
    {
        
    }
    
    public Profesor(String dni, String nombre, int edad, GregorianCalendar fechaIncorporacion, float mediaAlumnos, String foto) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIncorporacion = fechaIncorporacion;
        this.mediaAlumnos = mediaAlumnos;
        this.foto = foto;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public GregorianCalendar getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(GregorianCalendar fechaIncorporacion, Date d) {
        this.fechaIncorporacion = fechaIncorporacion;
        this.fechaIncorporacion.setTime(d);
       
    }

    public float getMediaAlumnos() {
        return mediaAlumnos;
    }

    public void setMediaAlumnos(float mediaAlumnos) {
        this.mediaAlumnos = mediaAlumnos;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    
}
