package pantallas;
import clases.Administrador;
import clases.Profesor;
import javax.swing.JOptionPane;

public class profesorAgregar extends javax.swing.JFrame {

  public profesorAgregar() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    Contraseña = new javax.swing.JLabel();
    codigoInput = new javax.swing.JTextField();
    nombreInput = new javax.swing.JTextField();
    apellidoInput = new javax.swing.JTextField();
    correoInput = new javax.swing.JTextField();
    generoInput = new javax.swing.JComboBox<>();
    passwordInput = new javax.swing.JTextField();
    agregarProfesorBtn = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    cerrarAgregar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel2.setText("Nombre");

    jLabel3.setText("Apellido");

    jLabel4.setText("Correo");

    jLabel5.setText("Género");

    Contraseña.setText("Contraseña");

    codigoInput.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        validarNumero(evt);
      }
    });

    generoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

    agregarProfesorBtn.setText("Agregar");
    agregarProfesorBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        agregarProfesorBtnActionPerformed(evt);
      }
    });

    jLabel1.setText("Código");

    jLabel6.setText("AGREGAR NUEVO PROFESOR");

    cerrarAgregar.setText("Cerrar");
    cerrarAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarAgregarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap(89, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(codigoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                  .addComponent(nombreInput)
                  .addComponent(apellidoInput)
                  .addComponent(correoInput)
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(229, 229, 229))
      .addGroup(layout.createSequentialGroup()
        .addGap(202, 202, 202)
        .addComponent(agregarProfesorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(88, 88, 88)
        .addComponent(cerrarAgregar)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addComponent(jLabel6)
        .addGap(43, 43, 43)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(codigoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1))
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
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Contraseña))
        .addGap(24, 24, 24)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel5))
        .addGap(52, 52, 52)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(agregarProfesorBtn)
          .addComponent(cerrarAgregar))
        .addContainerGap(57, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Funciones de Eventos
  private void agregarProfesorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProfesorBtnActionPerformed
    int codigoUsuario = Integer.parseInt(codigoInput.getText());
    boolean isRepeated = checkearCodigoRepetido(codigoUsuario);
    if(isRepeated) {
      manejarCodigoRepetido(codigoUsuario);
      return;
    }
    String nombreUsuario = nombreInput.getText();
    String apellidoUsuario = apellidoInput.getText();
    String correoUsuario = correoInput.getText();
    String generoUsuario = generoInput.getSelectedItem().toString();
    String usuarioUsuario = "as";
    String passwordUsuario = passwordInput.getText();

    System.out.println("El codigo de mi usuario es: " + codigoUsuario);
    System.out.println("El nombre de mi usuario es: " + nombreUsuario);
    System.out.println("El apellido de mi usuario es: " + apellidoUsuario);
    System.out.println("El correo de mi usuario es: " + correoUsuario);
    System.out.println("El genero de mi usuario es: " + generoUsuario);

    System.out.println("Tamaño anterior del ArrayList es: " + Administrador.arrayProfesores.size());
    Profesor nuevoAlumno = new Profesor(codigoUsuario,nombreUsuario,apellidoUsuario,correoUsuario,generoUsuario, usuarioUsuario, passwordUsuario);
    Administrador.arrayProfesores.add( nuevoAlumno);
    
    System.out.println("Tamaño actual del ArrayList es: " + Administrador.arrayProfesores.size());
    
    for (Profesor profesor : Administrador.arrayProfesores) {
      System.out.println("ID: " + profesor.getCodigo() + ", Name: " + profesor.getNombre());
    }
    this.clearInputs();
    this.dispose();
    JOptionPane.showMessageDialog(null, "✅ Datos ingresados correctamente ✅", "Alert", JOptionPane.INFORMATION_MESSAGE);
  }//GEN-LAST:event_agregarProfesorBtnActionPerformed

  private void cerrarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarAgregarActionPerformed
    this.clearInputs();
    this.dispose();
  }//GEN-LAST:event_cerrarAgregarActionPerformed

  // Funciones auxiliares
  public static boolean checkearCodigoRepetido(int codigoUsuario) {
    for (Profesor profesor : Administrador.arrayProfesores) {
      if (profesor.getCodigo() == codigoUsuario) {
        return true;                                                            // Se encontro un codigo repetidos en el List
      }
    }
    return false;                                                               // El codigo no esta registrado en el List
  }
  
  
  public void manejarCodigoRepetido(int codigoUsuario) {
    JOptionPane.showMessageDialog(null, "❌ El código: "+ codigoUsuario +" ya esta registrado, ingrese otro ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
    codigoInput.setText("");
  }
  
  
  private void validarNumero(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validarNumero
    try {
      int codigoUsuario = Integer.parseInt(codigoInput.getText());
    } catch(java.lang.NumberFormatException e) {
      codigoInput.setText("");
      JOptionPane.showMessageDialog(null, "Ingrese un numero!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_validarNumero
  
  
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
      java.util.logging.Logger.getLogger(profesorAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(profesorAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(profesorAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(profesorAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(() -> {
      new profesorAgregar().setVisible(true);
    });
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Contraseña;
  private javax.swing.JButton agregarProfesorBtn;
  private javax.swing.JTextField apellidoInput;
  private javax.swing.JButton cerrarAgregar;
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
