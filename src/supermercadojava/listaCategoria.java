
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
                        System.out.println ("elemento "+id+" eliminado");
                        tamano--;
                    }
           }
        }
    }
    public Object[] imprimir(){
        Object[] arreglo = new Object[100];
        nodoCategoria aux=this.inicio;
        int i=0;
        while(aux.getNodo()!=null){
            arreglo[0]=this.inicio.getCategoria();
            aux=aux.getNodo();
            i++;
        }
        return arreglo;
    }
    public Categoria buscar(String id){
        Categoria cate;
        boolean encontrado=false;
         if(this.inicio==null){
            System.out.println("lista vacía");
        }else{
           if(id.equals(this.inicio.getCategoria().getIdentificador())){
               return this.inicio.getCategoria();
           }else{
               nodoCategoria nodo=this.inicio;
               while (nodo.getNodo()!=null&& encontrado!=true ){
                   System.out.println(nodo.getCategoria().equals(id));
                   if (nodo.getCategoria().equals(id)){
                       cate=nodo.getCategoria();
                        System.out.println ("elemento "+id+" la lista");
                        return cate;
                    }else{
                        nodo = nodo.getNodo();
                    }
               }
           }
        }
        return null;
    }
}
