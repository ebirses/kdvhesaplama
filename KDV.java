
import java.util.Scanner;

public class KDV {
    public static void main(String[] args){
        double toplam;
        int kdvorani;

        Scanner input = new Scanner(System.in);

        System.out.print("Fatura toplamı?: ");
        toplam = input.nextDouble();

        System.out.print("KDV Oranını 1/8/18?: ");
        kdvorani = input.nextInt();

        double yuzdebolme = toplam / 100;
        double kdvsonuc = yuzdebolme * kdvorani;
        double geneltoplam = toplam + kdvsonuc;

        System.out.println("Fatura Toplamı: "+toplam+" TL");
        System.out.println("KDV %"+kdvorani +": "+kdvsonuc+" TL");
        System.out.println("Genel Toplam: " + geneltoplam+" TL");
    }
}
