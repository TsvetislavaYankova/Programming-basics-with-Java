import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
