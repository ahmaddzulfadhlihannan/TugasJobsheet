import java.util.Scanner;

public class Lingkaran03 {
    public static void main(String[] args) {
        // Scanner
        Scanner i = new Scanner(System.in);

        // Variabel
        int r;
        double keliling, luas, phi = 3.14;

        // Input r
        System.out.printf("Masukkan jari-jari lingkaran : ");
        r = i.nextInt();

        // Operasi
        keliling = 2 * phi * r;
        luas = phi * r * r;

        // Hasil Keliling dan Luas
        System.out.printf("Keliling = %f dan Luas = %f", keliling, luas);
    }
}