package pantallas;

import clases.Administrador;
import clases.Alumno;
import clases.Curso;
import clases.Profesor;
import javax.swing.table.DefaultTableModel;

public class moduloAdmin extends javax.swing.JFrame {
  profesorAgregar agregarProfesorPantalla = new profesorAgregar();
  profesorActualizar actualizarProfesorPantalla = new profesorActualizar();
  cursoAgregar agregarCursoPantalla = new cursoAgregar();
  cursoActualizar actualizarCursoPantalla = new cursoActualizar();
  
  
  public moduloAdmin() {
    initComponents();
    mostrarListadoProfesores();
  }

  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelesAdmin = new javax.swing.JTabbedPane();
    panelProfesores = new javax.swing.JPanel();
    cargaMasivaBtn1 = new javax.swing.JButton();
    crearBtn1 = new javax.swing.JButton();
    actualizarBtn1 = new javax.swing.JButton();
    exportarPDFBtn1 = new javax.swing.JButton();
    eliminarProfesorBtn = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaProfesores = new javax.swing.JTable();
    refrescarTablaProfesores = new javax.swing.JButton();
    panelCursos = new javax.swing.JPanel();
    cargaMasivaBtn2 = new javax.swing.JButton();
    crearBtn2 = new javax.swing.JButton();
    actualizarBtn2 = new javax.swing.JButton();
    exportarPDFBtn2 = new javax.swing.JButton();
    eliminarCursoBtn = new javax.swing.JButton();
    jScrollPane3 = new javax.swing.JScrollPane();
    tablaCursos = new javax.swing.JTable();
    refrescarTablaCursos = new javax.swing.JButton();
    panelAlumnos = new javax.swing.JPanel();
    cargaMasivaBtn3 = new javax.swing.JButton();
    exportarPDFBtn3 = new javax.swing.JButton();
    jScrollPane4 = new javax.swing.JScrollPane();
    tablaAlumnos = new javax.swing.JTable();
    refrescarTablaAlumnos = new javax.swing.JButton();
    cerrarSesion = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(153, 153, 153));

    panelesAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    cargaMasivaBtn1.setText("Carga Masiva");

    crearBtn1.setText("Crear");
    crearBtn1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        crearBtn1ActionPerformed(evt);
      }
    });

    actualizarBtn1.setText("Actualizar");
    actualizarBtn1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarBtn1ActionPerformed(evt);
      }
    });

    exportarPDFBtn1.setText("Exportar Listado a PDF");

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

    javax.swing.GroupLayout panelProfesoresLayout = new javax.swing.GroupLayout(panelProfesores);
    panelProfesores.setLayout(panelProfesoresLayout);
    panelProfesoresLayout.setHorizontalGroup(
      panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfesoresLayout.createSequentialGroup()
        .addGap(52, 52, 52)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
        .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelProfesoresLayout.createSequentialGroup()
            .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(crearBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(actualizarBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(58, 58, 58)
            .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(cargaMasivaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(eliminarProfesorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(panelProfesoresLayout.createSequentialGroup()
            .addGap(65, 65, 65)
            .addComponent(exportarPDFBtn1)))
        .addGap(64, 64, 64))
      .addGroup(panelProfesoresLayout.createSequentialGroup()
        .addGap(193, 193, 193)
        .addComponent(refrescarTablaProfesores)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panelProfesoresLayout.setVerticalGroup(
      panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelProfesoresLayout.createSequentialGroup()
        .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelProfesoresLayout.createSequentialGroup()
            .addGap(116, 116, 116)
            .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(cargaMasivaBtn1)
              .addComponent(crearBtn1))
            .addGap(27, 27, 27)
            .addGroup(panelProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(actualizarBtn1)
              .addComponent(eliminarProfesorBtn))
            .addGap(33, 33, 33)
            .addComponent(exportarPDFBtn1))
          .addGroup(panelProfesoresLayout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(refrescarTablaProfesores)
        .addContainerGap(24, Short.MAX_VALUE))
    );

    panelesAdmin.addTab("Profesores", panelProfesores);

    cargaMasivaBtn2.setText("Carga Masiva");

    crearBtn2.setText("Crear");
    crearBtn2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        crearBtn2ActionPerformed(evt);
      }
    });

    actualizarBtn2.setText("Actualizar");
    actualizarBtn2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarBtn2ActionPerformed(evt);
      }
    });

    exportarPDFBtn2.setText("Exportar Listado a PDF");

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

    javax.swing.GroupLayout panelCursosLayout = new javax.swing.GroupLayout(panelCursos);
    panelCursos.setLayout(panelCursosLayout);
    panelCursosLayout.setHorizontalGroup(
      panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCursosLayout.createSequentialGroup()
        .addGap(64, 64, 64)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
        .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelCursosLayout.createSequentialGroup()
            .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(crearBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(actualizarBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(58, 58, 58)
            .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(cargaMasivaBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(eliminarCursoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(panelCursosLayout.createSequentialGroup()
            .addGap(65, 65, 65)
            .addComponent(exportarPDFBtn2)))
        .addGap(77, 77, 77))
      .addGroup(panelCursosLayout.createSequentialGroup()
        .addGap(182, 182, 182)
        .addComponent(refrescarTablaCursos)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panelCursosLayout.setVerticalGroup(
      panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelCursosLayout.createSequentialGroup()
        .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelCursosLayout.createSequentialGroup()
            .addGap(105, 105, 105)
            .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(cargaMasivaBtn2)
              .addComponent(crearBtn2))
            .addGap(27, 27, 27)
            .addGroup(panelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(actualizarBtn2)
              .addComponent(eliminarCursoBtn))
            .addGap(33, 33, 33)
            .addComponent(exportarPDFBtn2))
          .addGroup(panelCursosLayout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(refrescarTablaCursos)
        .addContainerGap(31, Short.MAX_VALUE))
    );

    panelesAdmin.addTab("Cursos", panelCursos);

    panelAlumnos.setForeground(new java.awt.Color(60, 63, 65));

    cargaMasivaBtn3.setText("Carga Masiva");

    exportarPDFBtn3.setText("Exportar Listado a PDF");

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

    javax.swing.GroupLayout panelAlumnosLayout = new javax.swing.GroupLayout(panelAlumnos);
    panelAlumnos.setLayout(panelAlumnosLayout);
    panelAlumnosLayout.setHorizontalGroup(
      panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlumnosLayout.createSequentialGroup()
        .addGap(61, 61, 61)
        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
        .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(exportarPDFBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cargaMasivaBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(121, 121, 121))
      .addGroup(panelAlumnosLayout.createSequentialGroup()
        .addGap(185, 185, 185)
        .addComponent(refrescarTablaAlumnos)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panelAlumnosLayout.setVerticalGroup(
      panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelAlumnosLayout.createSequentialGroup()
        .addGroup(panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelAlumnosLayout.createSequentialGroup()
            .addGap(181, 181, 181)
            .addComponent(cargaMasivaBtn3)
            .addGap(43, 43, 43)
            .addComponent(exportarPDFBtn3))
          .addGroup(panelAlumnosLayout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(26, 26, 26)
        .addComponent(refrescarTablaAlumnos)
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
  private void crearBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBtn1ActionPerformed
    this.agregarProfesorPantalla.setVisible(true);
  }//GEN-LAST:event_crearBtn1ActionPerformed

  private void actualizarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBtn1ActionPerformed
    this.actualizarProfesorPantalla.setVisible(true);
  }//GEN-LAST:event_actualizarBtn1ActionPerformed

  private void crearBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBtn2ActionPerformed
    this.agregarCursoPantalla.setVisible(true);
  }//GEN-LAST:event_crearBtn2ActionPerformed

  private void actualizarBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBtn2ActionPerformed
    this.actualizarCursoPantalla.setVisible(true);
  }//GEN-LAST:event_actualizarBtn2ActionPerformed

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

  // Funciones para actualizar Tablas
  public void mostrarListadoProfesores() {
    DefaultTableModel model = new DefaultTableModel();                                  // Create a DefaultTableModel with column names
    model.setColumnIdentifiers(new String[] {"Código", "Nombre", "Apellido", "Correo", "Género"});
    
    for (Profesor profesor : Administrador.arrayProfesores) {                           // Loop through the arrayProfesores and add data to the table model
      Object[] rowData = new Object[] {
        profesor.getCodigo(),
        profesor.getNombre(),
        profesor.getApellido(),
        profesor.getCorreo(),
        profesor.getGenero()
      };
      model.addRow(rowData);
    }
    
    tablaProfesores.setModel(model);                                    // Set the table model to the tablaProfesores
    System.out.println("Se actualizaron las filas de Profesores");
  }
  
  
  public void mostrarListadoAlumnos() {
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
      if (profesor.getCodigo() == codigoUsuario) return i;                        // Return the index if codigo matches
    }
    return -1;                                                                    // Return -1 if no matching codigo is found
  }
  
  private int encontrarIndexCursoConCodigo(int codigoCurso) {
    for (int i = 0; i < Administrador.arrayCursos.size(); i++) {
      Curso curso = Administrador.arrayCursos.get(i);
      if (curso.getCodigo() == codigoCurso) return i;
    }
    return -1;                                                                    
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
  private javax.swing.JButton actualizarBtn1;
  private javax.swing.JButton actualizarBtn2;
  private javax.swing.JButton cargaMasivaBtn1;
  private javax.swing.JButton cargaMasivaBtn2;
  private javax.swing.JButton cargaMasivaBtn3;
  private javax.swing.JButton cerrarSesion;
  private javax.swing.JButton crearBtn1;
  private javax.swing.JButton crearBtn2;
  private javax.swing.JButton eliminarCursoBtn;
  private javax.swing.JButton eliminarProfesorBtn;
  private javax.swing.JButton exportarPDFBtn1;
  private javax.swing.JButton exportarPDFBtn2;
  private javax.swing.JButton exportarPDFBtn3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JPanel panelAlumnos;
  private javax.swing.JPanel panelCursos;
  private javax.swing.JPanel panelProfesores;
  private javax.swing.JTabbedPane panelesAdmin;
  private javax.swing.JButton refrescarTablaAlumnos;
  private javax.swing.JButton refrescarTablaCursos;
  private javax.swing.JButton refrescarTablaProfesores;
  private javax.swing.JTable tablaAlumnos;
  private javax.swing.JTable tablaCursos;
  private javax.swing.JTable tablaProfesores;
  // End of variables declaration//GEN-END:variables
}
