
package supermercadojava;

public class listaProducto {
   public nodoProducto inicio;
   public int tamano;

    public listaProducto() {
        this.inicio = null;
        this.tamano = 0;
    }
    public void agregar(Producto producto){
        nodoProducto nodo=new nodoProducto(producto);
        if(this.inicio==null){
            this.inicio=nodo;
            this.tamano++;
        }else{
            nodoProducto aux=inicio;
            while(aux.getNodo()!=null){
                aux=aux.getNodo();
            }
            aux.setNodo(nodo);
            this.tamano++;
        }
    }
    public String eliminar(){
        if(this.inicio==null){
            System.out.println("lista vacía");
            return "Lista vacia";
        }else{
            this.inicio = this.inicio.getNodo();
            this.tamano--;
            return "Eliminado";
        }
    } 
    
    
    public Object[] imprimir() {
      Object[] arreglo = new Object[100];
      arreglo = null;
      nodoProducto aux = this.inicio;
      int i = 0;
      if (this.tamano !=0) {
          while(aux!=null) {
              arreglo[i]=aux.getProducto();
              System.out.println(aux.getProducto().getNombre());
              aux = aux.getNodo();
              i++;
          }
      }
      return arreglo;
    }
    
    public Producto buscar(String id) {
        Producto produ = new Producto();
        boolean encontrado = false;
        if(this.inicio == null) {
            System.out.println("lista vacia");
        } else {
            if(id.equals(this.inicio.getProducto().getIdentificador())) {
                return this.inicio.getProducto();
            } else {
                nodoProducto nodo = this.inicio;
                while(nodo!=null) {
                    if(id.equals(nodo.getProducto().getIdentificador())) {
                        return nodo.getProducto();
                    }
                    nodo=nodo.getNodo();
                }
                return null;
            }
        }
        return null;
    }
    
    public String editar(String id, Producto produ) {
        boolean encontrado = false;
        if(this.inicio==null) {
            System.out.println("lista vacia");
        } else {
            if(id.equals(this.inicio.getProducto().getIdentificador())) {
                this.inicio.setProducto(produ);
                return "Fue editado";
            } else {
                nodoProducto nodo=this.inicio;
                while(nodo!=null) {
                    if(id.equals(nodo.getProducto().getIdentificador())) {
                        encontrado=true;
                        nodo.setProducto(produ);
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

