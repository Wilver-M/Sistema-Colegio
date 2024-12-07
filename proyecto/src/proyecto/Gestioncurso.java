/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

public class Gestioncurso {

    private final Curso[] cursos; // Array para almacenar los cursos
    private int contador;   // Número de cursos registrados

    // Constructor para inicializar el array
    public Gestioncurso(int capacidad) {
        this.cursos = new Curso[capacidad];
        this.contador = 0;
    }

    // Método para agregar un curso
    public boolean agregarCurso(Curso curso) {
        if (contador < cursos.length) {
            cursos[contador] = curso;
            contador++;
            return true;
        } else {
            System.out.println("El array de cursos está lleno.");
            return false;
        }
    }

    // Método para listar todos los cursos
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

    // Método para buscar un curso por código
    public Curso buscarCurso(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (cursos[i].getCodigo().equals(codigo)) {
                return cursos[i];
            }
        }
        return null; // No encontrado
    }

    // Método para actualizar un curso por código
    public boolean actualizarCurso(String codigo, String nuevoNombre, int nuevosCupos) {
        Curso curso = buscarCurso(codigo);
        if (curso != null) {
            curso.setNombre(nuevoNombre);
            curso.setCupos(nuevosCupos);
            return true;
        } else {
            System.out.println("Curso no encontrado.");
            return false;
        }
    }

    // Método para eliminar un curso por código
    public boolean eliminarCurso(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (cursos[i].getCodigo().equals(codigo)) {
                // Mover los elementos hacia la izquierda para llenar el espacio vacío
                for (int j = i; j < contador - 1; j++) {
                    cursos[j] = cursos[j + 1];
                }
                cursos[contador - 1] = null; // Limpiar la última posición
                contador--;
                return true;
            }
        }
        System.out.println("Curso no encontrado.");
        return false;
    }

    // Obtener el número actual de cursos registrados
    public int obtenerNumeroDeCursos() {
        return contador;
    }

}
