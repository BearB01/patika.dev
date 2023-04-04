package Giris;
import java.util.Scanner;


public class kdvTutariOrnegi {
    public static void main(String[] args) {

        double tutar;
        double kdv=0.18;
        double kdv2=0.08;
        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen tutarı giriniz: ");
        tutar= input.nextDouble();

        double kdvliTutar= (tutar*kdv)+tutar;
        //System.out.println("Kdvli tutarınız: "+kdvliTutar);

       /* if(tutar<1000&&tutar>0){//KDV %18 olacak
            double kdvliTutar= (tutar*kdv)+tutar;
            System.out.println("Kdvli tutarınız: "+kdvliTutar);

        }
        if(tutar>1000){//KDV %8 olacak
            double kdvliTutar2=(tutar*kdv2)+tutar;
            System.out.println("Kdv'li tutarınız: "+kdvliTutar2);
        }
*/
        double sonuc= tutar>1000? (tutar*kdv2)+tutar : (tutar*kdv)+tutar;
        System.out.println("Kdvli son fiyatınız: "+sonuc);


    }
}
