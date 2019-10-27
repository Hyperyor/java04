
package VIsta;

import Controlador.ConexionValidacion;
import Controlador.GestionarPedidos;
import Modelo.Pedidos;
import java.io.*;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VisualizarPedidos extends javax.swing.JPanel {

   private VentanaPrincipal venP;
   private Pedidos pedidoActual;
   private GestionarPedidos gestionPedidos;
   private boolean fechaActualizada=false;
   private boolean imagenActualizada=false;
    
    public VisualizarPedidos(VentanaPrincipal p) {
        initComponents();
        
        adaptacionFileChooser();
        venP=p;
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserImagen = new javax.swing.JFileChooser();
        jTextFieldNumeroPedido = new javax.swing.JTextField();
        jTextFieldCodigoPostal = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldCodigoCliente = new javax.swing.JTextField();
        jLabelNumeroPedido = new javax.swing.JLabel();
        jLabelCodigoPostal = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelFechaIncor = new javax.swing.JLabel();
        jLabelCodigoCliente = new javax.swing.JLabel();
        jDatePickerFechaPedido = new org.jdatepicker.JDatePicker();
        jLabelImagen = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jButtonSig = new javax.swing.JButton();
        jButtonAñadirProducto = new javax.swing.JButton();
        jButtonComposicion = new javax.swing.JButton();
        jButtonCambioImagen = new javax.swing.JButton();
        jButtonGuardarCambios = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));

        jTextFieldNumeroPedido.setEditable(false);
        jTextFieldNumeroPedido.setText("jTextField1");

        jTextFieldCodigoPostal.setEditable(false);
        jTextFieldCodigoPostal.setText("jTextField2");

        jTextFieldDireccion.setEditable(false);
        jTextFieldDireccion.setText("jTextField3");

        jTextFieldCodigoCliente.setEditable(false);
        jTextFieldCodigoCliente.setText("jTextField5");

        jLabelNumeroPedido.setText("NÚMERO PEDIDO");

        jLabelCodigoPostal.setText("CÓDIGO POSTAL");

        jLabelDireccion.setText("DIRECCIÓN");

        jLabelFechaIncor.setText("FECHA INCORPORACIÓN");

        jLabelCodigoCliente.setText("CÓDIGO CLIENTE");

        jDatePickerFechaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatePickerFechaPedidodatePickerActionPerformed(evt);
            }
        });

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setText("IMAGEN");
        jLabelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonAtras.setText("<");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonSig.setText(">");
        jButtonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigActionPerformed(evt);
            }
        });

        jButtonAñadirProducto.setText("Añadir producto");
        jButtonAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirProductoActionPerformed(evt);
            }
        });

        jButtonComposicion.setText("Composicion del pedido");
        jButtonComposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComposicionActionPerformed(evt);
            }
        });

        jButtonCambioImagen.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButtonCambioImagen.setText("Cambiar Imagen");
        jButtonCambioImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambioImagenActionPerformed(evt);
            }
        });

        jButtonGuardarCambios.setText("Guardar cambios");
        jButtonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCambioImagen))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButtonAñadirProducto)
                        .addGap(59, 59, 59)
                        .addComponent(jButtonComposicion)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jButtonGuardarCambios)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelNumeroPedido)
                        .addComponent(jLabelCodigoPostal)
                        .addComponent(jLabelDireccion)
                        .addComponent(jLabelCodigoCliente)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelFechaIncor)
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jTextFieldNumeroPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jDatePickerFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addContainerGap(375, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCambioImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonGuardarCambios)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAñadirProducto)
                            .addComponent(jButtonComposicion))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNumeroPedido)
                        .addComponent(jTextFieldNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCodigoPostal))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDireccion))
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelFechaIncor)
                        .addComponent(jDatePickerFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCodigoCliente))
                    .addContainerGap(262, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jDatePickerFechaPedidodatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatePickerFechaPedidodatePickerActionPerformed
        
        pedidoActual.setFechaPedido(obtenerFechaGregorian());
        
        //actualizarCampos();
        
    }//GEN-LAST:event_jDatePickerFechaPedidodatePickerActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed

        
        pedidoActual=gestionPedidos.obtenerAnteriorPed();
        actualizarCampos();
        actualizarBotones();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigActionPerformed

        pedidoActual=gestionPedidos.obtenerSigPed();
        actualizarCampos();
        actualizarBotones();
    }//GEN-LAST:event_jButtonSigActionPerformed

    private void jButtonAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirProductoActionPerformed

        venP.cambioDePanel(venP.getjPanelComponerPedido());

    }//GEN-LAST:event_jButtonAñadirProductoActionPerformed

    private void jButtonComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComposicionActionPerformed
        
        
        venP.cambioDePanel(venP.getjPanelVerComposicion());
    }//GEN-LAST:event_jButtonComposicionActionPerformed

    private void jButtonCambioImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambioImagenActionPerformed
       
        jFileChooserImagen.showDialog(this,"Obtener Imagen");
        
       
    }//GEN-LAST:event_jButtonCambioImagenActionPerformed

    private void jButtonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCambiosActionPerformed
        
        if(fechaActualizada==true || imagenActualizada==true)
        {
            
            gestionPedidos.modificarPedido(pedidoActual);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Los datos no han sido modificados", "GUARDAR CAMBIOS", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonGuardarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonAñadirProducto;
    private javax.swing.JButton jButtonCambioImagen;
    private javax.swing.JButton jButtonComposicion;
    private javax.swing.JButton jButtonGuardarCambios;
    private javax.swing.JButton jButtonSig;
    private org.jdatepicker.JDatePicker jDatePickerFechaPedido;
    private javax.swing.JFileChooser jFileChooserImagen;
    private javax.swing.JLabel jLabelCodigoCliente;
    private javax.swing.JLabel jLabelCodigoPostal;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFechaIncor;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNumeroPedido;
    private javax.swing.JTextField jTextFieldCodigoCliente;
    private javax.swing.JTextField jTextFieldCodigoPostal;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNumeroPedido;
    // End of variables declaration//GEN-END:variables

    public void instanciarGestionPedidos ()
    {
        try
        {
            gestionPedidos=new GestionarPedidos(venP.getNombreUsuario());
        }
        catch(SQLException e)
        {
            
        }
    }
        
    
    
    public void reset()
    {
        pedidoActual=gestionPedidos.obtenerPrimero();
        actualizarCampos();
        actualizarBotones();
        
        
    }

    
    private void actualizarCampos() 
    {
         if(pedidoActual==null)
         {
            jTextFieldCodigoCliente.setText("");
            jTextFieldCodigoPostal.setText("");
            jTextFieldDireccion.setText("");
            jTextFieldNumeroPedido.setText("");
         }
         else
         {
            jTextFieldCodigoCliente.setText(pedidoActual.getUsuPedidos());
            jTextFieldCodigoPostal.setText(pedidoActual.getCodigoPostal());
            jTextFieldDireccion.setText(pedidoActual.getDireccion());
            jTextFieldNumeroPedido.setText(""+pedidoActual.getNumeroPedido());
            
            jDatePickerFechaPedido.getFormattedTextField().setText(pedidoActual.getFechaPedido().get(Calendar.DAY_OF_MONTH)+"/"+
                                                                   (pedidoActual.getFechaPedido().get(Calendar.MONTH)+1)+"/"+
                                                                   pedidoActual.getFechaPedido().get(Calendar.YEAR));                                             
         }
    }                           
    
    private void accesoAPedidos()
    {
        try
        {
            gestionPedidos=new GestionarPedidos(ConexionValidacion.getUsuario());//pasamos el usuario validado
        }
        catch(SQLException e)
        {
            System.out.println("Error: "+e.getErrorCode()+", "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Pedidos no encontrado", "No tiene pedidos registrados", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void actualizarBotones()
    {
        
        
        if(gestionPedidos.getNumFilas()==0)
        {
            jButtonAtras.setEnabled(false);
            jButtonAñadirProducto.setEnabled(false);
            jButtonCambioImagen.setEnabled(false);
            jButtonComposicion.setEnabled(false);
            jButtonGuardarCambios.setEnabled(false);
            jButtonSig.setEnabled(false);
        }
        else
        {
            if(gestionPedidos.getNumFilas()==1)
            {
                jButtonAtras.setEnabled(false);
                jButtonAñadirProducto.setEnabled(true);
                jButtonCambioImagen.setEnabled(true);
                jButtonComposicion.setEnabled(true);
                jButtonGuardarCambios.setEnabled(true);
                jButtonSig.setEnabled(false);
                
            }
            else
            {
                if(gestionPedidos.esElPrimero())
                {
                    jButtonAtras.setEnabled(false);
                    jButtonAñadirProducto.setEnabled(true);
                    jButtonCambioImagen.setEnabled(true);
                    jButtonComposicion.setEnabled(true);
                    jButtonGuardarCambios.setEnabled(true);
                    jButtonSig.setEnabled(true);
                }
                else
                {
                    if(gestionPedidos.esElUltimo())
                    {
                        jButtonAtras.setEnabled(true);
                        jButtonAñadirProducto.setEnabled(true);
                        jButtonCambioImagen.setEnabled(true);
                        jButtonComposicion.setEnabled(true);
                        jButtonGuardarCambios.setEnabled(true);
                        jButtonSig.setEnabled(false);
                    }
                    else
                    {
                        jButtonAtras.setEnabled(true);
                        jButtonAñadirProducto.setEnabled(true);
                        jButtonCambioImagen.setEnabled(true);
                        jButtonComposicion.setEnabled(true);
                        jButtonGuardarCambios.setEnabled(true);
                        jButtonSig.setEnabled(true);
                        
                    }
                    
                }
            }
        
        
        }

    
    }

    private GregorianCalendar obtenerFechaGregorian() 
    {
        return new GregorianCalendar(
               jDatePickerFechaPedido.getModel().getYear(),
               jDatePickerFechaPedido.getModel().getMonth(),
               jDatePickerFechaPedido.getModel().getDay()
        );
                
    }

    private void adaptacionFileChooser()
    {
        FileFilter f= new FileNameExtensionFilter("Archivos .dat", "dat");
        
         jFileChooserImagen.
    }

    


}
