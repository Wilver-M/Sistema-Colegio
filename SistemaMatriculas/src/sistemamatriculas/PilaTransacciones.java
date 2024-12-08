package sistemamatriculas;

public class PilaTransacciones {
    private final String[] pila;
    private int tope;

    public PilaTransacciones(int capacidad) {
        pila = new String[capacidad];
        tope = -1;
    }

    public void push(String transaccion) {
        if (tope == pila.length - 1) {
            System.out.println("La pila está llena.");
            return;
        }
        pila[++tope] = transaccion;
    }

    public String pop() {
        if (tope == -1) {
            System.out.println("La pila está vacía.");
            return null;
        }
        return pila[tope--];
    }

    public void mostrar() {
        if (tope == -1) {
            System.out.println("La pila está vacía.");
            return;
        }
        System.out.println("Contenido de la pila:");
        for (int i = tope; i >= 0; i--) {
            System.out.println(pila[i]);
        }
    }
}
