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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f : ");
        int f = sc.nextInt();
        int hasil = penjumlahanRekursif(f);
        System.out.println(" = " +  + hasil);
        sc.close();
    }

}
