public class Profesor extends Usuario {
    public Profesor(String idUsuario, String nombre, String contraseña) {
        super(idUsuario, nombre, contraseña);
    }

    @Override
    public String getPerfil() {
        return "Profesor";
    }
    
    
}
