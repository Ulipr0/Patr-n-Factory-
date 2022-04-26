
package TareaPatronFactory;

import TareaPatronFactory.factory.Electronicos;

public class Computadora implements Electronicos{
    private int almacenamiento;
    private int raam;
    private String marca;
    private boolean ConMochila;
    private boolean ConMouse;

    public Computadora() {
    }
    
    public Computadora(int almacenamiento, int raam, String marca, boolean ConMochila, boolean ConMouse) {
        this.almacenamiento = almacenamiento;
        this.raam = raam;
        this.marca = marca;
        this.ConMochila = ConMochila;
        this.ConMouse = ConMouse;
    }

    Computadora(String computadora_gamer, boolean b, boolean b0, boolean b1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isConMouse() {
        return ConMouse;
    }

    public void setConMouse(boolean ConMouse) {
        this.ConMouse = ConMouse;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRaam() {
        return raam;
    }

    public void setRaam(int raam) {
        this.raam = raam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isConMochila() {
        return ConMochila;
    }

    public void setConMochila(boolean ConMochila) {
        this.ConMochila = ConMochila;
    }

    @Override
    public String toString() {
        return "Computadora{" + "almacenamiento=" + almacenamiento + ", raam=" + raam + ", marca=" + marca + ", ConMochila=" + ConMochila + ", ConMouse=" + ConMouse + '}';
    }

    
    
}
