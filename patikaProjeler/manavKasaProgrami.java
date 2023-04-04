package Giris;
import java.util.Scanner;
public class manavKasaProgrami {
    public static void main(String[] args) {
        double armutF=2.14,elmaF=3.67,domatesF=1.11,muzF=0.95, patlicanF=5 ;
        double armutK,elmaK,domatesK,muzK,patlicanK;
        Scanner input= new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız: ");
        armutK=input.nextDouble();

        System.out.print("Kaç kilo elma aldınız: ");
        elmaK=input.nextDouble();

        System.out.print("Kaç kilo domates aldınız: ");
        domatesK=input.nextDouble();

        System.out.print("Kaç kilo muz aldınız: ");
        muzK=input.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız: ");
        patlicanK=input.nextDouble();

        double toplamTutar= armutK*armutF+elmaK*elmaF+domatesK*domatesF+muzF*muzK+patlicanF*patlicanK;

        System.out.println("Toplam tutarınız: "+toplamTutar);


    }
}
