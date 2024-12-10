package sistemamatriculas;

public class Estudiante {
    private int estudianteID;
    private String dni;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String direccionPadres;
    private String codigoEstudiante;
    private int anioIngreso;
    private double promedioGeneral;
    private int gradoID;

    public Estudiante(int estudianteID, String dni, String nombre, String apellido, String fechaNacimiento, String direccionPadres, String codigoEstudiante, int anioIngreso, double promedioGeneral, int gradoID) {
        this.estudianteID = estudianteID;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccionPadres = direccionPadres;
        this.codigoEstudiante = codigoEstudiante;
        this.anioIngreso = anioIngreso;
        this.promedioGeneral = promedioGeneral;
        this.gradoID = gradoID;
    }

    public int getEstudianteID() {
        return estudianteID;
    }

    public void setEstudianteID(int estudianteID) {
        this.estudianteID = estudianteID;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccionPadres() {
        return direccionPadres;
    }

    public void setDireccionPadres(String direccionPadres) {
        this.direccionPadres = direccionPadres;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(double promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public int getGradoID() {
        return gradoID;
    }

    public void setGradoID(int gradoID) {
        this.gradoID = gradoID;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "estudianteID=" + estudianteID +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", direccionPadres='" + direccionPadres + '\'' +
                ", codigoEstudiante='" + codigoEstudiante + '\'' +
                ", anioIngreso=" + anioIngreso +
                ", promedioGeneral=" + promedioGeneral +
                ", gradoID=" + gradoID +
                '}';
    }
}
