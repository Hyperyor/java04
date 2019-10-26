
package Modelo;

import java.util.*;


public class ConsultasPedido {
    
    private String consultaValidacion="select * from USUARIOS where password=? and usuario=?";
    private String consultaPedidos="select * from PEDIDOS where usu_pedidos=?";
    private String consultasComposicion="select * from composicion";
    private String consulasProductos="select * from productos";
    private Object estructuraSimple;
    private ArrayList listaConsulta;
    
    
    public ConsultasPedido()
    {
        
        
    }

    public String getConsultaValidacion() {
        return consultaValidacion;
    }

    public String getConsultaPedidos() {
        return consultaPedidos;
    }

    public String getConsultasComposicion() {
        return consultasComposicion;
    }

    public String getConsulasProductos() {
        return consulasProductos;
    }
    
    
    
}
