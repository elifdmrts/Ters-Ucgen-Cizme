import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int basamakSayısı = scanner.nextInt();

        for (int i = basamakSayısı; i >= 1; i--) {
            for (int j = basamakSayısı - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}