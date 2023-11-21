import java.util.Scanner;
public class Ucapan_03 {
    public static String PenerimaanUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaanUcapan();
        System.out.println("Thank you " + nama + "\nMaythe force be with you.");
    }
}
