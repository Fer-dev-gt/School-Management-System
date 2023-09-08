package clases;

public abstract class Persona {
  private int codigo;
  private String nombre;
  private String apellido;
  private String correo;
  private String genero;
  private String usuario;
  private String password;
  
  public Persona(int codigo, String nombre, String apellido, String correo, String genero, String usuario, String password) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.genero = genero;
    this.usuario = usuario;
    this.password = password;
  }
  
  public Persona(int codigo, String nombre, String apellido, String correo, String genero,  String password) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.genero = genero;
    this.password = password;
  }
    
  public Persona(String usuario, String password) {
    this.usuario = usuario;
    this.password = password;
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

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
