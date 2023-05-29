import javax.swing.*;
import java.util.ArrayList;

public class Panels {

    public static final ArrayList<Divisa> divisas = new ArrayList<>(){
        {
            add(new Divisa(0.27, "Dólares", "$"));
            add(new Divisa(0.25, "Euros", "€"));
            add(new Divisa(0.22, "Libras", "£"));
            add(new Divisa(38.24, "Yenes", "¥"));
            add(new Divisa(360.55, "Wons", "₩"));
            add(new Divisa(3.67, "Dólares"));
            add(new Divisa(3.93, "Euros"));
            add(new Divisa(4.54, "Libras"));
            add(new Divisa(0.026, "Yenes"));
            add(new Divisa(0.0028, "Wons"));
        }
    };

    public static void principal() {
        String[] opciones = {"Conversor de monedas", "Conversor de kilometraje"};
        String seleccionado = (String) JOptionPane
                .showInputDialog(
                        null,
                        "Seleccione una opción de conversión:",
                        "Menu",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                );
        if (seleccionado == null) {
            finalizar();
        } else if (seleccionado.equals("Conversor de monedas")) {
            menuDivisas();
        } else {
            menuKilometraje();
        }
    }

    private static void menuDivisas() {

        String seleccionado = (String) JOptionPane
                .showInputDialog(
                        null,
                        "Elije la moneda a la que deseas convertir tu dinero:",
                        "Monedas",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        Utils.getDeclaraciones(divisas),
                        divisas.get(0).getDeclaracion()
                );
        if (seleccionado != null) {
            ingresarMonto(seleccionado);
        }
        else {
            principal();
        }
    }

    private static void menuKilometraje() {
        String[] opciones = {"Kilómetros a millas", "Millas a kilómetros"};
        String seleccionado = (String) JOptionPane
                .showInputDialog(
                        null,
                        "Seleccione una conversión:",
                        "Menu",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                );
        if (seleccionado == null) {
            principal();
        } else {
            boolean tipo = seleccionado.equals("Kilómetros a millas");
            ingresarDistancia(tipo ? 0.62 : 1.6, tipo ? "km" : "millas", tipo ? "millas" : "km");
        }
    }

    private static void ingresarMonto(String tipoConversion) {

        try {
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir:"));
            if (monto<0) {
                throw new NumberFormatException();
            }
            convertir(monto, Utils.getDivisaByDeclaracion(tipoConversion, divisas));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe de ingresar un número válido.");
            ingresarMonto(tipoConversion);
        } catch (NullPointerException ex) {
            menuDivisas();
        }
    }

    public static void ingresarDistancia(double conversion, String simboloInicial, String simboloFinal){
        try{
            double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de " + simboloInicial + " a convertir:"));
            JOptionPane.showMessageDialog(null, distancia + " " + simboloInicial + " son " + (distancia*conversion) + " " + simboloFinal + ".");
            continuar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe de ingresar un número válido.");
            ingresarDistancia(conversion, simboloInicial, simboloFinal);
        } catch (NullPointerException ex) {
            menuKilometraje();
        }
    }

    private static void convertir(double monto, Divisa divisa) {
        double montoConvertido = monto * divisa.getConversion();
        String nombreMoneda = divisa.getNombre();
        String simbolo = divisa.getSimbolo();
        JOptionPane.showMessageDialog(null, "Tienes " + simbolo + montoConvertido + " " + nombreMoneda);
        continuar();
    }

    private static void continuar() {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        if (confirmacion == 0) {
            principal();
        }
        else {
            finalizar();
        }
    }

    private static void finalizar() {
        JOptionPane.showMessageDialog(null, "Programa terminado.");
    }
}
