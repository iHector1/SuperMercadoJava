 
package supermercadojava;
  
public class Datos {
    public listaEmpleados empleados;
    public listaAdministradores  admis;
    public listaProducto productos;
    public listaCategoria categoria;
    public String nombre;

    public Datos(){
       this.empleados=new listaEmpleados();
       this.admis=new listaAdministradores();
       this.productos=new listaProducto();
       this.categoria=new listaCategoria();
       this.nombre="";
       this.init();
    }
    
    private void init(){
        Empleado em=new Empleado("12","MATUTINO",2500,"Pasillos","1234","David"
                ,"Loera","12/01/2001",20,"Nueva Escocia");
        Administrador ad=new Administrador("1","Oficinas","MIXTO",5000,
                "12/10/2010","4321","Benja","Cortina","2/09/1985",30,"Pablo neruda");
        this.empleados.agregar(em);
        this.admis.agregar(ad);
    }
    
    
}
