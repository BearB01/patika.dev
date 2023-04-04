package Giris;
import java.util.Scanner;
public class daireCevreVeAlanOrnegi {
    public static void main(String[] args) {

        double yaricap,alan,cevre,pi=3.14;

        Scanner input= new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        yaricap=input.nextDouble();

        alan=pi*(yaricap*yaricap);
        System.out.println("Dairenin alanı: "+alan);

        cevre=2*pi*yaricap;
        System.out.println("Dairenin çevresi: "+cevre);



    }
}
