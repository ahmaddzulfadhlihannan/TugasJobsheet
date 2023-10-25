import java.util.Scanner;
public class LinierSearch03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input jumlah elemen
        System.out.print("Masukkan jumlah elemen : ");
        int jumlahElemen = sc.nextInt();
        
        //Variabel
        int[] arrayInt = new int[jumlahElemen];
        int key;
        int hasil = 0;

        //Input elemen
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = sc.nextInt();
        }

        //Key yag ingin dicari
        System.out.print("Masukkan elemen yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array posisi ke-" + hasil);
                break;
            }
            else {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
        

        sc.close();
    }
}