public class Estudiante extends Usuario {
    public Estudiante(String idUsuario, String nombre, String contraseña) {
        super(idUsuario, nombre, contraseña);
    }

    @Override
    public String getPerfil() {
        return "Estudiante";
    }
}
