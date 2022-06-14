
package supermercadojava;

public class listaCategoria {
    public nodoCategoria inicio;
    public int tamano;

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
            this.tamano++;
        }
    }
    public void eliminar(String id){
        if(this.inicio==null){
            System.out.println("lista vacía");
        }else{
           this.inicio=this.inicio.getNodo();
           this.tamano--;
        }
    }
    public Object[] imprimir(){
        Object[] arreglo = new Object[100];
        arreglo=null;
        nodoCategoria aux=this.inicio;
        int i=0;
        if(this.tamano!=0){
           while(aux!=null){
            arreglo[i]=aux.getCategoria();
            System.out.println(aux.getCategoria().getNombre());
            aux=aux.getNodo();
            i++;
        } 
        }
        
        return arreglo;
    }
    public Categoria buscar(String id){
        Categoria cate=new Categoria();
        boolean encontrado=false;
         if(this.inicio==null){
            System.out.println("lista vacía");
        }else{
           if(id.equals(this.inicio.getCategoria().getIdentificador())){
               return this.inicio.getCategoria();
           }else{
               nodoCategoria nodo=this.inicio;
               while (nodo!=null){
                   if(id.equals(nodo.getCategoria().getIdentificador())){
                       return nodo.getCategoria();
                   }
                   nodo=nodo.getNodo();
               }
               return null;
           }
        }
        return null;
    }
    
    public String editar(String id,Categoria cate){
        boolean encontrado=false;
         if(this.inicio==null){
            System.out.println("lista vacía");
        }else{
           if(id.equals(this.inicio.getCategoria().getIdentificador())){
               this.inicio.setCategoria(cate);
               return "Fue editado";
           }else{
               nodoCategoria nodo=this.inicio;
               while (nodo!=null){
                   if(id.equals(nodo.getCategoria().getIdentificador())){
                       encontrado=true;
                       nodo.setCategoria(cate);
                       return "Fue editado";
                   }
                   nodo=nodo.getNodo();
               }
               return "No se encontro";
           }
        }
        return "No se encontro";
    }
}
