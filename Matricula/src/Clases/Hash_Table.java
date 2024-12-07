package Clases;

/**
 * @author Wilver
 */
public class Hash_Table {
    private Hash_Alumno[] tabla;
    private int capacidad;
    
    //constructor para inicializar la tabla hash
    public Hash_Table(int capacidad) {
        this.capacidad = capacidad;
        this.tabla = new Hash_Alumno[capacidad];
    }
    
    //Funcion Hash
    private int hash(String dni) {
        return Math.abs(dni.hashCode()) % capacidad;
    }
    
    // Método para agregar una matricula en la tabla hash
    public void nuevaMatricula(String dni, String nombre, String apellidos, String fec_nac,String direccion) {
        int indice = hash(dni);

        if (tabla[indice] != null) {
            if (tabla[indice].dni.equals(dni)) {
                tabla[indice].nombre = nombre;
                tabla[indice].apellidos = apellidos;
                tabla[indice].fec_nac = fec_nac;
                tabla[indice].direccion = direccion;
                return;
            } else {
                // Si ocurre una colisión envia un mensaje
                System.out.println("Colisión detectada " + dni + "");
            }
        }

        // Si la posición está libre agregamos la nueva matricula
        tabla[indice] = new Hash_Alumno(dni, nombre, apellidos,fec_nac,direccion);
    }
    
    // Método para buscar una matricula por su dni
    public Hash_Alumno buscarMatricula(String dni) {
        int indice = hash(dni);
        if (tabla[indice] != null && tabla[indice].dni.equals(dni)) {
            return tabla[indice];
        }
        return null;
    }
    
    // Método para actualizar la direccion
    public boolean actualizarDireccion(String dni, String nueva_dir) {
        Hash_Alumno matricula = buscarMatricula(dni);
        if (matricula != null) {
            matricula.direccion = nueva_dir;
            return true;
        }
        return false;
    }
    
    // Método para imprimir
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
