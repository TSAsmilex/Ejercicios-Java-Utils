import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        var array = ejercicio1(10);

        array.forEach(n -> System.out.println(n + ", "));
    }

    public static ArrayList<Integer> ejercicio1(int n) {
        var array = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            array.add(i);
        }

        return array;
    }
}
