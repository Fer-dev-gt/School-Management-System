package clases;

import java.io.Serializable;

public class AlumnoCursoSeleccionado implements Serializable{
  
  private int codigo;
  private String nombre;
  private String apellido;
  private int nota;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getNota() {
    return nota;
  }

  public void setNota(int nota) {
    this.nota = nota;
  }

  public AlumnoCursoSeleccionado(int codigo, String nombre, String apellido, int nota) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.apellido = apellido;
    this.nota = nota;
  }
  
}
