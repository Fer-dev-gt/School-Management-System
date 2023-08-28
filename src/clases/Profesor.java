package clases;

public class Profesor extends Persona {
  
  public Profesor(int codigo, String nombre, String apellido, String correo, String genero, String usuario, String password) {
    super(codigo, nombre, apellido, correo, genero, usuario, password);
  }
  
  public Profesor(int codigo, String nombre, String apellido, String correo, String genero, String password) {
    super(codigo, nombre, apellido, correo, genero, password);
  }
  
  public Profesor(String usuario, String password) {
    super(usuario, password);
  }
}
