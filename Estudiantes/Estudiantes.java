package estudiantes;

public class Estudiantes {
    
    String nombre;
    String apellido; 
    Double nota1;
    Double nota2;
    Double nota3;

    @Override
    public String toString() {
        double promedio = (this.nota1+this.nota2+this.nota3)/3;
        
        return "  "+nombre+"           "+apellido+"         "+nota1+ "              " +nota2+ "               " +nota3+ "           "+"         "+promedio+"\n";
    }

    public Estudiantes(String nombre, String apellido, Double nota1, Double nota2, Double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
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

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
