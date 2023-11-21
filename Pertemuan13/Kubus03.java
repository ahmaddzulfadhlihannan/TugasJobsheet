import java.util.Scanner;
public class Kubus03 {
    static int hitungVolume(int s) {
        int volume = s * s * s;
        return volume;
    }
    static int hitungLuasPermukaan(int rusuk) {
        int luasPermukaan = rusuk * rusuk * 6;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, vol, lPermukaan;
        System.out.println("Masukkan panjang sisi / rusuk");
        r = sc.nextInt();
        vol = hitungVolume(r);
        System.out.println("Volume kubus adalah " + vol);
        lPermukaan = hitungLuasPermukaan(r);
        System.out.println("Luas permukaan kubus adalah " + lPermukaan);
        sc.close();
    }
}
