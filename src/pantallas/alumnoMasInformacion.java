package pantallas;

import clases.Administrador;
import clases.Alumno;
import clases.AlumnoCursoSeleccionado;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pantallas.moduloAdmin.persistenciaDatosCursos;

public class alumnoMasInformacion extends javax.swing.JFrame {
  String correoAlumno = "";
  String passwordAlumno = "";
  String generoAlumno = "";
  String nombreCursoArchivoBIN = "";
  int codigoAlumnoEliminar = 0;
  int codigoCursoActual = 0;
  ArrayList<AlumnoCursoSeleccionado> listadoDeAlumnos = null;

  public alumnoMasInformacion(String nombreAlumno, String apellidoAlumno, int codigoAlumno, ArrayList<AlumnoCursoSeleccionado> listaDeAlumnos, String nombreCurso, int codigoCurso) {
    initComponents();
    nombreCursoLabel.setText("Ver más información de: " +nombreAlumno+ " " +apellidoAlumno);
    nombreInfo.setText(nombreAlumno);
    apellidoInfo.setText(apellidoAlumno);
    nombreCursoArchivoBIN = nombreCurso;
    
    for (Alumno alumno : Administrador.arrayAlumnos) {
      if (alumno.getCodigo() == codigoAlumno) { 
        correoAlumno = alumno.getCorreo();
        passwordAlumno = alumno.getPassword();
        generoAlumno = alumno.getGenero();
      }
    }
    
    correoInfo.setText(correoAlumno);
    passwordInfo.setText(passwordAlumno);
    generoInfo.setText(generoAlumno);
    codigoAlumnoEliminar = codigoAlumno;
    listadoDeAlumnos = listaDeAlumnos;
    codigoCursoActual = codigoCurso;
  }

  private alumnoMasInformacion() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    RegresarBtn = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    Contraseña = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    passwordInfo = new javax.swing.JTextField();
    nombreInfo = new javax.swing.JTextField();
    apellidoInfo = new javax.swing.JTextField();
    correoInfo = new javax.swing.JTextField();
    generoInfo = new javax.swing.JTextField();
    eliminarEstudiante = new javax.swing.JButton();
    nombreCursoLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    RegresarBtn.setText("Regresar");
    RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        RegresarBtnActionPerformed(evt);
      }
    });

    jLabel3.setText("Apellido");

    jLabel4.setText("Correo");

    Contraseña.setText("Contraseña");

    jLabel5.setText("Género");

    jLabel2.setText("Nombre");

    jLabel6.setText("Foto");

    eliminarEstudiante.setText("Eliminar Estudiante del Curso");
    eliminarEstudiante.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        eliminarEstudianteActionPerformed(evt);
      }
    });

    nombreCursoLabel.setFont(new java.awt.Font("Silom", 1, 20)); // NOI18N
    nombreCursoLabel.setText("Ver más información");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addComponent(nombreCursoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(passwordInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(apellidoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(correoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addComponent(generoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(eliminarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegresarBtn))))
              .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 83, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(nombreCursoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        .addGap(18, 18, 18)
        .addComponent(jLabel6)
        .addGap(165, 165, 165)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel2)
          .addComponent(nombreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(apellidoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(correoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(Contraseña)
          .addComponent(passwordInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(generoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(66, 66, 66)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(eliminarEstudiante)
          .addComponent(RegresarBtn))
        .addGap(49, 49, 49))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
    this.dispose();
  }//GEN-LAST:event_RegresarBtnActionPerformed

  private void eliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEstudianteActionPerformed
    int indexCursoAlumnos = 0;
    for (int i = 0; i < Administrador.arrayCursos.size(); i++) {
      if (Administrador.arrayCursos.get(i).getCodigo() == codigoCursoActual)indexCursoAlumnos = i;
    }
    
    System.out.println("Selected Código para ELIMINAR: " + codigoAlumnoEliminar);
    int indexAlumnoEliminar = encontrarIndexAlumnoEliminar(codigoAlumnoEliminar);
    listadoDeAlumnos.remove(indexAlumnoEliminar);
    System.out.println("Se elimino alumno: "+codigoAlumnoEliminar+" index: "+ indexAlumnoEliminar);
    
    Administrador.arrayCursos.get(indexCursoAlumnos).setAlumnos(listadoDeAlumnos.size());
    System.out.println("El tamaño de alumnos es ahora de: " + listadoDeAlumnos.size());
    try {
      persistenciaDatosAlumnosCursoSeleccionado(nombreCursoArchivoBIN);
    } catch (IOException ex) {
      Logger.getLogger(alumnoMasInformacion.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
      persistenciaDatosCursos();
    } catch (IOException ex) {
      Logger.getLogger(alumnoMasInformacion.class.getName()).log(Level.SEVERE, null, ex);
    }
    this.dispose();
  }//GEN-LAST:event_eliminarEstudianteActionPerformed

  
  private int encontrarIndexAlumnoEliminar(int codigoUsuario) {
    for (int i = 0; i < listadoDeAlumnos.size(); i++) {
      AlumnoCursoSeleccionado Alumno = listadoDeAlumnos.get(i);
      if (Alumno.getCodigo() == codigoUsuario) return i;                          // Regresa el index del profesor que encontró e hizo match
    }
    return -1;                                                                    // Si retorna -1 es porque no encontro al profesor
  }
  
  
  public void persistenciaDatosAlumnosCursoSeleccionado(String nombreCurso) throws IOException {
    FileOutputStream archivoDeSalida = new FileOutputStream("/Users/fernandoorozco/Desktop/"+nombreCurso+"_AlumnosRegistrados.bin");
    ObjectOutputStream objectoOutput = new ObjectOutputStream(archivoDeSalida);
    objectoOutput.writeObject(listadoDeAlumnos);
    archivoDeSalida.close();
    objectoOutput.close();
    System.out.println("Se hizo PERSISTENCIA de Datos Alumnos del Curso: " + nombreCurso);
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
      java.util.logging.Logger.getLogger(alumnoMasInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(alumnoMasInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(alumnoMasInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(alumnoMasInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new alumnoMasInformacion().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Contraseña;
  private javax.swing.JButton RegresarBtn;
  private javax.swing.JTextField apellidoInfo;
  private javax.swing.JTextField correoInfo;
  private javax.swing.JButton eliminarEstudiante;
  private javax.swing.JTextField generoInfo;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel nombreCursoLabel;
  private javax.swing.JTextField nombreInfo;
  private javax.swing.JTextField passwordInfo;
  // End of variables declaration//GEN-END:variables
}
