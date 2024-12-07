package Clases;

/**
 * @author Wilver
 */
public class Principal {

    public static void main(String[] args) {
        // Creamos tabla hash
        Hash_Table matricula = new Hash_Table(13);

        // Inicializamos algunas matriculas
        matricula.nuevaMatricula("45625878", "Sandra", "Marquez Crisanto","05/11/2012","San Miguel av.Bolivia 567");
        matricula.nuevaMatricula("45254568", "Yoryinio", "Taboada Crisanto","05/11/2012","San Isidro av Pierola 521");
        matricula.nuevaMatricula("45008503", "Wilver", "Martinez Ccarampa","05/11/2012","San Juan de Lurigancho av Canto 451");
        
        // Mostramos las matriculas registradas
        System.out.println("Matriculas registradas:");
        matricula.imprimirMatriculas();
        
        // Buscamos una matricula por su codigo para actualizar
        String codigo = "45625878";
        Hash_Alumno matric = matricula.buscarMatricula(codigo);
        if (matric != null) {
            System.out.println("\nMatricula encontrada: " + matric);
        } else {
            System.out.println("\nMatricula no encontrada  " + codigo);
        }
        
        // Actualizamos la matricula con una nueva direccion
        boolean matr_actualizada = matricula.actualizarDireccion(codigo, "Surco av Cisnes 154");
        if (matr_actualizada) {
            System.out.println("Matricula actualizada correctamente.");
        } else {
            System.out.println("No se pudo actualizar la matricula (matricula no encontrada).");
        }
        
        // mostrar matriculas despues de actualizar
        System.out.println("\nmatriculas actualizadas:");
        matricula.imprimirMatriculas();
        
    }
}
