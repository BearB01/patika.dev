package Giris;

import java.util.Scanner;

public class ucakBiletiFiyatıHesaplama {
    public static void main(String[] args) {
        double km, perKm = 0.1;
        int age, typeOfTravel;
        Scanner input = new Scanner(System.in);

        System.out.print("Yolculuk mesafesini giriniz(Km cinsinden): ");
        km = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk şeklinizi giriniz:1=> Tek yön, 2=> Gidiş-Dönüş ");
        typeOfTravel = input.nextInt();

        double normalTutar = km * perKm;
        double tutar, gidisDonusIndirimi;
        gidisDonusIndirimi = normalTutar * 0.2;

        double yasIndirimi;
        if (age < 12) {
            System.out.println("Yaş 12'den küçük ise indirim=%50");
            if (typeOfTravel == 1) {
                yasIndirimi = normalTutar * 0.5;
                tutar = normalTutar - yasIndirimi;
                System.out.println("Ödemeniz gereken tutar: "+tutar);
            } else if (typeOfTravel == 2) {
                yasIndirimi = normalTutar * 0.5;
                tutar = normalTutar - yasIndirimi - gidisDonusIndirimi;
                System.out.println("Ödemeniz gereken tutar: "+tutar);
            }


        } else if (age >= 12 && age <= 24) {
            System.out.println("Yaş 12 ile 24 arasındaysa indirim=%10");
            if (typeOfTravel == 1) {
                yasIndirimi = normalTutar * 0.1;
                tutar = normalTutar - yasIndirimi;
                System.out.println("Ödemeniz gereken tutar: "+tutar);
            } else if (typeOfTravel == 2) {
                yasIndirimi = normalTutar * 0.1;
                tutar = normalTutar - yasIndirimi - gidisDonusIndirimi;
                System.out.println("Ödemeniz gereken tutar: "+tutar);
            }

        } else if (age > 65) {
            System.out.println("Yaş 12'den büyük ise indirim=%30");
            if (typeOfTravel == 1) {
                yasIndirimi = normalTutar * 0.3;
                tutar = normalTutar - yasIndirimi;
                System.out.println("Ödemeniz gereken tutar: "+tutar);
            } else if (typeOfTravel == 2) {
                yasIndirimi = normalTutar * 0.3;
                tutar = normalTutar - yasIndirimi - gidisDonusIndirimi;
                System.out.println("Ödemeniz gereken tutar: "+tutar);
            }

        }


    }
}
