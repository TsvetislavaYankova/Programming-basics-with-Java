import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Inches = ");
        double inches = Double.parseDouble(scr.nextLine());
        double centimetres = inches * 2.54;
        System.out.println("Centimeters = " + centimetres);
    }
}
