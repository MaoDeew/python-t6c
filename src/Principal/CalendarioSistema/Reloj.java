package Principal.CalendarioSistema;

//Imports
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Reloj extends Thread {

    private JLabel labelHora;

    //Constructor
    public Reloj(JLabel labelHora) {
        this.labelHora = labelHora;
    }

    //Metodo run con Override de Thread (Hilos)
    @Override
    public void run() {
        while (true) {
            Date hoy = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm a");

            labelHora.setText(s.format(hoy));

            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
