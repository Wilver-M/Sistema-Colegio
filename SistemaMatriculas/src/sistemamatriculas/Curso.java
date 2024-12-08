package sistemamatriculas;

public class Curso {
    private String codigo;
    private String nombre;
    private int cupos;

    public Curso(String codigo, String nombre, int cupos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupos = cupos;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCupos() { return cupos; }
    public void setCupos(int cupos) { this.cupos = cupos; }

    @Override
    public String toString() {
        return "Curso{codigo='" + codigo + "', nombre='" + nombre + "', cupos=" + cupos + '}';
    }
}
