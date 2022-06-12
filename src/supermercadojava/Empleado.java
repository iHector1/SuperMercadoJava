
package supermercadojava;

public class Empleado extends Persona{
    private String identificador;
    private String horario;
    private double salario;
    private String area;
    private String contrasena;
    //constructor

    public Empleado(String identificador, String horario, double salario, 
            String area, String contrasena, String nombre, String apellido,
            String fechaNacimiento, int edad, String domicilio) {
        super(nombre, apellido, fechaNacimiento, edad, domicilio);
        this.identificador = identificador;
        this.horario = horario;
        this.salario = salario;
        this.area = area;
        this.contrasena = contrasena;
    }
    //getter and setter

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
