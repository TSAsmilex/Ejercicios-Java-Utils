import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, Integer> book = new HashMap<>();

    public PhoneBook() {

    }

    public void add(String name, int number) {
        book.put(name, number);
    }

    public int number (String name) {
        return book.get(name);
    }
}
