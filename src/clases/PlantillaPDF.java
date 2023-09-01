package clases;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PlantillaPDF {
  String nombre;
  String apellido;
  String fecha;
  
  Document documento;
  FileOutputStream archivo;
  Paragraph titulo;
  
  
  public PlantillaPDF(String nombre, String apellido, String fecha) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fecha = fecha;
    
    documento = new Document();
    titulo = new Paragraph("Lista de Profesores");
  }
  
  
  public void crearPlantillaProfesores() throws DocumentException {
    try {
      archivo = new FileOutputStream("Lista de Profesores.pdf");
      PdfWriter.getInstance(documento, archivo);
      documento.open();
      titulo.setAlignment(1);
      
      documento.add(titulo);
      documento.add(new Paragraph("Nombre: " + nombre));
      documento.add(new Paragraph("Apellido: " + apellido));
      documento.add(Chunk.NEWLINE);
      
      documento.add(Chunk.NEWLINE);
      
      documento.add(new Paragraph("Fecha: " + fecha));
      documento.add(Chunk.NEWLINE);
      
      
      PdfPTable tabla = new PdfPTable(5);
      tabla.setWidthPercentage(100);
      
      PdfPCell codigo = new PdfPCell(new Phrase("codigo"));
      codigo.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell nombre = new PdfPCell(new Phrase("nombre"));
      nombre.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell apellido = new PdfPCell(new Phrase("apellido"));
      apellido.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell correo = new PdfPCell(new Phrase("correo"));
      correo.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell genero = new PdfPCell(new Phrase("genero"));
      genero.setBackgroundColor(BaseColor.ORANGE);
      
      tabla.addCell(codigo);
      tabla.addCell(nombre);
      tabla.addCell(apellido);
      tabla.addCell(correo);
      tabla.addCell(genero);
      
      for(Profesor profesor : Administrador.arrayProfesores){
        tabla.addCell(String.valueOf(profesor.getCodigo()));
        tabla.addCell(profesor.getNombre());
        tabla.addCell(profesor.getApellido());
        tabla.addCell(profesor.getCorreo());
        tabla.addCell(profesor.getGenero());
      }
      
      documento.add(tabla);
      documento.add(Chunk.NEWLINE);
      documento.add(new Paragraph("Archivo guardado como 'Lista de Profesores.pdf'"));
      documento.close();
      System.out.println("Archivo creado exitosamente");
      
      
    }catch(FileNotFoundException | DocumentException e){
      System.err.println(e.getMessage());
    }
  }
  
  
  public void crearPlantillaAlumnos() throws DocumentException {
    try {
      archivo = new FileOutputStream("Lista de Alumnos.pdf");
      PdfWriter.getInstance(documento, archivo);
      documento.open();
      titulo.setAlignment(1);
      
      documento.add(titulo);
      documento.add(new Paragraph("Nombre: " + nombre));
      documento.add(new Paragraph("Apellido: " + apellido));
      documento.add(Chunk.NEWLINE);
      
      documento.add(Chunk.NEWLINE);
      
      documento.add(new Paragraph("Fecha: " + fecha));
      documento.add(Chunk.NEWLINE);
      
      
      PdfPTable tabla = new PdfPTable(5);
      tabla.setWidthPercentage(100);
      
      PdfPCell codigo = new PdfPCell(new Phrase("codigo"));
      codigo.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell nombre = new PdfPCell(new Phrase("nombre"));
      nombre.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell apellido = new PdfPCell(new Phrase("apellido"));
      apellido.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell correo = new PdfPCell(new Phrase("correo"));
      correo.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell genero = new PdfPCell(new Phrase("genero"));
      genero.setBackgroundColor(BaseColor.ORANGE);
      
      tabla.addCell(codigo);
      tabla.addCell(nombre);
      tabla.addCell(apellido);
      tabla.addCell(correo);
      tabla.addCell(genero);
      
      for(Alumno alumno : Administrador.arrayAlumnos){
        tabla.addCell(String.valueOf(alumno.getCodigo()));
        tabla.addCell(alumno.getNombre());
        tabla.addCell(alumno.getApellido());
        tabla.addCell(alumno.getCorreo());
        tabla.addCell(alumno.getGenero());
      }
      
      documento.add(tabla);
      documento.add(Chunk.NEWLINE);
      documento.add(new Paragraph("Archivo guardado como 'Lista de Alumnos.pdf'"));
      documento.close();
      System.out.println("Archivo creado exitosamente");
      
      
    }catch(FileNotFoundException | DocumentException e){
      System.err.println(e.getMessage());
    }
  }
  
  
  public void crearPlantillaCursos() throws DocumentException {
    try {
      archivo = new FileOutputStream("Lista de Cursos.pdf");
      PdfWriter.getInstance(documento, archivo);
      documento.open();
      titulo = new Paragraph("Lista de Cursos");
      titulo.setAlignment(1);
      
      documento.add(titulo);
      documento.add(new Paragraph("Nombre: " + nombre));
      documento.add(new Paragraph("Apellido: " + apellido));
      documento.add(Chunk.NEWLINE);
      
      documento.add(Chunk.NEWLINE);
      
      documento.add(new Paragraph("Fecha: " + fecha));
      documento.add(Chunk.NEWLINE);
      
      
      PdfPTable tabla = new PdfPTable(5);
      tabla.setWidthPercentage(100);
      
      PdfPCell codigo = new PdfPCell(new Phrase("codigo"));
      codigo.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell nombre = new PdfPCell(new Phrase("nombre"));
      nombre.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell creditos = new PdfPCell(new Phrase("creditos"));
      creditos.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell alumnos = new PdfPCell(new Phrase("alumnos"));
      alumnos.setBackgroundColor(BaseColor.ORANGE);
      PdfPCell profesor = new PdfPCell(new Phrase("profesor"));
      profesor.setBackgroundColor(BaseColor.ORANGE);
      
      tabla.addCell(codigo);
      tabla.addCell(nombre);
      tabla.addCell(creditos);
      tabla.addCell(alumnos);
      tabla.addCell(profesor);
      
      for(Curso curso : Administrador.arrayCursos){
        tabla.addCell(String.valueOf(curso.getCodigo()));
        tabla.addCell(curso.getNombre());
        tabla.addCell(String.valueOf(curso.getCreditos()));
        tabla.addCell(String.valueOf(curso.getAlumnos()));
        tabla.addCell(curso.getProfesor());
      }
      
      documento.add(tabla);
      documento.add(Chunk.NEWLINE);
      documento.add(new Paragraph("Archivo guardado como 'Lista de Cursos.pdf'"));
      documento.close();
      System.out.println("Archivo creado exitosamente");
      
      
    }catch(FileNotFoundException | DocumentException e){
      System.err.println(e.getMessage());
    }
  }
  
}
