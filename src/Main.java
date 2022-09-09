
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Tommer til centimeter udregner");
        System.out.println("Indtast venligst en værdi");

        final double tommer = s.nextDouble();
        double centimeters = tommer * 2.54;

        System.out.println(tommer + " tommer svarer til " + centimeters + "cm");
    }
}