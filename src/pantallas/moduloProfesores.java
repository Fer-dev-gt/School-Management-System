package pantallas;

import clases.Administrador;
import clases.Curso;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import static pantallas.Login.indexActualProfesor;

public class moduloProfesores extends javax.swing.JFrame {
  profesorActualizarLoggedIn actualizarProfesorPantallaLoggedIn;
  profesorAdministrarCurso administrarCursoPantalla;
  
  public moduloProfesores() {
    initComponents();
    agregarBotonesProfesor();
  }
  
  
  private void agregarBotonesProfesor() {                                                
    int posicionX = 100;
    for (Curso curso : Administrador.arrayCursos) {
      if (curso.getProfesor().equals(Administrador.arrayProfesores.get(indexActualProfesor).getNombre() + " " + Administrador.arrayProfesores.get(indexActualProfesor).getApellido())) { // Replace with the actual professor's name
        System.out.println("Boton agregado para clase: " + curso.getNombre());
        
        JButton botonDeCurso = new JButton(curso.getNombre());
        botonDeCurso.setBounds(posicionX,100,100,50);
        botonDeCurso.setText(curso.getNombre());
        
        botonDeCurso.addActionListener((ActionEvent evt) -> {
          System.out.println("Curso: " + curso.getNombre());
          administrarCursoPantalla = new profesorAdministrarCurso(curso.getNombre());
          this.administrarCursoPantalla.setVisible(true);
        });
        
        JLabel alumnosLabel = new JLabel(String.valueOf(curso.getAlumnos() + " Alumnos"));
        alumnosLabel.setBounds(posicionX + 15,140,100,50);
        
        panelBotones.add(botonDeCurso);
        panelBotones.add(alumnosLabel);
        posicionX += 100;
      } else {
        System.out.println("Nooooo");
      }
    }
    panelBotones.revalidate();
    panelBotones.repaint();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    actualizarDatosProfesorActual = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    cerrarSesion = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    panelBotones = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    actualizarDatosProfesorActual.setText("Actualizar Datos");
    actualizarDatosProfesorActual.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarDatosProfesorActualActionPerformed(evt);
      }
    });

    jLabel1.setText("CURSOS ASIGNADOS");

    cerrarSesion.setText("CERRAR SESIÓN");
    cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarSesionActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
    jLabel2.setText("MODULO PROFESOR");

    panelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
    panelBotones.setLayout(panelBotonesLayout);
    panelBotonesLayout.setHorizontalGroup(
      panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    panelBotonesLayout.setVerticalGroup(
      panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 289, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(229, 229, 229)
        .addComponent(jLabel2)
        .addContainerGap(260, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGap(58, 58, 58)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(49, 49, 49)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actualizarDatosProfesorActual)))
        .addGap(63, 63, 63))
      .addGroup(layout.createSequentialGroup()
        .addGap(283, 283, 283)
        .addComponent(cerrarSesion)
        .addGap(107, 304, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addComponent(jLabel2)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(actualizarDatosProfesorActual))
        .addGap(18, 18, 18)
        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(cerrarSesion)
        .addGap(53, 53, 53))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
    this.dispose();
    Login login = new Login();
    login.setVisible(true);
  }//GEN-LAST:event_cerrarSesionActionPerformed

  private void actualizarDatosProfesorActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDatosProfesorActualActionPerformed
    actualizarProfesorPantallaLoggedIn = new profesorActualizarLoggedIn();
    this.actualizarProfesorPantallaLoggedIn.setVisible(true);
  }//GEN-LAST:event_actualizarDatosProfesorActualActionPerformed

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
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
      java.util.logging.Logger.getLogger(moduloProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(moduloProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(moduloProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(moduloProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new moduloProfesores().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton actualizarDatosProfesorActual;
  private javax.swing.JButton cerrarSesion;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel panelBotones;
  // End of variables declaration//GEN-END:variables
}
