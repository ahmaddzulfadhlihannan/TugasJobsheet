//Latihan Membuat Contoh Variabel//
public class ContohVariabel03 {
    public static void main(String[] args) {
        String varHobi = "Membaca Manga";
        boolean varPandai = true;
        char varKelamin = 'L';
        byte varUmur = 19;
        double $varIpk = 0.0, $varTinggi = 162;
        System.out.println("Salah Satu Hobi Saya Adalah " + varHobi);
        System.out.println("Apakah Pandai? " + varPandai);
        System.out.println("Jenis Kelamin " + varKelamin);
        System.out.println("Umurku Saat Ini " + varUmur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $varIpk, $varTinggi));
    }
}
