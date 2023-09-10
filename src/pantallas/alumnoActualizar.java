package pantallas;

import clases.Administrador;
import clases.Alumno;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static pantallas.moduloAdmin.persistenciaDatosAlumnos;

public class alumnoActualizar extends javax.swing.JFrame {
  ImageIcon fotoTemporal;
  ImageIcon iconoGuardado;
  int codigoDelAlumno;
  
  
  public alumnoActualizar(int codigoActualAlumno, int indexActualAlumno){
    initComponents();
    codigoDelAlumno = codigoActualAlumno;
    System.out.println("Codigo del alumno FOTO: " + codigoDelAlumno+ " index: " +indexActualAlumno);
    
    for (Alumno alumnoFoto : Administrador.arrayAlumnos) {
      if (alumnoFoto.getCodigo() == codigoActualAlumno) {
        iconoGuardado = alumnoFoto.getFoto();
        System.out.println("Se recupero la FOTO");
        nombreInput.setText(alumnoFoto.getNombre());
        apellidoInput.setText(alumnoFoto.getApellido());
        correoInput.setText(alumnoFoto.getCorreo());
        passwordInput.setText(alumnoFoto.getPassword());
      }
    }
    imagenLabel.setIcon(iconoGuardado);
  }

  private alumnoActualizar() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    passwordInput = new javax.swing.JTextField();
    nombreInput = new javax.swing.JTextField();
    apellidoInput = new javax.swing.JTextField();
    correoInput = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    Contraseña = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    generoInput = new javax.swing.JComboBox<>();
    actualizarPerfil = new javax.swing.JButton();
    nombreCursoLabel = new javax.swing.JLabel();
    cambiarFoto = new javax.swing.JButton();
    cerrarVentana = new javax.swing.JButton();
    imagenLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel2.setText("Nombre");

    jLabel3.setText("Apellido");

    jLabel4.setText("Correo");

    Contraseña.setText("Contraseña");

    jLabel5.setText("Género");

    generoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "f" }));

    actualizarPerfil.setText("Actualizar Datos");
    actualizarPerfil.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarPerfilActionPerformed(evt);
      }
    });

    nombreCursoLabel.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
    nombreCursoLabel.setText("Actualizar Datos");

    cambiarFoto.setText("Cambiar Foto");
    cambiarFoto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cambiarFotoActionPerformed(evt);
      }
    });

    cerrarVentana.setText("Regresar");
    cerrarVentana.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarVentanaActionPerformed(evt);
      }
    });

    imagenLabel.setText("Usario no ha subido foto");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(137, 137, 137)
            .addComponent(actualizarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addComponent(nombreCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(cerrarVentana)
            .addGap(28, 28, 28))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(cambiarFoto)
            .addGap(66, 66, 66))))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(85, 85, 85)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGap(18, 18, 18)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addContainerGap(88, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(nombreCursoLabel)
              .addComponent(cerrarVentana))
            .addGap(18, 18, 18)
            .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(158, 158, 158)
            .addComponent(cambiarFoto)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
        .addComponent(generoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(61, 61, 61)
        .addComponent(actualizarPerfil)
        .addGap(81, 81, 81))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(297, 297, 297)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel2)
            .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(18, 18, 18)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel3)
            .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(18, 18, 18)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel4)
            .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(18, 18, 18)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(Contraseña)
            .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(18, 18, 18)
          .addComponent(jLabel5)
          .addContainerGap(172, Short.MAX_VALUE)))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentanaActionPerformed
    this.dispose();
  }//GEN-LAST:event_cerrarVentanaActionPerformed

  private void cambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarFotoActionPerformed
    String ruta = "";
    JFileChooser jFileChooser = new JFileChooser();                                     
    FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG,PNG", "jpg", "png");
    jFileChooser.setFileFilter(filter);
    int respuestaFileChooser = jFileChooser.showOpenDialog(this);

    if (respuestaFileChooser == JFileChooser.APPROVE_OPTION) {
      ruta = jFileChooser.getSelectedFile().getPath();
      Image imagen = new ImageIcon(ruta).getImage();
      ImageIcon icono = new ImageIcon(imagen.getScaledInstance(imagenLabel.getWidth(), imagenLabel.getHeight(), Image.SCALE_SMOOTH));
      fotoTemporal = icono;
      imagenLabel.setIcon(icono);
      iconoGuardado = icono;
    }
  }//GEN-LAST:event_cambiarFotoActionPerformed

  private void actualizarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPerfilActionPerformed
    String nombreUsuario = nombreInput.getText();
    String apellidoUsuario = apellidoInput.getText();
    String correoUsuario = correoInput.getText();
    String generoUsuario = generoInput.getSelectedItem().toString();
    String passwordUsuario = passwordInput.getText();

    try {
      if (fotoTemporal != null) {
        actualizarRegistroAlumno(nombreUsuario, apellidoUsuario, correoUsuario, generoUsuario, passwordUsuario, fotoTemporal);
        persistenciaDatosAlumnos();
        JOptionPane.showMessageDialog(null, "Se actualizaron los datos y foto");
        this.dispose();
      } else {
        JOptionPane.showMessageDialog(null, "Porfavor sube una imagen");
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
      System.out.println("Hubo un Error");
    }
  }//GEN-LAST:event_actualizarPerfilActionPerformed

  
  public void actualizarRegistroAlumno(String nombreUsuario, String apellidoUsuario, String correoUsuario, String generoUsuario, String passwordUsuario, ImageIcon foto) {
    for (int i = 0; i < Administrador.arrayAlumnos.size(); i++) {
      if (Administrador.arrayAlumnos.get(i).getCodigo() == codigoDelAlumno) {
        Alumno nuevoAlumno = new Alumno(codigoDelAlumno, nombreUsuario, apellidoUsuario, correoUsuario, generoUsuario, passwordUsuario);
        nuevoAlumno.setFoto(foto);
        Administrador.arrayAlumnos.set(i, nuevoAlumno);
        System.out.println("SE ACTUALIZO LA FOTO");
      }
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
      java.util.logging.Logger.getLogger(alumnoActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(alumnoActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(alumnoActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(alumnoActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(() -> {
      new alumnoActualizar().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Contraseña;
  private javax.swing.JButton actualizarPerfil;
  private javax.swing.JTextField apellidoInput;
  private javax.swing.JButton cambiarFoto;
  private javax.swing.JButton cerrarVentana;
  private javax.swing.JTextField correoInput;
  private javax.swing.JComboBox<String> generoInput;
  private javax.swing.JLabel imagenLabel;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel nombreCursoLabel;
  private javax.swing.JTextField nombreInput;
  private javax.swing.JTextField passwordInput;
  // End of variables declaration//GEN-END:variables
}
