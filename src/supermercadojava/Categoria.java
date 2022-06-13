
package supermercadojava;

public class Categoria {
    private int identificador;
    private String nombre;
    private String categoria;
    private String descripcion;
    private String localizacion; 
    
    //constructor
    public Categoria(int identificador, String nombre, String categoria, String localizacion,String descripcion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.categoria = categoria;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
