/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadojava;

/**
 *
 * @author PC
 */
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
