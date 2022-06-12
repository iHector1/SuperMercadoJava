
package supermercadojava;

public class Administrador extends Persona{
    private String identificador;
    private String areaSupervisor;
    private String horario;
    private double salario;
    private String fechaAntiguedad;
    private String contrasena;

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getAreaSupervisor() {
        return areaSupervisor;
    }

    public void setAreaSupervisor(String areaSupervisor) {
        this.areaSupervisor = areaSupervisor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaAntiguedad() {
        return fechaAntiguedad;
    }

    public void setFechaAntiguedad(String fechaAntiguedad) {
        this.fechaAntiguedad = fechaAntiguedad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Administrador(String identificador, String areaSupervisor, 
            String horario, double salario, String fechaAntiguedad, 
            String contrasena, String nombre, String apellido, 
            String fechaNacimiento, int edad, String domicilio) {
        super(nombre, apellido, fechaNacimiento, edad, domicilio);
        this.identificador = identificador;
        this.areaSupervisor = areaSupervisor;
        this.horario = horario;
        this.salario = salario;
        this.fechaAntiguedad = fechaAntiguedad;
        this.contrasena = contrasena;
    }
    
    
}
