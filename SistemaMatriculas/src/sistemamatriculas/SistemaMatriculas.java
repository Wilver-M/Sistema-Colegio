package sistemamatriculas;

public class SistemaMatriculas {

    public static void main(String[] args) {
        // === Gestión de Cursos ===
        System.out.println("=== Gestión de Cursos ===");
        Gestioncurso gestionCursos = new Gestioncurso(10); // Capacidad máxima de 10 cursos
        gestionCursos.agregarCurso(new Curso("MAT101", "Matemáticas", 30));
        gestionCursos.agregarCurso(new Curso("HIS101", "Historia", 25));
        gestionCursos.listarCursos();

        // === Gestión de Matrículas ===
        System.out.println("\n=== Gestión de Matrículas ===");
        Hash_Table gestionMatriculas = new Hash_Table(13); // Tabla Hash con capacidad para 13
        gestionMatriculas.nuevaMatricula("45625878", "Sandra", "Marquez Crisanto", "05/11/2012", "San Miguel av.Bolivia 567");
        gestionMatriculas.nuevaMatricula("45254568", "Yoryinio", "Taboada Crisanto", "05/11/2012", "San Isidro av Pierola 521");
        gestionMatriculas.imprimirMatriculas();

        // === Operaciones con Pilas ===
        System.out.println("\n=== Operaciones con Pilas (Historial de Transacciones) ===");
        PilaTransacciones pila = new PilaTransacciones(10); // Capacidad de 10 transacciones
        pila.push("Curso agregado: MAT101");
        pila.push("Matrícula registrada: 45625878");
        pila.mostrar();
        pila.pop(); // Retira el último elemento
        pila.mostrar();

        // === Operaciones con Colas ===
        System.out.println("\n=== Operaciones con Colas (Flujo de Procesos) ===");
        ColaProcesos cola = new ColaProcesos(5); // Capacidad de 5 procesos
        cola.enqueue("Inicio de proceso de inscripción.");
        cola.enqueue("Validación de matrícula: 45625878");
        cola.enqueue("Generación de recibo de pago.");
        cola.mostrar();
        cola.dequeue(); // Retira el primer proceso
        cola.mostrar();

        // === Gestión de Estudiantes con Listas Enlazadas ===
        System.out.println("\n=== Gestión de Estudiantes con Listas Enlazadas ===");
        ListaEnlazada listaEstudiantes = new ListaEnlazada();

        // Agregar estudiantes
        listaEstudiantes.agregar(new Estudiante(1, "45625878", "Sandra", "Marquez", "2005-11-12", "San Miguel", "E001", 2023, 18.5, 1));
        listaEstudiantes.agregar(new Estudiante(2, "45254568", "Yoryinio", "Taboada", "2004-09-10", "San Isidro", "E002", 2022, 17.8, 2));
        listaEstudiantes.agregar(new Estudiante(3, "45008503", "Wilver", "Martinez", "2003-07-15", "Surco", "E003", 2021, 19.0, 3));

        // Mostrar lista de estudiantes
        System.out.println("=== Lista de Estudiantes ===");
        listaEstudiantes.mostrar();

        // Eliminar un estudiante
        System.out.println("\nEliminando estudiante con ID 2...");
        listaEstudiantes.eliminar(2);

        // Mostrar lista actualizada
        System.out.println("\n=== Lista Actualizada ===");
        listaEstudiantes.mostrar();

        // === Gestión de Estudiantes con Árbol Binario ===
        System.out.println("\n=== Gestión de Estudiantes con Árbol Binario ===");
        ArbolBinario arbolEstudiantes = new ArbolBinario();

        // Agregar estudiantes al árbol
        arbolEstudiantes.insertar(new Estudiante(1, "45625878", "Sandra", "Marquez", "2005-11-12", "San Miguel", "E001", 2023, 18.5, 1));
        arbolEstudiantes.insertar(new Estudiante(2, "45254568", "Yoryinio", "Taboada", "2004-09-10", "San Isidro", "E002", 2022, 17.8, 2));
        arbolEstudiantes.insertar(new Estudiante(3, "45008503", "Wilver", "Martinez", "2003-07-15", "Surco", "E003", 2021, 19.0, 3));

        // Mostrar estudiantes en orden
        System.out.println("=== Estudiantes en Orden (Inorden) ===");
        arbolEstudiantes.mostrarEnOrden();

        // Buscar un estudiante
        System.out.println("\n=== Buscar Estudiante con ID 2 ===");
        Estudiante encontrado = arbolEstudiantes.buscar(2);
        if (encontrado != null) {
            System.out.println("Estudiante encontrado: " + encontrado);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
