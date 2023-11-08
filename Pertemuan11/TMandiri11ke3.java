import java.util.Scanner;

public class TMandiri11ke3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("N minimal harus 3.");
        } else {
            // Baris pertama
            for (int i = 0; i < N; i++) {
                System.out.print(N);
            }
            System.out.println();

            // Baris tengah
            for (int i = 0; i < N - 2; i++) {
                System.out.print(N);
                for (int j = 0; j < N - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(N);
            }

            // Baris terakhir
            for (int i = 0; i < N; i++) {
                System.out.print(N);
            }
            System.out.println();
        }
        sc.close();
    }
}
