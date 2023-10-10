import java.util.Scanner;

public class ForKelipatan03 {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);
        
        //Variabel
        int kelipatan, jumlah = 0, counter = 0;

        //Input
        System.out.print("Masukkan bilangan kelipatan 1- 9\t:\t");
        kelipatan = scan.nextInt();

        //For
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);

        //Tutup scanner
        scan.close();
    }
}