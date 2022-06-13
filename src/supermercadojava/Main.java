
package supermercadojava;

public class Main {
    
    public static void main(String[] args) {
        Datos datos=new Datos();
        Login login=new Login(datos);
        login.setVisible(true);
    }
    
}
