package Donguler;
import java.util.Scanner;
public class tekSayilarinToplamiProgrami {
    public static void main(String[] args) {
        /*
       int sayi=0, toplam=0;

       Scanner input = new Scanner(System.in);
*/

        /*
        do{
            System.out.print("Sayı giriniz: ");
            sayi= input.nextInt();
            if(sayi%2==1){
                toplam+=sayi;
                System.out.println("Tek Sayı: "+ sayi);
            }


        }while (sayi>0);

        System.out.println("Sayıların toplamı: "+ toplam);

        */

        int number,total=0;

        Scanner input= new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();

            if( number%2==0 && number%4==0){
                total = total+number;
            }


        }while(number%2==0);

        System.out.println("Toplam: "+ total);


    }
}
