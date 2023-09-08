package pantallas;
import clases.Administrador;
import clases.Profesor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static pantallas.moduloAdmin.persistenciaDatosProfesores;
import static pantallas.profesorAgregar.checkearCodigoRepetido;


public class profesorActualizar extends javax.swing.JFrame {

  public profesorActualizar() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    passwordInput = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    Contraseña = new javax.swing.JLabel();
    codigoInput = new javax.swing.JTextField();
    nombreInput = new javax.swing.JTextField();
    apellidoInput = new javax.swing.JTextField();
    correoInput = new javax.swing.JTextField();
    generoInput = new javax.swing.JComboBox<>();
    actualizarProfesorBtn = new javax.swing.JButton();
    cerrarActualizar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel2.setText("Nombre");

    jLabel3.setText("Apellido");

    jLabel4.setText("Correo");

    jLabel5.setText("Género");

    jLabel1.setText("Código");

    jLabel6.setText("ACTUALIZAR DATOS PROFESOR");

    Contraseña.setText("Contraseña");

    codigoInput.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        codigoInputFocusLost(evt);
      }
    });

    generoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "f" }));

    actualizarProfesorBtn.setText("Actualizar");
    actualizarProfesorBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarProfesorBtnActionPerformed(evt);
      }
    });

    cerrarActualizar.setText("Cerrar");
    cerrarActualizar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarActualizarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(64, 64, 64)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(codigoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 46, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(actualizarProfesorBtn)
                .addGap(86, 86, 86)
                .addComponent(cerrarActualizar)))))
        .addGap(162, 162, 162))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(58, Short.MAX_VALUE)
        .addComponent(jLabel6)
        .addGap(43, 43, 43)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(codigoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
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
        .addGap(33, 33, 33)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(actualizarProfesorBtn)
          .addComponent(cerrarActualizar))
        .addGap(56, 56, 56))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cerrarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActualizarActionPerformed
    this.dispose();
  }//GEN-LAST:event_cerrarActualizarActionPerformed

  private void actualizarProfesorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProfesorBtnActionPerformed
    int codigoUsuario = Integer.parseInt(codigoInput.getText());
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
    }
  }//GEN-LAST:event_actualizarProfesorBtnActionPerformed

  private void codigoInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoInputFocusLost
    try {
      int codigoCurso = Integer.parseInt(codigoInput.getText());
    } catch(java.lang.NumberFormatException e) {
      codigoInput.setText("");
      JOptionPane.showMessageDialog(null, "Ingrese un numero!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_codigoInputFocusLost

  
  public static boolean actualizarRegistro(int codigoUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario, String generoUsuario, String passwordUsuario) {
    for (int i = 0; i < Administrador.arrayProfesores.size(); i++) {
      if (Administrador.arrayProfesores.get(i).getCodigo() == codigoUsuario) {
        Profesor nuevoProfesor = new Profesor(codigoUsuario, nombreUsuario, apellidoUsuario, correoUsuario, generoUsuario, passwordUsuario);
        Administrador.arrayProfesores.set(i, nuevoProfesor);
        try {  
          persistenciaDatosProfesores();
        } catch (IOException ex) {
          Logger.getLogger(profesorAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
      }
    }
    return false;
  }
  
  public void manejarCodigoNoEncontrado(int codigoUsuario) {
    JOptionPane.showMessageDialog(null, "❌ El usuario con código: "+ codigoUsuario +" NO esta registrado, ingrese otro ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
    codigoInput.setText("");
  }
  
  public void manejarDatosActualizados(int codigoUsuario) {
    JOptionPane.showMessageDialog(null, "✅ El usuario con código: "+ codigoUsuario +" fue actualizado ✅", "Alert", JOptionPane.INFORMATION_MESSAGE);
    clearInputs();
  }
  
  
  // Funciones Auxiliares
  public void clearInputs() {
    codigoInput.setText("");
    nombreInput.setText("");
    apellidoInput.setText("");
    correoInput.setText("");
    passwordInput.setText("");
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
      java.util.logging.Logger.getLogger(profesorActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(profesorActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(profesorActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(profesorActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new profesorActualizar().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Contraseña;
  private javax.swing.JButton actualizarProfesorBtn;
  private javax.swing.JTextField apellidoInput;
  private javax.swing.JButton cerrarActualizar;
  private javax.swing.JTextField codigoInput;
  private javax.swing.JTextField correoInput;
  private javax.swing.JComboBox<String> generoInput;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JTextField nombreInput;
  private javax.swing.JTextField passwordInput;
  // End of variables declaration//GEN-END:variables
}
