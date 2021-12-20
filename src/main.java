
import java.util.Scanner;
import java.util.jar.JarFile;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("Recursive Fonksiyon İle Üslü Sayı Bulma");
        System.out.println("----------------------------------------------------");
        System.out.print("Lütfen taban değerini Giriniz : ");
        double number = scanner.nextInt();
        System.out.print("Lütfen üs değerini Giriniz : ");
        double power = scanner.nextInt();
        System.out.println("Sonuç : " + recursivePower(number, power));
    }

    public static double recursivePower(double number, double power) {
        Scanner scanner = new Scanner(System.in);
        if (number == number && power == 0) {
            return 1;
        }
        if (power > 0) {
            return recursivePower(number, power - 1) * number;
        } else {
            return recursivePower(number, power + 1) / number;
        }
    }
}
