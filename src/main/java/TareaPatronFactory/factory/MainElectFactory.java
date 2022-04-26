package TareaPatronFactory.factory;

import java.util.Scanner;

public class MainElectFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
         
        System.out.println("Aparato deseado");
        System.out.println(Electronicos.computadoraGamer + " Computadora gamer");
        System.out.println(Electronicos.computadoraEscritorio + " Computadora de escritorio");
        System.out.println(Electronicos.laptop + " Laptop");
        System.out.println(Electronicos.celularGamer + " Celular gamer");
        System.out.println(Electronicos.celularLlamMen + " Celular solo llamadas y mensajes");
        System.out.println(Electronicos.gamaAlta + " Gama alta");
        System.out.println(Electronicos.tabletGamaMedia +" Tablet gama media");
        System.out.println(Electronicos.tabletGamaAlta + " Tablet gama alta");
        
        try {
            System.out.print("Selecciona un digito");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No seleccionaste un número");
        }
        Electronicos Main = FactoryElectronica.createElectronicos(eleccion);
        System.out.println(Main.toString());
    }
    
}
