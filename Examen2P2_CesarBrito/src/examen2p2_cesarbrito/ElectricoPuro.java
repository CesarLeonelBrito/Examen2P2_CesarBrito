package examen2p2_cesarbrito;

public class ElectricoPuro extends Vehiculo {

    private int coeficiente;
    private int motores;
    private int recarga;
    private Bateria bateria;

    public ElectricoPuro() {
        super();
    }

    public ElectricoPuro(int coeficiente, int motores, int recarga, String marca, String modelo, String tipoCarroceria, int vin) {
        super(marca, modelo, tipoCarroceria, vin);
        this.coeficiente = coeficiente;
        this.motores = motores;
        this.recarga = recarga;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
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
