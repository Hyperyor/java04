
package Vista;


public class Visualizar extends javax.swing.JPanel {

    private VentanaPrincipal venP;
    
    public Visualizar(VentanaPrincipal p) {
        initComponents();
        
        venP=p;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProfesor = new javax.swing.JPanel();
        jPanelImagen = new javax.swing.JPanel();
        jButtonMedia = new javax.swing.JButton();
        jButtonAlumnos = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonSig = new javax.swing.JButton();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldMedia = new javax.swing.JTextField();
        jLabelDni = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelFechaIncor = new javax.swing.JLabel();
        jLabelMedia = new javax.swing.JLabel();
        jPanelAlumnos = new javax.swing.JPanel();
        jScrollPaneAlum = new javax.swing.JScrollPane();
        jTableAlum = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        jButtonMedia.setText("Calcular media");

        jButtonAlumnos.setText("Ver alumnos");

        jButtonAtras.setText("<");

        jButtonSig.setText(">");

        jTextFieldDni.setText("jTextField1");

        jTextFieldNombre.setText("jTextField2");

        jTextFieldEdad.setText("jTextField3");

        jTextFieldFecha.setText("jTextField4");

        jTextFieldMedia.setText("jTextField5");

        jLabelDni.setText("DNI");

        jLabelNombre.setText("NOMBRE Y APELLIDOS");

        jLabelEdad.setText("EDAD");

        jLabelFechaIncor.setText("FECHA INCORPORACIÓN");

        jLabelMedia.setText("MEDIA DE ALUMNOS");

        javax.swing.GroupLayout jPanelProfesorLayout = new javax.swing.GroupLayout(jPanelProfesor);
        jPanelProfesor.setLayout(jPanelProfesorLayout);
        jPanelProfesorLayout.setHorizontalGroup(
            jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDni)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelEdad)
                    .addComponent(jLabelFechaIncor)
                    .addComponent(jLabelMedia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldDni)
                    .addComponent(jTextFieldFecha)
                    .addComponent(jTextFieldMedia))
                .addGap(31, 31, 31)
                .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelProfesorLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButtonMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButtonAlumnos)
                .addGap(139, 139, 139))
            .addGroup(jPanelProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelProfesorLayout.setVerticalGroup(
            jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelProfesorLayout.createSequentialGroup()
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDni))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEdad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFechaIncor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMedia))))
                .addGap(63, 63, 63)
                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMedia)
                    .addComponent(jButtonAlumnos))
                .addGap(51, 51, 51))
        );

        jTableAlum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPaneAlum.setViewportView(jTableAlum);

        javax.swing.GroupLayout jPanelAlumnosLayout = new javax.swing.GroupLayout(jPanelAlumnos);
        jPanelAlumnos.setLayout(jPanelAlumnosLayout);
        jPanelAlumnosLayout.setHorizontalGroup(
            jPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneAlum, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAlumnosLayout.setVerticalGroup(
            jPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneAlum, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanelAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlumnos;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonMedia;
    private javax.swing.JButton jButtonSig;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelFechaIncor;
    private javax.swing.JLabel jLabelMedia;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanelAlumnos;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JPanel jPanelProfesor;
    private javax.swing.JScrollPane jScrollPaneAlum;
    private javax.swing.JTable jTableAlum;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldMedia;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
