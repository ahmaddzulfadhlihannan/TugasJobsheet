import java.util.Scanner;

public class DoWhileCuti03 {
    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Variabel
        int jatahCuti, jumlahHari;
        String konfirmasi;

        //Input
        System.out.print("Jatah cuti\t\t\t:\t");
        jatahCuti = sc.nextInt();

        do {
            System.out.printf("Apakah anda ingin mengambil cuti:\t");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari\t\t\t:\t");
                jumlahHari = sc.nextInt();
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti\t\t\t:\t" + jatahCuti);
                }
                else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                }

            }
        }
        while (jatahCuti > 0);

        //Tutup scanner
        sc.close(); 
    }
}
