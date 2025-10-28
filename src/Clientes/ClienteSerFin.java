package Clientes;

//Imports
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class ClienteSerFin implements Serializable {

    //Datos Personales
    String nombre, apellido, cedula, edad, ciudad, direccion, celular, estadoCivil;

    //Prestamo Generado
    String tipoPrestamo, modalidadPago, anosPago, numCuotas, montoPrestamo;

    String ubicacion = "E:\\Documentos Programacion\\NetBeans\\POO\\SerFin\\src\\Clientes\\clientesPrestamo.txt";

    public void datosClienteConPrestamo(String nombre, String apellido, String cedula, String edad, String ciudad, String direccion,
            String celular, String estadoCivil, String tipoPrestamo, String modalidadPago, String anosPago, String numCuotas,
            String montoPrestamo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.celular = celular;
        this.estadoCivil = estadoCivil;
        this.tipoPrestamo = tipoPrestamo;
        this.modalidadPago = modalidadPago;
        this.anosPago = anosPago;
        this.numCuotas = numCuotas;
        this.montoPrestamo = montoPrestamo;
    }

    public void guardarClienteConPrestamo() {

        File archivo = new File(ubicacion);
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try {
            w = new FileWriter(archivo, Boolean.TRUE);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            String lineaTexto = nombre + "/" + apellido + "/" + cedula + "/" + edad + "/" + ciudad + "/" + direccion + "/" + celular + "/" + estadoCivil + "/"
                    + tipoPrestamo + "/" + modalidadPago + "/" + anosPago + "/" + numCuotas + "/" + montoPrestamo;

            wr.write(lineaTexto);
            wr.println();
            wr.close();
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error. Intente de nuevo." + e);
        }

    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public String getModalidadPago() {
        return modalidadPago;
    }

    public String getAnosPago() {
        return anosPago;
    }

}
