package pantallas;

import clases.Administrador;
import clases.Curso;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import static pantallas.Login.codigoUsuarioActualAlumno;
import static pantallas.Login.indexActualAlumno;

public class moduloAlumnos extends javax.swing.JFrame {
  alumnoActualizar alumnoActualizarPantalla;
  alumnoInformacionCurso alumnoInfoDelCursoPantalla;
  int codigoActualAlumno;
  int indexActualAlumno;
  
  public moduloAlumnos(int codigoUsuarioActualAlumno, int indexActualAlumno, String nombreUsuarioActual) {
    initComponents();
    agregarBotonesProfesor();
    codigoActualAlumno = codigoUsuarioActualAlumno;
    indexActualAlumno = indexActualAlumno;
    moduloAlumnoLabel.setText("MODULO ESTUDIANTE DE: "+nombreUsuarioActual);
  }

  private moduloAlumnos() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    cerrarSesion = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    actualizarDatosAlumno = new javax.swing.JButton();
    moduloAlumnoLabel = new javax.swing.JLabel();
    panelBotones = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    cerrarSesion.setText("CERRAR SESIÓN");
    cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarSesionActionPerformed(evt);
      }
    });

    jLabel1.setText("CURSOS ASIGNADOS");

    actualizarDatosAlumno.setText("Actualizar Datos");
    actualizarDatosAlumno.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarDatosAlumnoActionPerformed(evt);
      }
    });

    moduloAlumnoLabel.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
    moduloAlumnoLabel.setText("MODULO ESTUDIANTE");

    panelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
    panelBotones.setLayout(panelBotonesLayout);
    panelBotonesLayout.setHorizontalGroup(
      panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 673, Short.MAX_VALUE)
    );
    panelBotonesLayout.setVerticalGroup(
      panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 289, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(97, 97, 97)
        .addComponent(moduloAlumnoLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(actualizarDatosAlumno)
        .addGap(25, 25, 25))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(282, 282, 282)
            .addComponent(cerrarSesion))
          .addGroup(layout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel1))))
        .addGap(67, 67, 67))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(moduloAlumnoLabel)
          .addComponent(actualizarDatosAlumno))
        .addGap(29, 29, 29)
        .addComponent(jLabel1)
        .addGap(29, 29, 29)
        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
        .addComponent(cerrarSesion)
        .addGap(65, 65, 65))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
    this.dispose();
    Login login = new Login();
    login.setVisible(true);
  }//GEN-LAST:event_cerrarSesionActionPerformed

  private void actualizarDatosAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDatosAlumnoActionPerformed
    alumnoActualizarPantalla = new alumnoActualizar(codigoActualAlumno, indexActualAlumno);
    alumnoActualizarPantalla.setVisible(true);
  }//GEN-LAST:event_actualizarDatosAlumnoActionPerformed

  
  
  private void agregarBotonesProfesor() {    
    if (indexActualAlumno < Administrador.arrayAlumnos.size()) {
      ArrayList<String> listaDeCursos = Administrador.arrayAlumnos.get(indexActualAlumno).getListaDeCursos();
      int posicionX = 100;
      for (Curso curso : Administrador.arrayCursos) {
        if (listaDeCursos != null && !listaDeCursos.isEmpty() && listaDeCursos.contains(curso.getNombre())) {
          System.out.println("Boton agregado para clase: " + curso.getNombre());
        
          JButton botonDeCurso = new JButton(curso.getNombre());
          botonDeCurso.setBounds(posicionX,100,100,50);
          botonDeCurso.setText(curso.getNombre());

          botonDeCurso.addActionListener((ActionEvent evt) -> {
            System.out.println("Curso: " + curso.getNombre());
            alumnoInfoDelCursoPantalla = new alumnoInformacionCurso(curso.getNombre(), curso.getCodigo(), curso.getProfesor());
            this.alumnoInfoDelCursoPantalla.setVisible(true);
          });

          JLabel nombreProfesorDelCurso = new JLabel(curso.getProfesor());
          nombreProfesorDelCurso.setBounds(posicionX + 5,140,100,50);

          panelBotones.add(botonDeCurso);
          panelBotones.add(nombreProfesorDelCurso);
          posicionX += 125;
        } else {
          System.out.println("no tiene asignado " + curso.getNombre());
        }
      }
      
      System.out.println("El alumno tiene: "+listaDeCursos.size()+" Cursos");
        panelBotones.revalidate();
        panelBotones.repaint();
    } else {
        System.out.println("No se generaron botones para estudiantes");
    }
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
      java.util.logging.Logger.getLogger(moduloAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(moduloAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(moduloAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(moduloAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    java.awt.EventQueue.invokeLater(() -> {
      new moduloAlumnos().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton actualizarDatosAlumno;
  private javax.swing.JButton cerrarSesion;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel moduloAlumnoLabel;
  private javax.swing.JPanel panelBotones;
  // End of variables declaration//GEN-END:variables
}
