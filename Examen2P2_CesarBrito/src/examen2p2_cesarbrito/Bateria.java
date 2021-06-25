package examen2p2_cesarbrito;

import java.io.Serializable;

public class Bateria implements Serializable {

    private String marca;
    private String autonomia;
    private String tipoVehiculo;
    private int capacidad;
    private int modulos;
    private int carga;
    private int tiempo;

    private static final long SerialVersionUID = 222L;

    public Bateria() {
    }

    public Bateria(String marca, String autonomia, String tipoVehiculo, int capacidad, int modulos, int carga, int tiempo) {
        this.marca = marca;
        this.autonomia = autonomia;
        this.tipoVehiculo = tipoVehiculo;
        this.capacidad = capacidad;
        this.modulos = modulos;
        this.carga = carga;
        this.tiempo = tiempo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getModulos() {
        return modulos;
    }

    public void setModulos(int modulos) {
        this.modulos = modulos;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return marca;
    }

}
