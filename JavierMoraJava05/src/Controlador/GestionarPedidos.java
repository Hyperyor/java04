
package Controlador;

import Modelo.Consultas;
import Modelo.Pedidos;
import java.sql.*;
import java.util.GregorianCalendar;


public class GestionarPedidos {
    
    private String usuario;
    private PreparedStatement statementPedidos;
    private ResultSet resultadoConsulta;
    
    public GestionarPedidos(String usuario) throws SQLException
    {
        this.usuario=usuario;
        
        montarStatement ();
       
        creacionResultSet();//lanzara la exepcion si no hay pedidos y se capturara en la vista para mostrar el mensaje
        
    }
    
    private void  montarStatement () 
    {
        Consultas consultaPedidos=new Consultas();
        String consul=consultaPedidos.getConsultaPedidos();
        
        try
        {
            statementPedidos=ConexionValidacion.getConexionBD().prepareStatement(consul, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        
        
        
    }
    
    private void creacionResultSet() throws SQLException
    {
        
        
           statementPedidos.setString(1, usuario);
           resultadoConsulta=statementPedidos.executeQuery();
           
    }
    
    public int cantidadDePedidos()
    {
        int numeroDeFilas = 0;
        
         try
         {
            resultadoConsulta.afterLast();
            numeroDeFilas=resultadoConsulta.getRow();//devuelve el numero de la ultima 
            resultadoConsulta.beforeFirst();
            return numeroDeFilas;
            
         }
         catch(SQLException e)
         {
             
             
         }
         
         return numeroDeFilas;
            
    }
    
    public Pedidos obtenerSigPed()
    {
        
        Pedidos pedido=new Pedidos();
        
        try{    
           if(resultadoConsulta.next())
           {
               pedido.setNumeroPedido(resultadoConsulta.getInt("num_pedido"));
               pedido.setNif(resultadoConsulta.getString("NIF"));
               pedido.setCodigoPostal(resultadoConsulta.getString("codigo_pos"));
               //pedido.setFechaPedido(new GregorianCalendar(resultadoConsulta.getDate("fecha_ped")));
               
               pedido.setDireccion(resultadoConsulta.getString("direccion"));
               pedido.setRutaFoto(resultadoConsulta.getString("imagen"));
               pedido.setUsuPedidos(resultadoConsulta.getString("usu_pedidos"));

           }
           
        }
        catch(SQLException e)
        {
            
        }
        
        return null;//no hay pedidos 
    }
    
    public Pedidos obtenerAnteriorPed()
    {
        
        Pedidos pedido=new Pedidos();
        
        try{    
           if(resultadoConsulta.previous())
           {
               pedido.setNumeroPedido(resultadoConsulta.getInt("num_pedido"));
               pedido.setNif(resultadoConsulta.getString("NIF"));
               pedido.setCodigoPostal(resultadoConsulta.getString("codigo_pos"));
               //pedido.setFechaPedido(new GregorianCalendar(resultadoConsulta.getDate("fecha_ped")));
               
               pedido.setDireccion(resultadoConsulta.getString("direccion"));
               pedido.setRutaFoto(resultadoConsulta.getString("imagen"));
               pedido.setUsuPedidos(resultadoConsulta.getString("usu_pedidos"));

           }
           
        }
        catch(SQLException e)
        {
            
        }
        
        return null;//no hay pedidos 
    }
}
