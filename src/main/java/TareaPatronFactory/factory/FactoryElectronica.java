
package TareaPatronFactory.factory;

import TareaPatronFactory.Computadora;
import TareaPatronFactory.Smartphone;
import TareaPatronFactory.Tablet;

public class FactoryElectronica {
    public static Electronicos createElectronicos(int tipo){
        switch (tipo) {
            case Electronicos.computadoraGamer:
                    return new Computadora(tipo, tipo, "Marca", true, true);
            
            case Electronicos.computadoraEscritorio:
                    return new Computadora(tipo, tipo, "marca", true, true);
                    
            case Electronicos.laptop:
                    return new Computadora(tipo, tipo, "marca", true, true);
            
            case Smartphone.celularGamer:
                    return new Smartphone(tipo, tipo, "marca", true, true);
                    
            case Smartphone.celularLlamMen:
                return new Smartphone(tipo, tipo, "marca", true, true);
                
            case Smartphone.gamaAlta:
                return new Smartphone(tipo, tipo, "marca", true, true);
                
            case Tablet.tabletGamaMedia:
                return new Tablet(tipo, tipo, "marca", true, true);
                
            case Tablet.tabletGamaAlta:
                return new Tablet(tipo, tipo, "marca", true, true);
                    
            default:
                throw new AssertionError();
        }
    }        
}
