public abstract class Usuario {
    private String idUsuario;
    private String nombre;
    private String contraseña;

    public Usuario(String idUsuario, String nombre, String contraseña) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public abstract String getPerfil();
}
