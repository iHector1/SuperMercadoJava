 
package supermercadojava;
 
public class nodoProducto {
    Producto producto;
    nodoProducto nodo;

    public nodoProducto(Producto producto) {
        this.producto = producto;
        this.nodo = null;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public nodoProducto getNodo() {
        return nodo;
    }

    public void setNodo(nodoProducto nodo) {
        this.nodo = nodo;
    }
    
    
}
