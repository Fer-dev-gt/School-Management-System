package pantallas;

import clases.Administrador;
import clases.Curso;
import clases.Profesor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static pantallas.cursoAgregar.checkearCodigoRepetido;
import static pantallas.moduloAdmin.persistenciaDatosCursos;

public class cursoActualizar extends javax.swing.JFrame {

  public cursoActualizar() {
    initComponents();
    actualizarComboBoxProfesores();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    codigoInput = new javax.swing.JTextField();
    nombreInput = new javax.swing.JTextField();
    creditosInput = new javax.swing.JTextField();
    agregarCursoBtn = new javax.swing.JButton();
    cerrarAgregar = new javax.swing.JButton();
    cambiarProfesorComboBox = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel2.setText("Nombre");

    jLabel3.setText("Créditos");

    jLabel4.setText("Profesor");

    jLabel1.setText("Código");

    jLabel6.setText("ACTUALIZAR CURSO");

    codigoInput.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        codigoInputFocusLost(evt);
      }
    });

    creditosInput.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        creditosInputFocusLost(evt);
      }
    });

    agregarCursoBtn.setText("Actualizar");
    agregarCursoBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarCursoBtnActionPerformed(evt);
      }
    });

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
      .addGroup(layout.createSequentialGroup()
        .addGap(153, 153, 153)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(0, 3, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(agregarCursoBtn)
                .addGap(88, 88, 88)
                .addComponent(cerrarAgregar))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(codigoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addComponent(nombreInput)
                .addComponent(creditosInput)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(159, 159, 159))
          .addGroup(layout.createSequentialGroup()
            .addComponent(cambiarProfesorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(53, Short.MAX_VALUE)
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
          .addComponent(creditosInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4)
          .addComponent(cambiarProfesorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(50, 50, 50)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(agregarCursoBtn)
          .addComponent(cerrarAgregar))
        .addGap(38, 38, 38))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Funciones de Eventos
  private void actualizarCursoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarCursoBtnActionPerformed
    int codigoCurso = Integer.parseInt(codigoInput.getText());
    boolean codeIsFound = checkearCodigoRepetido(codigoCurso);
    if(!codeIsFound) {
      manejarCodigoNoEncontrado(codigoCurso);
      return;
    }
    
    String nombreCurso = nombreInput.getText();
    int creditos = Integer.parseInt(creditosInput.getText());
    String profesorCurso = cambiarProfesorComboBox.getSelectedItem().toString();
    
    boolean dataUpdated = actualizarCurso(codigoCurso, nombreCurso, creditos, profesorCurso);
    if(dataUpdated) {
      manejarDatosActualizados(codigoCurso);
      this.clearInputs();
      this.dispose();
    }
  }//GEN-LAST:event_actualizarCursoBtnActionPerformed

  private void cerrarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarAgregarActionPerformed
    this.clearInputs();
    this.dispose();
  }//GEN-LAST:event_cerrarAgregarActionPerformed

  private void codigoInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoInputFocusLost
    try {
      int codigoCurso = Integer.parseInt(codigoInput.getText());
    } catch(java.lang.NumberFormatException e) {
      codigoInput.setText("");
      JOptionPane.showMessageDialog(null, "Ingrese un numero!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_codigoInputFocusLost

  private void creditosInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditosInputFocusLost
    try {
      int creditosCurso = Integer.parseInt(creditosInput.getText());
    } catch(java.lang.NumberFormatException e) {
      creditosInput.setText("");
      JOptionPane.showMessageDialog(null, "Ingrese un numero!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_creditosInputFocusLost

  
  // Funciones auxiliares
  public static boolean actualizarCurso(int codigoCurso, String nombreCurso, int creditos, String profesorCurso) {
    for (int i = 0; i < Administrador.arrayCursos.size(); i++) {
      if (Administrador.arrayCursos.get(i).getCodigo() == codigoCurso) {
        int alumnos = Administrador.arrayCursos.get(i).getAlumnos();                                      // Guardamos el valor de los alumnos actuales para no perder este dato
        Curso nuevoCurso = new Curso(codigoCurso, nombreCurso, creditos, alumnos,profesorCurso);
        Administrador.arrayCursos.set(i, nuevoCurso);
        try {
          persistenciaDatosCursos();
        } catch (IOException ex) {
          Logger.getLogger(cursoActualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
      }
    }
    return false;
  }
   
  public void manejarCodigoNoEncontrado(int codigoUsuario) {
    JOptionPane.showMessageDialog(null, "❌ El Curso con código: "+ codigoUsuario +" NO esta registrado, ingrese otro ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
    codigoInput.setText("");
  }
  
  public void manejarDatosActualizados(int codigoUsuario) {
    JOptionPane.showMessageDialog(null, "✅ El Curso con código: "+ codigoUsuario +" fue actualizado ✅", "Alert", JOptionPane.INFORMATION_MESSAGE);
    clearInputs();
  }
  
  public void clearInputs() {
    codigoInput.setText("");
    nombreInput.setText("");
    creditosInput.setText("");
  }
  
  public void actualizarComboBoxProfesores() {
    cambiarProfesorComboBox.removeAllItems();
    for (Profesor profesor : Administrador.arrayProfesores) {
      cambiarProfesorComboBox.addItem(profesor.getNombre()+ " " + profesor.getApellido());
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
      java.util.logging.Logger.getLogger(cursoActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(cursoActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(cursoActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(cursoActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new cursoActualizar().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton agregarCursoBtn;
  private javax.swing.JComboBox<String> cambiarProfesorComboBox;
  private javax.swing.JButton cerrarAgregar;
  private javax.swing.JTextField codigoInput;
  private javax.swing.JTextField creditosInput;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JTextField nombreInput;
  // End of variables declaration//GEN-END:variables
}
