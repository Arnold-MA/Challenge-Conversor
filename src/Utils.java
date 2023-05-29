import java.util.ArrayList;

public class Utils {

    public static String[] getDeclaraciones(ArrayList<Divisa> divisas) {
        String[] declaraciones = new String[divisas.size()];
        for (int i = 0; i < divisas.size(); i++) {
            declaraciones[i] = divisas.get(i).getDeclaracion();
        }
        return declaraciones;
    }

    public static Divisa getDivisaByDeclaracion(String declaracion, ArrayList<Divisa> divisas) {
        for (Divisa divisa : divisas) {
            if (divisa.getDeclaracion().equals(declaracion))
                return divisa;
        }
        return new Divisa(1, "Soles");
    }
}
