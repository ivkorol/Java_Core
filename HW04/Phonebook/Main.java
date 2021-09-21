package HW04.Phonebook;

public class Main {
    public static void main(String[] args){

        Phonebook phonebook = new Phonebook();
        phonebook.add("Семенов", "+7 916 555-45-55");
        phonebook.add("Семенов", "+7 926 123-45-67");
        phonebook.add("Семенов", "+7 903 471-84-96");
        phonebook.add("Семенов", "+7 929 461-77-96");
        phonebook.add("Кузнецов", "+7 916 777-55-22");
        phonebook.add("Кузнецов", "+7 926 546-88-21");
        phonebook.add("Кузнецов", "+7 905 784-13-91");
        phonebook.add("Ильин", "+7 916 716-98-42");
        phonebook.add("Ильин", "+7 929 461-43-92");

        System.out.println("Телефонный справочник");
        System.out.println("Фамилия : номер(а):");
        phonebook.show();
    }
}