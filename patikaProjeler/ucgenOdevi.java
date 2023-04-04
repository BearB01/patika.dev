package Giris;
import java.util.Scanner;
public class ucgenOdevi {
    public static void main(String[] args) {

        double kenar1,kenar2,kenar3,cevre,cevreyarisi,alan;

        Scanner input = new Scanner(System.in);

        System.out.print("1. kenarı giriniz: ");
        kenar1= input.nextDouble();

        System.out.print("2. kenarı giriniz: ");
        kenar2= input.nextDouble();

        System.out.print("3. kenarı giriniz: ");
        kenar3= input.nextDouble();

        cevre= kenar1+kenar2+kenar3;
        cevreyarisi=cevre/2;
        alan=Math.sqrt(cevreyarisi*(cevreyarisi-kenar1)*(cevreyarisi-kenar2)*(cevreyarisi-kenar3));


        System.out.print("Üçgenin çevresi: "+ cevre);
        System.out.println("Üçgenin alanı: "+ alan);







    }
}
