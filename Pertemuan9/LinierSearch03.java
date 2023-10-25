public class LinierSearch03 {
    public static void main(String[] args) {
        int[] arrrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil = 0;

        for (int i = 0; i < arrrayInt.length; i++) {
            if (arrrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada dalam array posisi ke-" + hasil);
    }
}