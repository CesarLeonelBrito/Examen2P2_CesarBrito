package examen2p2_cesarbrito;

public class HibridoEnchufable extends Vehiculo {

    private int capacidadMaletero;
    private int galones;
    private Bateria bateria;

    public HibridoEnchufable() {
        super();
    }

    public HibridoEnchufable(int capacidadMaletero, int galones, String marca, String modelo, String tipoCarroceria, int vin) {
        super(marca, modelo, tipoCarroceria, vin);
        this.capacidadMaletero = capacidadMaletero;
        this.galones = galones;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getGalones() {
        return galones;
    }

    public void setGalones(int galones) {
        this.galones = galones;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
