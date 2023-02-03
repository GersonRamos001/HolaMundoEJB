/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.Date;
import javax.ejb.Remote;
/**
 *
 * @author ramos
 */

@Remote
public interface IHolaMundoRemote {
    public String saludo(String SuNombre);
    public String saludoSinParametro();
    public Date fechaDeHoy();
    public String operaciones(int a, int b);
    
    
    
    
}
