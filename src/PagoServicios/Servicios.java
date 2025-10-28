package PagoServicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public class Servicios implements Serializable {
    //Datos del servicio

    String nombre, nit, descripcion, costoMensual;

    String ubicacionArchivo = "E:\\Documentos Programacion\\NetBeans\\POO\\SerFin\\src\\PagoServicios\\serviciosRegistrados.txt";

    public Servicios(String nombre, String nit, String descripcion, String costoMensual) {
        this.nombre = nombre;
        this.nit = nit;
        this.descripcion = descripcion;
        this.costoMensual = costoMensual;
    }

    public void guardarServicio() {

        File listado = new File(ubicacionArchivo);
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        try {
            w = new FileWriter(ubicacionArchivo, Boolean.TRUE);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            String orden = nombre + "/" + nit + "/" + descripcion + "/" + costoMensual;

            wr.write(orden);
            wr.println();
            wr.close();
            bw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCostoMensual() {
        return costoMensual;
    }

}
