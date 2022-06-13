
package supermercadojava;

public class listaProducto {
   private nodoProducto inicio;

    public listaProducto() {
        this.inicio = null;
    }
    public void agregar(Producto producto){
        nodoProducto nodo=new nodoProducto(producto);
        if(this.inicio==null){
            this.inicio=nodo;
        }else{
            nodoProducto aux=inicio;
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
            nodoProducto actual = this.inicio;
                while (actual.getNodo()!=null && !actual.getNodo().getProducto().getIdentificador().equals(id)){
                    actual = actual.getNodo();
                }
                    if (actual.getNodo()== null )
                        System.out.println ("elemento "+id+" no esta en la lista");
                    else{
                        actual.setNodo(actual.getNodo().getNodo());
                    }
        }
        
    } 
    public int editar(Producto producto){
        if(this.inicio==null){
            System.out.println("lista vacía");
            return -1;
        }else{
            nodoProducto actual = this.inicio;
                while (actual.getNodo()!=null && 
                        !actual.getNodo().getProducto().getIdentificador()
                                .equals(producto.getIdentificador())){
                    actual = actual.getNodo();
                    if (actual.getNodo()== null ){
                      System.out.println ("elemento "+producto.getIdentificador()+" no esta en la lista");
                    return -1;  
                    }
                        
                    else{
                        actual.setProducto(producto);
                        return 1;
                    }
                }
        }
        return 0;
    }
}

