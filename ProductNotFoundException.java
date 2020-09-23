package lesson3;

public class ProductNotFoundException extends RuntimeException{

    public void printStackTrace(String s) {
        System.out.println(s);
    }
}
