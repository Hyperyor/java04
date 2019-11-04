
package Modelo;

import java.util.ArrayList;


public class ConsultasComposicion {
    
     private String consultasComposicion="select * from composicion where pedComposicion=?";
     private Composicion producto;
     private ArrayList<Composicion> listaProducto;
     
     public ConsultasComposicion()
     {
         
         
     }

    public String getConsultasComposicion() {
        return consultasComposicion;
    }

    public void setConsultasComposicion(String consultasComposicion) {
        this.consultasComposicion = consultasComposicion;
    }
     
     
}
