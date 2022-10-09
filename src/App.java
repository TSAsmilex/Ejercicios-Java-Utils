import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.concurrent.ThreadLocalRandom;


public class App {
    public static void main(String[] args) throws Exception {
        var array = ejercicio1(10);

        array.forEach(n -> System.out.print(n + ", "));
        System.out.println("\n");

        String Apetecan = "Apetecan";
        System.out.println("Apetecan -> " + iteradores(Apetecan, "a"));

        ejercicioArrayDeque();
        ejercicioPatients();
        
        String cadena = "Las palabras únicas que hay en toda esta cadana son las siguientes: ";
        System.out.println(cadena + palabrasUnicas(cadena));

        String cadena2 = "Y los caracteres únicos de esta cadena son los siguientes: ";
        System.out.println(cadena2 + caracteresUnicos(cadena2));

        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Jobye", 411796621);
        phonebook.add("Moises", 416767743);
        phonebook.add("Berni", 370328190);
        phonebook.add("Brinna", 154750423);
        phonebook.add("Barbee", 437677783);
        phonebook.add("Corrina", 277487400);
        phonebook.add("Birgitta", 266837694);
        phonebook.add("Merrili", 146435154);
        phonebook.add("Rolf", 743337192);
        phonebook.add("Mic", 827953893);

        System.out.println("El teléfono de Mic es " + phonebook.number("Mic"));

        try {
            System.out.println("El teléfono de Apetecan es " + phonebook.number("Apetecan"));
        }
        catch (NullPointerException eNullPointerException) {
            System.out.println("El teléfono de Apetecán no existe");
        }
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


    public static void ejercicioArrayDeque() {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        for (int i = 0; i <= 100; i++) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + ", ");
        }
        System.out.println("");
    }


    public static void ejercicioPatients() {
        int nPatients = ThreadLocalRandom.current().nextInt(2, 10 + 1);

        PriorityQueue<Patient> pq = new PriorityQueue<>();

        for (int i = 0; i < nPatients; i++) {
            int risk = ThreadLocalRandom.current().nextInt(2, 10 + 1);
            pq.add(new Patient(risk));
        }

        while (!pq.isEmpty()) {
            System.out.println("Riesgo: " + pq.poll().risk);
        }
    }


    public static int palabrasUnicas (String cadena) {
        var hs = new HashSet<String>();
        
        for (var c: cadena.split(" ")) {
            hs.add(c.toLowerCase());
        }

        return hs.size();
    }

    
    public static int caracteresUnicos(String cadena) {
        var hs = new HashSet<String>();
        
        for (var c: cadena.split("")) {
            hs.add(c.toLowerCase());
        }

        return hs.size();
    }
}
