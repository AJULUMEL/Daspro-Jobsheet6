import java.util.Scanner;
public class Pemilihan2Percobaan106 {
    public static void main(String[] args) throws Exception {
       Scanner input21 = new Scanner(System.in);
       int tahun;
       
       System.out.print("Masukkan Tahun : ");
       tahun= input21.nextInt();

       if((tahun % 4) == 0){
        if ((tahun % 100) != 0){
            System.out.println("Tahun "+ tahun +" adalah tahun kabisat");
        }
        else{
            System.out.println("Tahun "+ tahun +" bukan tahun kabisat");
        }
    }else{
        System.out.println("Tahun "+ tahun +" adalah tahun kabisat");
    }

    input21.close();
    }
}