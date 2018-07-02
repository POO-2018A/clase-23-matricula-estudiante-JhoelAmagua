package matricula;

public class Matriculados {
    
    private String estudiante;
    private String materias;

    public Matriculados(String estudiante, String materias) {
        this.estudiante = estudiante;
        this.materias = materias;
    }
    
    
    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

}
