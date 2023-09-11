package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class SeguimientoNotasAlumno implements Serializable{
  private int codigo;
  private String nombreCurso;
  private ArrayList<Double> listaDeNotas = new ArrayList<>();

  public SeguimientoNotasAlumno(int codigo, String nombreCurso) {
    this.codigo = codigo;
    this.nombreCurso = nombreCurso;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombreCurso() {
    return nombreCurso;
  }

  public void setNombreCurso(String nombreCurso) {
    this.nombreCurso = nombreCurso;
  }

  public ArrayList<Double> getListaDeNotas() {
    return listaDeNotas;
  }

  public void setListaDeNotas(ArrayList<Double> listaDeNotas) {
    this.listaDeNotas = listaDeNotas;
  }
}
