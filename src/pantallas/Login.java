// @author fernandoorozco
package pantallas;
import clases.Administrador;
import clases.Profesor;
import clases.Alumno;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
  Administrador admin = new Administrador("a", "a");
  Profesor profesor = new Profesor("b", "b");
  Alumno alumno = new Alumno("c", "c");
  
  moduloAdmin pantallaAdministrador = new moduloAdmin();
  moduloProfesores pantallaProfesor = new moduloProfesores();
  moduloEstudiantes pantallaEstudiante = new moduloEstudiantes();
  
  public static int codigoUsuarioActualProfesor;
  public static int indexActualProfesor;
  public static int codigoUsuarioActualAlumno;
  public static int indexActualAlumno;

  
  public Login() {
    initComponents();
  }

  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    entrarCuentaButton = new javax.swing.JButton();
    codigoUsuario = new javax.swing.JTextField();
    passwordInput = new javax.swing.JTextField();
    userLabel = new javax.swing.JLabel();
    passwordLabel = new javax.swing.JLabel();
    programLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    entrarCuentaButton.setText("Iniciar");
    entrarCuentaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        entrarCuentaButtonActionPerformed(evt);
      }
    });

    userLabel.setText("usuario");

    passwordLabel.setText("contraseña");

    programLabel.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
    programLabel.setText("DTT");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(62, 62, 62)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(codigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(162, 162, 162)
            .addComponent(entrarCuentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(231, 231, 231)
            .addComponent(programLabel)))
        .addContainerGap(276, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addComponent(programLabel)
        .addGap(30, 30, 30)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(codigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(userLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(passwordLabel))
        .addGap(44, 44, 44)
        .addComponent(entrarCuentaButton)
        .addContainerGap(119, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  
  private void entrarCuentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarCuentaButtonActionPerformed
    String user = codigoUsuario.getText();
    String password = passwordInput.getText();
    boolean existeUsuarioProfesor = false;
    boolean existeUsuarioAlumno = false;
    
    try {
      existeUsuarioProfesor = buscarUsarioProfesor(user, password);
    } catch (NumberFormatException e){
      System.out.println("sigue");
    }
    
    try {
      existeUsuarioAlumno = burcarUsarioAlumno(user, password);
    } catch (NumberFormatException e){
      System.out.println("sigue");
    }

    if(this.admin.getUsuario().equals(user) && this.admin.getPassword().equals(password)){
      this.pantallaAdministrador.setVisible(true);
      this.dispose();
    } else if((this.profesor.getUsuario().equals(user) && this.profesor.getPassword().equals(password)) || existeUsuarioProfesor){  
      this.pantallaProfesor.setVisible(true);
      this.dispose();
    } else if((this.alumno.getUsuario().equals(user) && this.alumno.getPassword().equals(password)) || existeUsuarioAlumno){  
      this.pantallaEstudiante.setVisible(true);
      this.dispose();
    }else{
      codigoUsuario.setText("");
      passwordInput.setText("");
      JOptionPane.showMessageDialog(null, "Las credenciales son incorrectas!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }

  }//GEN-LAST:event_entrarCuentaButtonActionPerformed

  
  public boolean buscarUsarioProfesor(String userString, String password){
    int userInt = Integer.parseInt(userString);
    
    for (int i = 0; i < Administrador.arrayProfesores.size(); i++) {
      if (Administrador.arrayProfesores.get(i).getCodigo() == userInt && Administrador.arrayProfesores.get(i).getPassword().equals(password)){
        System.out.println("Usario encontrado: " + userInt);
        System.out.println("Nombre de usuario profesor actual: " + Administrador.arrayProfesores.get(i).getNombre());
        codigoUsuarioActualProfesor = userInt;
        indexActualProfesor = i;
        return true;
      } 
    }
    return false;
  }
  
  
  public boolean burcarUsarioAlumno(String userString, String password){
    int userInt = Integer.parseInt(userString);
    
    for (int i = 0; i < Administrador.arrayAlumnos.size(); i++) {
      if (Administrador.arrayAlumnos.get(i).getCodigo() == userInt && Administrador.arrayAlumnos.get(i).getPassword().equals(password)){
        System.out.println("Usario encontrado: " + userInt);
        System.out.println("Nombre de usuario alumno actual: " + Administrador.arrayAlumnos.get(i).getNombre());
        codigoUsuarioActualAlumno = userInt;
        indexActualAlumno = i;
        return true;
      } 
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
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new Login().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField codigoUsuario;
  private javax.swing.JButton entrarCuentaButton;
  private javax.swing.JTextField passwordInput;
  private javax.swing.JLabel passwordLabel;
  private javax.swing.JLabel programLabel;
  private javax.swing.JLabel userLabel;
  // End of variables declaration//GEN-END:variables
}
