import java.util.Scanner;

public class NilaiArray03 {
    public static void main(String[] args) {

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Variabel
        int[] nilaiAkhir = new int[10];

        // Perulangan
        try {
            int i;
            for (i = 0; i < 10; i++) {
                System.out.print("Masukkan nilai akhir ke-" + i + ":");
                nilaiAkhir[i] = scan.nextInt();
            }

            for (i = 0; i < 10; i++) {
                System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Tutup scanner
            scan.close();
        }
    }
}
