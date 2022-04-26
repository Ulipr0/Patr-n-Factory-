
package TareaPatronFactory;

import TareaPatronFactory.factory.Electronicos;

public class Tablet implements Electronicos{
    private int almacenamiento;
    private int raam;
    private String marca;
    private boolean pen;
    private boolean keyboard;

    public Tablet() {
    }

    public Tablet(int almacenamiento, int raam, String marca, boolean pen, boolean keyboard) {
        this.almacenamiento = almacenamiento;
        this.raam = raam;
        this.marca = marca;
        this.pen = pen;
        this.keyboard = keyboard;
    }

    Tablet(String tablet_gama_media) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isKeyboard() {
        return keyboard;
    }

    public void setKeyboard(boolean keyboard) {
        this.keyboard = keyboard;
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

    public boolean isPen() {
        return pen;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "Tablet{" + "almacenamiento=" + almacenamiento + ", raam=" + raam + ", marca=" + marca + ", pen=" + pen + ", keyboard=" + keyboard + '}';
    }
      
}
