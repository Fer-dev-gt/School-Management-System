package pantallas;

import clases.ActividadesCursoSeleccionado;
import clases.Administrador;
import clases.AlumnoCursoSeleccionado;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static pantallas.moduloAdmin.persistenciaDatosCursos;

public class profesorAdministrarCurso extends javax.swing.JFrame {
  public ArrayList<AlumnoCursoSeleccionado> arrayAlumnosCursoSeleccionado = new ArrayList<>();
  public ArrayList<ActividadesCursoSeleccionado> arrayActividadesCurso = new ArrayList<>();
  String nombreCursoArchivoBIN;
  int codigoCursoActual;
  
  
  public profesorAdministrarCurso(String nombreCurso, int codigoCurso) {
    initComponents();
    mostrarListadoAlumnosCurso();
    recuperarAlumnos(nombreCurso);
    nombreCursoLabel.setText(nombreCurso);
    nombreCursoArchivoBIN = nombreCurso;
    codigoCursoActual = codigoCurso;
  }

  private profesorAdministrarCurso() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    actividadDescripcion = new javax.swing.JTextField();
    actividadNombre = new javax.swing.JTextField();
    actividadPonderacion = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    crearActividadBtn = new javax.swing.JButton();
    CargaMasivaNotas = new javax.swing.JButton();
    peoresEstudiantesReporte = new javax.swing.JButton();
    mejoresEstudiantesReporte = new javax.swing.JButton();
    nombreCursoLabel = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaActividadesCurso = new javax.swing.JTable();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaAlumnosInscritos = new javax.swing.JTable();
    jLabel10 = new javax.swing.JLabel();
    promedioNotasLabel = new javax.swing.JLabel();
    cerrarVentana = new javax.swing.JButton();
    cargaMasivaAlumnos = new javax.swing.JButton();
    refrescarTablaProfesores = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Listado Alumnos");

    jLabel2.setText("Actividades");

    jLabel3.setText("Crear Actividad");

    jLabel4.setText("Reportes");

    jLabel5.setText("Descripción");

    jLabel6.setText("Ponderación");

    jLabel7.setText("Nombre");

    jLabel8.setText("Notas");

