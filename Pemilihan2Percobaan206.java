import java.util.Scanner;

public class Pemilihan2Percobaan206 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int totalSudut, sudut1, sudut2, sudut3;

        System.out.println("Masukkan Sudut 1 : ");
        sudut1 = input21.nextInt();
        System.out.println("Masukkan Sudut 2 : ");
        sudut2 = input21.nextInt();
        System.out.println("Masukkan Sudut 3 : ");
        sudut3 = input21.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90)
                System.out.println("Segitiga Tersebut Adalah Segitiga Siku-siku");
            else if (sudut1 == sudut2 && sudut2 == sudut3)
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Sisi");
            else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3)
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Kaki");
            else
                System.out.println("Segitiga Tersebut Adalah Segitiga Sembarang");
        } else {
            System.out.println("Bukan Segitiga");
        }

        input21.close();
    }
}