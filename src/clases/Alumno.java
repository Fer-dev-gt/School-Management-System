package clases;

public class Alumno extends Persona {
  
  public Alumno(int codigo, String nombre, String apellido, String correo, String genero,  String password) {
    super(codigo, nombre, apellido, correo, genero, password);
  }
  
  
  public Alumno(String usuario, String password) {
    super(usuario, password);
  }
}
