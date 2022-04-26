
package TareaPatronFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
         
        System.out.println("Aparato deseado");
        System.out.println("1 Computadora gamer");
        System.out.println("2 Computadora de escritorio");
        System.out.println("3 Laptop");
        System.out.println("4 Celular gamer");
        System.out.println("5 Celular solo llamadas y mensajes");
        System.out.println("6 Gama alta");
        System.out.println("7 Tablet gama media");
        System.out.println("8 Tablet gama alta");
        
        try {
            System.out.print("Selecciona un digito");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No seleccionaste un número");
        }
        
        switch (eleccion) {
            case 1 -> {
                Computadora cg = new Computadora("computadora_gamer", true, true, true);
                System.out.println( cg );
            }
            case 2 -> {
                Computadora ce = new Computadora("Computadora escritorio", false, true, false);
                System.out.println( ce );
            }
                
            case 3 -> {
                Computadora cL = new Computadora("Laptop", true, false,false);
                System.out.println( cL );
            }
            case 4 -> {
                Smartphone sg = new Smartphone("celular_gamer", true, true, true);
                System.out.println( sg );
            }
            case 5 -> {
                Smartphone sL = new Smartphone("Solo llamadas y msn", false, true, true);
                System.out.println( sL );
            }
            case 6 -> {
                Smartphone sA = new Smartphone("Gama Alta", true, false,false);
                System.out.println( sA );
            }
            case 7 -> {
                Tablet tm = new Tablet(eleccion, eleccion, "marca" , true, true);
                System.out.println( tm );
            }
            case 8 -> {
                Tablet ta = new Tablet(eleccion, eleccion,"Tablet gama alta" , true, true);
                System.out.println( ta );
            }    
                
            default -> throw new AssertionError();
        }
    }   
}
