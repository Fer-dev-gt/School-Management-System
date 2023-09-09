package clases;

import java.util.ArrayList;

public class Alumno extends Persona {
  
  private ArrayList<String> listaDeCursos = new ArrayList<>();
  
  public Alumno(int codigo, String nombre, String apellido, String correo, String genero,  String password) {
    super(codigo, nombre, apellido, correo, genero, password);
  }
  
  public Alumno(String usuario, String password) {
    super(usuario, password);
  }

  public ArrayList<String> getListaDeCursos() {
    return listaDeCursos;
  }

  public void setListaDeCursos(ArrayList<String> listaDeCursos) {
    this.listaDeCursos = listaDeCursos;
  }
}
