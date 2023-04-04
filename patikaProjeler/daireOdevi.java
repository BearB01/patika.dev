package Giris;
import java.util.Scanner;
public class daireOdevi {
    public static void main(String[] args) {
        double r,daireDilAlan,aci,pi=3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r= inp.nextDouble();

        System.out.print("Daire diliminin açısını giriniz: ");
        aci= inp.nextDouble();

        daireDilAlan=(pi*r*r*aci)/360;
        System.out.println("Daire dilimi alanınız: "+daireDilAlan);




    }
}
