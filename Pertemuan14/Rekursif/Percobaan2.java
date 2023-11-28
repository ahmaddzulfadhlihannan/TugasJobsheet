
/**
 * Percobaan2
 */
import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int n, int y) {
        if (y == 0) {
            System.out.print("1 ");
            return (1);
        } else {
            System.out.print(n + "*");
            return (n * hitungPangkat(n, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat, perhitungan;
        System.out.print("Bilangan yang ingin dihitung :");
        bilangan = sc.nextInt();
        System.out.print("Pangkat :");
        pangkat = sc.nextInt();
        perhitungan = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + perhitungan);
        sc.close();
    }
}