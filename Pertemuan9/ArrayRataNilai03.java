import java.util.Scanner;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        // Variabel
        int nilaiMhs[] = new int[jumlahMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        double rata2Lulus, rata2TidakLulus;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        // Perulangan
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        // Jumlah mahasiswa lulus
        System.out.println("Jumlah mahasiswa lulus adalah : " + jumlahLulus);

        // Rata-rata mahasiswa lulus
        if (jumlahLulus != 0) {
            rata2Lulus = totalLulus / jumlahLulus;
            System.out.println("Rata-rata nilai mahasiswa lulus = " + rata2Lulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus");
        }

        // Jumlah mahasiswa tidak lulus
        System.out.println("Jumlah mahasiswa tidak lulus adalah : " + jumlahTidakLulus);

        // Rata-rata mahasiswa tidak lulus
        if (jumlahTidakLulus != 0) {
            rata2TidakLulus = totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata-rata nilai mahasiswa tidak lulus = " + rata2TidakLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus");
        }

        // Tutup scanner
        sc.close();
    }
}
