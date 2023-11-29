import java.util.Scanner;
public class Tugas2 {
    static int penjumlahanRekursif(int f) {
        if (f == 1) {
            System.out.print("1 ");
            return (1);
        }
        else {
            int hasil = f + penjumlahanRekursif( f - 1);
            System.out.print("+ " + f + " ");
            return (hasil);
        }
    }
    static int penjumlahanIteratif(int f) {
        int hasil = 0;
        for (int i = 1; i <= f; i++) {
            hasil += i;
            if (hasil == 1) {
                System.out.print("1 ");
            }
            else {
                System.out.print("+ " + i + " ");
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f : ");
        int f = sc.nextInt();
        int hasilRekursif = penjumlahanRekursif(f);
        System.out.println(" = " +  hasilRekursif);
        int hasilIteratif = penjumlahanIteratif(f);
        System.out.println(" = " + hasilIteratif);
        sc.close();
    }

}
