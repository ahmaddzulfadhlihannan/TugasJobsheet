import java.util.Scanner;

public class HargaBayar03 {
    public static void main(String[] args) {

        // Scanner
        Scanner i = new Scanner(System.in);

        // Variabel
        int harga, jumlah, jmlHalBuku;
        double dis = 0.1 , total, jmlDis, bayar;
        String merkBuku;

        // Input merk buku dan jumlah halaman buku
        System.out.printf("Merk buku : ");
        merkBuku = i.next();
        System.out.printf("Jumlah halaman buku : ");
        jmlHalBuku = i.nextInt();

        // input harga, jumlah barang, dan diskon
        System.out.printf("Harga barang : ");
        harga = i.nextInt();
        System.out.printf("Jumlah barang : ");
        jumlah = i.nextInt();
        System.out.printf("Diskon : ");
        dis = i.nextDouble();

        // Operasi
        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;
        
        // Rincian buku
        System.out.printf("Merk buku : %s\n", merkBuku);
        System.out.printf("Jumlah halaman buku : %d\n", jmlHalBuku);

        // Print rincian pembelian
        System.out.printf("Total harga : %f\n", total);
        System.out.printf("Diskon yang diperoleh : %f\n", jmlDis);
        System.out.printf("Harga bayar setelah potongan diskon : %f\n", bayar);

    }
}
