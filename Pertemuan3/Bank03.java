//Studi kasus bank//
import java.util.Scanner;
public class Bank03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTabunganAwal, lamaMenabung;
        double persentaseBunga =0.02, bunga, jmlTabunganAkhir;

        System.out.println("masukkan jumlah tabungan awal anda!");
        jmlTabunganAwal = sc.nextInt();
        System.out.println("masukkan lama menabung anda!");
        lamaMenabung = sc.nextInt();

        bunga = lamaMenabung * persentaseBunga * jmlTabunganAwal;
        jmlTabunganAkhir = bunga + jmlTabunganAwal;

        System.out.println("Jumlah tabungan akhir anda adalah" + jmlTabunganAkhir);
    }
}
