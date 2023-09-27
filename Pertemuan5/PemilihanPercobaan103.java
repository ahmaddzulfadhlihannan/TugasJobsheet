import java.util.Scanner;

public class PemilihanPercobaan103 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner i = new Scanner(System.in);

        //Input angka
        System.out.print("Masukkan angka : ");
        int angka = i.nextInt();

        //Pemilihan
        if (angka % 2 == 0) {
            System.out.print("Angka " + angka + " bilangan genap");
        }
        else {
            System.out.print("Angka " + angka + "bilangan ganjil");
        }
        i.close();
    }
}