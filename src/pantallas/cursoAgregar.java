package pantallas;

import clases.Administrador;
import clases.Curso;
import clases.Profesor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static pantallas.moduloAdmin.persistenciaDatosCursos;

public class cursoAgregar extends javax.swing.JFrame {

  public cursoAgregar() {
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
    nombreCursoInput = new javax.swing.JTextField();
    creditosInput = new javax.swing.JTextField();
    agregarCursoBtn = new javax.swing.JButton();
    cerrarAgregar = new javax.swing.JButton();
    listaDeProfesores = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel2.setText("Nombre");

    jLabel3.setText("Créditos");

    jLabel4.setText("Profesor");

    jLabel1.setText("Código");

    jLabel6.setText("AGREGAR NUEVO CURSO");

    codigoInput.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        evaluarNumero(evt);
      }
    });

    creditosInput.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        evaluarNumeroCreditos(evt);
      }
    });

    agregarCursoBtn.setText("Agregar");
    agregarCursoBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        agregarCursoBtnActionPerformed(evt);
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
        .addGap(39, 39, 39)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(listaDeProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(agregarCursoBtn)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(codigoInput)
                .addComponent(nombreCursoInput)
                .addComponent(creditosInput, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cerrarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)))
        .addGap(120, 120, 120))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(35, 35, 35)
        .addComponent(jLabel6)
        .addGap(43, 43, 43)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(codigoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(nombreCursoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(creditosInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(listaDeProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(31, 31, 31)
        .addComponent(agregarCursoBtn)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
        .addComponent(cerrarAgregar)
        .addGap(58, 58, 58))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  
  // Funciones de Eventos
  private void agregarCursoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCursoBtnActionPerformed
    int codigoCurso = Integer.parseInt(codigoInput.getText());
    boolean isRepeated = checkearCodigoRepetido(codigoCurso);
    if(isRepeated) {
      manejarCodigoRepetido(codigoCurso);
      return;
    }
    
    String nombreCurso = nombreCursoInput.getText();
    int creditos = Integer.parseInt(creditosInput.getText());
    String profesor = listaDeProfesores.getSelectedItem().toString();

    System.out.println("Tamaño anterior del ArrayList Cursos es: " + Administrador.arrayCursos.size());
    Curso nuevoCurso = new Curso(codigoCurso, nombreCurso, creditos, profesor);
    Administrador.arrayCursos.add( nuevoCurso);
    System.out.println("Tamaño actual del ArrayList Cursos es: " + Administrador.arrayCursos.size());
    
    //nuevoCurso.setAlumnos(Integer.parseInt(auxiliarAlumnos.getText()));     // Eliminar esto despues
    
    try {
      persistenciaDatosCursos();
    } catch (IOException ex) {
      Logger.getLogger(cursoAgregar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    this.clearInputs();
    this.dispose();
    JOptionPane.showMessageDialog(null, "✅ Datos del Curso ingresados correctamente ✅", "Alert", JOptionPane.INFORMATION_MESSAGE);
  }//GEN-LAST:event_agregarCursoBtnActionPerformed

  private void evaluarNumero(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_evaluarNumero
    try {
      int codigoUsuario = Integer.parseInt(codigoInput.getText());
    } catch(java.lang.NumberFormatException e) {
      codigoInput.setText("");
      JOptionPane.showMessageDialog(null, "Ingrese un numero!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_evaluarNumero
  
  private void cerrarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarAgregarActionPerformed
    this.clearInputs();
    this.dispose();
  }//GEN-LAST:event_cerrarAgregarActionPerformed

  private void evaluarNumeroCreditos(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_evaluarNumeroCreditos
    
  }//GEN-LAST:event_evaluarNumeroCreditos

  
  // Funciones auxiliares
  public static boolean checkearCodigoRepetido(int codigoCurso) {
    for (Curso curso : Administrador.arrayCursos) {
      if (curso.getCodigo() == codigoCurso) return true;                                                            
    }
    return false;                                                               
  }
  
  public void manejarCodigoRepetido(int codigoUsuario) {
    JOptionPane.showMessageDialog(null, "❌ El código: "+ codigoUsuario +" ya esta registrado, ingrese otro ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
    codigoInput.setText("");
  }
  
  public void clearInputs() {
    codigoInput.setText("");
    nombreCursoInput.setText("");
    creditosInput.setText("");
  }
  
  public void actualizarComboBoxProfesores() {
    listaDeProfesores.removeAllItems();
    for (Profesor profesor : Administrador.arrayProfesores) {
      listaDeProfesores.addItem(profesor.getNombre()+ " " + profesor.getApellido());
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
      java.util.logging.Logger.getLogger(cursoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(cursoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(cursoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(cursoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(() -> {
      new cursoAgregar().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton agregarCursoBtn;
  private javax.swing.JButton cerrarAgregar;
  private javax.swing.JTextField codigoInput;
  private javax.swing.JTextField creditosInput;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JComboBox<String> listaDeProfesores;
  private javax.swing.JTextField nombreCursoInput;
  // End of variables declaration//GEN-END:variables
}
