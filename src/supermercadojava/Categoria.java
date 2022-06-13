
package supermercadojava;

public class Categoria {
    private int identificador;
    private String nombre;
    private String description;
    private String descripcion;
    private String localizacion; 
    
    //constructor
    public Categoria(int identificador, String nombre, String descripcion, String localizacion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.description = description;
        this.descripcion = descripcion;
        this.localizacion = localizacion;
    }
    //getters and setters

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
