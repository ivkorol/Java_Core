package HW02;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Некорректный размер массива");
    }
}
