package clases;
import java.io.Serializable;

public class Profesor extends Persona implements Serializable{
    private String codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String genero;
  
  
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
