import java.util.Scanner;

public class Tugas1JobsheetP903 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Input jumlah elemen
        System.out.print("Masukkan jumlah elemen : ");
        int jumlahElemen = sc.nextInt();

        // Variabel
        int nilaiElemen[] = new int[jumlahElemen];
        int totalElemen = 0, nilaiTertinggi = Integer.MIN_VALUE, nilaiTerendah = Integer.MAX_VALUE;
        double rata2;

        // Perulangan
        for (int i = 0; i < nilaiElemen.length; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + " : ");
            nilaiElemen[i] = sc.nextInt();
            totalElemen += nilaiElemen[i];
            if (nilaiElemen[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiElemen[i];
            }
            if (nilaiElemen[i] < nilaiTerendah) {
                nilaiTerendah = nilaiElemen[i];
            }
            }
        
        // Output nilai
        System.out.println("Nilai elemen tertinggi adalah : " + nilaiTertinggi);
        System.out.println("Nilai elemen terendah adalah : " + nilaiTerendah);

        //Rata-rata
        rata2 = (double) totalElemen / nilaiElemen.length;
        System.out.println("Rata-rata semua nilai adalah : " + rata2);
        
        // Tutup scanner
        sc.close();
    }
}
