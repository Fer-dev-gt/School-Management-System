package pantallas;

import clases.Administrador;
import clases.Alumno;
import clases.Curso;
import clases.PlantillaPDF;
import clases.Profesor;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import com.itextpdf.text.DocumentException;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class moduloAdmin extends javax.swing.JFrame {
  profesorAgregar agregarProfesorPantalla = new profesorAgregar();
  profesorActualizar actualizarProfesorPantalla = new profesorActualizar();
  cursoAgregar agregarCursoPantalla = new cursoAgregar();
  cursoActualizar actualizarCursoPantalla = new cursoActualizar();
  
  
  public moduloAdmin() {
    initComponents();
    mostrarListadoProfesores();
    mostrarListadoAlumnos();
    mostrarListadoCursos();
  }

  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelesAdmin = new javax.swing.JTabbedPane();
    panelProfesores = new javax.swing.JPanel();
    cargaMasivaProfesores = new javax.swing.JButton();
    crearNuevoProfesor = new javax.swing.JButton();
    actualizarDatosProfesor = new javax.swing.JButton();
    exportarPDFProfesores = new javax.swing.JButton();
    eliminarProfesorBtn = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaProfesores = new javax.swing.JTable();
    refrescarTablaProfesores = new javax.swing.JButton();
    panelProfesoresGrafica = new javax.swing.JPanel();
    graficaProfesoresBtn = new javax.swing.JButton();
    panelCursos = new javax.swing.JPanel();
    cargaMasivaCursos = new javax.swing.JButton();
    crearNuevoCurso = new javax.swing.JButton();
    actualizarDatosCurso = new javax.swing.JButton();
    exportarPDFCursos = new javax.swing.JButton();
    eliminarCursoBtn = new javax.swing.JButton();
    jScrollPane3 = new javax.swing.JScrollPane();
    tablaCursos = new javax.swing.JTable();
    refrescarTablaCursos = new javax.swing.JButton();
    graficaCursosBtn = new javax.swing.JButton();
    panelCursosGrafica = new javax.swing.JPanel();
    panelAlumnos = new javax.swing.JPanel();
    cargaMasivaEstudiantes = new javax.swing.JButton();
    exportarPDFEstudiantes = new javax.swing.JButton();
    jScrollPane4 = new javax.swing.JScrollPane();
    tablaAlumnos = new javax.swing.JTable();
    refrescarTablaAlumnos = new javax.swing.JButton();
    panelEstudiantesGrafica = new javax.swing.JPanel();
    graficaAlumnosBtn = new javax.swing.JButton();
    cerrarSesion = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(153, 153, 153));

    panelesAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    cargaMasivaProfesores.setText("Carga Masiva");
    cargaMasivaProfesores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cargaMasivaProfesoresActionPerformed(evt);
      }
    });

    crearNuevoProfesor.setText("Crear");
    crearNuevoProfesor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        crearNuevoProfesorActionPerformed(evt);
      }
    });

    actualizarDatosProfesor.setText("Actualizar");
    actualizarDatosProfesor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarDatosProfesorActionPerformed(evt);
      }
    });

    exportarPDFProfesores.setText("Exportar Listado a PDF");
    exportarPDFProfesores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exportarPDFProfesoresActionPerformed(evt);
      }
    });

    eliminarProfesorBtn.setText("Eliminar");
    eliminarProfesorBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        eliminarProfesorBtnActionPerformed(evt);
      }
    });

    tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Código", "Nombre", "Apellido", "Correo", "Género"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane2.setViewportView(tablaProfesores);

    refrescarTablaProfesores.setText("Refrescar Datos de Tabla");
    refrescarTablaProfesores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        refrescarTablaProfesoresActionPerformed(evt);
      }
    });

    panelProfesoresGrafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout panelProfesoresGraficaLayout = new javax.swing.GroupLayout(panelProfesoresGrafica);
    panelProfesoresGrafica.setLayout(panelProfesoresGraficaLayout);
    panelProfesoresGraficaLayout.setHorizontalGroup(
      panelProfesoresGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    panelProfesoresGraficaLayout.setVerticalGroup(
      panelProfesoresGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 244, Short.MAX_VALUE)
    );

    graficaProfesoresBtn.setText("Mostrar gráfica de pastel");
    graficaProfesoresBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        graficaProfesoresBtnActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelProfesoresLayout = new javax.swing.GroupLayout(panelProfesores);
    panelProfesores.setLayout(panelProfesoresLayout);
    panelProfesoresLayout.setHorizontalGroup(
      panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfesoresLayout.createSequentialGroup()
        .addGap(52, 52, 52)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelProfesoresLayout.createSequentialGroup()
            .addGap(95, 95, 95)
            .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(actualizarDatosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(crearNuevoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(91, 91, 91)
            .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(cargaMasivaProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(eliminarProfesorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 95, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfesoresLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exportarPDFProfesores)
            .addGap(159, 159, 159))
          .addGroup(panelProfesoresLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(panelProfesoresGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())))
      .addGroup(panelProfesoresLayout.createSequentialGroup()
        .addGap(193, 193, 193)
        .addComponent(refrescarTablaProfesores)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(graficaProfesoresBtn)
        .addGap(154, 154, 154))
    );
    panelProfesoresLayout.setVerticalGroup(
      panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelProfesoresLayout.createSequentialGroup()
        .addGap(46, 46, 46)
        .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(panelProfesoresLayout.createSequentialGroup()
            .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(crearNuevoProfesor)
              .addComponent(cargaMasivaProfesores))
            .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelProfesoresLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(eliminarProfesorBtn))
              .addGroup(panelProfesoresLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(actualizarDatosProfesor)))
            .addGap(18, 18, 18)
            .addComponent(exportarPDFProfesores)
            .addGap(18, 18, 18)
            .addComponent(panelProfesoresGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(refrescarTablaProfesores)
          .addComponent(graficaProfesoresBtn))
        .addContainerGap(24, Short.MAX_VALUE))
    );

    panelesAdmin.addTab("Profesores", panelProfesores);

    cargaMasivaCursos.setText("Carga Masiva");
    cargaMasivaCursos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cargaMasivaCursosActionPerformed(evt);
      }
    });

    crearNuevoCurso.setText("Crear");
    crearNuevoCurso.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        crearNuevoCursoActionPerformed(evt);
      }
    });

    actualizarDatosCurso.setText("Actualizar");
    actualizarDatosCurso.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarDatosCursoActionPerformed(evt);
      }
    });

    exportarPDFCursos.setText("Exportar Listado a PDF");
    exportarPDFCursos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exportarPDFCursosActionPerformed(evt);
      }
    });

    eliminarCursoBtn.setText("Eliminar");
    eliminarCursoBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        eliminarCursoBtnActionPerformed(evt);
      }
    });

    tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Código", "Nombre", "Creditos", "Alumnos", "Profesor"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane3.setViewportView(tablaCursos);

    refrescarTablaCursos.setText("Refrescar Datos de Tabla");
    refrescarTablaCursos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        refrescarTablaCursosActionPerformed(evt);
      }
    });

    graficaCursosBtn.setText("Mostrar gráfica de barras");
    graficaCursosBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        graficaCursosBtnActionPerformed(evt);
      }
    });

    panelCursosGrafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout panelCursosGraficaLayout = new javax.swing.GroupLayout(panelCursosGrafica);
    panelCursosGrafica.setLayout(panelCursosGraficaLayout);
    panelCursosGraficaLayout.setHorizontalGroup(
      panelCursosGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 457, Short.MAX_VALUE)
    );
    panelCursosGraficaLayout.setVerticalGroup(
      panelCursosGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 212, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout panelCursosLayout = new javax.swing.GroupLayout(panelCursos);
    panelCursos.setLayout(panelCursosLayout);
    panelCursosLayout.setHorizontalGroup(
      panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCursosLayout.createSequentialGroup()
        .addGap(64, 64, 64)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelCursosLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelCursosLayout.createSequentialGroup()
                .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(crearNuevoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(actualizarDatosCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cargaMasivaCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(eliminarCursoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(panelCursosLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(exportarPDFCursos)))
            .addGap(77, 77, 77))
          .addGroup(panelCursosLayout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(panelCursosGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(14, Short.MAX_VALUE))))
      .addGroup(panelCursosLayout.createSequentialGroup()
        .addGap(182, 182, 182)
        .addComponent(refrescarTablaCursos)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(graficaCursosBtn)
        .addGap(136, 136, 136))
    );
    panelCursosLayout.setVerticalGroup(
      panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelCursosLayout.createSequentialGroup()
        .addGap(39, 39, 39)
        .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panelCursosLayout.createSequentialGroup()
            .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(cargaMasivaCursos)
              .addComponent(crearNuevoCurso))
            .addGap(27, 27, 27)
            .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(actualizarDatosCurso)
              .addComponent(eliminarCursoBtn))
            .addGap(33, 33, 33)
            .addComponent(exportarPDFCursos)
            .addGap(18, 18, 18)
            .addComponent(panelCursosGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(refrescarTablaCursos)
          .addComponent(graficaCursosBtn))
        .addContainerGap(31, Short.MAX_VALUE))
    );

    panelesAdmin.addTab("Cursos", panelCursos);

    panelAlumnos.setForeground(new java.awt.Color(60, 63, 65));

    cargaMasivaEstudiantes.setText("Carga Masiva");
    cargaMasivaEstudiantes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cargaMasivaEstudiantesActionPerformed(evt);
      }
    });

    exportarPDFEstudiantes.setText("Exportar Listado a PDF");
    exportarPDFEstudiantes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exportarPDFEstudiantesActionPerformed(evt);
      }
    });

    tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Código", "Nombre", "Apellido", "Correo", "Género"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane4.setViewportView(tablaAlumnos);

    refrescarTablaAlumnos.setText("Refrescar Datos de Tabla");
    refrescarTablaAlumnos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        refrescarTablaAlumnosActionPerformed(evt);
      }
    });

    panelEstudiantesGrafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout panelEstudiantesGraficaLayout = new javax.swing.GroupLayout(panelEstudiantesGrafica);
    panelEstudiantesGrafica.setLayout(panelEstudiantesGraficaLayout);
    panelEstudiantesGraficaLayout.setHorizontalGroup(
      panelEstudiantesGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 466, Short.MAX_VALUE)
    );
    panelEstudiantesGraficaLayout.setVerticalGroup(
      panelEstudiantesGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 244, Short.MAX_VALUE)
    );

    graficaAlumnosBtn.setText("Mostrar gráfica de pastel");
    graficaAlumnosBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        graficaAlumnosBtnActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelAlumnosLayout = new javax.swing.GroupLayout(panelAlumnos);
    panelAlumnos.setLayout(panelAlumnosLayout);
    panelAlumnosLayout.setHorizontalGroup(
      panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlumnosLayout.createSequentialGroup()
        .addGap(61, 61, 61)
        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelAlumnosLayout.createSequentialGroup()
            .addComponent(panelEstudiantesGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(16, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlumnosLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(cargaMasivaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(exportarPDFEstudiantes))
            .addGap(154, 154, 154))))
      .addGroup(panelAlumnosLayout.createSequentialGroup()
        .addGap(185, 185, 185)
        .addComponent(refrescarTablaAlumnos)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(graficaAlumnosBtn)
        .addGap(147, 147, 147))
    );
    panelAlumnosLayout.setVerticalGroup(
      panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelAlumnosLayout.createSequentialGroup()
        .addGap(34, 34, 34)
        .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelAlumnosLayout.createSequentialGroup()
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addComponent(refrescarTablaAlumnos))
          .addGroup(panelAlumnosLayout.createSequentialGroup()
            .addComponent(cargaMasivaEstudiantes)
            .addGap(31, 31, 31)
            .addComponent(exportarPDFEstudiantes)
            .addGap(69, 69, 69)
            .addComponent(panelEstudiantesGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(44, 44, 44)
            .addComponent(graficaAlumnosBtn)))
        .addContainerGap(28, Short.MAX_VALUE))
    );

    panelesAdmin.addTab("Alumnos", panelAlumnos);

    cerrarSesion.setText("CERRAR SESIÓN");
    cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarSesionActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
    jLabel1.setText("MODULO ADMIN");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(panelesAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(441, 441, 441)
            .addComponent(jLabel1)))
        .addContainerGap(23, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(cerrarSesion)
        .addGap(461, 461, 461))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(panelesAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(cerrarSesion)
        .addContainerGap(58, Short.MAX_VALUE))
    );

    panelesAdmin.getAccessibleContext().setAccessibleName("Profesores");

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Funciones de Eventos
  private void crearNuevoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNuevoProfesorActionPerformed
    this.agregarProfesorPantalla.setVisible(true);
  }//GEN-LAST:event_crearNuevoProfesorActionPerformed

  private void actualizarDatosProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDatosProfesorActionPerformed
    this.actualizarProfesorPantalla.setVisible(true);
  }//GEN-LAST:event_actualizarDatosProfesorActionPerformed

  private void crearNuevoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNuevoCursoActionPerformed
    this.agregarCursoPantalla.setVisible(true);
    this.agregarCursoPantalla.actualizarComboBoxProfesores();
  }//GEN-LAST:event_crearNuevoCursoActionPerformed

  private void actualizarDatosCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDatosCursoActionPerformed
    this.actualizarCursoPantalla.setVisible(true);
    this.actualizarCursoPantalla.actualizarComboBoxProfesores();
  }//GEN-LAST:event_actualizarDatosCursoActionPerformed

  private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
    this.dispose();
    Login login = new Login();
    login.setVisible(true);
  }//GEN-LAST:event_cerrarSesionActionPerformed

  private void refrescarTablaProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarTablaProfesoresActionPerformed
    mostrarListadoProfesores();   
  }//GEN-LAST:event_refrescarTablaProfesoresActionPerformed

  private void refrescarTablaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarTablaAlumnosActionPerformed
    mostrarListadoAlumnos();
  }//GEN-LAST:event_refrescarTablaAlumnosActionPerformed

  private void refrescarTablaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarTablaCursosActionPerformed
     mostrarListadoCursos();
  }//GEN-LAST:event_refrescarTablaCursosActionPerformed

  private void eliminarProfesorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProfesorBtnActionPerformed
    int selectedRow = tablaProfesores.getSelectedRow();                                                       // Get the selected row index from the JTable
    
    if (selectedRow >= 0) {                                                                                   // Check if a row is selected
      int codigoUsuario = (int) tablaProfesores.getValueAt(selectedRow, 0);                        // Get the value of the "Código" column from the selected row
      System.out.println("Selected Código: " + codigoUsuario);
      boolean validCodeToDelete = profesorAgregar.checkearCodigoRepetido(codigoUsuario);
      if(validCodeToDelete) {
        int indexProfesorArray = encontrarIndexProfesorConCodigo(codigoUsuario);
        Administrador.arrayProfesores.remove(indexProfesorArray);
        mostrarListadoProfesores(); 
      }
    } else {
      System.out.println("No row selected");
    }
  }//GEN-LAST:event_eliminarProfesorBtnActionPerformed

  private void eliminarCursoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCursoBtnActionPerformed
    int selectedRow = tablaCursos.getSelectedRow();                                                       // Get the selected row index from the JTable
    
    if (selectedRow >= 0) {                                                                                   // Check if a row is selected
      int codigoCurso = (int) tablaCursos.getValueAt(selectedRow, 0);                        // Get the value of the "Código" column from the selected row
      System.out.println("Selected Código: " + codigoCurso);
      boolean validCodeToDelete = cursoAgregar.checkearCodigoRepetido(codigoCurso);
      if(validCodeToDelete) {
        int indexCursoArray = encontrarIndexCursoConCodigo(codigoCurso);
        Administrador.arrayCursos.remove(indexCursoArray);
        mostrarListadoCursos();
      }
    } else {
      System.out.println("No row selected");
    }
  }//GEN-LAST:event_eliminarCursoBtnActionPerformed

  private void graficaCursosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaCursosBtnActionPerformed
    actualizarGraficaBarrasCursos();
  }//GEN-LAST:event_graficaCursosBtnActionPerformed

  private void graficaProfesoresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaProfesoresBtnActionPerformed
    actualizarGraficaPastelProfesores();
  }//GEN-LAST:event_graficaProfesoresBtnActionPerformed

  private void exportarPDFProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarPDFProfesoresActionPerformed
    PlantillaPDF miPlantilla = new PlantillaPDF("Fernando", "Jose", "20/20/20");
    try {
      miPlantilla.crearPlantillaProfesores();
    } catch (DocumentException ex) {
      Logger.getLogger(moduloAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    try{
      File path = new File("Lista de Profesores.pdf");
      Desktop.getDesktop().open(path);
    }catch (Exception ex){
      JOptionPane.showMessageDialog(null, ex, "Atención", 2);
    }
  }//GEN-LAST:event_exportarPDFProfesoresActionPerformed

  private void exportarPDFCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarPDFCursosActionPerformed
    PlantillaPDF miPlantilla = new PlantillaPDF("Fernando", "Jose", "20/20/20");
    try {
      miPlantilla.crearPlantillaCursos();
    } catch (DocumentException ex) {
      Logger.getLogger(moduloAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    try{
      File path = new File("Lista de Cursos.pdf");
      Desktop.getDesktop().open(path);
    }catch (Exception ex){
      JOptionPane.showMessageDialog(null, ex, "Atención", 2);
    }
  }//GEN-LAST:event_exportarPDFCursosActionPerformed

  private void cargaMasivaProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaMasivaProfesoresActionPerformed
    JFileChooser lectorDeArchivos = new JFileChooser();
    FileNameExtensionFilter filtroArchivo = new FileNameExtensionFilter(".csv", "csv");
    lectorDeArchivos.setFileFilter(filtroArchivo);
    int respuestaFileChooser = lectorDeArchivos.showOpenDialog(this);                                        // Abre el menú del dialogo para subir archivos y guarda la respuesta si es archivo valido
    
    if (respuestaFileChooser == JFileChooser.APPROVE_OPTION) {
      String ruta = lectorDeArchivos.getSelectedFile().getAbsolutePath();
      
      try {
        BufferedReader mybufferReader = new BufferedReader(new FileReader(ruta));
        String line;
        mybufferReader.readLine();                                                                                  // Saltamos la primera linea donde esta los nombres de las columnas
        while ((line = mybufferReader.readLine()) != null) {                                                        // Primero guardamos el valor de linea actual del csv al ejecutar lo que esta adentro de parentesis y luego validamos si la linea es igual a 'null'
          String[] data = line.split(",");                                                                     // Usamos el método 'split(,)' para crear un Array con los valores de cada columna que estan separador por comas
          if (data.length == 5) {
            int codigo = Integer.parseInt(data[0]);
            String nombre = data[1];
            String apellido = data[2];
            String correo = data[3];
            String genero = data[4];
            
            Profesor profesor = new Profesor(codigo, nombre, apellido, correo, genero, "1234");             // Se coloca contraseña por defecto "1234"
            Administrador.arrayProfesores.add(profesor);
          } else {
            JOptionPane.showMessageDialog(this, "❌ El CSV no tiene 5 columnas exactas ❌");
          }
        }
        
        mybufferReader.close();
        mostrarListadoProfesores();                                                                                 // Refresh the JTable with updated data
        actualizarGraficaPastelProfesores();
        
        persistenciaDatosProfesores();
        
        JOptionPane.showMessageDialog(this, "✅ Carga masiva de profesores completada ✅");      // Inform the user about successful loading
      } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error al cargar el archivo CSV ❌");
      } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error de formato en el archivo CSV ❌");
      }
    }
  }//GEN-LAST:event_cargaMasivaProfesoresActionPerformed

  private void cargaMasivaEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaMasivaEstudiantesActionPerformed
    JFileChooser lectorDeArchivos = new JFileChooser();
    FileNameExtensionFilter filtroArchivo = new FileNameExtensionFilter(".csv", "csv");
    lectorDeArchivos.setFileFilter(filtroArchivo);
    int respuestaFileChooser = lectorDeArchivos.showOpenDialog(this);                                        // Abre el menú del dialogo para subir archivos y guarda la respuesta si es archivo valido
    
    if (respuestaFileChooser == JFileChooser.APPROVE_OPTION) {
      String ruta = lectorDeArchivos.getSelectedFile().getAbsolutePath();
      
      try {
        BufferedReader mybufferReader = new BufferedReader(new FileReader(ruta));
        String line;
        mybufferReader.readLine();                                                                                  // Saltamos la primera linea donde esta los nombres de las columnas
        while ((line = mybufferReader.readLine()) != null) {                                                        // Primero guardamos el valor de linea actual del csv al ejecutar lo que esta adentro de parentesis y luego validamos si la linea es igual a 'null'
          String[] data = line.split(",");                                                                     // Usamos el método 'split(,)' para crear un Array con los valores de cada columna que estan separador por comas
          if (data.length == 5) {
            int codigo = Integer.parseInt(data[0]);
            String nombre = data[1];
            String apellido = data[2];
            String correo = data[3];
            String genero = data[4];
            
            Alumno alumno = new Alumno(codigo, nombre, apellido, correo, genero, "1234");             // Se coloca contraseña por defecto "1234"
            Administrador.arrayAlumnos.add(alumno);
          } else {
            JOptionPane.showMessageDialog(this, "❌ El CSV no tiene 5 columnas exactas ❌");
          }
        }
        
        mybufferReader.close();
        mostrarListadoAlumnos();                                                                                    // Refresh the JTable with updated data
        actualizarGraficaPastelAlumnos();
        
        JOptionPane.showMessageDialog(this, "✅ Carga masiva de profesores completada ✅");      // Inform the user about successful loading
      } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error al cargar el archivo CSV ❌");
      } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error de formato en el archivo CSV ❌");
      }
    }
  }//GEN-LAST:event_cargaMasivaEstudiantesActionPerformed

  private void graficaAlumnosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaAlumnosBtnActionPerformed
    actualizarGraficaPastelAlumnos();
  }//GEN-LAST:event_graficaAlumnosBtnActionPerformed

  private void exportarPDFEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarPDFEstudiantesActionPerformed
    PlantillaPDF miPlantilla = new PlantillaPDF("Fernando", "Jose", "20/20/20");
    try {
      miPlantilla.crearPlantillaAlumnos();
    } catch (DocumentException ex) {
      Logger.getLogger(moduloAdmin.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    try{
      File path = new File("Lista de Alumnos.pdf");
      Desktop.getDesktop().open(path);
    }catch (Exception ex){
      JOptionPane.showMessageDialog(null, ex, "Atención", 2);
    }
  }//GEN-LAST:event_exportarPDFEstudiantesActionPerformed

  private void cargaMasivaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaMasivaCursosActionPerformed
    JFileChooser lectorDeArchivos = new JFileChooser();
    FileNameExtensionFilter filtroArchivo = new FileNameExtensionFilter(".csv", "csv");
    lectorDeArchivos.setFileFilter(filtroArchivo);
    int respuestaFileChooser = lectorDeArchivos.showOpenDialog(this);                                        // Abre el menú del dialogo para subir archivos y guarda la respuesta si es archivo valido
    
    if (respuestaFileChooser == JFileChooser.APPROVE_OPTION) {
      String ruta = lectorDeArchivos.getSelectedFile().getAbsolutePath();
      
      try {
        BufferedReader mybufferReader = new BufferedReader(new FileReader(ruta));
        String line;
        mybufferReader.readLine();                                                                                  // Saltamos la primera linea donde esta los nombres de las columnas
        while ((line = mybufferReader.readLine()) != null) {                                                        // Primero guardamos el valor de linea actual del csv al ejecutar lo que esta adentro de parentesis y luego validamos si la linea es igual a 'null'
          String[] data = line.split(",");                                                                     // Usamos el método 'split(,)' para crear un Array con los valores de cada columna que estan separador por comas
          if (data.length == 4) {
            int codigo = Integer.parseInt(data[0]);
            String nombre = data[1];
            int creditos =  Integer.parseInt(data[2]);
            String profesor = data[3];
            
            Curso curso = new Curso(codigo, nombre, creditos, profesor);             
            Administrador.arrayCursos.add(curso);
          } else {
            JOptionPane.showMessageDialog(this, "❌ El CSV no tiene 4 columnas exactas ❌");
          }
        }
        
        mybufferReader.close();
        mostrarListadoCursos();                                                                                    // Refresh the JTable with updated data
        actualizarGraficaBarrasCursos();
        
        JOptionPane.showMessageDialog(this, "✅ Carga masiva de profesores completada ✅");      // Inform the user about successful loading
      } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error al cargar el archivo CSV ❌");
      } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error de formato en el archivo CSV ❌");
      }
    }
  }//GEN-LAST:event_cargaMasivaCursosActionPerformed

  
  // Funciones para actualizar Tablas
  public void mostrarListadoProfesores() {
    tablaProfesores.setAutoCreateRowSorter(true); 
    DefaultTableModel model = new DefaultTableModel();                                  
    model.setColumnIdentifiers(new String[] {"Código", "Nombre", "Apellido", "Correo", "Género"});
    
    for (Profesor profesor : Administrador.arrayProfesores) {                                         // Iteramos a traves del Array de Profesores y creamos un objeto con los datos de los profesores y los agregamos a la tabla
      Object[] rowData = new Object[] {
        profesor.getCodigo(),
        profesor.getNombre(),
        profesor.getApellido(),
        profesor.getCorreo(),
        profesor.getGenero()
      };
      model.addRow(rowData);
    }
    
    tablaProfesores.setModel(model);                                                          // Agregamos el model a la tabla de profesores
    System.out.println("Se actualizaron las filas de Profesores");
  }
  
  
  public void mostrarListadoAlumnos() {
    tablaAlumnos.setAutoCreateRowSorter(true); 
    DefaultTableModel model = new DefaultTableModel();                          
    model.setColumnIdentifiers(new String[] {"Código", "Nombre", "Apellido", "Correo", "Género"});
    
    for (Alumno alumno : Administrador.arrayAlumnos) {                   
      Object[] rowData = new Object[] {
        alumno.getCodigo(),
        alumno.getNombre(),
        alumno.getApellido(),
        alumno.getCorreo(),
        alumno.getGenero()
      };
      model.addRow(rowData);
    }
    
    tablaAlumnos.setModel(model);                                    
    System.out.println("Se actualizaron las filas de Alumnos");
  }
  
  
  public void mostrarListadoCursos() {
    tablaCursos.setAutoCreateRowSorter(true); 
    DefaultTableModel model = new DefaultTableModel();                          
    model.setColumnIdentifiers(new String[] {"Código", "Nombre", "Creditos", "Alumnos", "Profesor"});
    
    for (Curso curso : Administrador.arrayCursos) {                   
      Object[] rowData = new Object[] {
        curso.getCodigo(),
        curso.getNombre(),
        curso.getCreditos(),
        curso.getAlumnos(),
        curso.getProfesor()
      };
      model.addRow(rowData);
    }
    
    tablaCursos.setModel(model);                                    
    System.out.println("Se actualizaron las filas de Alumnos");
  }
  
  
  private int encontrarIndexProfesorConCodigo(int codigoUsuario) {
    for (int i = 0; i < Administrador.arrayProfesores.size(); i++) {
      Profesor profesor = Administrador.arrayProfesores.get(i);
      if (profesor.getCodigo() == codigoUsuario) return i;                        // Regresa el index del profesor que encontró e hizo match
    }
    return -1;                                                                    // Si retorna -1 es porque no encontro al profesor
  }
  
  
  private int encontrarIndexCursoConCodigo(int codigoCurso) {
    for (int i = 0; i < Administrador.arrayCursos.size(); i++) {
      Curso curso = Administrador.arrayCursos.get(i);
      if (curso.getCodigo() == codigoCurso) return i;
    }
    return -1;                                                                    
  }
  
  
  public void actualizarGraficaBarrasCursos() {
    DefaultCategoryDataset datos = new DefaultCategoryDataset();
    bubbleSort(Administrador.arrayCursos);
    int cursosConAlumnos = 0;
    
    for (Curso curso : Administrador.arrayCursos) {  
      if(curso.getAlumnos() > 0){
        cursosConAlumnos++;
      }
    }
    
    System.out.println("Cursos con alumnos: " + cursosConAlumnos);
    
    if(cursosConAlumnos == 1) datos.setValue(Administrador.arrayCursos.get(0).getAlumnos(),"Alumnos",Administrador.arrayCursos.get(0).getNombre());
    if(cursosConAlumnos == 2) {
      datos.setValue(Administrador.arrayCursos.get(0).getAlumnos(),"Alumnos",Administrador.arrayCursos.get(0).getNombre());
      datos.setValue(Administrador.arrayCursos.get(1).getAlumnos(),"Alumnos",Administrador.arrayCursos.get(1).getNombre());
    }
    if(cursosConAlumnos >= 3) {
      datos.setValue(Administrador.arrayCursos.get(0).getAlumnos(),"Alumnos",Administrador.arrayCursos.get(0).getNombre());
      datos.setValue(Administrador.arrayCursos.get(1).getAlumnos(),"Alumnos",Administrador.arrayCursos.get(1).getNombre());
      datos.setValue(Administrador.arrayCursos.get(2).getAlumnos(),"Alumnos",Administrador.arrayCursos.get(2).getNombre());
    }
    
    
    JFreeChart graficaBarras = ChartFactory.createBarChart3D("Top 3 Cursos con más estudiantes",
            "Alumnos por Curso",
            "# Estudiantes",
            datos,
            PlotOrientation.VERTICAL,
            true,
            true,
            false);
    
    if (panelCursosGrafica.getComponentCount() > 0) panelCursosGrafica.remove(0); 
    
    ChartPanel panel = new ChartPanel(graficaBarras);
    panel.setMouseWheelEnabled(true);
    panel.setPreferredSize(new Dimension(440,230));
    panelCursosGrafica.setLayout(new BorderLayout());
    panelCursosGrafica.add(panel, BorderLayout.NORTH);
    
    pack();
    repaint();
  }
  
  
  public void actualizarGraficaPastelProfesores(){
    DefaultPieDataset pieDataset = new DefaultPieDataset();
    int totalProfesores = Administrador.arrayProfesores.size();
    int countMasculino = 0;
    int countFemenino = 0;
    
    for (Profesor profesor : Administrador.arrayProfesores) {
      if (profesor.getGenero().equals("m")) countMasculino++; 
      if (profesor.getGenero().equals("f")) countFemenino++;
    }
    
    double percentMasculino = (double) countMasculino / totalProfesores * 100;
    double percentFemenino = (double) countFemenino / totalProfesores * 100;
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    String formattedPercentMasculino = decimalFormat.format(percentMasculino);
    String formattedPercentFemenino = decimalFormat.format(percentFemenino);
    
    pieDataset.setValue("Masculino " + formattedPercentMasculino + "%", countMasculino);
    pieDataset.setValue("Femenino " + formattedPercentFemenino + "%", countFemenino);
    
    JFreeChart graficaPie = ChartFactory.createPieChart("Género de Profesores", pieDataset, true, true, true);
    
    if (panelProfesoresGrafica.getComponentCount() > 0) panelProfesoresGrafica.remove(0);                                   // Remove the old chart panel
        
    ChartPanel panel = new ChartPanel(graficaPie);
    panel.setMouseWheelEnabled(true);
    panel.setPreferredSize(new Dimension(400,270));
    panelProfesoresGrafica.setLayout(new BorderLayout());
    panelProfesoresGrafica.add(panel, BorderLayout.NORTH);
    System.out.println("Gráfica actualizada");
    pack();
    repaint();
  }
  
  
  public void actualizarGraficaPastelAlumnos(){
    DefaultPieDataset pieDataset = new DefaultPieDataset();
    int totalAlumnos = Administrador.arrayAlumnos.size();
    int countMasculino = 0;
    int countFemenino = 0;
    
    for (Alumno alumno : Administrador.arrayAlumnos) {
      if (alumno.getGenero().equals("m")) countMasculino++; 
      if (alumno.getGenero().equals("f")) countFemenino++;
    }
    
    double percentMasculino = (double) countMasculino / totalAlumnos * 100;
    double percentFemenino = (double) countFemenino / totalAlumnos * 100;
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    String formattedPercentMasculino = decimalFormat.format(percentMasculino);
    String formattedPercentFemenino = decimalFormat.format(percentFemenino);
    
    pieDataset.setValue("Masculino " + formattedPercentMasculino + "%", countMasculino);
    pieDataset.setValue("Femenino " + formattedPercentFemenino + "%", countFemenino);
    
    JFreeChart graficaPie = ChartFactory.createPieChart("Género de Alumnos", pieDataset, true, true, true);
    
    if (panelEstudiantesGrafica.getComponentCount() > 0) panelEstudiantesGrafica.remove(0);                                   // Remove the old chart panel
        
    ChartPanel panel = new ChartPanel(graficaPie);
    panel.setMouseWheelEnabled(true);
    panel.setPreferredSize(new Dimension(400,270));
    panelEstudiantesGrafica.setLayout(new BorderLayout());
    panelEstudiantesGrafica.add(panel, BorderLayout.NORTH);
    System.out.println("Gráfica actualizada");
    pack();
    repaint();
  }
  
  
  public static void bubbleSort(ArrayList<Curso> cursos) {
    int n = cursos.size();
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (cursos.get(j).getAlumnos() < cursos.get(j + 1).getAlumnos()) {
          // Swap cursos[j] and cursos[j+1]
          Curso temp = cursos.get(j);
          cursos.set(j, cursos.get(j + 1));
          cursos.set(j + 1, temp);
        }
      }
    }
 }
  
  
  // Persistencia de Datos
  public static void persistenciaDatosProfesores() throws IOException {
    FileOutputStream archivoDeSalida = new FileOutputStream("/Users/fernandoorozco/Desktop/Registros_Profesores.bin");
    ObjectOutputStream objectoOutput = new ObjectOutputStream(archivoDeSalida);
    objectoOutput.writeObject(Administrador.arrayProfesores);
    System.out.println(Administrador.arrayProfesores.get(0).getNombre());
    System.out.println(Administrador.arrayProfesores.get(0).getApellido());
    System.out.println(Administrador.arrayProfesores);
    archivoDeSalida.close();
    objectoOutput.close();
    System.out.println("Se guardaron los datos de los profesores PERSISTENCIA ");
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
      java.util.logging.Logger.getLogger(moduloAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(moduloAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(moduloAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(moduloAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(() -> {
      new moduloAdmin().setVisible(true);
    });
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton actualizarDatosCurso;
  private javax.swing.JButton actualizarDatosProfesor;
  private javax.swing.JButton cargaMasivaCursos;
  private javax.swing.JButton cargaMasivaEstudiantes;
  private javax.swing.JButton cargaMasivaProfesores;
  private javax.swing.JButton cerrarSesion;
  private javax.swing.JButton crearNuevoCurso;
  private javax.swing.JButton crearNuevoProfesor;
  private javax.swing.JButton eliminarCursoBtn;
  private javax.swing.JButton eliminarProfesorBtn;
  private javax.swing.JButton exportarPDFCursos;
  private javax.swing.JButton exportarPDFEstudiantes;
  private javax.swing.JButton exportarPDFProfesores;
  private javax.swing.JButton graficaAlumnosBtn;
  private javax.swing.JButton graficaCursosBtn;
  private javax.swing.JButton graficaProfesoresBtn;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JPanel panelAlumnos;
  private javax.swing.JPanel panelCursos;
  private javax.swing.JPanel panelCursosGrafica;
  private javax.swing.JPanel panelEstudiantesGrafica;
  private javax.swing.JPanel panelProfesores;
  private javax.swing.JPanel panelProfesoresGrafica;
  private javax.swing.JTabbedPane panelesAdmin;
  private javax.swing.JButton refrescarTablaAlumnos;
  private javax.swing.JButton refrescarTablaCursos;
  private javax.swing.JButton refrescarTablaProfesores;
  private javax.swing.JTable tablaAlumnos;
  private javax.swing.JTable tablaCursos;
  private javax.swing.JTable tablaProfesores;
  // End of variables declaration//GEN-END:variables
}
