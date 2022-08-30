import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a region: ");
        String region = sc.nextLine();
        System.out.println(Region.valueOf(region.toUpperCase(Locale.ROOT)).getSight());
    }
}