package sistemamatriculas;

public class NodoArbol {
    private final Estudiante estudiante;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }
}
