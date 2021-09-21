package HW04;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Cat", "Dog", "Monkey", "Horse", "Box",
                "Dog", "Cow", "Goat", "Cat", "Bird",
                "Cat", "Monkey", "Cat", "Bird", "Bear",
                "Horse", "Bird", "Dog", "Human", "Monkey"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words);
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}

