import java.util.ArrayList;
import java.util.HashMap;

public class Clase {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    private HashMap<Estudiante, Nota> estudiantesNotas;

    public Clase(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
        this.estudiantesNotas = new HashMap<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
            estudiantesNotas.put(estudiante, new Nota(0, 0, 0)); // Inicializamos notas
        }
    }

    public void registrarNotas(Estudiante estudiante, double periodo1, double periodo2, double periodo3) {
        if (estudiantes.contains(estudiante)) {
            estudiantesNotas.put(estudiante, new Nota(periodo1, periodo2, periodo3));
        } else {
            System.out.println("El estudiante no está inscrito en esta clase.");
        }
    }

    public Nota obtenerNotas(Estudiante estudiante) {
        return estudiantesNotas.get(estudiante);
    }

    // Sobrescribir toString para mostrar el nombre de la clase
    @Override
    public String toString() {
        return nombre; // Retorna el nombre de la clase
    }
}
