import java.util.Scanner;
import model.Balok;

public class App {
    public static void main(String[] args)throws Exception{

        System.out.println("Volume Balok by Michael");
        System.out.println("=========================\n");
        Scanner keyboard = new Scanner(System.in);

        Balok Balok1 = new Balok();
        System.out.print("Masukkan Panjang Balok : ");
        Balok1.p= keyboard.nextInt();

        Balok Balok2 = new Balok();
        System.out.print("Masukkan Lebar Balok : ");
        Balok1.l= keyboard.nextInt();

        Balok Balok3 = new Balok();
        System.out.print("Masukkan Tinggi Balok : ");
        Balok1.t= keyboard.nextInt();

        Balok1.VolumeBalok();
    }
}