    crearActividadBtn.setText("Crear Actividad");
    crearActividadBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        crearActividadBtnActionPerformed(evt);
      }
    });

    CargaMasivaNotas.setText("Seleccionar archivo CSV");

    peoresEstudiantesReporte.setText("Top 5 - Estudiantes con PEOR rendimiento ");

    mejoresEstudiantesReporte.setText("Top 5 - Estudiantes con MEJOR rendimiento ");

    nombreCursoLabel.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
    nombreCursoLabel.setText("Curso");

    tablaActividadesCurso.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Nombre", "Descripción", "Ponderación", "Promedio"
      }
    ));
    jScrollPane1.setViewportView(tablaActividadesCurso);

    tablaAlumnosInscritos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Código", "Nombre", "Apellido", "Acciones"
      }
    ));
    tablaAlumnosInscritos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    jScrollPane2.setViewportView(tablaAlumnosInscritos);

    jLabel10.setText("Acumulado:");

    promedioNotasLabel.setText("/100");

    cerrarVentana.setText("CERRAR");
    cerrarVentana.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarVentanaActionPerformed(evt);
      }
    });

    cargaMasivaAlumnos.setText("Carga Masiva Alumnos");
    cargaMasivaAlumnos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cargaMasivaAlumnosActionPerformed(evt);
      }
    });

    refrescarTablaProfesores.setText("Refrescar Datos de Tabla");
    refrescarTablaProfesores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        refrescarTablaProfesoresActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cerrarVentana)
            .addGap(120, 120, 120)
            .addComponent(crearActividadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mejoresEstudiantesReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(peoresEstudiantesReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cargaMasivaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CargaMasivaNotas))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actividadPonderacion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(actividadNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(actividadDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(58, 58, 58))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(nombreCursoLabel))
            .addGap(18, 18, 18)
            .addComponent(refrescarTablaProfesores)
            .addGap(267, 267, 267)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(533, 533, 533)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(33, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(promedioNotasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(83, 83, 83))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(33, 33, 33)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(432, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(nombreCursoLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel1)
              .addComponent(jLabel2)))
          .addGroup(layout.createSequentialGroup()
            .addGap(43, 43, 43)
            .addComponent(refrescarTablaProfesores)))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(27, 27, 27)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel10)
          .addComponent(promedioNotasLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(cargaMasivaAlumnos, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(actividadPonderacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(CargaMasivaNotas)
              .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(crearActividadBtn)
              .addComponent(cerrarVentana))
            .addGap(33, 33, 33))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel7)
              .addComponent(actividadNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel4))
            .addGap(8, 8, 8)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(actividadDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5)
              .addComponent(mejoresEstudiantesReporte))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6))
              .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(peoresEstudiantesReporte)))
            .addGap(108, 108, 108))))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(102, 102, 102)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(275, Short.MAX_VALUE)))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentanaActionPerformed
    this.dispose();
  }//GEN-LAST:event_cerrarVentanaActionPerformed

  private void refrescarTablaProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarTablaProfesoresActionPerformed
    mostrarListadoAlumnosCurso();
    mostrarListadoActividades();
  }//GEN-LAST:event_refrescarTablaProfesoresActionPerformed

  private void cargaMasivaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaMasivaAlumnosActionPerformed
    int indexCursoAlumnos = 0;
    for (int i = 0; i < Administrador.arrayCursos.size(); i++) {
      if (Administrador.arrayCursos.get(i).getCodigo() == codigoCursoActual)indexCursoAlumnos = i;
    }
    
    JFileChooser lectorDeArchivos = new JFileChooser();
    FileNameExtensionFilter filtroArchivo = new FileNameExtensionFilter(".csv", "csv");
    lectorDeArchivos.setFileFilter(filtroArchivo);
    int respuestaFileChooser = lectorDeArchivos.showOpenDialog(this);                                        
    
    if (respuestaFileChooser == JFileChooser.APPROVE_OPTION) {
      String ruta = lectorDeArchivos.getSelectedFile().getAbsolutePath();
      
      try {
        BufferedReader mybufferReader = new BufferedReader(new FileReader(ruta));
        String line;
        mybufferReader.readLine();                                                                                  
        while ((line = mybufferReader.readLine()) != null) {                                                        // Primero guardamos el valor de linea actual del csv al ejecutar lo que esta adentro de parentesis y luego validamos si la linea es igual a 'null'
          String[] data = line.split(",");                                                                     // Usamos el método 'split(,)' para crear un Array con los valores de cada columna que estan separador por comas
          if (data.length == 1) {
            int codigo = Integer.parseInt(data[0]);
            String nombre="";
            String apellido="";
            
            for (int i = 0; i < Administrador.arrayAlumnos.size(); i++) {
              if (Administrador.arrayAlumnos.get(i).getCodigo() == codigo){
                nombre = Administrador.arrayAlumnos.get(i).getNombre();
                apellido = Administrador.arrayAlumnos.get(i).getApellido();
                AlumnoCursoSeleccionado alumno = new AlumnoCursoSeleccionado(codigo, nombre, apellido, 0);       
                
                boolean isRepeated = checkearCodigoRepetidoAlumnoCursoSeleccionado(codigo);
                if(isRepeated) {
                  System.out.println("No se Registro dato repetido Carga Masiva");
                  continue;
                }
                this.arrayAlumnosCursoSeleccionado.add(alumno);
                Administrador.arrayCursos.get(indexCursoAlumnos).setAlumnos(Administrador.arrayCursos.get(indexCursoAlumnos).getAlumnos()+1);
              } 
            }
            
          } else {
            JOptionPane.showMessageDialog(this, "❌ El CSV no tiene 1 columna exactas ❌");
          }
        }
        
        mybufferReader.close();
        mostrarListadoAlumnosCurso();     
        persistenciaDatosAlumnosCursoSeleccionado(nombreCursoArchivoBIN);
        persistenciaDatosCursos();
        
        JOptionPane.showMessageDialog(this, "✅ Carga masiva de profesores completada ✅");      
      } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error al cargar el archivo CSV ❌");
      } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error de formato en el archivo CSV ❌");
      }
    }
  }//GEN-LAST:event_cargaMasivaAlumnosActionPerformed

  private void crearActividadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActividadBtnActionPerformed
    String nombreActividad = actividadNombre.getText();
    String descripcionActividad = actividadDescripcion.getText();
    int ponderacionActividad = Integer.parseInt(actividadPonderacion.getText());
    
    ActividadesCursoSeleccionado nuevaActividad = new ActividadesCursoSeleccionado(nombreActividad, descripcionActividad, ponderacionActividad, 7);
    arrayActividadesCurso.add(nuevaActividad);
    
    
    mostrarListadoActividades();
  }//GEN-LAST:event_crearActividadBtnActionPerformed

  
  
  
  
  
  
  
  
  
  
  
  
  
  public void mostrarListadoAlumnosCurso() {
    tablaAlumnosInscritos.setAutoCreateRowSorter(true); 
    DefaultTableModel model = new DefaultTableModel();                                  
    model.setColumnIdentifiers(new String[] {"Código", "Nombre", "Apellido", "Acciones"});
    
    for (AlumnoCursoSeleccionado datosAlumnoCurso : arrayAlumnosCursoSeleccionado) {                                         
      Object[] rowData = new Object[] {
        datosAlumnoCurso.getCodigo(),
        datosAlumnoCurso.getNombre(),
        datosAlumnoCurso.getApellido(),
        "Ver más Información"
      };
      model.addRow(rowData);
    }
    
    tablaAlumnosInscritos.setModel(model);                                                          
    System.out.println("Se actualizaron las filas de Alumnos de este curso");
  }
  
  
  public void mostrarListadoActividades() {
    tablaActividadesCurso.setAutoCreateRowSorter(true); 
    DefaultTableModel model = new DefaultTableModel();                                  
    model.setColumnIdentifiers(new String[] {"Código", "Decripción", "Ponderación", "Premedio"});
    
    for (ActividadesCursoSeleccionado actividad : arrayActividadesCurso) {                                         
      Object[] rowData = new Object[] {
        actividad.getNombre(),
        actividad.getDescripcion(),
        actividad.getPonderacion(),
        actividad.getPromedio()
      };
      model.addRow(rowData);
    }
    
    tablaActividadesCurso.setModel(model);                                                          
    System.out.println("Se actualizaron las filas de Actividades de este curso");
  }
  
  
  public void persistenciaDatosAlumnosCursoSeleccionado(String nombreCurso) throws IOException {
    FileOutputStream archivoDeSalida = new FileOutputStream("/Users/fernandoorozco/Desktop/"+nombreCurso+".bin");
    ObjectOutputStream objectoOutput = new ObjectOutputStream(archivoDeSalida);
    objectoOutput.writeObject(arrayAlumnosCursoSeleccionado);
    archivoDeSalida.close();
    objectoOutput.close();
    System.out.println("Se hizo PERSISTENCIA de Datos Alumnos del Curso: " + nombreCurso);
  }
  
  
  public void recuperarAlumnos(String nombreCurso) {
    try {
      FileInputStream archivoBinario = new FileInputStream("/Users/fernandoorozco/Desktop/"+nombreCurso+".bin");
      ObjectInputStream objetoInput = new ObjectInputStream(archivoBinario);
      ArrayList<AlumnoCursoSeleccionado> alumnosCursoSeleccionadoDelArchivo = (ArrayList<AlumnoCursoSeleccionado>) objetoInput.readObject();
      System.out.println("Se recuperaron: " + alumnosCursoSeleccionadoDelArchivo.size() + " registros de Alumnos del curso: " + nombreCurso);
      
      for (AlumnoCursoSeleccionado alumnoRegistro : alumnosCursoSeleccionadoDelArchivo) {
        int codigoUsuario = alumnoRegistro.getCodigo();
        boolean isRepeated = checkearCodigoRepetidoAlumnoCursoSeleccionado(codigoUsuario);
        if(isRepeated) {
          System.out.println("No se Registro dato repetido");
          continue;
        }
        System.out.println(alumnoRegistro.getNombre());
        arrayAlumnosCursoSeleccionado.add(alumnoRegistro);
      }
      
      archivoBinario.close();
      objetoInput.close();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Error al recuperar alumnos: " + e.getMessage());
    }
  }
  
  
  public boolean checkearCodigoRepetidoAlumnoCursoSeleccionado(int codigoUsuario) {
    for (AlumnoCursoSeleccionado alumno : arrayAlumnosCursoSeleccionado) {
      if (alumno.getCodigo() == codigoUsuario) return true;                     
    }
    return false;                                                               
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void main(String args[]) {
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(profesorAdministrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(profesorAdministrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(profesorAdministrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(profesorAdministrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new profesorAdministrarCurso().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton CargaMasivaNotas;
  private javax.swing.JTextField actividadDescripcion;
  private javax.swing.JTextField actividadNombre;
  private javax.swing.JTextField actividadPonderacion;
  private javax.swing.JButton cargaMasivaAlumnos;
  private javax.swing.JButton cerrarVentana;
  private javax.swing.JButton crearActividadBtn;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JButton mejoresEstudiantesReporte;
  private javax.swing.JLabel nombreCursoLabel;
  private javax.swing.JButton peoresEstudiantesReporte;
  private javax.swing.JLabel promedioNotasLabel;
  private javax.swing.JButton refrescarTablaProfesores;
  private javax.swing.JTable tablaActividadesCurso;
  private javax.swing.JTable tablaAlumnosInscritos;
  // End of variables declaration//GEN-END:variables
}
