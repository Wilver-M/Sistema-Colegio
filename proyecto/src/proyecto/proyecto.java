/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
        
public class proyecto {
    public static void main(String[] args) {
        Gestioncurso gestion = new Gestioncurso(10); // Capacidad máxima: 10 cursos

        // Agregar cursos
        gestion.agregarCurso(new Curso("MAT101", "Matemáticas", 30));
        gestion.agregarCurso(new Curso("HIS101", "Historia", 25));
        gestion.agregarCurso(new Curso("SCI101", "Ciencia", 20));

        // Listar cursos
        gestion.listarCursos();

        // Buscar un curso
        Curso curso = gestion.buscarCurso("MAT101");
        if (curso != null) {
            System.out.println("Curso encontrado: " + curso);
        } else {
            System.out.println("Curso no encontrado.");
        }

        // Actualizar un curso
        if (gestion.actualizarCurso("HIS101", "Historia Universal", 28)) {
            System.out.println("Curso actualizado correctamente.");
        }

        // Listar cursos nuevamente
        gestion.listarCursos();

        // Eliminar un curso
        if (gestion.eliminarCurso("SCI101")) {
            System.out.println("Curso eliminado correctamente.");
        }

        // Listar cursos después de la eliminación
        gestion.listarCursos();
    }
}

