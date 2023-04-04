package Giris;
import java.util.Scanner;

public class notOrtalamasiOrnegi {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;


        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik= input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik= input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya= input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce= input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih= input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik= input.nextInt();

        double ort = ((matematik+fizik+kimya+turkce+tarih+muzik)/6);
        System.out.println("Tüm derslerin ortalaması: "+ ort);

        String sonuc= ort>=60? "Geçtiniz.:)))))": "Kaldınız.:((((";
        System.out.println(sonuc);






    }
}
