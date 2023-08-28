package clases;

public class Curso {
  private int codigo;
  private String nombre;
  private int creditos;
  private String Alumnos;
  private String Profesor;

  
  public Curso(int codigo, String nombre, int creditos, String Alumnos, String Profesor) {
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

  public String getAlumnos() {
    return Alumnos;
  }

  public void setAlumnos(String Alumnos) {
    this.Alumnos = Alumnos;
  }

  public String getProfesor() {
    return Profesor;
  }

  public void setProfesor(String Profesor) {
    this.Profesor = Profesor;
  }
}
