import java.util.Scanner;

public class NilaiMahasiswa03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Input Jumlah Mahasiswa dan Jumlah Minggu
        System.out.print("Masukkan jumlah mahasiswa: ");
        int namaMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah minggu: ");
        int mingguKe = scanner.nextInt();
        // Inisialisasi Array 2 Dimensi
        int[][] nilaiMahasiswa = new int[namaMahasiswa][mingguKe];
        // Input Nilai Minggu
        for (int j = 0; j < mingguKe; j++) {
            System.out.print("Masukkan nilai untuk minggu ke-" + (j + 1) + ": \n");
            for (int i = 0; i < namaMahasiswa; i++) {
                System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
        tampilkanNilaiMahasiswa(nilaiMahasiswa, namaMahasiswa, mingguKe);
        // Cari Minggu dengan Nilai Tertinggi
        int mingguTertinggi = cariMingguTertinggi(nilaiMahasiswa, namaMahasiswa, mingguKe);
        System.out.println("Minggu ke-" + mingguTertinggi + " memiliki nilai tertinggi.");
        // Tampilkan Mahasiswa dengan Nilai Tertinggi
        tampilkanMahasiswaTertinggi(nilaiMahasiswa, namaMahasiswa, mingguKe);
    }

    // Fungsi untuk input nilai mahasiswa
    public static void inputNilaiMahasiswa(int[][] nilaiMahasiswa, int minggu, int namaMahasiswa) {
        System.out.println("Masukkan nilai untuk minggu ke-" + minggu + ": ");
        for (int i = 0; i < namaMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i][minggu] = scanner.nextInt();
        }
    }

    // Fungsi untuk menampilkan nilai mahasiswa
    public static void tampilkanNilaiMahasiswa(int[][] nilaiMahasiswa, int namaMahasiswa, int mingguKe) {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < namaMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < mingguKe; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari minggu keberapakah terdapat nilai tertinggi
    public static int cariMingguTertinggi(int[][] nilaiMahasiswa, int namaMahasiswa, int mingguKe) {
        int mingguTertinggi = 1;
        int nilaiTertinggi = nilaiMahasiswa[0][0];
        for (int j = 0; j < mingguKe; j++) {
            int totalNilaiHari = 0;
            for (int i = 0; i < namaMahasiswa; i++) {
                totalNilaiHari += nilaiMahasiswa[i][j];
            }
            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                mingguTertinggi = j + 1;
            }
        }
        return mingguTertinggi;
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi untuk setiap minggu
    public static void tampilkanMahasiswaTertinggi(int[][] nilaiMahasiswa, int namaMahasiswa, int mingguKe) {
        System.out.println("\nMahasiswa dengan Nilai Tertinggi untuk Setiap Minggu:");
        for (int j = 0; j < mingguKe; j++) {
            int nilaiTertinggi = 0;
            int mahasiswaTertinggi = 0;
            for (int i = 0; i < namaMahasiswa; i++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaTertinggi = i + 1;
                }
            }
            System.out.println("Minggu ke-" + (j + 1) + ": Mahasiswa ke-" + mahasiswaTertinggi);
        }
    }
}
