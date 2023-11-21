import java.util.Scanner;

public class NilaiLimaMahasiswa03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] namaMahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
        int[] mingguKe = new int[7];
        int[][] nilaiMahasiswa = new int[namaMahasiswa.length][mingguKe.length];

        for (int j = 0; j < mingguKe.length; j++) {
            System.out.print("Masukkan nilai untuk minggu ke-" + (j + 1) + ": \n");
            for (int i = 0; i < namaMahasiswa.length; i++) {
                System.out.print("Nilai " + namaMahasiswa[i] + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }

        tampilkanNilaiMahasiswa(nilaiMahasiswa, namaMahasiswa.length, mingguKe.length);

        // Cari Minggu dengan Nilai Tertinggi
        int mingguTertinggi = cariMingguTertinggi(nilaiMahasiswa, namaMahasiswa.length, mingguKe.length);
        System.out.println("Minggu ke-" + mingguTertinggi + " memiliki nilai tertinggi.");

        // Tampilkan Mahasiswa dengan Nilai Tertinggi
        tampilkanMahasiswaTertinggi(nilaiMahasiswa, namaMahasiswa.length, mingguKe.length);
    }

    // Fungsi untuk menampilkan nilai mahasiswa
    public static void tampilkanNilaiMahasiswa(int[][] nilaiMahasiswa, int[] namaMahasiswa, int[] mingguKe) {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < mingguKe.length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari minggu keberapakah terdapat nilai tertinggi
    public static int cariMingguTertinggi(int[][] nilaiMahasiswa, int[] namaMahasiswa, int[] mingguKe) {
        int mingguTertinggi = 1;
        int nilaiTertinggi = nilaiMahasiswa[0][0];
        for (int j = 0; j < mingguKe.length; j++) {
            int totalNilaiHari = 0;
            for (int i = 0; i < namaMahasiswa.length; i++) {
                totalNilaiHari += nilaiMahasiswa[i][j];
            }
            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                mingguTertinggi = j++;
            }
        }
        return mingguTertinggi;
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi untuk setiap minggu
    public static void tampilkanMahasiswaTertinggi(int[][] nilaiMahasiswa, int[] namaMahasiswa, int[] mingguKe) {
        System.out.println("\nMahasiswa dengan Nilai Tertinggi untuk Setiap Minggu:");
        for (int j = 0; j < mingguKe.length; j++) {
            int nilaiTertinggi = 0;
            int mahasiswaTertinggi = 0;
            for (int i = 0; i < namaMahasiswa.length; i++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaTertinggi = i + 1;
                }
            }
            System.out.println("Minggu ke-" + (j + 1) + ": Mahasiswa ke-" + mahasiswaTertinggi);
        }
    }
}
