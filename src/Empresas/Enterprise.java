package Empresas;

/**
 *
 * @author Daniela
 */
public class Enterprise {

    private String nit;
    private String dir;
    private String rut;
    private String business_name;
    private String city;

    public Enterprise(String nit, String rut, String business_name, String dir, String city) {
        this.nit = nit;
        this.dir = dir;
        this.rut = rut;
        this.business_name = business_name;
        this.city = city;
    }

}
