package clases;
import java.util.ArrayList;

public class Administrador extends Persona{
  
  public static ArrayList<Alumno> arrayAlumnos = new ArrayList<>();
  public static ArrayList<Profesor> arrayProfesores = new ArrayList<>();
  public static ArrayList<Curso> arrayCursos = new ArrayList<>();
    
  public Administrador(String usuario, String password) {
    super(usuario, password);
  }
}
