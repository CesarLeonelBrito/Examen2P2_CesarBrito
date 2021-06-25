package examen2p2_cesarbrito;

public class Combustion extends Vehiculo {

    private int cilindrada;
    private int motores;
    private int consumo;

    public Combustion() {
        super();
    }

    public Combustion(int cilindrada, int motores, int consumo, String marca, String modelo, String tipoCarroceria, int vin) {
        super(marca, modelo, tipoCarroceria, vin);
        this.cilindrada = cilindrada;
        this.motores = motores;
        this.consumo = consumo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
