
package ejercicio.pkg3.join;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gallegomanuel88
 */
public class Ejercicio3Join extends Thread{

    public Ejercicio3Join (String str){
        super (str);
    }
    
    static int hilo = 0;
    
    public void run () {
        
        System.out.println(getName()+" comenzado");
        
        
        if (hilo < 5){
            hilo++;
             
            Thread th = new Ejercicio3Join ("Hilo "+hilo); 
            th.start ();
            try {
                th.join();
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else {
            try {
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        /**
        if (hilo == 0){
            hilo++;
            Thread th = new Ejercicio3Join ("Hilo "+hilo);
            th.start ();
            try {
                th.join();
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 1){
            hilo++;
            Thread th = new Ejercicio3Join ("Hilo "+hilo);
            th.start ();
            try {
                th.join();
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 2){
            hilo++;
            Thread th = new Ejercicio3Join ("Hilo "+hilo);
            th.start ();
            try {
                th.join();
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 3){
            hilo++;
            Thread th = new Ejercicio3Join ("Hilo "+hilo);
            th.start ();
            try {
                th.join();
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 4){
            hilo++;
            Thread th = new Ejercicio3Join ("Hilo "+hilo);
            th.start ();
            try {
                th.join();
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 5){
            hilo++;
            try {
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3Join.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        */
        System.out.println(getName()+" terminado");
    }
    /**
     * Metodo que lanza 10 veces un sleep entre 100 y 600 milisegundos aleatoriamente
     * @throws InterruptedException 
     */
    public void metodo () throws InterruptedException{
        for (int i = 0; i < 9; i++){
            int tiempoAleatorio = (int) Math.floor(Math.random()*600+100);
            Thread.sleep(tiempoAleatorio);
            System.out.println("bucle "+this.getName());
        }
    }
    
    public static void main(String[] args) {
        Thread th = new Ejercicio3Join ("Hilo "+hilo);
        th.start ();
    }
    
}
