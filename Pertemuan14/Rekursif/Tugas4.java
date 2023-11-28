public class Tugas4 {
    static int fibonacciMarmut(int bulan) {
        if (bulan <= 1) {
            return bulan;
        } else {
            return fibonacciMarmut(bulan - 1) + fibonacciMarmut(bulan - 2);
        }
    }
    public static void main(String[] args) {
        int banyakMarmut = fibonacciMarmut(12);
        System.out.println("Pada akhir bulan ke-12 banyak marmut adalah : " + banyakMarmut);
    }
}
