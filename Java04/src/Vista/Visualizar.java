
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
    
    private boolean notaActualizada;
    private boolean fechaUpdated;
    
    private String tipoAlumnoAlta = "";
    
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
        jTextFieldInsertarProfesor = new javax.swing.JTextField();
        jTextFieldInsertarNota = new javax.swing.JTextField();
        jLabelCabecera = new javax.swing.JLabel();
        textFieldDiaNac = new javax.swing.JTextField();
        textFieldMesNac = new javax.swing.JTextField();
        textFieldAnioNac = new javax.swing.JTextField();
        jButtonVolverAProfesor = new javax.swing.JButton();
        jButtonAceptarAlta = new javax.swing.JButton();

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
        jButtonDam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDamActionPerformed(evt);
            }
        });

        jButtonDaw.setText("Nuevo Daw");
        jButtonDaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDawActionPerformed(evt);
            }
        });

        jLabelInsertarCodigoAlumno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelInsertarCodigoAlumno.setText("CÓDIGO");

        jLabelInsertarNombre.setText("NOMBRE Y APELLIDOS");

        jLabelInsertarFechaIncorporacion.setText("FECHA DE INCORPORACIÓN");

        jLabelInsertarProfesor.setText("PROFESOR");

        jLabelInsertarNota.setText("NOTA MOVIL:");

        jTextFieldInsertarProfesor.setEditable(false);

        jLabelCabecera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCabecera.setText("Insertar alumno de Dam");

        textFieldAnioNac.setText("      ");

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
                .addGroup(jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldInsertarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInsertarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInsertarDamLayout.createSequentialGroup()
                        .addComponent(textFieldDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldAnioNac)))
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
                .addGap(20, 20, 20)
                .addGroup(jPanelInsertarDamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsertarFechaIncorporacion)
                    .addComponent(textFieldDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
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

        jButtonAceptarAlta.setText("Aceptar");
        jButtonAceptarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInsertarAlumLayout = new javax.swing.GroupLayout(jPanelInsertarAlum);
        jPanelInsertarAlum.setLayout(jPanelInsertarAlumLayout);
        jPanelInsertarAlumLayout.setHorizontalGroup(
            jPanelInsertarAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertarAlumLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButtonDam)
                .addGap(143, 143, 143)
                .addComponent(jButtonDaw)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(jPanelInsertarAlumLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButtonVolverAProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAceptarAlta)
                .addGap(121, 121, 121))
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
                .addGroup(jPanelInsertarAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolverAProfesor)
                    .addComponent(jButtonAceptarAlta))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelInsertarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelInsertarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addContainerGap()))
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
        
        jTextFieldInsertarProfesor.setText(profeActual.getDni());
        
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
        
        float valorAnterior = convertirFloat(jTextFieldMedia.getText());
        
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
        
        if(media != valorAnterior)
        {
            jTextFieldMedia.setText("" + media);
        
            profeActual.setMediaAlumnos(media);

            notaActualizada=true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, 
                                "No hay nueva media", "Calculo no realizado", 
                                JOptionPane.WARNING_MESSAGE);
        }
 
    }//GEN-LAST:event_jButtonMediaActionPerformed

    private void jButtonActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarDatosActionPerformed
        
        if(fechaUpdated || notaActualizada)
        {
                
             venP.getGestionProf().updateProf(profeActual);
             resetDatosactualizar();
             
             JOptionPane.showMessageDialog(null, 
                                "Datos actualizados", "Actualizacion realizada", 
                                JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, 
                                "No hay datos actualizados", "Actualizacion no realizada", 
                                JOptionPane.INFORMATION_MESSAGE);
        }
        
        actualizarCamposProf();
    }//GEN-LAST:event_jButtonActualizarDatosActionPerformed

    private void jButtonVolverAProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAProfesorActionPerformed
       
        colocarPanel(jPanelProfesor, jPanelInsertarAlum);
        
        resetAlta();
        
    }//GEN-LAST:event_jButtonVolverAProfesorActionPerformed

    private void datePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerActionPerformed
        GregorianCalendar fechaActualizada=obtenerNuevaFecha();
            java.util.Date d= fechaActualizada.getTime();
                    
        profeActual.setFechaIncorporacion(fechaActualizada, d);

        fechaUpdated=true;
    }//GEN-LAST:event_datePickerActionPerformed

    private void jButtonAceptarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarAltaActionPerformed
        
        if(datosCorrectos())
        {
            Alumno al = createNewAlumn();
            
            //listaProfesor.add(al);
            
            venP.getGestAlumn().getListadoAlumnos().add(al);
            actualizarTable();
            actualizarListaAlumnosProfesor();
            
            JOptionPane.showMessageDialog(null, 
                                "Se ha dado de alta al alumno", "Ok", 
                                JOptionPane.INFORMATION_MESSAGE);
            
            venP.getGestAlumn().insertAlumn(al);
        }
        else
        {
        
            JOptionPane.showMessageDialog(null, 
                                "Los datos introducidos son incorrectos", "Error", 
                                JOptionPane.WARNING_MESSAGE);
        }
        
        colocarPanel(jPanelProfesor, jPanelInsertarAlum);
        
        resetAlta();
        
    }//GEN-LAST:event_jButtonAceptarAltaActionPerformed

    private void jButtonDawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDawActionPerformed
        tipoAlumnoAlta = "Daw";
        
        jLabelInsertarNota.setText("NOTA WEB: ");
        jLabelCabecera.setText("Insertar alumno de Daw");
    }//GEN-LAST:event_jButtonDawActionPerformed

    private void jButtonDamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDamActionPerformed
        tipoAlumnoAlta = "Dam";
        
        jLabelInsertarNota.setText("NOTA MOVIL: ");
        jLabelCabecera.setText("Insertar alumno de Dam");
    }//GEN-LAST:event_jButtonDamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarAlta;
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
    private javax.swing.JTextField jTextFieldInsertarNombre;
    private javax.swing.JTextField jTextFieldInsertarNota;
    private javax.swing.JTextField jTextFieldInsertarProfesor;
    private javax.swing.JTextField jTextFieldMedia;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField textFieldAnioNac;
    private javax.swing.JTextField textFieldDiaNac;
    private javax.swing.JTextField textFieldMesNac;
    // End of variables declaration//GEN-END:variables

    
    private void resetDatosactualizar()
    {
        
        notaActualizada=false;
        fechaUpdated=false;
    }
    
    private Alumno createNewAlumn()
    {
        //se crea el alumno

                     
        if(tipoAlumnoAlta.equals("Dam"))
        {
            AlumnoDam alD = new AlumnoDam();

            alD.setCodigoAlumno(convertirInt(jTextFieldInsertarCodigo.getText()));

            alD.setApeNom(jTextFieldInsertarNombre.getText());

        GregorianCalendar fechaNac = new GregorianCalendar(
                convertirInt(textFieldAnioNac.getText()),
                (convertirInt(textFieldMesNac.getText()) - 1),
                convertirInt(textFieldDiaNac.getText()));

            alD.setFechaNacimiento(fechaNac);

            alD.setProAlumno(jTextFieldInsertarProfesor.getText());

            alD.setNotaMovil(convertirFloat(jTextFieldInsertarNota.getText()));

            return alD;
        }
        else
        {
            AlumnoDaw alW= new AlumnoDaw();
            
            alW.setCodigoAlumno(convertirInt(jTextFieldInsertarCodigo.getText()));

            alW.setApeNom(jTextFieldInsertarNombre.getText());

            GregorianCalendar fechaNac = new GregorianCalendar(
                convertirInt(textFieldAnioNac.getText()),
                (convertirInt(textFieldMesNac.getText()) - 1),
                convertirInt(textFieldDiaNac.getText()));

            alW.setFechaNacimiento(fechaNac);

            alW.setProAlumno(jTextFieldInsertarProfesor.getText());

            alW.setNotaWeb(convertirFloat(jTextFieldInsertarNota.getText()));

            return alW;
        }
    }
    
    private boolean datosCorrectos()
    {
        if(!jTextFieldInsertarCodigo.equals("") && codigoNoRepetido())
        {
            if(!jTextFieldInsertarNombre.equals(""))
            {
                if(!jTextFieldInsertarNota.equals("") && 
                        (convertirFloat(jTextFieldInsertarNota.getText()) >= 0 && 
                        convertirFloat(jTextFieldInsertarNota.getText()) <= 10))
                {
                    if(jTextFieldInsertarProfesor.getText().equals(profeActual.getDni()))
                    {
                        if(correctDate(convertirInt(textFieldDiaNac.getText()), 
                                convertirInt(textFieldMesNac.getText()), 
                                convertirInt(textFieldAnioNac.getText())))
                        {
                            return true;
                        }
                    }
                }
            }
        }
        
        return false;
    }
    
    private boolean codigoNoRepetido()
    {
        ArrayList<Alumno> lista = venP.getGestAlumn().getListadoAlumnos();
        
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(1).getCodigoAlumno() == convertirInt(jTextFieldInsertarCodigo.getText()))
            {
                return false;
            }
            
        }
        
        return true;
    }
    
     public Profesor getProfeActual() {
        return profeActual;
    }

    public void setProfeActual(Profesor profeActual) {
        this.profeActual = profeActual;
    }
    
    private void resetAlta()
    {
        jTextFieldInsertarCodigo.setText("");
        jTextFieldInsertarNombre.setText("");
        jTextFieldInsertarNota.setText("");
        jTextFieldInsertarProfesor.setText("");
        
        textFieldDiaNac.setText("");
        textFieldMesNac.setText("");
        textFieldAnioNac.setText("");
        
        
        jLabelInsertarNota.setText("NOTA MOVIL: ");
        jLabelCabecera.setText("Insertar alumno de Dam");
        tipoAlumnoAlta = "Dam";
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
        //emptyCamposAlum();
        resetAlta();
        //Ponemos el panel visible al de profesores e invisible el de alumno
         colocarPanel(jPanelProfesor, jPanelInsertarAlum);
        //actualizamos botones
        actualizaBotones();
        //actualizamos imagen
        actualizarImagen();
        actualizarTable();
        actualizarListaAlumnosProfesor();
        
        resetDatosactualizar();
        
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
   
    private float convertirFloat(String texto)
    {
        float f = 0;
         
        try
        {
          f =  Float.parseFloat(texto);
        }
        catch(NumberFormatException e)
        {
          //return Float.NaN; // No es un número (valor float)
        }
         
        return f;
    }
    
    private int convertirInt(String texto)
    {
        int n = 0;
         
        try
        {
          n = Integer.parseInt(texto);
        }
        catch(NumberFormatException e)
        {
          //return Integer.MIN_VALUE; // valor más pequeño
        }
         
        return n;
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

//    private void emptyCamposAlum() 
//    {
//        jTextFieldInsertarCodigo.setText("");
//        jTextFieldInsertarFechaIncorporacion.setText("");
//        jTextFieldInsertarNombre.setText("");
//        jTextFieldInsertarNota.setText("");
//        jTextFieldInsertarProfesor.setText("");
//    }

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
    
     private boolean correctDate(int day, int month, int year)
    {
        if(year > 0)
        {
            if(month >= 1 && month <= 12)
            {
                if(day >= 1 && day <= checkMonthsTotalDays(month, year))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    private int checkMonthsTotalDays(int month, int year)
    {
        switch(month)
        {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: return 31;
        case 4:
        case 6:
        case 9:
        case 11: return 30;
        case 2: 
               if(comprobarBisiesto(year))
               {
                   return 29;
               }
               else
               {
                   return 28;
               }
     
        }   
        
        return 1;
    }
    
    private boolean comprobarBisiesto(int year)
    {
        if((year % 4 == 0) && !((year % 100 == 0) && (year % 400 != 0)))
        {
            return true;
        }
        return false;
    }
}
