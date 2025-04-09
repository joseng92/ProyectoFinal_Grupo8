import java.util.ArrayList;

public class BaseDeDatos {
    private ArrayList<Profesor> profesores;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Clase> clases;

    public BaseDeDatos() {
        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();
        clases = new ArrayList<>();
        inicializarDatos();
    }

    private void inicializarDatos() {
        // Profesores
        profesores.add(new Profesor("prof1", "Javier Pérez", "1234"));
        profesores.add(new Profesor("prof2", "Rosa Martínez", "5678"));
        profesores.add(new Profesor("prof3", "Ramón López", "abcd"));
        profesores.add(new Profesor("prof4", "Pilar García", "efgh"));
        profesores.add(new Profesor("prof5", "Omar Torres", "ijkl"));

        // Estudiantes con nombres y apellidos
        estudiantes.add(new Estudiante("est1", "Carlos Gómez", "pass1"));
        estudiantes.add(new Estudiante("est2", "Ana Fernández", "pass2"));
        estudiantes.add(new Estudiante("est3", "Luis Martínez", "pass3"));
        estudiantes.add(new Estudiante("est4", "María López", "pass4"));
        estudiantes.add(new Estudiante("est5", "Pedro García", "pass5"));
        estudiantes.add(new Estudiante("est6", "Laura Torres", "pass6"));
        estudiantes.add(new Estudiante("est7", "José Castillo", "pass7"));
        estudiantes.add(new Estudiante("est8", "Claudia Sánchez", "pass8"));
        estudiantes.add(new Estudiante("est9", "Juan Vargas", "pass9"));
        estudiantes.add(new Estudiante("est10", "Marta Gómez", "pass10"));
        estudiantes.add(new Estudiante("est11", "Diego Herrera", "pass11"));
        estudiantes.add(new Estudiante("est12", "Lucía Romero", "pass12"));
        estudiantes.add(new Estudiante("est13", "Carlos Torres", "pass13"));
        estudiantes.add(new Estudiante("est14", "Sofía Méndez", "pass14"));
        estudiantes.add(new Estudiante("est15", "Enrique Silva", "pass15"));
        estudiantes.add(new Estudiante("est16", "Gloria Álvarez", "pass16"));
        estudiantes.add(new Estudiante("est17", "Andrea Flores", "pass17"));
        estudiantes.add(new Estudiante("est18", "Daniel Rojas", "pass18"));
        estudiantes.add(new Estudiante("est19", "Raúl Ortiz", "pass19"));
        estudiantes.add(new Estudiante("est20", "Patricia Jiménez", "pass20"));

        // Clases
        clases.add(new Clase("MAT01", "Matemáticas", profesores.get(0)));
        clases.add(new Clase("HIS01", "Historia", profesores.get(1)));
        clases.add(new Clase("QUI01", "Química", profesores.get(2)));
        clases.add(new Clase("BIO01", "Biología", profesores.get(3)));
        clases.add(new Clase("FIS01", "Física", profesores.get(4)));

        // Inscribir estudiantes a las clases con notas iniciales
        for (int i = 0; i < estudiantes.size(); i++) {
            Clase clase = clases.get(i % clases.size());
            clase.agregarEstudiante(estudiantes.get(i));
            // Asignar notas para los dos primeros periodos
            clase.registrarNotas(estudiantes.get(i), 70 + (i % 10), 80 + (i % 10), 0); // Periodo 3 en 0
        }
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }
}
