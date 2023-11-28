/**
 * Tugas1
 */
import java.util.Scanner;
public class Tugas1 {

    static int tampilkanRekursif(int n) {
        if (n == 0) {
            System.out.print(n + " ");
            return(0);
        }
        else {
            System.out.print(n + " ");
            return(tampilkanRekursif(n-1));
        }
    }
    static int tampilkanIteratif(int n) {
        int mulai = n;
        for (int i = mulai; i >= 0; i--) {
            System.out.print(i + " ");
        }
        return mulai;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n :");
        int n = sc.nextInt();

        System.out.print("Rekursif :");
        tampilkanRekursif(n);
        System.out.print("Iteratif :");
        tampilkanIteratif(n);
        
        sc.close();
    }

}