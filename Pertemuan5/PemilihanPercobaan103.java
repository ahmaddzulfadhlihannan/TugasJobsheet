import java.util.Scanner;

public class PemilihanPercobaan103 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner i = new Scanner(System.in);
        String hasil;

        //Input angka
        System.out.print("Masukkan angka : ");
        int angka = i.nextInt();

        //Operasi
        hasil = (angka % 2 == 0) ? "genap" : "ganjil";    

        //Output
        System.out.println("Ternary operator");
        System.out.print(angka + " adalah " + hasil);

        i.close();
    }
}