package sistemamatriculas;

public class Hash_Table {
    private final Hash_Alumno[] tabla;
    private final int capacidad;

    public Hash_Table(int capacidad) {
        this.capacidad = capacidad;
        tabla = new Hash_Alumno[capacidad];
    }

    private int hash(String dni) {
        return Math.abs(dni.hashCode()) % capacidad;
    }

    public void nuevaMatricula(String dni, String nombre, String apellidos, String fec_nac, String direccion) {
        int indice = hash(dni);
        if (tabla[indice] != null) {
            System.out.println("Colisión detectada para el DNI: " + dni);
            return;
        }
        tabla[indice] = new Hash_Alumno(dni, nombre, apellidos, fec_nac, direccion);
    }

    public void imprimirMatriculas() {
        for (int i = 0; i < capacidad; i++) {
            if (tabla[i] != null) {
                System.out.println("Índice " + i + ": " + tabla[i]);
            } else {
                System.out.println("Índice " + i + ": vacío");
            }
        }
    }
}
