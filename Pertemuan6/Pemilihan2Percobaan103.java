import java.util.Scanner;

public class Pemilihan2Percobaan103 {
    public static void main(String[] args) {

        //Scanner
        Scanner input03 = new Scanner(System.in);

        //Varibel
        int tahun;

        //Masukkan input
        System.out.print("Masukkan tahun\t\t:\t\t");
        tahun = input03.nextInt();

        //Pemilihan bersarang
        if ((tahun % 400) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 4 ) == 0) {
                    System.out.print("Tahun Kabisat");
                }
                else {
                    System.out.print("Bukan tahun kabisat");    
                }
            } 
            else {
                System.out.print("Bukan tahun kabisat");
            }
        }
        else {
            System.out.print("Bukan tahun kabisat");
        }

        //Tutup Scanner
        input03.close();

    }
}