package sistemamatriculas;

public class Hash_Alumno {
    String dni;
    String nombre;
    String apellidos;
    String fec_nac;
    String direccion;

    public Hash_Alumno(String dni, String nombre, String apellidos, String fec_nac, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fec_nac = fec_nac;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Fecha Nac.: " + fec_nac + ", Dirección: " + direccion;
    }
}
