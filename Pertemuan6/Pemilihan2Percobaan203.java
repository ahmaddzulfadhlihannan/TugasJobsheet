import java.util.Scanner;

public class Pemilihan2Percobaan203 {
    public static void main(String[] args) {

        //Scanner
        Scanner input03 = new Scanner(System.in);

        //Variabel
        int sudut1, sudut2, sudut3, totSudut;

        //Input nilai
        System.out.print("Nilai sudut 1\t:\t");
        sudut1 = input03.nextInt();
        System.out.print("Nilai sudut 2\t:\t");
        sudut2 = input03.nextInt();
        System.out.print("Nilai sudut 3\t:\t");
        sudut3 = input03.nextInt();

        //Operasi
        totSudut = sudut1 + sudut2 + sudut3;

        //Pemilihan berasarang
        if (totSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.print("Segitiga tersebut adaah segitiga siku-siku");
            }
                else {
                System.out.print("Segitiga tersebut bukan segitiga siku-siku");
            }   
        }
        else {
            System.out.print("Itu bukan segitiga");
        }      
        
        //Tutup Scanner
        input03.close();
    }
}
