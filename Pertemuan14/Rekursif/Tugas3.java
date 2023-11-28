import java.util.Scanner;
public class Tugas3 {
    static int cekPrimaRekursif(int x, int y) {
        if (x <= 1) {
            return (0);
        }
        else if (y == 1) {
            return (1);
        }
        else {
            if (x % y == 0) {
                return (0);
            }
            else {
                return (cekPrimaRekursif(x, y - 1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan x : ");
        int x = sc.nextInt();
        int hasil = cekPrimaRekursif(x, x / 2);
        if (hasil == 1) {
            System.out.println(x + " merupakan bilangan prima");
        }
        else{
            System.out.println(x + " bukan bilangan prima");
        }
        sc.close();
    }
}
