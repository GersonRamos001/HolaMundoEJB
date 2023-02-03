
package Beans;

import java.util.Date;
import javax.ejb.Stateless;


@Stateless
public class HolaMundoImp implements IHolaMundoRemote{
    @Override
    public String saludo(String SuNombre){
        System.out.println("Ejecutando...");
        return "Buenas Noches " + SuNombre;
    }
    
    public String saludoSinParametro(){
       return "Buenas noches yo no necesito parametros";
    }

    @Override
    public Date fechaDeHoy() {
       return new java.util.Date(); 
    }

    @Override
    public String operaciones(int a, int b) {
        
        return "El resultado de la suma es: "+ (a + b)
                +"\n El resultado de la resta es: "+ (a-b)
                +"\n El resultado de la division es: "+(a/b)
                +"\nEl resultado de la multiplicacion es: "+(a*b);
      
        
    }
}