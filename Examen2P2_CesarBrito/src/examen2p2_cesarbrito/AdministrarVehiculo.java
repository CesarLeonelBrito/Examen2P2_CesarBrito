package examen2p2_cesarbrito;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdministrarVehiculo {

    private ArrayList<Vehiculo> listaVehiculos = new ArrayList();
    private File archivo = null;

    public AdministrarVehiculo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaVehiculos;
    }

    public void setVehiculo(Vehiculo p) {
        this.listaVehiculos.add(p);
    }

    public void cargarArchivo() {
        try {
            listaVehiculos = new ArrayList();
            Vehiculo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Vehiculo) objeto.readObject()) != null) {
                        listaVehiculos.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Vehiculo t : listaVehiculos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
