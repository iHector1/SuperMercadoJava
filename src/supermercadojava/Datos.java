 
package supermercadojava;
  
public class Datos {
    public listaEmpleados empleados;
    public listaAdministradores  admis;
    public listaProducto productos;
    public listaCategoria categoria;

    public Datos(){
       this.empleados=new listaEmpleados();
       this.admis=new listaAdministradores();
       this.productos=new listaProducto();
       this.categoria=new listaCategoria();
    }
    
    private void init(){
       // Empleado em=new Empleado();
    }
    
    
}
