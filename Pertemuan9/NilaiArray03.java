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
            for (i = 0; i < nilaiAkhir.length; i++) {
                System.out.print("Masukkan nilai akhir ke-" + i + ":");
                nilaiAkhir[i] = scan.nextInt();
            }

            for (i = 0; i < nilaiAkhir.length; i++) {
                if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus ! ");
                }
                else {
                    System.out.println("Mahasiswa ke-" + i + " tidak lulus ! ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Tutup scanner
            scan.close();
        }
    }
}
