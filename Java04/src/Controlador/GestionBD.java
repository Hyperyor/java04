/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.*;

/**
 *
 * @author hyperior
 */
public class GestionBD {
    
    private static Connection conn = null;
    
    //booleano que nos indica el estado de la conexión con la BD
    private static boolean connected = false;
    
    //metodo que recibe un string (contraseña de la BD) y devuelve true
    //en caso de establecer conexión y false en caso contrario
    public static boolean connectToDataBase(String pwd)
    {
        String urlDatabase =  "jdbc:postgresql://localhost:5432/instituto"; 
        
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase,  "postgres", pwd);
        } catch (Exception e) {
            System.out.println("Ocurrio un error : "+e.getMessage());
            return false;
        }
        System.out.println("La conexión se realizo sin problemas! =) ");
        connected = true;
        return true;
    }
    
    //metodo que cierra la conexion con la base de datos
    public static void closeConnectionToDataBase() 
    {
        try
        {
            conn.commit();
            conn.close();
            connected = false;
        }
        catch(SQLException e)
        {
            System.out.println("\nNo se ha podido cerrar la conexión");
        }
        
    }
    
    //metodo que crea y devuelve un statement
    public static Statement getPreofesorStatement()
    {
        Statement stmt = null;
        
        try
        {
            //ResultSet.HOLD_CURSORS_OVER_COMMIT no si se hará falta usarlo más adelante
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
        }
        catch(SQLException ex)
        {
            System.out.println("\nError al crear el statement");
        }
         
         return stmt;
    }
    
    public static Statement getAlumnoStatement()
    {
        Statement stmt = null;
        
        try
        {
            //el statement debe ser asi, de lo contrario no se podrian
            //insertar elementos en las tablas, daria error
                stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                                            ResultSet.CONCUR_UPDATABLE);
        }
        catch(SQLException ex)
        {
            System.out.println("\nError al crear el statement");
        }
         
         return stmt;
    }
    
    public static boolean getDBConnectionState()
    {
        return connected;
    }
    
}
