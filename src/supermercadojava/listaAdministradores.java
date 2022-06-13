
package supermercadojava;
public class listaAdministradores {
   int contador;
   Administrador[] administrador;

    public listaAdministradores() {
        contador=0;
        this.administrador=new Administrador[20];
    }
    
    public void agregar(Administrador administrador){
        if(this.contador<20){
            this.administrador[this.contador]=administrador;
            this.contador++;
        }else{
            
        }
    }
    public int buscar(String id,String contrasena){
        System.out.println(id+" "+contrasena);
        for(int i= 0;i<this.contador;i++){
            if(id.equals(this.administrador[i].getIdentificador())&& contrasena.equals(this.administrador[i].getContrasena())){
                return i;
            }
        }
        return -1;
    }
}
