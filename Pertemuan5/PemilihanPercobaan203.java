import java.util.Scanner;

public class PemilihanPercobaan203 {
    public static void main(String[] args) {

        //Scanner
        Scanner i = new Scanner(System.in);

        //Input nilai
        System.out.print("Nilai uas\t\t:\t");
        float uas = i.nextFloat();
        System.out.print("Nilai uts\t\t:\t");
        float uts = i.nextFloat();
        System.out.print("Nilai kuis\t\t:\t");
        float kuis = i.nextFloat();
        System.out.print("Nilai tugas\t\t:\t");
        float tugas = i.nextFloat();

        //Operasi
        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        //Remidi    
        String messege = total < 65 ? "Remidi" : "Tidak remidi";

        //Hasil
        System.out.println("Nilai akhir = " + total + " sehingga " + messege);

        //Nilai huruf
        if (total > 80 && total <= 100) {
            System.out.print("Nilai huruf anda A\n");
        }
        else if (total > 73 && total <= 80) {
            System.out.print("Nilai huruf anda B+\n");
        }
        else if (total > 65 && total <= 73) {
            System.out.print("Nilai huruf anda B\n");
        }
        else if (total > 60 && total <= 65) {
            System.out.print("Nilai huruf anda C+\n");
        }
        else if (total > 50 && total <= 60) {
            System.out.print("Nilai huruf anda C\n");
        }
        else if (total > 39 && total <= 50) {
            System.out.print("Nilai huruf anda D\n");
        }
        else if (total <= 39) {
            System.out.print("Nilai huruf anda E\n");
        }
        else {
            System.out.print("Tidak valid\n");
        }
        i.close();
    }
}
