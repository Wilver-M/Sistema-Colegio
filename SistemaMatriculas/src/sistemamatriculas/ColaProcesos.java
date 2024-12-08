package sistemamatriculas;

public class ColaProcesos {
    private final String[] cola;
    private int frente;
    private int finalCola;
    private int tamaño;
    private final int capacidad;

    public ColaProcesos(int capacidad) {
        this.capacidad = capacidad;
        cola = new String[capacidad];
        frente = 0;
        finalCola = -1;
        tamaño = 0;
    }

    public void enqueue(String proceso) {
        if (tamaño == capacidad) {
            System.out.println("La cola está llena.");
            return;
        }
        finalCola = (finalCola + 1) % capacidad;
        cola[finalCola] = proceso;
        tamaño++;
    }

    public String dequeue() {
        if (tamaño == 0) {
            System.out.println("La cola está vacía.");
            return null;
        }
        String proceso = cola[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;
        return proceso;
    }

    public void mostrar() {
        if (tamaño == 0) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.println("Contenido de la cola:");
        for (int i = 0; i < tamaño; i++) {
            int indice = (frente + i) % capacidad;
            System.out.println(cola[indice]);
        }
    }
}
