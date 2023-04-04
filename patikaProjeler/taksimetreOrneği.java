package Giris;
import java.util.Scanner;

public class taksimetreOrneği {
    public static void main(String[] args) {

        double mesafe,perKm,acilisUcreti,toplam=10;
        Scanner input= new Scanner(System.in);

        acilisUcreti=10;
        perKm=2.20;

        System.out.print("Mesafeyi km cinsinden giriniz: " );
        mesafe= input.nextDouble();

        toplam += (mesafe*perKm);
        double sonuc= toplam>20 ? toplam: 20;
        System.out.println("Toplam ödenecek tutar: "+ sonuc);

    }
}
