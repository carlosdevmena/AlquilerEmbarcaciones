public class Capitan extends Persona {
    private String matriculaNavegacion;

    public Capitan(String nombre, String apellido, String matriculaNavegacion) {
        super(nombre, apellido);
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public String getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

    public void setMatriculaNavegacion(String matriculaNavegacion) {
        this.matriculaNavegacion = matriculaNavegacion;
    }
}