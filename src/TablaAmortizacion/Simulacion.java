package TablaAmortizacion;

public class Simulacion extends InterfazInicialPrestamo {

    int monto, anos, cuotas;
    String tipoPrestamo;
    double cuotaTabla, inte, interes;
    double amortizacion = 0, saldo = 0, interesCapital = 0;

    public void obtenerDatos(int monto, int cuotas, String tipoPrestamo) {
        this.monto = monto;
        this.cuotas = cuotas;
        this.tipoPrestamo = tipoPrestamo;
    }

    public void calcularCuotaAmortizacion() {

        if ("Credito Libre Inversión (SerFin)".equals(tipoPrestamo)) {
            interes = 1;
        }

        if ("Credito Vehiculo (SerFin)".equals(tipoPrestamo)) {
            interes = 1.5;
        }

        if ("Credito Vivienda (Otra entidad financiera)".equals(tipoPrestamo)) {
            interes = 1.5;
        }

        if ("Credito Libre Inversión (Otra entidad financiera)".equals(tipoPrestamo)) {
            interes = 2.5;
        }

        if ("Credito Vehiculo (Otra entidad financiera)".equals(tipoPrestamo)) {
            interes = 1;
        }

        inte = interes / 100;

        double numerador, denominador, division, parentesis, exponente;

        parentesis = 1 + inte;
        exponente = Math.pow(parentesis, cuotas);
        numerador = inte * exponente;
        denominador = exponente - 1;
        division = (numerador / denominador);

        this.cuotaTabla = monto * division;

    }

}
