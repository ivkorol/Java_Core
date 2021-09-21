package HW04.Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> map = new HashMap<>();

    public Phonebook() {
    }

    public void add(String Name, String number) {
        if (map.containsKey(Name)) {
            List<String> numbers = map.get(Name);
            numbers.add(number);
        }
        else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            map.put(Name, numbers);
        }
    }

    public void show() {
        map.keySet().stream().sorted().forEach((String Name) -> {
            System.out.print(Name + " : ");
            System.out.println(String.join(" , ", this.get(Name)) + ".");
        });
    }

    private List<String> get(String Name) {
        return  map.get(Name);
    }
}