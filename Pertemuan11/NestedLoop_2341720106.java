import java.util.Scanner;

public class NestedLoop_2341720106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        
        for (double[] tempArray : temps) {
            for (double temp : tempArray) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            double sum = 0;
            for (int j = 0; j < temps[i].length; j++) {
                sum += temps[i][j];
            }
            double average = sum / temps[i].length;
            System.out.println("Rata-rata suhu kota ke-" + (i + 1) + " adalah " + average);
        }
        
        sc.close();
    }
}
