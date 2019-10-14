
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

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
        Connection conn = null;
            String urlDatabase =  "jdbc:postgresql://localhost:5432/instituto"; 
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(urlDatabase,  "postgres", "example");
            } catch (Exception e) {
                System.out.println("Ocurrio un error : "+e.getMessage());
            }
            System.out.println("La conexión se realizo sin problemas! =) ");
            
            try
            {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM profesor");
                ResultSetMetaData rsmd = rs.getMetaData();
      int numCols = rsmd.getColumnCount();

      while (rs.next()) {
        for (int i = 1; i <= numCols; i++) {
          System.out.print(rs.getString(i) + " ");
        }
        System.out.println("");
      }
            }
            catch(SQLException sq)
            {
                
            }
            
      
    }
    
}
