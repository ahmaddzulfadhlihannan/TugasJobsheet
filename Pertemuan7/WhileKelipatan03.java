import java.util.Scanner;

public class WhileKelipatan03 {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);
        
        //Variabel
        int i = 1, kelipatan, jumlah = 0, counter = 0, rataRata = 0;

        //Input
        System.out.print("Masukkan bilangan kelipatan 1- 9\t:\t");
        kelipatan = scan.nextInt();

        //For
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        if (counter != 0) {
            rataRata = jumlah / counter;
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata dari seluruh  bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, rataRata);

        //Tutup scanner
        scan.close();
    }
}