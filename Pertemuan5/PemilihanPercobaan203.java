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
        String messege = total < 65 ? "Remidi" : "Tidak Remidi";

        //Hasil
        System.out.print("Nilai akhir = " + total + "sehingga " + messege);

        i.close();
    }
}
