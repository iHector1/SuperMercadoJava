
package supermercadojava;

public class listaCategoria {
    private nodoCategoria inicio;

    public listaCategoria() {
        this.inicio = null;
    }
    public void agregar(Categoria categoria){
        nodoCategoria nodo=new nodoCategoria(categoria);
        if(this.inicio==null){
            this.inicio=nodo;
        }else{
            nodoCategoria aux=inicio;
            while(aux.getNodo()!=null){
                aux=aux.getNodo();
            }
            aux.setNodo(nodo);
        }
    }
}
