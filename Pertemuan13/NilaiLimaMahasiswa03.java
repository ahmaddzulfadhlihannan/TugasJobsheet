import java.util.Scanner;

public class NilaiLimaMahasiswa03 {

    // fungsi input data nilai
    public static int[][] inputData() {
        Scanner scan = new Scanner(System.in);
        int[][] nilai = new int[7][5];
        String[] nama = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
        for (int i = 0; i < 7; i++) {
            System.out.println("Minggu ke-" + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai mahasiswa " + nama[j] + ":");
                nilai[i][j] = scan.nextInt();
            }
        }
        scan.close();
        return nilai;
    }

    // fungsi menampilkan seluruh nilai mahasiswa dari minggu 1 sampai 7
    public static void tampilData(int[][] nilai) {
        String[] nama = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
        for (int i = 0; i < 5; i++) {
            System.out.print(nama[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilai[j][i] + "\t");
            }
            System.out.println();
        }
    }

    // fungsi pada minggu keberapa terdapat nilai tertinggi dibanding minggu lain
    // dari data nilai keseluruhan
    public static int cariMingguNilaiTertinggi(int[][] nilai) {
        int minggu = 0;
        int total = 0;
        int max = 0;
        for (int j = 0; j < 7; j++) {
            total = 0;
            for (int i = 0; i < 5; i++) {
                total += nilai[j][i];
            }
            if (total > max) {
                max = total;
                minggu = j + 1;
            }
        }
        return minggu;
    }

    // fungsi mahasiswa yang memiliki nilai tertinggi dengan keterangan minggu
    // keberapa
    public static void tampilMahasiswaNilaiTertinggi(int[][] nilai) {
        String[] nama = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
        int max = 0;
        int minggu = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (nilai[i][j] > max) {
                    max = nilai[i][j];
                    minggu = i + 1;
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (nilai[i][j] == max) {
                    System.out.println(nama[j] + "\t:\t" + nilai[i][j] + "\t" + "Pada minggu ke-" + minggu);
                }
            }
        }

    }

    // Console
    public static void main(String[] args) {
        int[][] nilai = inputData();
        tampilData(nilai);
        int minggu = cariMingguNilaiTertinggi(nilai);
        System.out.println("Minggu dengan nilai tertinggi adalah minggu ke-" + minggu);
        tampilMahasiswaNilaiTertinggi(nilai);
    }
}