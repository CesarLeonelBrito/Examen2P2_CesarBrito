package examen2p2_cesarbrito;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdministrarBateria {

    private ArrayList<Bateria> listaBaterias = new ArrayList();
    private File archivo = null;

    public AdministrarBateria(String path) {
        archivo = new File(path);
    }

    public ArrayList<Bateria> getListaBaterias() {
        return listaBaterias;
    }

    public void setListaBaterias(ArrayList<Bateria> listaBaterias) {
        this.listaBaterias = listaBaterias;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaBaterias;
    }

    public void setBateria(Bateria p) {
        this.listaBaterias.add(p);
    }

    public void cargarArchivo() {
        try {
            listaBaterias = new ArrayList();
            Bateria temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Bateria) objeto.readObject()) != null) {
                        listaBaterias.add(temp);
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
            for (Bateria t : listaBaterias) {
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
