import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Name please: ");
        Scanner scnr = new Scanner(System.in);
        String name = scnr.next();
        System.out.println("hello " + name);
    }
}
