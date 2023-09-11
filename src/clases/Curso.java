package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable{
  private int codigo;
  private String nombre;
  private int creditos;
  private int Alumnos;
  private String Profesor;
  public ArrayList<ActividadesCursoSeleccionado> actividadesDelCurso = new ArrayList<>();

  
  public Curso(int codigo, String nombre, int creditos, int Alumnos, String Profesor) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.creditos = creditos;
    this.Alumnos = Alumnos;
    this.Profesor = Profesor;
  }
  
  public Curso(int codigo, String nombre, int creditos, String Profesor) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.creditos = creditos;
    this.Profesor = Profesor;
  }

  public int getCodigo() {
    return codigo;
  }

  public ArrayList<ActividadesCursoSeleccionado> getActividadesDelCurso() {
    return actividadesDelCurso;
  }

  public void setActividadesDelCurso(ArrayList<ActividadesCursoSeleccionado> actividadesDelCurso) {
    this.actividadesDelCurso = actividadesDelCurso;
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

  public int getCreditos() {
    return creditos;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public int getAlumnos() {
    return Alumnos;
  }

  public void setAlumnos(int Alumnos) {
    this.Alumnos = Alumnos;
  }

  public String getProfesor() {
    return Profesor;
  }

  public void setProfesor(String Profesor) {
    this.Profesor = Profesor;
  }
}
