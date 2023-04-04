package Giris;
import java.util.Scanner;
public class vucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {

        double kilo,boy,indeks;

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        kilo= input.nextDouble();

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy= input.nextDouble();

        indeks=kilo/(boy*boy);
        System.out.println("Girdiğiniz bilgilere göre vücut kitle indeksiniz: "+ indeks);

    }
}
