/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author hyperior
 */
public class GestionAlumno {
    
    private ResultSet rSet;
    private Statement alumnStatement;
    
    private ArrayList<Alumno> listadoAlumnos = new ArrayList<Alumno>();
    
    public GestionAlumno(Statement stmt)
    {
        alumnStatement = stmt;
        
        insertarAlumnosDaw();
        
        insertarAlumnosDam();
        
    }
    
    private void insertarAlumnosDaw()
    {
        try
        {
            rSet = alumnStatement.executeQuery("select alumno.codigo_alumno, apenom, fecha_nacimiento, proalumno, nota_web " +
                                "from alumno, alumnoDaw where alumno.codigo_alumno = alumnoDaw.codigo_alumno");
            
            while(rSet.next())
            {
                AlumnoDaw alD = new AlumnoDaw();
                
                alD.setCodigoAlumno(rSet.getInt("codigo_alumno"));
                
                alD.setApeNom(rSet.getString("apenom"));
                
                java.util.Date d = rSet.getDate("fecha_nacimiento");
                
                alD.setFechaNacimiento(new GregorianCalendar(), d);
                
                alD.setProAlumno(rSet.getString("proalumno"));
                
                alD.setNotaWeb(rSet.getFloat("nota_web"));
                
                listadoAlumnos.add(alD);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("\nError");
        }
    }
    
    private void insertarAlumnosDam()
    {
        try
        {
            rSet = alumnStatement.executeQuery("select alumno.codigo_alumno, apenom, fecha_nacimiento, proalumno, nota_movil " +
                                "from alumno, alumnoDam where alumno.codigo_alumno = alumnoDam.codigo_alumno");
            
            while(rSet.next())
            {
                AlumnoDam alD = new AlumnoDam();
                
                alD.setCodigoAlumno(rSet.getInt("codigo_alumno"));
                
                alD.setApeNom(rSet.getString("apenom"));
                
                java.util.Date d = rSet.getDate("fecha_nacimiento");
                
                alD.setFechaNacimiento(new GregorianCalendar(), d);
                
                alD.setProAlumno(rSet.getString("proalumno"));
                
                alD.setNotaMovil(rSet.getFloat("nota_movil"));
                
                listadoAlumnos.add(alD);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("\nError");
        }
    }
    
    //funcion que recibe un alumno y lo inserta en las tablas respectivas 
    //de la base de datos
    public void insertAlumn(Alumno alumn)
    {
       
        try
        {
            rSet = alumnStatement.executeQuery("select * from alumno");
            
            rSet.moveToInsertRow();
            
            rSet.updateInt("codigo_alumno", alumn.getCodigoAlumno());
            
            rSet.updateString("apenom", alumn.getApeNom());
            
            java.util.Date utilDate = alumn.getFechaNacimiento().getTime();
            java.sql.Date d = new java.sql.Date(utilDate.getTime());
            rSet.updateDate("fecha_nacimiento", d);
            
            rSet.updateString("proalumno", alumn.getProAlumno());
            
            rSet.insertRow();
            
            if(alumn instanceof AlumnoDaw)
            {
                AlumnoDaw daw = (AlumnoDaw)alumn;
                insertarAlumnoDaw(daw);
            }
            else
            {
                AlumnoDam dam = (AlumnoDam)alumn;
                insertarAlumnoDam(dam);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("\nError");
        }
        
    }
    
    
    private void insertarAlumnoDaw(AlumnoDaw daw)
    {
        try
        {
            rSet = alumnStatement.executeQuery("select * from alumnoDaw");
            
            rSet.moveToInsertRow();
            
            rSet.updateInt("codigo_alumno", daw.getCodigoAlumno());

            rSet.updateFloat("nota_web", daw.getNotaWeb());
            
            rSet.insertRow();

        }
        catch(SQLException ex)
        {
            System.out.println("\nError");
        }
    }
    
    private void insertarAlumnoDam(AlumnoDam dam)
    {
        try
        {
            rSet = alumnStatement.executeQuery("select * from alumnoDam");
            
            rSet.moveToInsertRow();
            
            rSet.updateInt("codigo_alumno", dam.getCodigoAlumno());

            rSet.updateFloat("nota_movil", dam.getNotaMovil());
            
            rSet.insertRow();

        }
        catch(SQLException ex)
        {
            System.out.println("\nError");
        }
    }
    
    public ArrayList<Alumno> getListadoAlumnos()
    {
        return listadoAlumnos;
    }
    
}
