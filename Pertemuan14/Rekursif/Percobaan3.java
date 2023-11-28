
/**
 * Percobaan3
 */
import java.util.Scanner;

public class Percobaan3 {

    static double hitungLaba(double saldo, int tahun) {
        // Base case
        if (tahun == 0) {
            return (saldo);
        }
        // Recursion call
        else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc.nextDouble();
        System.out.print("amanya investasi (tahun) : ");
        tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + "tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));

        sc.close();
    }
}