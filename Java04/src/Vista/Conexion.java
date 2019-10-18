 
package Vista;

import Controlador.GestionAlumno;
import Controlador.GestionBD;
import Controlador.GestionProfesor;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Conexion extends javax.swing.JPanel {

    private VentanaPrincipal venP;
    
    public Conexion(VentanaPrincipal p) {
        initComponents();
        
        venP=p;
        //jDatePicker1.getFormattedTextField().setText("");
        //jDatePicker1.getModel().
        reset();
    }
    
    public void reset()
    {
        jTextFieldContraseña.setText("");
    }

   
    public String enviarContr()
    {
        return jTextFieldContraseña.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInicioSesion = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldContraseña = new javax.swing.JPasswordField();

        setMaximumSize(new java.awt.Dimension(750, 550));
        setMinimumSize(new java.awt.Dimension(750, 550));

        jLabelInicioSesion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInicioSesion.setText("INICIAR SESIÓN");

        jTextFieldUsuario.setText("postgres");

        jLabelUsuario.setText("Usuario");

        jLabelContraseña.setText("Contraseña");

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldContraseña.setText("jPasswordField1");
        jTextFieldContraseña.setPreferredSize(new java.awt.Dimension(167, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelContraseña))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUsuario)
                            .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(216, 216, 216))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(76, 76, 76)
                        .addComponent(jButtonAceptar)
                        .addGap(262, 262, 262))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabelInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContraseña)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(223, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        
        if(GestionBD.connectToDataBase(enviarContr()))
        {
            //creamos el GestionProfesor
            venP.setGestionProf(new GestionProfesor(GestionBD.getSensitiveStatement()));
            venP.setGestAlumn(new GestionAlumno(GestionBD.getSimpleStatement(), GestionBD.getSensitiveStatement()));
            //poner boton menu verde
            venP.setjMenuConexion(Color.green);
            //habilitar botones menu
            venP.getMainMenu().setEnabled(true);

            //poner invisible el de conexion, deberia llamar directamente al visiualizar
            venP.getJPanelConexion().setVisible(false);
            //le decimso a la ventana principal que coloque el panel
            //visualizar y lo haga visible
            venP.cambiarAVisualizar();
            
            //venP.getJPanelVisualizar().setProfesores(new GestionProfesor(GestionBD.getSensitiveStatement()));
           
            //resetea el panel una vez se conecte, no antes
            venP.getJPanelVisualizar().reset();
            //reseteamos el panel Conexion
            reset();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
            reset();
            venP.reset();//En principio no hace falta llamarlo
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       reset();
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelInicioSesion;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
