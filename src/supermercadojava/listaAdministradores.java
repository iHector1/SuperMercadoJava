
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
    
}
