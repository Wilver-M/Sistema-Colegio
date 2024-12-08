package sistemamatriculas;

public class SistemaMatriculas {

    public static void main(String[] args) {
        // Gestión de Cursos
        System.out.println("=== Gestión de Cursos ===");
        Gestioncurso gestionCursos = new Gestioncurso(10);
        gestionCursos.agregarCurso(new Curso("MAT101", "Matemáticas", 30));
        gestionCursos.agregarCurso(new Curso("HIS101", "Historia", 25));
        gestionCursos.listarCursos();

        // Gestión de Matrículas
        System.out.println("\n=== Gestión de Matrículas ===");
        Hash_Table gestionMatriculas = new Hash_Table(13);
        gestionMatriculas.nuevaMatricula("45625878", "Sandra", "Marquez Crisanto", "05/11/2012", "San Miguel av.Bolivia 567");
        gestionMatriculas.nuevaMatricula("45254568", "Yoryinio", "Taboada Crisanto", "05/11/2012", "San Isidro av Pierola 521");
        gestionMatriculas.imprimirMatriculas();

        // Operaciones con Pilas
        System.out.println("\n=== Operaciones con Pilas (Historial de Transacciones) ===");
        PilaTransacciones pila = new PilaTransacciones(10);
        pila.push("Curso agregado: MAT101");
        pila.push("Matrícula registrada: 45625878");
        pila.mostrar();
        pila.pop();
        pila.mostrar();

        // Operaciones con Colas
        System.out.println("\n=== Operaciones con Colas (Flujo de Procesos) ===");
        ColaProcesos cola = new ColaProcesos(5);
        cola.enqueue("Inicio de proceso de inscripción.");
        cola.enqueue("Validación de matrícula: 45625878");
        cola.enqueue("Generación de recibo de pago.");
        cola.mostrar();
        cola.dequeue();
        cola.mostrar();
    }
}
