package Donguler;
import java.util.Scanner;
public class girilenSayidanKucukIkininKuvvetleri {
    public static void main(String[] args) {
        /*
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();

        int i;
        for (i = 1; i < number; i*=2) {
            System.out.println(i);

        }
            */

        int number;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sınır sayısı giriniz: ");
        number = inp.nextInt();

        for(int i=1; i<number; i*=4){
            System.out.println(i);
        }
        System.out.println("----------------");
        for (int j=1; j<number; j*=5){
            System.out.println(j);
        }






    }
}
