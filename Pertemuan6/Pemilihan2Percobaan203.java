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
            if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                System.out.print("Segitiga tersebut adalah segitiga sama sisi");
            }
            else {
                if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1 )) {
                    System.out.print("Segitiga tersebut adalah segitiga sama kaki");
                }
                else {
                    System.out.print("Segitiga tersebut adalah segitiga sembarang");
                }
            }   
        }
        else {
            System.out.print("Itu bukan segitiga");
        }      
        
        //Tutup Scanner
        input03.close();
    }
}
