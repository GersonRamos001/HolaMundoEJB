
package test;
import Beans.IHolaMundoRemote;
import java.util.Date;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestHolaMundo {
    public static void main(String[] args) {
        System.out.println("Llamando al EJB...");

        try{
            Context jndi = new InitialContext();
            IHolaMundoRemote saludoEJB = (IHolaMundoRemote) jndi.lookup("java:global/HolaMundo/HolaMundoImp!Beans.IHolaMundoRemote");
            String saludo = saludoEJB.saludo("Gerson Ramos");
            String saludoSin= saludoEJB.saludoSinParametro();
            String operacionesMate= saludoEJB.operaciones(5, 5);
            Date fechaHoy= saludoEJB.fechaDeHoy();
            System.out.println(saludo);
            System.out.println("*****************************");
            System.out.println(saludoSin);
            System.out.println("*****************************");
            System.out.println(fechaHoy);
            System.out.println("*****************************");
            System.out.println(operacionesMate);
            
           


        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
