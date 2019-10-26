
package Controlador;

import java.sql.SQLException;


public class Pruebas {

    
    public static void main(String[] args) throws SQLException {
       
        
    
        if(ConexionValidacion.realizarConexionPostgres() && ConexionValidacion.realizarConexionMysql())
        {
            System.out.println("La conexion ha sido correcta");
        }
        else
        {
            System.out.println("Ha ocurrido un problema con la base de datos");
            System.exit(0);
        }
        
        if(ConexionValidacion.realizaStatementValidacion("1111", "hola"))
        {
            System.out.println(ConexionValidacion.getUsuario());
        }
        else
        {
            System.out.println("No conection");
        }
        
        GestionarPedidos ge=new GestionarPedidos("hola");
        
        
        
        System.out.println(ge.obtenerSigPed().getNumeroPedido());
        System.out.println(ge.obtenerSigPed().getNumeroPedido());
        System.out.println(ge.obtenerAnteriorPed().getNumeroPedido());
         
    }
}
