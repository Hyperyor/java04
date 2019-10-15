
package Vista;

import Controlador.GestionBD;
import Controlador.GestionProfesor;
import java.awt.*;
import javax.swing.*;



public class VentanaPrincipal extends javax.swing.JFrame {

    private Conexion JPanelConexion;
    private Visualizar JPanelVisualizar;
    private Acerca JDialogAcerca;
    private GestionProfesor gestionP;
    
    public VentanaPrincipal() {
        initComponents();
        
        
        JPanelConexion=new Conexion(this);
        JPanelVisualizar=new Visualizar(this);
        
        
        reset();
    }
    
    public void reset()
    {
        jMenuConexion.setForeground(Color.RED);
        //jMenuVisualizar.setEnabled(false);
        mainMenu.setEnabled(false);
        setContentPane(JPanelConexion);
        JPanelConexion.setVisible(true);
        JPanelVisualizar.setVisible(false);
    }

    

    public Conexion getJPanelConexion() {
        return JPanelConexion;
    }

    public void setJPanelConexion(Conexion JPanelConexion) {
        this.JPanelConexion = JPanelConexion;
    }

    public Visualizar getJPanelVisualizar() {
        return JPanelVisualizar;
    }

    public void setJPanelVisualizar(Visualizar JPanelVisualizar) {
        this.JPanelVisualizar = JPanelVisualizar;
    }

//    public JMenu getjMenuVisualizar() {
//        return jMenuVisualizar;
//    }
//
//    public void setjMenuVisualizar(JMenu jMenuVisualizar) {
//        this.jMenuVisualizar = jMenuVisualizar;
//    }

    public JMenu getjMenuAcerca() {
        return mainMenu;
    }

    public void setjMenuAcerca(JMenu jMenuAcerca) {
        this.mainMenu=jMenuAcerca;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenu getjMenuConexion() {
        return jMenuConexion;
    }

    public void setjMenuConexion(Color color) {
        this.jMenuConexion.setForeground(color);
    }

    public GestionProfesor getGestionProf()
    {
        return gestionP;
    }
    
    public void setGestionProf(GestionProfesor gp)
    {
        gestionP = gp;
    }
    
    public JMenu  getMainMenu()
    {
        return mainMenu;
    }
    
    public void cambiarAVisualizar()
    {
        JPanelVisualizar.setVisible(true);
        cambiarContenedor(JPanelVisualizar);
    }
    
    private void cambiarContenedor(JPanel aux){
        this.setContentPane(aux);
        pack();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConexion = new javax.swing.JMenu();
        mainMenu = new javax.swing.JMenu();
        visualizarMenuItem = new javax.swing.JMenuItem();
        acercaDeMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));

        jMenuConexion.setText("Conexion ");
        jMenuConexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConexionMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuConexion);

        mainMenu.setText("Menú principal");

        visualizarMenuItem.setText("Acerca de");
        visualizarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarMenuItemActionPerformed(evt);
            }
        });
        mainMenu.add(visualizarMenuItem);

        acercaDeMenuItem.setText("Visualizar");
        acercaDeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeMenuItemActionPerformed(evt);
            }
        });
        mainMenu.add(acercaDeMenuItem);

        jMenuBar1.add(mainMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuConexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConexionMouseClicked
        
        if(jMenuConexion.getForeground()==Color.GREEN)
        {
            int yes=JOptionPane.showConfirmDialog(null, "¿Desea desconectarse?");
            if(yes==0)
            {
                GestionBD.closeConnectionToDataBase();
                reset();
                
            }
        }
    }//GEN-LAST:event_jMenuConexionMouseClicked

    private void visualizarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarMenuItemActionPerformed
        if(mainMenu.isEnabled())
        {
            JDialogAcerca=new Acerca(this, true);
        }
    }//GEN-LAST:event_visualizarMenuItemActionPerformed

    private void acercaDeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeMenuItemActionPerformed
        if(mainMenu.isEnabled())
        {
            JPanelConexion.setVisible(false);
            JPanelVisualizar.setVisible(true);
            setContentPane(JPanelVisualizar);
        }
    }//GEN-LAST:event_acercaDeMenuItemActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaDeMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConexion;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JMenuItem visualizarMenuItem;
    // End of variables declaration//GEN-END:variables
}
