    import java.util.Scanner;
    public class Gaji03 {
        
        public static void main(String[] args) {
            //Scanner
            Scanner i = new Scanner(System.in);
            
            //Variabel
            int jmlMasuk, jmlTidakMasuk, totGaji, gaji, potGaji;

            //Input nilai variabel jmlMasuk dan jmlTidakMasuk
            System.out.printf("Jumlah absen masuk pegawai : ");
            jmlMasuk = i.nextInt();
            System.out.printf("Besaran gaji : ");
            gaji = i.nextInt();
            System.out.printf("Jumlah absen tidak masuk pegawai : ");
            jmlTidakMasuk = i.nextInt();
            System.out.printf("Besaran potongan gaji : ");
            potGaji = i.nextInt();

            //Operasi
            totGaji = (jmlMasuk * gaji) - (jmlTidakMasuk * potGaji);

            //Hasil total gaji
            System.out.printf("Total gaji anda adalah : %d", totGaji);

        }
    }
