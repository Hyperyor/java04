
package Vista;



import Controlador.*;
import Modelo.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Visualizar extends javax.swing.JPanel {

    private VentanaPrincipal venP;
    private Profesor profeActual;
    private ImageIcon fotoProfe;
    private ArrayList<Alumno> listaProfesor;
    
    DefaultTableModel model;
    
    public Visualizar(VentanaPrincipal p) {
        initComponents();
       
        venP=p;
        
       model = (DefaultTableModel) jTableAlum.getModel();
        
    }

    /*public GestionProfesor getProfesores() {
        return profesores;
    }

    public void setProfesores(GestionProfesor profesores) {
        this.profesores = profesores;
    }*/

   

    
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
        jTextFieldMedia = new javax.swing.JTextField();
        jLabelDni = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelFechaIncor = new javax.swing.JLabel();
        jLabelMedia = new javax.swing.JLabel();
        jButtonActualizarDatos = new javax.swing.JButton();
        jPanelAlumnos = new javax.swing.JPanel();
        jScrollPaneAlum = new javax.swing.JScrollPane();
        jTableAlum = new javax.swing.JTable();
        jButtonInsertarAlum = new javax.swing.JButton();
        jDatePickerProfesor = new org.jdatepicker.JDatePicker();
        jPanelInsertarAlum = new javax.swing.JPanel();
        jButtonDam = new javax.swing.JButton();
        jButtonDaw = new javax.swing.JButton();
        jPanelInsertarDam = new javax.swing.JPanel();
        jLabelInsertarCodigoAlumno = new javax.swing.JLabel();
        jLabelInsertarNombre = new javax.swing.JLabel();
        jLabelInsertarFechaIncorporacion = new javax.swing.JLabel();
        jLabelInsertarProfesor = new javax.swing.JLabel();
        jLabelInsertarNota = new javax.swing.JLabel();
        jTextFieldInsertarCodigo = new javax.swing.JTextField();
        jTextFieldInsertarNombre = new javax.swing.JTextField();
        jTextFieldInsertarFechaIncorporacion = new javax.swing.JTextField();
        jTextFieldInsertarProfesor = new javax.swing.JTextField();
        jTextFieldInsertarNota = new javax.swing.JTextField();
        jLabelCabecera = new javax.swing.JLabel();
        jButtonVolverAProfesor = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 575));
        setMinimumSize(new java.awt.Dimension(800, 575));
        setPreferredSize(new java.awt.Dimension(800, 575));

        jPanelProfesor.setMaximumSize(new java.awt.Dimension(750, 550));
        jPanelProfesor.setMinimumSize(new java.awt.Dimension(750, 550));
        jPanelProfesor.setPreferredSize(new java.awt.Dimension(750, 550));

        jPanelImagen.setMaximumSize(new java.awt.Dimension(175, 175));
        jPanelImagen.setMinimumSize(new java.awt.Dimension(175, 175));
        jPanelImagen.setPreferredSize(new java.awt.Dimension(175, 175));
        jPanelImagen.setLayout(new java.awt.BorderLayout());

        jButtonMedia.setText("Calcular media");
        jButtonMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMediaActionPerformed(evt);
            }
        });

        jButtonAlumnos.setText("Ver alumnos");
        jButtonAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlumnosActionPerformed(evt);
            }
        });

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

        jTextFieldDni.setEditable(false);
        jTextFieldDni.setText("jTextField1");

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setText("jTextField2");

        jTextFieldEdad.setEditable(false);
        jTextFieldEdad.setText("jTextField3");

        jTextFieldMedia.setEditable(false);
        jTextFieldMedia.setText("jTextField5");

        jLabelDni.setText("DNI");

        jLabelNombre.setText("NOMBRE Y APELLIDOS");

        jLabelEdad.setText("EDAD");

        jLabelFechaIncor.setText("FECHA INCORPORACIÓN");

        jLabelMedia.setText("MEDIA DE ALUMNOS");

        jButtonActualizarDatos.setText("Guardar");
        jButtonActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarDatosActionPerformed(evt);
            }
        });

        jTableAlum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre y apellidos", "Fecha incorpor.", "Profesor", "Nota", "Tipo "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneAlum.setViewportView(jTableAlum);

        javax.swing.GroupLayout jPanelAlumnosLayout = new javax.swing.GroupLayout(jPanelAlumnos);
        jPanelAlumnos.setLayout(jPanelAlumnosLayout);
        jPanelAlumnosLayout.setHorizontalGroup(
            jPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAlum, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelAlumnosLayout.setVerticalGroup(
            jPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jButtonInsertarAlum.setText("Insertar Alumno");
        jButtonInsertarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarAlumActionPerformed(evt);
            }
        });

        jDatePickerProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProfesorLayout = new javax.swing.GroupLayout(jPanelProfesor);
        jPanelProfesor.setLayout(jPanelProfesorLayout);
        jPanelProfesorLayout.setHorizontalGroup(
            jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfesorLayout.createSequentialGroup()
                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfesorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfesorLayout.createSequentialGroup()
                                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelProfesorLayout.createSequentialGroup()
                                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jButtonMedia))
                                    .addComponent(jLabelDni)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelEdad)
                                    .addComponent(jLabelMedia)
                                    .addGroup(jPanelProfesorLayout.createSequentialGroup()
                                        .addComponent(jLabelFechaIncor)
                                        .addGap(80, 80, 80)
                                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDatePickerProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                .addComponent(jTextFieldDni, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                .addComponent(jTextFieldEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                .addComponent(jTextFieldMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelProfesorLayout.createSequentialGroup()
                                        .addComponent(jButtonAlumnos)
                                        .addGap(50, 50, 50)
                                        .addComponent(jButtonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanelProfesorLayout.createSequentialGroup()
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProfesorLayout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(jButtonActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProfesorLayout.createSequentialGroup()
                                .addGap(319, 319, 319)
                                .addComponent(jButtonInsertarAlum)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelProfesorLayout.setVerticalGroup(
            jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfesorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfesorLayout.createSequentialGroup()
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDni)
                            .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEdad))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaIncor)
                            .addComponent(jDatePickerProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMedia)))
                    .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButtonActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMedia)
                    .addComponent(jButtonAlumnos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonInsertarAlum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelInsertarAlum.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanelInsertarAlum.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanelInsertarAlum.setPreferredSize(new java.awt.Dimension(600, 500));

        jButtonDam.setText("Nuevo Dam");

        jButtonDaw.setText("Nuevo Daw");

        jLabelInsertarCodigoAlumno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelInsertarCodigoAlumno.setText("CÓDIGO");

        jLabelInsertarNombre.setText("NOMBRE Y APELLIDOS");

        jLabelInsertarFechaIncorporacion.setText("FECHA DE INCORPORACIÓN");

        jLabelInsertarProfesor.setText("PROFESOR");

        jLabelInsertarNota.setText("NOTA");

        jTextFieldInsertarCodigo.setText("jTextField1");

        jTextFieldInsertarNombre.setText("jTextField2");

        jTextFieldInsertarFechaIncorporacion.setText("jTextField3");

        jTextFieldInsertarProfesor.setText("jTextField4");

        jTextFieldInsertarNota.setText("jTextField5");

        jLabelCabecera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCabecera.setText("Insertar alumno de Dam");

        javax.swing.GroupLayout jPanelInsertarDamLayout = new javax.swing.GroupLayout(jPanelInsertarDam);
        jPanelInsertarDam.setLayout(jPanelInsertarDamLayout);
        jPanelInsertarDamLayout.setHorizontalGroup(
            jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertarDamLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelInsertarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInsertarCodigoAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInsertarFechaIncorporacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInsertarProfesor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInsertarNota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldInsertarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertarFechaIncorporacion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertarDamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelInsertarDamLayout.setVerticalGroup(
            jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertarDamLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelCabecera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsertarCodigoAlumno)
                    .addComponent(jTextFieldInsertarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsertarNombre)
                    .addComponent(jTextFieldInsertarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsertarFechaIncorporacion)
                    .addComponent(jTextFieldInsertarFechaIncorporacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsertarProfesor)
                    .addComponent(jTextFieldInsertarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsertarNota)
                    .addComponent(jTextFieldInsertarNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jButtonVolverAProfesor.setText("<-- VOLVER");
        jButtonVolverAProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInsertarAlumLayout = new javax.swing.GroupLayout(jPanelInsertarAlum);
        jPanelInsertarAlum.setLayout(jPanelInsertarAlumLayout);
        jPanelInsertarAlumLayout.setHorizontalGroup(
            jPanelInsertarAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertarAlumLayout.createSequentialGroup()
                .addGroup(jPanelInsertarAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInsertarAlumLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButtonDam)
                        .addGap(143, 143, 143)
                        .addComponent(jButtonDaw))
                    .addGroup(jPanelInsertarAlumLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButtonVolverAProfesor)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(jPanelInsertarAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInsertarAlumLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelInsertarDam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelInsertarAlumLayout.setVerticalGroup(
            jPanelInsertarAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertarAlumLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelInsertarAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDam)
                    .addComponent(jButtonDaw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addComponent(jButtonVolverAProfesor)
                .addGap(38, 38, 38))
            .addGroup(jPanelInsertarAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertarAlumLayout.createSequentialGroup()
                    .addContainerGap(88, Short.MAX_VALUE)
                    .addComponent(jPanelInsertarDam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelInsertarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelInsertarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlumnosActionPerformed


        Object[] rows = new Object[6];
        
        for (int i = 0; i < listaProfesor.size(); i++) {
            
            rows = getDatos(listaProfesor.get(i));

            model.addRow(rows);
        }
        
        jTableAlum.setModel(model);
        
        //mostrar mensaje de error en caso de no tener alumnos
        if(listaProfesor.size() == 0)
        {
            JOptionPane.showMessageDialog(null, 
                                "Este profesor no tiene alumnos", "Error", 
                                JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButtonAlumnosActionPerformed

    
    private void jButtonInsertarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarAlumActionPerformed
       
        
        colocarPanel(jPanelInsertarAlum, jPanelProfesor);
        
    }//GEN-LAST:event_jButtonInsertarAlumActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        
        
        profeActual=venP.getGestionProf().getPreviousProf();
        actualizaBotones();
        actualizarCamposProf();
        actualizarImagen();
        actualizarTable();
        actualizarListaAlumnosProfesor();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigActionPerformed
        
        
        profeActual=venP.getGestionProf().getNextProf();
        actualizaBotones();
        actualizarCamposProf();
        actualizarImagen();
        actualizarTable();
        actualizarListaAlumnosProfesor();
    }//GEN-LAST:event_jButtonSigActionPerformed

    private void jButtonMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMediaActionPerformed
        
        float acum = 0;
        
        for (int i = 0; i < listaProfesor.size(); i++) {
            
            if(listaProfesor.get(i) instanceof AlumnoDaw)
            {
                AlumnoDaw daw = (AlumnoDaw)listaProfesor.get(i);
                
                acum += daw.getNotaWeb();
                
            }
            else
            {
                AlumnoDam dam = (AlumnoDam)listaProfesor.get(i);
                acum += dam.getNotaMovil();
            }
        }
        
        float media = acum / listaProfesor.size();
        
        jTextFieldMedia.setText("" + media);
        
        profeActual.setMediaAlumnos(media);
        
    }//GEN-LAST:event_jButtonMediaActionPerformed

    private void jButtonActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarDatosActionPerformed
        
        if(jDatePickerProfesor.getModel().isSelected())
        {
            if(jDatePickerProfesor.getModel().getValue() == null)
            {
                System.out.println("\nhola");
            }
            
                System.out.println(profeActual.getFechaIncorporacion().getTime());
                System.out.println(profeActual.getFechaIncorporacion().get(Calendar.DAY_OF_MONTH)+"-"
                                   +(profeActual.getFechaIncorporacion().get(Calendar.MONTH)+1)+"-"
                                   +profeActual.getFechaIncorporacion().get(Calendar.YEAR));
           
            GregorianCalendar fechaActualizada=obtenerNuevaFecha();
            java.util.Date d= fechaActualizada.getTime();
                    
            profeActual.setFechaIncorporacion(fechaActualizada, d);
           
                System.out.println(profeActual.getFechaIncorporacion().getTime());
                System.out.println(profeActual.getFechaIncorporacion().get(Calendar.DAY_OF_MONTH)+"-"
                                   +(profeActual.getFechaIncorporacion().get(Calendar.MONTH)+1)+"-"
                                   +profeActual.getFechaIncorporacion().get(Calendar.YEAR));
                
                jDatePickerProfesor.getModel().setSelected(false);
        }
        else
        {
           
            jDatePickerProfesor.getFormattedTextField().setText(""+profeActual.getFechaIncorporacion().get(Calendar.DAY_OF_MONTH)+
                                                                "/"  +(profeActual.getFechaIncorporacion().get(Calendar.MONTH)+1)+
                                                                "/"  +profeActual.getFechaIncorporacion().get(Calendar.YEAR));
            
            
        }
    }//GEN-LAST:event_jButtonActualizarDatosActionPerformed

    private void jButtonVolverAProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAProfesorActionPerformed
       
        colocarPanel(jPanelProfesor, jPanelInsertarAlum);
        
    }//GEN-LAST:event_jButtonVolverAProfesorActionPerformed

    private void datePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerActionPerformed
        System.out.println("\nhola");
    }//GEN-LAST:event_datePickerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarDatos;
    private javax.swing.JButton jButtonAlumnos;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonDam;
    private javax.swing.JButton jButtonDaw;
    private javax.swing.JButton jButtonInsertarAlum;
    private javax.swing.JButton jButtonMedia;
    private javax.swing.JButton jButtonSig;
    private javax.swing.JButton jButtonVolverAProfesor;
    private org.jdatepicker.JDatePicker jDatePickerProfesor;
    private javax.swing.JLabel jLabelCabecera;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelFechaIncor;
    private javax.swing.JLabel jLabelInsertarCodigoAlumno;
    private javax.swing.JLabel jLabelInsertarFechaIncorporacion;
    private javax.swing.JLabel jLabelInsertarNombre;
    private javax.swing.JLabel jLabelInsertarNota;
    private javax.swing.JLabel jLabelInsertarProfesor;
    private javax.swing.JLabel jLabelMedia;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanelAlumnos;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JPanel jPanelInsertarAlum;
    private javax.swing.JPanel jPanelInsertarDam;
    private javax.swing.JPanel jPanelProfesor;
    private javax.swing.JScrollPane jScrollPaneAlum;
    private javax.swing.JTable jTableAlum;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldInsertarCodigo;
    private javax.swing.JTextField jTextFieldInsertarFechaIncorporacion;
    private javax.swing.JTextField jTextFieldInsertarNombre;
    private javax.swing.JTextField jTextFieldInsertarNota;
    private javax.swing.JTextField jTextFieldInsertarProfesor;
    private javax.swing.JTextField jTextFieldMedia;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    
     public Profesor getProfeActual() {
        return profeActual;
    }

    public void setProfeActual(Profesor profeActual) {
        this.profeActual = profeActual;
    }
    
    
    private void getAlumnos(ArrayList<Alumno> listadoAlumn, ArrayList<Alumno> listaProfesor)
    {
        for (int i = 0; i < listadoAlumn.size(); i++) {
            
            Alumno al = (Alumno)listadoAlumn.get(i);
            
            if(profeActual.getDni().equals(al.getProAlumno()))
            {
                listaProfesor.add(al);
            }
            
        }
    }

    private Object[] getDatos(Alumno al)
    {
        Object[] rows = new Object[6];
        
        rows[0] = al.getCodigoAlumno();
        rows[1] = al.getApeNom();
        String fecha = "" + al.getFechaNacimiento().get(Calendar.DAY_OF_MONTH) + "/"
                + (al.getFechaNacimiento().get(Calendar.MONTH)+1) + "/" + 
                al.getFechaNacimiento().get(Calendar.YEAR);
        rows[2] = fecha;
        rows[3] = al.getProAlumno();
        
        
        if(al instanceof AlumnoDaw)
        {
            AlumnoDaw daw = (AlumnoDaw)al;
            
            rows[4] = daw.getNotaWeb();
            rows[5] = "Alumno de Daw";
        }
        else
        {
            if(al instanceof AlumnoDam)
            {
                AlumnoDam dam = (AlumnoDam)al;
                
                rows[4] = dam.getNotaMovil();
                rows[5] = "Alumno de Dam";
            }
        }
        
        return rows;
    }

    public void reset()
    {
        
        //visualizamos el primer elemento
        profeActual=venP.getGestionProf().getFirstProf();
        //Campos profesor
        actualizarCamposProf();
        //Campos Inserccion alumno
        emptyCamposAlum();
        //Ponemos el panel visible al de profesores e invisible el de alumno
         colocarPanel(jPanelProfesor, jPanelInsertarAlum);
        //actualizamos botones
        actualizaBotones();
        //actualizamos imagen
        actualizarImagen();
        actualizarTable();
        actualizarListaAlumnosProfesor();
        
    }
    
    private void actualizarListaAlumnosProfesor()
    {
        //cogemos el arraylist de alumnos principal
        ArrayList<Alumno> listadoAlumn = venP.getGestAlumn().getListadoAlumnos();
        
        //me creo un auxiliar en el que insertaremos unicamente los alumnos del profesor
        //que estamos visualizando
        listaProfesor = new ArrayList<Alumno>();
        
        getAlumnos(listadoAlumn, listaProfesor);
    }
    
    private void actualizarTable()
    {
        model.setRowCount(0);
    }
    
    private void colocarPanel(JPanel panelVisible, JPanel panelInvisible)
    {
             
        panelVisible.setVisible(true);
        panelInvisible.setVisible(false);
        this.setVisible(false);
        this.setVisible(true); 
        
    }
   

    private void actualizaBotones()
    {
        if(venP.getGestionProf().getTotalRowNumber()==0)
        {
            jButtonActualizarDatos.setEnabled(false);
            jButtonAlumnos.setEnabled(false);
            jButtonAtras.setEnabled(false);
            jButtonInsertarAlum.setEnabled(false);
            jButtonMedia.setEnabled(false);
            jButtonSig.setEnabled(false);
        }
        else
        {
            if(venP.getGestionProf().getTotalRowNumber()==1)
            {
                jButtonAtras.setEnabled(false);
                jButtonSig.setEnabled(false);
                jButtonActualizarDatos.setEnabled(true);
                jButtonAlumnos.setEnabled(true);
                jButtonInsertarAlum.setEnabled(true);
                jButtonMedia.setEnabled(true);
                
            }
            else
            {
                if(venP.getGestionProf().isFirstProfesor())
                {
                    jButtonAtras.setEnabled(false);
                    jButtonSig.setEnabled(true);
                    jButtonActualizarDatos.setEnabled(true);
                    jButtonAlumnos.setEnabled(true);
                    jButtonInsertarAlum.setEnabled(true);
                    jButtonMedia.setEnabled(true);
                }
                else
                {
                    if(venP.getGestionProf().isLastProfesor())
                    {
                        jButtonAtras.setEnabled(true);
                        jButtonSig.setEnabled(false); 
                        jButtonActualizarDatos.setEnabled(true);
                        jButtonAlumnos.setEnabled(true);
                        jButtonInsertarAlum.setEnabled(true);
                        jButtonMedia.setEnabled(true);
                    }
                    else
                    {
                        jButtonAtras.setEnabled(true);
                        jButtonSig.setEnabled(true);
                        jButtonActualizarDatos.setEnabled(true);
                        jButtonAlumnos.setEnabled(true);
                        jButtonInsertarAlum.setEnabled(true);
                        jButtonMedia.setEnabled(true);
                        
                    }
                    
                }
            }
                  
            
        }

    }

    private void actualizarCamposProf()
    {
        if(profeActual==null)
        {
            jTextFieldDni.setText("");
            jTextFieldEdad.setText("");
            jDatePickerProfesor.getFormattedTextField().setText("");
            jTextFieldMedia.setText("");
            jTextFieldNombre.setText("");
            
            
            
        }
        else
        {
            jTextFieldDni.setText(profeActual.getDni());
            jTextFieldEdad.setText(""+profeActual.getEdad());
            jDatePickerProfesor.getFormattedTextField().setText(""+profeActual.getFechaIncorporacion().get(Calendar.DAY_OF_MONTH)+
                                                                "/"  +(profeActual.getFechaIncorporacion().get(Calendar.MONTH)+1)+
                                                                "/"  +profeActual.getFechaIncorporacion().get(Calendar.YEAR));
            jTextFieldMedia.setText(""+profeActual.getMediaAlumnos());
            jTextFieldNombre.setText(profeActual.getNombre());
            
            
            
           
        }
            
    }

    private void emptyCamposAlum() 
    {
        jTextFieldInsertarCodigo.setText("");
        jTextFieldInsertarFechaIncorporacion.setText("");
        jTextFieldInsertarNombre.setText("");
        jTextFieldInsertarNota.setText("");
        jTextFieldInsertarProfesor.setText("");
    }

    private void actualizarImagen()
    {
        jPanelImagen.removeAll();
        
        Image i=new ImageIcon(profeActual.getFoto()).getImage();
        FondoImagen panelContenedorImagen=new FondoImagen(i);
       
        jPanelImagen.add(panelContenedorImagen, BorderLayout.CENTER);
        
        jPanelImagen.setVisible(false);
        jPanelImagen.setVisible(true);
        
    }

    private GregorianCalendar obtenerNuevaFecha() 
    {
        return new GregorianCalendar
        (  jDatePickerProfesor.getModel().getYear(), 
          (jDatePickerProfesor.getModel().getMonth()),//no necesito quitarle 1 
           jDatePickerProfesor.getModel().getDay() 
        );
        
            
            
            
        
         
            
            
    }
}
