package sistemamatriculas;

public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Agregar un estudiante al final de la lista
    public void agregar(Estudiante estudiante) {
        Nodo nuevoNodo = new Nodo(estudiante);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    // Eliminar un estudiante por ID
    public boolean eliminar(int estudianteID) {
        if (cabeza == null) return false;

        if (cabeza.getEstudiante().getEstudianteID() == estudianteID) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        Nodo temp = cabeza;
        while (temp.getSiguiente() != null && temp.getSiguiente().getEstudiante().getEstudianteID() != estudianteID) {
            temp = temp.getSiguiente();
        }

        if (temp.getSiguiente() != null) {
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            return true;
        }

        return false;
    }

    // Mostrar todos los estudiantes en la lista
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.getEstudiante());
            temp = temp.getSiguiente();
        }
    }
}
