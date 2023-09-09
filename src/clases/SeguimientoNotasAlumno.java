package clases;

import java.util.ArrayList;

public class SeguimientoNotasAlumno {
  private int codigo;
  private ArrayList<Double> listaDeNotas = new ArrayList<>();

  public SeguimientoNotasAlumno(int codigo) {
    this.codigo = codigo;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public ArrayList<Double> getListaDeNotas() {
    return listaDeNotas;
  }

  public void setListaDeNotas(ArrayList<Double> listaDeNotas) {
    this.listaDeNotas = listaDeNotas;
  }
}
