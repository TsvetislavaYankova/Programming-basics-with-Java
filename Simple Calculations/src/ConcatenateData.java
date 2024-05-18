import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String firstName = scr.nextLine();
        String lastName = scr.nextLine();
        int age = Integer.parseInt(scr.nextLine());
        String town = scr.nextLine();
        System.out.println("You are " + firstName + " "+ lastName +"," +
                " a " + age + "-years old person from " + town +".");
    }
}
