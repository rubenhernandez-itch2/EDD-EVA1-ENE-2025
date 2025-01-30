/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_manejo_memoria;

/**
 *
 * @author ruben
 */
public class EVA1_1_MANEJO_MEMORIA {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA MAIN");
        A();
        System.out.println("TERMINA MAIN");
    }    
    public static void A(){
        System.out.println("INICIA A");
        B();
        System.out.println("TERMINA A");
    }    
    public static void B(){
        System.out.println("INICIA B");
        System.out.println("TERMINA B");
    }    
}
