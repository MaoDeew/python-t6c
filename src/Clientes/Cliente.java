package Clientes;

//Imports
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import javax.swing.JOptionPane;

//Clase
public class Cliente implements Serializable {

    //Datos Personales Cliente
    String nombre, apellido, cedula, edad, ciudad, direccion, celular, estadoCivil;

    //Datos Empresa del Cliente
    String ocupacion, empresa, ingresos, tipoContrato, duracionEmpresa;

    //Ubicacion Registro Clientes .txt
    String ubicacionArchivo = "E:\\Documentos Programacion\\NetBeans\\POO\\SerFin\\src\\Clientes\\registroClientes.txt";

    //Constructor
    public Cliente(String nombre, String apellido, String cedula, String edad, String ciudad, String direccion,
            String celular, String estadoCivil, String ocupacion, String empresa, String ingresos,
            String tipoContrato, String duracionEmpresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.celular = celular;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.empresa = empresa;
        this.ingresos = ingresos;
        this.tipoContrato = tipoContrato;
        this.duracionEmpresa = duracionEmpresa;
    }

    //Metodos
    public void guardarClientesDatosPersonales() {

        File archivo = new File(ubicacionArchivo);
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try {
            w = new FileWriter(archivo, true);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            String lineaTexto = nombre + "/" + apellido + "/" + cedula + "/" + edad + "/" + ciudad + "/" + direccion + "/" + celular + "/" + estadoCivil + "/"
                    + ocupacion + "/" + empresa + "/" + ingresos + "/" + tipoContrato + "/" + duracionEmpresa;

            wr.write(lineaTexto);
            wr.println();
            wr.close();
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error. Intente de nuevo. " + e);
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

    public String getOcupacion() {
        return ocupacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getIngresos() {
        return ingresos;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public String getDuracionEmpresa() {
        return duracionEmpresa;
    }
    
}
