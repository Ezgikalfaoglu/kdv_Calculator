import java.util.Scanner;

public class kdv_CALCULATOR {
    public static void main(String[] args) {
        double tutar;
        Scanner scanner = new Scanner(System.in);

        System.out.print("KDV'siz tutar: ");
        tutar = scanner.nextDouble(); // You need to assign the input value to the tutar variable

        double yeniTutar = tutar + (tutar * 18 / 100); // Calculate the KDV-included price
        System.out.println("KDV'li tutar: " + yeniTutar);

        double kdvTutar = tutar * 18 / 100; // Calculate the KDV amount
        System.out.println("KDV tutarı: " + kdvTutar);

        scanner.close();
    }
}