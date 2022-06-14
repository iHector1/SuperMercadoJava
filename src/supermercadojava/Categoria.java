
package supermercadojava;

public class Categoria {
    private String identificador;
    private String nombre;
    private String clasificacion;
    private String descripcion;
    private String localizacion; 
    
    //constructor
    public Categoria(String identificador, String nombre, String clasificacion, String localizacion,String descripcion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.descripcion = descripcion;
        this.localizacion = localizacion;
    }
    //getters and setters

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
    
    
    
}
