
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
    public void eliminar(String id){
        if(this.inicio==null){
            System.out.println("lista vacía");
        }else{
            nodoCategoria actual = this.inicio;
                while (actual.getNodo()!=null )
                    actual = actual.getNodo();
                    if (actual.getNodo()== null )
                        System.out.println ("elemento "+id+" no esta en la lista");
                    else{
                        actual.setNodo(actual.getNodo().getNodo());
                    }
        }
    }
}
