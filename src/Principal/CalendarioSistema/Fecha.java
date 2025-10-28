package Principal.CalendarioSistema;

//Imports
import java.util.GregorianCalendar;
import javax.swing.JLabel;

public class Fecha {

    private JLabel labelFecha;

    //Constructor
    public Fecha(JLabel labelFecha) {
        this.labelFecha = labelFecha;
    }

    //Metodo que inicia el funcionamiento del objeto
    public void iniciar() {

        GregorianCalendar cal = new GregorianCalendar();
        int dia = cal.get(cal.DAY_OF_MONTH);
        int mes = cal.get(cal.MONTH) + 1;
        int year = cal.get(cal.YEAR);

        if (mes < 10) {

            if (dia < 10) {
                String fecha = "0" + String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(year);
                labelFecha.setText(fecha);
            }

            if (dia >= 10) {
                String fecha = String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(year);
                labelFecha.setText(fecha);
            }

        }

        if (mes >= 10) {

            if (dia < 10) {
                String fecha = "0" + String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(year);
                labelFecha.setText(fecha);
            }

            if (dia >= 10) {
                String fecha = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(year);
                labelFecha.setText(fecha);
            }
        }

    }

}
