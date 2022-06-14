 
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
        Empleado em=new Empleado("Alo","MATUTINO",2500,"Pasillos","12345","Alondra"
                ,"Yazmín","12/01/2001",20,"AV. AVIACIÓN");
        Administrador ad=new Administrador("admin","Oficinas","MIXTO",5000,
                "12/10/2021","admin","BENJAMÍN","CORTINA","11/09/2002",19,"AV. ESCOCIO");
        this.empleados.agregar(em);
        this.admis.agregar(ad);
    }
    
    
}
