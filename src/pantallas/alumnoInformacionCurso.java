package pantallas;

import clases.ActividadesCursoSeleccionado;
import clases.Administrador;
import clases.Curso;
import clases.SeguimientoNotasAlumno;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class alumnoInformacionCurso extends javax.swing.JFrame {
  int codigoCursoActual = 0;
  int codigoAlumnoActual = 0;
  String nombreCursoActual;
  ArrayList<Double> listaNotaObtenida; 
  
  public alumnoInformacionCurso(String nombreCurso, int codigoCurso, String nombreProfesor, int codigoActualAlumno) {
    initComponents();
    nombreCursoLabel.setText(nombreCurso);
    codigoCursoActual = codigoCurso;
    nombreCursoActual = nombreCurso;
    codigoAlumnoActual = codigoActualAlumno;
    profesorAdministrarCurso.recuperarSeguimientoNotas();
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
    panelNotasDelCurso = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaActividadesNotas = new javax.swing.JTable();
    refrescarDatosTablaGrafica = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    TotalPuntosObtenidos = new javax.swing.JLabel();
    totalPonderacionLabel = new javax.swing.JLabel();

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

    panelNotasDelCurso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout panelNotasDelCursoLayout = new javax.swing.GroupLayout(panelNotasDelCurso);
    panelNotasDelCurso.setLayout(panelNotasDelCursoLayout);
    panelNotasDelCursoLayout.setHorizontalGroup(
      panelNotasDelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 728, Short.MAX_VALUE)
    );
    panelNotasDelCursoLayout.setVerticalGroup(
      panelNotasDelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 302, Short.MAX_VALUE)
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

    jLabel2.setText("Total Ponderación");

    jLabel3.setText("Puntos Obtenidos");

    TotalPuntosObtenidos.setText("0");

    totalPonderacionLabel.setText("0");

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
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(panelNotasDelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(297, 297, 297)
            .addComponent(refrescarDatosTablaGrafica))
          .addGroup(layout.createSequentialGroup()
            .addGap(475, 475, 475)
            .addComponent(totalPonderacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(112, 112, 112)
            .addComponent(TotalPuntosObtenidos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(450, 450, 450)
            .addComponent(jLabel2)
            .addGap(53, 53, 53)
            .addComponent(jLabel3)))
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
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel3)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(TotalPuntosObtenidos)
          .addComponent(totalPonderacionLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
        .addComponent(panelNotasDelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    mostrarGraficaBarras1();
  }//GEN-LAST:event_refrescarDatosTablaGraficaActionPerformed

  
  public void mostrarActividadesTabla(){
    System.out.println("tamaño arraySeguimientoNotas: " +profesorAdministrarCurso.arraySeguimientoNotas.size());        
    for (SeguimientoNotasAlumno seguir : profesorAdministrarCurso.arraySeguimientoNotas) {
      if((seguir.getCodigo() == codigoAlumnoActual) && (seguir.getNombreCurso().equals(nombreCursoActual))){
        listaNotaObtenida = seguir.getListaDeNotas();
        System.out.println("MATCH con CODIGO ALUMNO: "+codigoAlumnoActual+" y NOMBRE CURSO: " + nombreCursoActual);
        System.out.println("Cantidad de notas obtenidas: "+listaNotaObtenida.size());
      }
    }
    
    for (Curso curso : Administrador.arrayCursos) {
      if(curso.getCodigo() == codigoCursoActual){
        System.out.println("Mostrando actividades en Tabla" );
        mostrarListadoActividades(curso.getActividadesDelCurso(), listaNotaObtenida);
        System.out.println("Número de calificaciones que ha recibido: "+curso.getActividadesDelCurso().size());
      }
    }
  }
  
  
  public void mostrarListadoActividades(ArrayList<ActividadesCursoSeleccionado> arrayActividadesCursoActual, ArrayList<Double> listaNotaObtenida) {
    tablaActividadesNotas.setAutoCreateRowSorter(true); 
    DefaultTableModel model = new DefaultTableModel();                                  
    model.setColumnIdentifiers(new String[] {"Nombre", "Decripción", "Ponderación", "Nota Obtenidad"});
    System.out.println("Número de actividades en el curso "+nombreCursoActual+": " +arrayActividadesCursoActual.size());
    int nota = 0;
    double totalPonderación = 0;
    double totalPuntosObtenidos = 0;
    double notaParcial = 0;
    
    for (ActividadesCursoSeleccionado actividad : arrayActividadesCursoActual) {                    
      System.out.println("Nota obtenida: " +listaNotaObtenida.get(nota));
      totalPonderación += actividad.getPonderacion();
      totalPuntosObtenidos = listaNotaObtenida.get(nota);
      notaParcial += (actividad.getPonderacion() * (totalPuntosObtenidos/100)); 
      
      Object[] rowData = new Object[] {
        actividad.getNombre(),
        actividad.getDescripcion(),
        actividad.getPonderacion(),
        listaNotaObtenida.get(nota)
      };
      model.addRow(rowData);
      nota++;
    }
    
    totalPuntosObtenidos = totalPuntosObtenidos/arrayActividadesCursoActual.size();
    tablaActividadesNotas.setModel(model);                                                          
    System.out.println("Se actualizaron las filas de Actividades del curso: "+nombreCursoActual);
    totalPonderacionLabel.setText(String.valueOf(totalPonderación));
    TotalPuntosObtenidos.setText(String.format("%.2f", notaParcial));
  }
  
  
  public void mostrarGraficaBarras1(){
    for (Curso curso : Administrador.arrayCursos) {
      if(curso.getCodigo() == codigoCursoActual){
        System.out.println("Mostrando gráfica" );
        mostrarGraficaBarras2(curso.getActividadesDelCurso(), listaNotaObtenida);
      }
    }
  }
  
  
  public void mostrarGraficaBarras2(ArrayList<ActividadesCursoSeleccionado> arrayActividadesCursoActual, ArrayList<Double> listaNotaObtenida){
    DefaultCategoryDataset datos = new DefaultCategoryDataset();
    int numeroDeActividades = 0;
    
    for (ActividadesCursoSeleccionado actividad : arrayActividadesCursoActual) {  
      if(arrayActividadesCursoActual.size() > 0){
        numeroDeActividades++;
      }
    }
    
    if(numeroDeActividades == 1) datos.setValue(listaNotaObtenida.get(0),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(0).getNombre());
    
    if(numeroDeActividades == 2) {
      datos.setValue(listaNotaObtenida.get(0),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(0).getNombre());
      datos.setValue(listaNotaObtenida.get(1),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(1).getNombre());
    }
    if(numeroDeActividades == 3) {
      datos.setValue(listaNotaObtenida.get(0),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(0).getNombre());
      datos.setValue(listaNotaObtenida.get(1),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(1).getNombre());
      datos.setValue(listaNotaObtenida.get(2),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(2).getNombre());
    }
    
    if(numeroDeActividades == 4) {
      datos.setValue(listaNotaObtenida.get(0),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(0).getNombre());
      datos.setValue(listaNotaObtenida.get(1),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(1).getNombre());
      datos.setValue(listaNotaObtenida.get(2),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(2).getNombre());
      datos.setValue(listaNotaObtenida.get(3),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(3).getNombre());
    }
    
    if(numeroDeActividades == 5) {
      datos.setValue(listaNotaObtenida.get(0),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(0).getNombre());
      datos.setValue(listaNotaObtenida.get(1),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(1).getNombre());
      datos.setValue(listaNotaObtenida.get(2),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(2).getNombre());
      datos.setValue(listaNotaObtenida.get(3),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(3).getNombre());
      datos.setValue(listaNotaObtenida.get(4),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(4).getNombre());
    }
    
    if(numeroDeActividades >= 6) {
      datos.setValue(listaNotaObtenida.get(0),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(0).getNombre());
      datos.setValue(listaNotaObtenida.get(1),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(1).getNombre());
      datos.setValue(listaNotaObtenida.get(2),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(2).getNombre());
      datos.setValue(listaNotaObtenida.get(3),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(3).getNombre());
      datos.setValue(listaNotaObtenida.get(4),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(4).getNombre());
      datos.setValue(listaNotaObtenida.get(5),"Porcentaje de Ponderación",arrayActividadesCursoActual.get(5).getNombre());
    }
    
    JFreeChart graficaBarras = ChartFactory.createBarChart3D("Nota obtenida por actividad",
            "",
            "Nota obtenida",
            datos,
            PlotOrientation.VERTICAL,
            true,
            true,
            false);
    
    if (panelNotasDelCurso.getComponentCount() > 0) panelNotasDelCurso.remove(0); 
    
    ChartPanel panel = new ChartPanel(graficaBarras);
    panel.setMouseWheelEnabled(true);
    panel.setPreferredSize(new Dimension(730,304));
    panelNotasDelCurso.setLayout(new BorderLayout());
    panelNotasDelCurso.add(panel, BorderLayout.NORTH);
    
    pack();
    repaint();
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
  private javax.swing.JLabel TotalPuntosObtenidos;
  private javax.swing.JButton cerrarVentana;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel nombreCursoLabel;
  private javax.swing.JPanel panelNotasDelCurso;
  private javax.swing.JButton refrescarDatosTablaGrafica;
  private javax.swing.JTable tablaActividadesNotas;
  private javax.swing.JLabel totalPonderacionLabel;
  // End of variables declaration//GEN-END:variables
}
