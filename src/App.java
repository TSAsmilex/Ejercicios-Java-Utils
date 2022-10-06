import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        var array = ejercicio1(10);

        array.forEach(n -> System.out.print(n + ", "));
        System.out.println("\n");

        String Apetecan = "Apetecan";
        System.out.println("Apetecan -> " + iteradores(Apetecan, "a"));

    }

    public static ArrayList<Integer> ejercicio1(int n) {
        var array = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            array.add(i);
        }

        return array;
    }

    public static String iteradores(String cadena, String letra) {
        var cadena_arraylist = new ArrayList<String>(
            Arrays.asList(cadena.split(""))
        );

        var it = cadena_arraylist.iterator();

        while (it.hasNext()) {
            String actual = it.next();

            if (actual.compareTo(letra) == 0) {
                it.remove();
            }
        }

        cadena = new String();
        for (var c: cadena_arraylist) {
            cadena += c;
        }

        return cadena;
    }
}
