package sistemamatriculas;

public class Gestioncurso {
    private final Curso[] cursos;
    private int contador;

    public Gestioncurso(int capacidad) {
        cursos = new Curso[capacidad];
        contador = 0;
    }

    public boolean agregarCurso(Curso curso) {
        if (contador < cursos.length) {
            cursos[contador++] = curso;
            return true;
        }
        System.out.println("No se puede agregar más cursos. Capacidad llena.");
        return false;
    }

    public void listarCursos() {
        if (contador == 0) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        System.out.println("=== Lista de Cursos ===");
        for (int i = 0; i < contador; i++) {
            System.out.println(cursos[i]);
        }
    }
}


