
package supermercadojava;

public class listaCategoria {
    private nodoCategoria inicio;
    private int tamano;

    public listaCategoria() {
        this.inicio = null;
        this.tamano=0;
    }
    public void agregar(Categoria categoria){
        nodoCategoria nodo=new nodoCategoria(categoria);
        if(this.inicio==null){
            this.inicio=nodo;
            this.tamano++;
        }else{
            nodoCategoria aux=inicio;
            while(aux.getNodo()!=null){
                aux=aux.getNodo();
            }
            aux.setNodo(nodo);
            this.tamano=0;
        }
    }
    public void eliminar(String id){
        if(this.inicio==null){
            System.out.println("lista vacía");
        }else{
           if(id.equals(this.inicio.getCategoria().getIdentificador())){
               this.inicio=this.inicio.getNodo();
               this.tamano--;
           }else{
               nodoCategoria nodo=this.inicio;
               while (nodo.getNodo()!=null && nodo.getNodo().getCategoria().getIdentificador().equals(id)){
                   nodo = nodo.getNodo();
               }
                    if (nodo.getNodo()== null )
                        System.out.println ("elemento "+id+" no esta en la lista");
                    else{
                        nodo.setNodo(nodo.getNodo().getNodo());
                        tamano--;
                    }
           }
        }
    }
    public Categoria buscar(String id){
        Categoria cate;
        if(this.inicio==null){
            System.out.println("lista vacía");
        }else{
            nodoCategoria actual = this.inicio;
                while (actual.getNodo()!=null&& !actual.getNodo().getCategoria().getIdentificador().equals(id)){
                    actual = actual.getNodo();
                }
                    if (actual.getNodo()== null){
                     return null;   
                    } 
                    else{
                        cate=actual.getCategoria();
                        return cate;
                    }
        }
        return null;
    }
}
