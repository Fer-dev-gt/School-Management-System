package pantallas;

public class alumnoInformacionCurso extends javax.swing.JFrame {

  public alumnoInformacionCurso(String nombreCurso, int codigoCurso, String nombreProfesor) {
    initComponents();
    nombreCursoLabel.setText(nombreCurso);
  }

  private alumnoInformacionCurso() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    nombreCursoLabel = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    cerrarVentana = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    nombreCursoLabel.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
    nombreCursoLabel.setText("Curso");

    jLabel1.setText("Actividades");

    cerrarVentana.setText("Regresar");
    cerrarVentana.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarVentanaActionPerformed(evt);
      }
    });

    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 497, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 300, Short.MAX_VALUE)
    );

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Nombre", "Descripción", "Ponderación", "Nota Obtenida"
      }
    ));
    jScrollPane1.setViewportView(jTable1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(169, 169, 169)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(56, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addComponent(nombreCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(339, 339, 339)
            .addComponent(cerrarVentana)))
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(nombreCursoLabel)
        .addGap(26, 26, 26)
        .addComponent(jLabel1)
        .addGap(26, 26, 26)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(cerrarVentana)
        .addGap(43, 43, 43))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentanaActionPerformed
    this.dispose();
  }//GEN-LAST:event_cerrarVentanaActionPerformed

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
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
      java.util.logging.Logger.getLogger(alumnoInformacionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(alumnoInformacionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(alumnoInformacionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(alumnoInformacionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(() -> {
      new alumnoInformacionCurso().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton cerrarVentana;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JLabel nombreCursoLabel;
  // End of variables declaration//GEN-END:variables
}
