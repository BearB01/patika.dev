package Donguler;
import java.util.Scanner;
public class girilenSayilardanCiftSayilariBulanProgram {
    public static void main(String[] args) {

        /*int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for(int i=0; i<=sayi; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }

         */

        int sayi, toplam = 0, k=0;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        sayi = input.nextInt();

        int i;
        for (i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                k++;
                toplam += i;

            }

        }
        System.out.println("3 e ve 4 e tam bölünen sayıların toplamı: "+ toplam);
        ort = toplam /k;
        System.out.println("Ortalama: "+ort);

    }
}
