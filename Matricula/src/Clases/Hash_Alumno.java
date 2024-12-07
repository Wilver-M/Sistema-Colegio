package Clases;

/**
 * @author Wilver
 */
public class Hash_Alumno {
    String dni;
    String nombre;
    String apellidos;
    String fec_nac;
    String direccion;
    //int prom_mat;
    //int prom_leng;
    
    //constructor
    public Hash_Alumno (String dni,String nombre,String apellidos,String fec_nac,String direccion){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fec_nac = fec_nac;
        this.direccion = direccion;
        //this.prom_mat = prom_mat;
        //this.prom_leng = prom_leng;
    }
    
    //metodo para representar el regsitro en cadena
    public String toString() {
        return "Código[Num: " + dni + ", Nombres: " + nombre + ", Apellidos: " + apellidos +", Fech Nac.: "+fec_nac+", Dirección: "+direccion + "]";
    }
    
}
