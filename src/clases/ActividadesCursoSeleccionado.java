package clases;

import java.io.Serializable;

public class ActividadesCursoSeleccionado implements Serializable{
  private String nombre;
  private String descripcion;
  private int ponderacion;
  private String promedio;

  public ActividadesCursoSeleccionado(String nombre, String descripcion, int ponderacion, String promedio) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.ponderacion = ponderacion;
    this.promedio = promedio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getPonderacion() {
    return ponderacion;
  }

  public void setPonderacion(int ponderacion) {
    this.ponderacion = ponderacion;
  }

  public String getPromedio() {
    return promedio;
  }

  public void setPromedio(String promedio) {
    this.promedio = promedio;
  }
}
