public class Divisa {

    private double conversion;
    private String nombre;
    private String simbolo;
    private String declaracion;

    public Divisa (double conversion, String nombre, String simbolo) {
        this.conversion = conversion;
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.declaracion = "De Soles a " + nombre;
    }

    public Divisa(double conversion, String nombre) {
        this.conversion = conversion;
        this.nombre = "Soles";
        this.simbolo = "S/";
        this.declaracion = "De " + nombre + " a Soles";
    }

    public double getConversion() {
        return conversion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getDeclaracion() {
        return declaracion;
    }
}
