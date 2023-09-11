package pantallas;

import clases.ActividadesCursoSeleccionado;
import clases.Administrador;
import clases.Curso;
import clases.SeguimientoNotasAlumno;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class alumnoInformacionCurso extends javax.swing.JFrame {
  int codigoCursoActual = 0;
  int codigoAlumnoActual = 0;
  String nombreCursoActual;
  ArrayList<Double> variableLista; 
  
  public alumnoInformacionCurso(String nombreCurso, int codigoCurso, String nombreProfesor, int codigoActualAlumno) {
    initComponents();
    nombreCursoLabel.setText(nombreCurso);
    codigoCursoActual = codigoCurso;
    nombreCursoActual = nombreCurso;
    codigoAlumnoActual = codigoActualAlumno;
  }

  private alumnoInformacionCurso() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jButton1 = new javax.swing.JButton();
    nombreCursoLabel = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    cerrarVentana = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaActividadesNotas = new javax.swing.JTable();
    refrescarDatosTablaGrafica = new javax.swing.JButton();

    jButton1.setText("Refrescar Tabla y Gráfica");

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

    tablaActividadesNotas.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane1.setViewportView(tablaActividadesNotas);

    refrescarDatosTablaGrafica.setText("Refrescar Tabla y Gráfica");
    refrescarDatosTablaGrafica.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        refrescarDatosTablaGraficaActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(37, 37, 37)
        .addComponent(nombreCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(cerrarVentana)
        .addGap(40, 40, 40))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(158, 158, 158)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(297, 297, 297)
            .addComponent(refrescarDatosTablaGrafica)))
        .addContainerGap(56, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(nombreCursoLabel)
          .addComponent(cerrarVentana))
        .addGap(26, 26, 26)
        .addComponent(jLabel1)
        .addGap(26, 26, 26)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(41, 41, 41)
        .addComponent(refrescarDatosTablaGrafica)
        .addGap(54, 54, 54))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentanaActionPerformed
    this.dispose();
    
  }//GEN-LAST:event_cerrarVentanaActionPerformed

  private void refrescarDatosTablaGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarDatosTablaGraficaActionPerformed
    mostrarActividadesTabla();
  }//GEN-LAST:event_refrescarDatosTablaGraficaActionPerformed

  public void mostrarActividadesTabla(){
    for (SeguimientoNotasAlumno seguir : profesorAdministrarCurso.arraySeguimientoNotas) {
      if((seguir.getCodigo() == codigoAlumnoActual) && (seguir.getNombreCurso().equals(nombreCursoActual))){
        variableLista = seguir.getListaDeNotas();
        System.out.println("MATCH con CODIGO ALUMNO y NOMBRE CURSO: " + nombreCursoActual);
        System.out.println(variableLista.size());
        System.out.println(variableLista.get(0));
      }
    }
    
        
    for (Curso curso : Administrador.arrayCursos) {
      if(curso.getCodigo() == codigoCursoActual){
        System.out.println("Mostrando actividades en Tabla" );
        mostrarListadoActividades(curso.getActividadesDelCurso(), variableLista);
        System.out.println("Número de calificaciones que ha recibido: "+curso.getActividadesDelCurso().size());
      }
    }
  }
  
  
  public void mostrarListadoActividades(ArrayList<ActividadesCursoSeleccionado> arrayActividadesCursoActual, ArrayList<Double> arraySeguimientoNotas) {
    tablaActividadesNotas.setAutoCreateRowSorter(true); 
    DefaultTableModel model = new DefaultTableModel();                                  
    model.setColumnIdentifiers(new String[] {"Nombre", "Decripción", "Ponderación", "Nota Obtenidad"});
    System.out.println("Número de actividades en el curso "+nombreCursoActual+": " +arrayActividadesCursoActual.size());
    int nota = 0;
    
    for (ActividadesCursoSeleccionado actividad : arrayActividadesCursoActual) {                    
      System.out.println("Haber:" +arraySeguimientoNotas.get(nota));
      Object[] rowData = new Object[] {
        actividad.getNombre(),
        actividad.getDescripcion(),
        actividad.getPonderacion(),
        arraySeguimientoNotas.get(nota)
      };
      model.addRow(rowData);
      nota++;
    }
    
    tablaActividadesNotas.setModel(model);                                                          
    System.out.println("Se actualizaron las filas de Actividades del curso: "+nombreCursoActual);
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
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel nombreCursoLabel;
  private javax.swing.JButton refrescarDatosTablaGrafica;
  private javax.swing.JTable tablaActividadesNotas;
  // End of variables declaration//GEN-END:variables
}
