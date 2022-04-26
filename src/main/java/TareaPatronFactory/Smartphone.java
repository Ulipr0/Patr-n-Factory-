
package TareaPatronFactory;

import TareaPatronFactory.factory.Electronicos;

public class Smartphone implements Electronicos{
    private int almacenamiento;
    private int raam;
    private String marca;
    private boolean carcasa;
    private boolean cargaRapida;

    public Smartphone() {
    }

    public Smartphone(int akmacenamiento, int raam, String marca, boolean carcasa, boolean cargaRapida) {
        this.almacenamiento = akmacenamiento;
        this.raam = raam;
        this.marca = marca;
        this.carcasa = carcasa;
        this.cargaRapida = cargaRapida;
    }

    Smartphone(String celular_gamer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Smartphone(String celular_gamer, boolean b, boolean b0, boolean b1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isCargaRapida() {
        return cargaRapida;
    }

    public void setCargaRapida(boolean cargaRapida) {
        this.cargaRapida = cargaRapida;
    }

    public int getAkmacenamiento() {
        return almacenamiento;
    }

    public void setAkmacenamiento(int akmacenamiento) {
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

    public boolean isCarcasa() {
        return carcasa;
    }

    public void setCarcasa(boolean carcasa) {
        this.carcasa = carcasa;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "akmacenamiento=" + almacenamiento + ", raam=" + raam + ", marca=" + marca + ", carcasa=" + carcasa + ", cargaRapida=" + cargaRapida + '}';
    }
   
}
