package examen2p2_cesarbrito;

public class Hibrido extends Vehiculo {

    private int kilometros;
    private int pasajeros;
    private int precio;
    private Bateria bateria;

    public Hibrido() {
        super();
    }

    public Hibrido(int kilometros, int pasajeros, int precio, String marca, String modelo, String tipoCarroceria, int vin) {
        super(marca, modelo, tipoCarroceria, vin);
        this.kilometros = kilometros;
        this.pasajeros = pasajeros;
        this.precio = precio;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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
