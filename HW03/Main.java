package HW03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Задание 1.1
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        swap(arr1,1,4);

        //Задание 1.2
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);

        //Задание 2
        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();

        System.out.println("Задание 2");
        System.out.println("Количество фруктов: ");

        orange.addFruit(new Orange(),10);
        orange1.addFruit(new Orange(),0);
        apple.addFruit(new Apple(),8);
        apple1.addFruit(new Apple(),0);

        System.out.println("Box 1: "+orange.getWeight());
        System.out.println("Box 2: "+orange1.getWeight());
        System.out.println("Box 3: "+apple.getWeight());
        System.out.println("Box 4: "+apple1.getWeight());
        System.out.println("Сравним коробки:");
        System.out.println("Box 1 равно box 3: "+orange.compare(apple));
        System.out.println("Box 2 равно box 4: "+orange1.compare(apple1));

        System.out.println("Пересыпаем фрукты");
        orange.pourTo(orange1);
        apple.pourTo(apple1);

        System.out.println("Взвесим коробки:");
        System.out.println("Box 1: "+orange.getWeight());
        System.out.println("Box 2: "+orange1.getWeight());
        System.out.println("Box 3: "+apple.getWeight());
        System.out.println("Box 4: "+apple1.getWeight());


    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задание 1.1: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Массив после изменения: "+Arrays.toString(arr));
        System.out.println("____________________");
    }
    public static <T> void asList(T[]arr){

        ArrayList<T> arr2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Задание 1.2. Преобразование массива :"+arr2);
        System.out.println("____________________");
    }
}
