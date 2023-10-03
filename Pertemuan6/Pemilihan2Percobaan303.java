import java.util.Scanner;

public class Pemilihan2Percobaan303 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //Scanner
        Scanner input03 = new Scanner(System.in);

        //Variabel
        String kategori;
        int penghasilan, gajiBersih;
        double pajak;

        //Input 
        System.out.print("Masukkan kategori\t\t:\t");
        kategori = input03.nextLine();
        System.out.print("Masukkan besarnya penghasilan\t:\t");
        penghasilan = input03.nextInt();

        //Pemilihan
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 20000000) 
                pajak = 0.1;
            else if (penghasilan <= 3000000) 
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasian bersih\t\t:\t" + gajiBersih);
        }
        else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 25000000) 
                pajak = 0.15;
            else if (penghasilan <= 3500000) 
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasian bersih\t\t:\t" + gajiBersih);
        }
        else {
            System.out.print("Masukkan kategori salah");
        }
        
        //Tutup Scanner
        input03.close();
    }
}
