
import Controlador.GestionAlumno;
import Controlador.GestionBD;
import Controlador.GestionProfesor;
import Modelo.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Connection conn = null;
//            String urlDatabase =  "jdbc:postgresql://localhost:5432/instituto"; 
//            try {
//                Class.forName("org.postgresql.Driver");
//                conn = DriverManager.getConnection(urlDatabase,  "postgres", "example");
//            } catch (Exception e) {
//                System.out.println("Ocurrio un error : "+e.getMessage());
//            }
//            System.out.println("La conexión se realizo sin problemas! =) ");

        GestionBD.connectToDataBase("example");
        
        GestionProfesor gp = new GestionProfesor(GestionBD.getPreofesorStatement());
        
        System.out.println("\nNumero total de profesores: " + gp.getTotalRowNumber());
        
        Profesor p = gp.getNextProf();
        
        System.out.println("\nFila actual: " + gp.getActualRowNumber());
        
        System.out.println("\nDNI del primer profesor: " + p.getDni());
        System.out.println("\nMedia de alumnos del primer profesor: " + p.getMediaAlumnos());
        
//        p.setMediaAlumnos(1);
//        
//        gp.updateProf(p);
        
        Profesor pe = gp.getNextProf();
        
        System.out.println("\nFila actual: " + gp.getActualRowNumber());
        
        System.out.println("\nDNI del segundo profesor: " + pe.getDni());
        System.out.println("\nMedia de alumnos del segundo profesor: " + pe.getMediaAlumnos());
        
        Profesor pi = gp.getNextProf();
        
        System.out.println("\nFila actual: " + gp.getActualRowNumber());
        
        System.out.println("\nDNI del tercer profesor: " + pi.getDni());
        System.out.println("\nMedia de alumnos del tercer profesor: " + pi.getMediaAlumnos());
        
        Profesor po = gp.getPreviousProf(); //con esto nos saldria el tercer profesor
        
        System.out.println("\nFila actual: " + gp.getActualRowNumber());
        
        System.out.println("\nDNI del cuarto profesor: " + po.getDni());
        System.out.println("\nMedia de alumnos del cuarto profesor: " + po.getMediaAlumnos());
        
        GestionAlumno gA = new GestionAlumno(GestionBD.getAlumnoStatement());
        
        ArrayList<Alumno> al = gA.getListadoAlumnos();
        
        for (int i = 0; i < al.size(); i++) {
            
            Alumno alumn = al.get(i);
            
            System.out.println("\nCodigo del alumno: " + alumn.getCodigoAlumno());
        }
        
        //AlumnoDaw al1 = (AlumnoDaw)al.get(0);
        
        //al1.setCodigoAlumno(3);
        
        //gA.insertAlumn(al1);
        
//        po.setMediaAlumnos(0);
//        
//        gp.updateProf(po);
        
        
//        Profesor pa = gp.getPreviousProf();
//        
//        System.out.println("\nDNI del anterior profesor: " + pa.getDni());
//        System.out.println("\nMedia de alumnos del primer profesor: " + p.getMediaAlumnos());
        
        GestionBD.closeConnectionToDataBase();
            
//            try
//            {
//                Statement stmt = conn.createStatement();
//                ResultSet rs = stmt.executeQuery("SELECT * FROM profesor");
//                ResultSetMetaData rsmd = rs.getMetaData();
//      int numCols = rsmd.getColumnCount();
//
//      while (rs.next()) {
//        for (int i = 1; i <= numCols; i++) {
//          System.out.print(rs.getString(i) + " ");
//        }
//        System.out.println("");
//      }
//            }
//            catch(SQLException sq)
//            {
//                
//            }
            
      
    }
    
}
