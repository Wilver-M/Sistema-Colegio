package sistemamatriculas;

public class ArbolBinario {
    private NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // Método para insertar un estudiante
    public void insertar(Estudiante estudiante) {
        NodoArbol nuevoNodo = new NodoArbol(estudiante);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            insertarRecursivo(raiz, nuevoNodo);
        }
    }

    private void insertarRecursivo(NodoArbol actual, NodoArbol nuevo) {
        if (nuevo.getEstudiante().getEstudianteID() < actual.getEstudiante().getEstudianteID()) {
            if (actual.getIzquierdo() == null) {
                actual.setIzquierdo(nuevo);
            } else {
                insertarRecursivo(actual.getIzquierdo(), nuevo);
            }
        } else {
            if (actual.getDerecho() == null) {
                actual.setDerecho(nuevo);
            } else {
                insertarRecursivo(actual.getDerecho(), nuevo);
            }
        }
    }

    // Método para buscar un estudiante por ID
    public Estudiante buscar(int estudianteID) {
        return buscarRecursivo(raiz, estudianteID);
    }

    private Estudiante buscarRecursivo(NodoArbol actual, int estudianteID) {
        if (actual == null) {
            return null; // No encontrado
        }
        if (actual.getEstudiante().getEstudianteID() == estudianteID) {
            return actual.getEstudiante();
        }
        if (estudianteID < actual.getEstudiante().getEstudianteID()) {
            return buscarRecursivo(actual.getIzquierdo(), estudianteID);
        } else {
            return buscarRecursivo(actual.getDerecho(), estudianteID);
        }
    }

    // Mostrar el árbol en orden (inorden)
    public void mostrarEnOrden() {
        mostrarEnOrdenRecursivo(raiz);
    }

    private void mostrarEnOrdenRecursivo(NodoArbol actual) {
        if (actual != null) {
            mostrarEnOrdenRecursivo(actual.getIzquierdo());
            System.out.println(actual.getEstudiante());
            mostrarEnOrdenRecursivo(actual.getDerecho());
        }
    }
}
