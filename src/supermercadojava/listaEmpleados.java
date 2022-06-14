
package supermercadojava;


public class listaEmpleados {
    int contador;
    Empleado[] empleados;

    public listaEmpleados() {
        this.empleados=new Empleado[20];
        this.contador=0;
    }
    
    public void agregar(Empleado empleado){
       if(this.contador<20){
           this.empleados[this.contador]=empleado;
           this.contador++;
       }else{
       }
    }

    
    public int buscar(String id,String contrasena){
        for(int i= 0;i<this.contador;i++){
            if(id.equals(this.empleados[i].getIdentificador())&& contrasena.equals(this.empleados[i].getContrasena())){
                return i;
            }
        }
        return -1;
    }
    public int buscar(String id){
        System.out.println(id);
        for(int i= 0;i<this.contador;i++){
            if(id.equals(this.empleados[i].getIdentificador())){
                return i;
            }
        }
        return -1;
    }
    public int eliminar(String id){
        int codigo=-1;
        for(int i=0;i<this.contador;i++){
            if(this.empleados[i].getIdentificador().equals(id)){
                codigo=i;
                System.out.print("El codigo es"+codigo);
                break;
            }
        }  
        if(codigo!=-1){
        this.elimination(codigo);
        this.contador--;
        }
        return codigo;
    }
    public int elimination(int position){
        for(int i=position;i<this.contador-position;i++)
	{
            if(i+1>this.contador-1)
		return 1;
            else
		this.empleados[i] = this.empleados[i+1];
	}
	return 1;
    }
    public Object[] imprimir(){
        Object[] arreglo =new Object[100];
        for(int i =0;i<this.contador;i++){
            arreglo[i]=this.empleados[i];
        }
        return arreglo;
    }    
}
