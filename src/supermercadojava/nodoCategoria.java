
package supermercadojava;


public class nodoCategoria {
    private Categoria categoria;
    private nodoCategoria nodo;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public nodoCategoria getNodo() {
        return nodo;
    }

    public void setNodo(nodoCategoria nodo) {
        this.nodo = nodo;
    }

    public nodoCategoria(Categoria categoria) {
        this.categoria = categoria;
        this.nodo = null;
    }
    
}
