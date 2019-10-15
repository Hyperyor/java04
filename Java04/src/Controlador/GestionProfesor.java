/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Profesor;
import java.sql.*;
import java.util.GregorianCalendar;

/**
 *
 * @author hyperior
 */
public class GestionProfesor {
    
    private ResultSet rSet;
    private Statement profStatement;
    
    private int totalRowNumber;
    private int actualRowNumber;
    
    public GestionProfesor(Statement stmt)
    {
        profStatement = stmt;
        
        try
        {
            rSet = stmt.executeQuery("SELECT dni, nombre, edad, fecha_incorporacion,"
                    + " media_alumnos, foto FROM profesor");
            
            rSet.last();
            totalRowNumber = rSet.getRow();
            rSet.beforeFirst();
        }
        catch(SQLException ex)
        {
            
        }
        
    }
    
    public Profesor getNextProf()
    {
        Profesor p = new Profesor();
        
        try
        {
            if(rSet.next())
            {
                p.setDni(rSet.getString("dni"));
                p.setNombre(rSet.getString("nombre"));
                p.setEdad(rSet.getInt("edad"));
                
                Date d = rSet.getDate("fecha_incorporacion");
                
                p.setFechaIncorporacion(new GregorianCalendar(), d);
                
                p.setMediaAlumnos(rSet.getFloat("media_alumnos"));
                
                p.setFoto(rSet.getString("foto"));
                
                actualRowNumber = rSet.getRow();
            }
        }
        catch(SQLException ex)
        {
            
        }
        
        return p;
        
    }
    
    public Profesor getPreviousProf()
    {
        Profesor p = new Profesor();
        
        try
        {
            if(rSet.previous())
            {
                p.setDni(rSet.getString("dni"));
                p.setNombre(rSet.getString("nombre"));
                p.setEdad(rSet.getInt("edad"));
                
                Date d = rSet.getDate("fecha_incorporacion");
                
                p.setFechaIncorporacion(new GregorianCalendar(), d);
                
                p.setMediaAlumnos(rSet.getFloat("media_alumnos"));
                
                p.setFoto(rSet.getString("foto"));
                
                actualRowNumber = rSet.getRow();
            }
        }
        catch(SQLException ex)
        {
            
        }
        
        return p;
        
    }
    
    public void updateProf(Profesor prof)
    {
        Statement st = profStatement;
        try
        {
            java.util.Date utilDate = prof.getFechaIncorporacion().getTime();

            java.sql.Date d = new java.sql.Date(utilDate.getTime());
            rSet.updateDate("fecha_incorporacion", d);
            
            rSet.updateFloat("media_alumnos", prof.getMediaAlumnos());
            
            rSet.updateRow();
            
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    //devuelve true si el profesor que estamos viendo ahora mismo es el ultimo
    //de la lista
    public boolean isLastProfesor()
    {
        if(getActualRowNumber() == getTotalRowNumber())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //devuelve true si el profesor que estamos viendo ahora mismo es el primero de la
    //lista
    public boolean isFirstProfesor()
    {
        if(getActualRowNumber() == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int getTotalRowNumber()
    {
        return totalRowNumber;
    }
    
    public int getActualRowNumber()
    {
        return actualRowNumber;
    }
    
}
