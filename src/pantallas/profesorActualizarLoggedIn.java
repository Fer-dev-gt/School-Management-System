package pantallas;

public class profesorActualizarLoggedIn extends javax.swing.JFrame {
  

  public profesorActualizarLoggedIn() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel6 = new javax.swing.JLabel();
    Contraseña = new javax.swing.JLabel();
    nombreInput = new javax.swing.JTextField();
    apellidoInput = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    correoInput = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    generoInput = new javax.swing.JComboBox<>();
    passwordInput = new javax.swing.JTextField();
    actualizarProfesorBtn = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    cerrarActualizar = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel6.setText("ACTUALIZAR DATOS PROFESOR LOGGED-IN");

    Contraseña.setText("Contraseña");

    jLabel2.setText("Nombre");

    jLabel3.setText("Apellido");

    generoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

    actualizarProfesorBtn.setText("Actualizar");
    actualizarProfesorBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarProfesorBtnActionPerformed(evt);
      }
    });

    jLabel4.setText("Correo");

    cerrarActualizar.setText("Cerrar");
    cerrarActualizar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarActualizarActionPerformed(evt);
      }
    });

    jLabel5.setText("Género");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(267, 267, 267)
            .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(116, 116, 116)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(80, 80, 80)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))))
          .addGroup(layout.createSequentialGroup()
            .addGap(161, 161, 161)
            .addComponent(jLabel6))
          .addGroup(layout.createSequentialGroup()
            .addGap(163, 163, 163)
            .addComponent(actualizarProfesorBtn)
            .addGap(101, 101, 101)
            .addComponent(cerrarActualizar)))
        .addContainerGap(105, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(44, 44, 44)
        .addComponent(jLabel6)
        .addGap(42, 42, 42)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4))
        .addGap(24, 24, 24)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Contraseña))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel5))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(actualizarProfesorBtn)
          .addComponent(cerrarActualizar))
        .addGap(104, 104, 104))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void actualizarProfesorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProfesorBtnActionPerformed
    /*int codigoUsuario = Integer.parseInt(codigoInput.getText());
    boolean codeIsFound = checkearCodigoRepetido(codigoUsuario);
    if(!codeIsFound) {
      manejarCodigoNoEncontrado(codigoUsuario);
      return;
    }

    String nombreUsuario = nombreInput.getText();
    String apellidoUsuario = apellidoInput.getText();
    String correoUsuario = correoInput.getText();
    String generoUsuario = generoInput.getSelectedItem().toString();
    String passwordUsuario = passwordInput.getText();

    boolean dataUpdated = actualizarRegistro(codigoUsuario, nombreUsuario, apellidoUsuario, correoUsuario, generoUsuario, passwordUsuario);
    if(dataUpdated) {
      manejarDatosActualizados(codigoUsuario);
      this.clearInputs();
      this.dispose();
    }*/
  }//GEN-LAST:event_actualizarProfesorBtnActionPerformed

  private void cerrarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActualizarActionPerformed
    this.dispose();
  }//GEN-LAST:event_cerrarActualizarActionPerformed

  
  
  
  
  
  
  
  
  
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
      java.util.logging.Logger.getLogger(profesorActualizarLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(profesorActualizarLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(profesorActualizarLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(profesorActualizarLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new profesorActualizarLoggedIn().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Contraseña;
  private javax.swing.JButton actualizarProfesorBtn;
  private javax.swing.JTextField apellidoInput;
  private javax.swing.JButton cerrarActualizar;
  private javax.swing.JTextField correoInput;
  private javax.swing.JComboBox<String> generoInput;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JTextField nombreInput;
  private javax.swing.JTextField passwordInput;
  // End of variables declaration//GEN-END:variables
}
