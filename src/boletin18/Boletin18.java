/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;
import com.fred.Infromacion.Persoal;
/**
 *
 * @author fojomars
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoal paquito = new Persoal("698956234", "paquitomartinez@gmail.com");
        Persoal anita = new Persoal("697265546", "anitamartinez@gmail.com");
        Academica paco = new Academica("Paco", 5, paquito);
        Academica ana = new Academica("Ana", 7, anita);
        paco.setNota(8);
        System.out.println(paco.toString());
        System.out.println(ana.toString());
    }
    
}
