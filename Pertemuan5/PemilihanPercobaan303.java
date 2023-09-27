import java.util.Scanner;

public class PemilihanPercobaan303 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner i = new Scanner(System.in);
        
        //Variabel
        double angka1, angka2, hasil;
        char operator;

        //Inputan
        System.out.print("Masukkan angka pertama\t\t\t\t:\t");
        angka1 = i.nextDouble();
        System.out.print("Masukkan angka kedua\t\t\t\t:\t");
        angka2 = i.nextDouble();
        System.out.print("Masukkan angka operator (+,-,*,/)\t\t:\t");
        operator = i.next().charAt(0);
        
        //Pemilihan operator
        switch (operator) {
            case '+' :
                hasil = angka1 + angka2;
                System.out.print(angka1 +" + " + angka2 + " = " + hasil);
                //break;
        case '-' :
                hasil = angka1 - angka2;
                System.out.print(angka1 +" - " + angka2 + " = " + hasil);
                break;
        case '*' :
                hasil = angka1 * angka2;
                System.out.print(angka1 +" * " + angka2 + " = " + hasil);
                break;
        case '/' :
                hasil = angka1 / angka2;
                System.out.print(angka1 +" / " + angka2 + " = " + hasil);
                break;
        default : 
                System.out.print("Operasi tidak ditemukan");
        break;
        }
        i.close();
    }
    
}
