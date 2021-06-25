package examen2p2_cesarbrito;

import java.io.Serializable;

public class Vehiculo implements Serializable {

    private String marca;
    private String modelo;
    private String tipoCarroceria;
    private int vin;

    private static final long SerialVersionUID = 111L;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String tipoCarroceria, int vin) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCarroceria = tipoCarroceria;
        this.vin = vin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Marca : " + marca + " - VIN : " + vin;
    }

}
