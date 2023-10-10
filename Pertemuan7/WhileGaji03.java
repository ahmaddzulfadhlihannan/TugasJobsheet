import java.util.Scanner;

public class WhileGaji03 {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Variabel
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        //Input
        System.out.print("Masukkan jumlah karyawan\t\t:\t");
        jumlahKaryawan = scan.nextInt();

        //Perulangan
        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihlah jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            jabatan = scan.next();
            System.out.println("Masukkan jumlah jam lembur\t\t:\t");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue ;
            }
            else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            else {
                System.out.println("Jabatan Invalid");
            }

            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur\t\t\t:\t" + totalGajiLembur);
        }

        //Tutup scanner
        scan.close();
    }
    
}
