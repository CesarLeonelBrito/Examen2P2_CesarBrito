package examen2p2_cesarbrito;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Ensamblar extends Thread {

    private JProgressBar progBar;
    private Vehiculo vehiculo;
    private Bateria bateria;
    private boolean avanzar;
    private boolean vive;

    public Ensamblar(JProgressBar progBar) {
        this.progBar = progBar;
        avanzar = true;
        vive = true;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar.setString("Tiempo");
                progBar.setMaximum(bateria.getTiempo());
                while (progBar.getValue() < bateria.getTiempo()) {
                    progBar.setValue(progBar.getValue() + 1);
                    progBar.setString(progBar.getValue() + " segundos");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                if (progBar.getValue() == bateria.getTiempo()) {
                    AdministrarVehiculo av = new AdministrarVehiculo("./Ensamblados.cbm");
                    av.cargarArchivo();
                    if (vehiculo instanceof Hibrido) {
                        Hibrido x = (Hibrido) vehiculo;
                        x.setBateria(bateria);
                        av.getListaVehiculos().add(x);
                    } else if (vehiculo instanceof HibridoEnchufable) {
                        HibridoEnchufable x = (HibridoEnchufable) vehiculo;
                        x.setBateria(bateria);
                        av.getListaVehiculos().add(x);
                    } else {
                        ElectricoPuro x = (ElectricoPuro) vehiculo;
                        x.setBateria(bateria);
                        av.getListaVehiculos().add(x);
                    }
                    av.escribirArchivo();
                    vive = false;
                    JOptionPane.showMessageDialog(null, "Se ha agregado exitosamente");
                }
            }
        }

    }

}
