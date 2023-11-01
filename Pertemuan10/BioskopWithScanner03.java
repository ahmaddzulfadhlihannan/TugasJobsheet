import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Variabel
        int baris, kolom;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Input data penonton\n2. Daftar penonton\n3. exit\nPilih 1/2/3");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama : ");
                    nama = sc.next();
                    System.out.print("Masukkan baris (max 4) : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (max 2) : ");
                    kolom = sc.nextInt();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Kursi tidak tersedia.");
                        break;
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi. Silahkan pilih kursi lain.");
                        System.out.print("Masukkan baris (max 4) : ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (max 2) : ");
                        kolom = sc.nextInt();
                        break;
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    break;
                case 2:
                    System.out.println("Daftar penonton : ");
                    for (baris = 0; baris < 4; baris++) {
                    if (penonton[baris][0] != null) {
                        System.out.println(penonton[baris][1] + " : Baris-" + (baris+1) + ", kolom-1" );
                    }
                    else {
                        System.out.println("*** : Baris-" + (baris+1) + ", kolom-1" );
                        
                    }
                    }
                    for (baris = 0; baris < 4; baris++) {
                    if (penonton[baris][1] != null) {
                        System.out.println(penonton[baris][2] + " : Baris-" + (baris+1) + ", kolom-2" );
                    }
                    else {
                        System.out.println("*** : Baris-" + (baris+1) + ", kolom-2" );
                        
                    }
                    } 
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    break;
            }
        }
        //Selesai
    }
}
