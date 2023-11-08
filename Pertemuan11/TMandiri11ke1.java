import java.util.Scanner;

public class TMandiri11ke1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("N minimal harus 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Mencetak spasi sebelum angka
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }
                // Mencetak angka secara berurutan
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
