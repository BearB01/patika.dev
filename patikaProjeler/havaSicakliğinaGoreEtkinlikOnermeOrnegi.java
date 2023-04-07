package Giris;
import java.util.Scanner;
public class havaSicakliğinaGoreEtkinlikOnermeOrnegi {
    public static void main(String[] args) {

        double sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Bulunduğunuz konumdaki hava sıcaklığını giriniz: ");
        sicaklik = input.nextDouble();

        if(sicaklik<5){
            System.out.println("Hava çok soğuk ve karlı kayak yapmalısın.");
        }else if(sicaklik>=5 && sicaklik<=25){
            if(sicaklik>=5 && sicaklik<10){
                System.out.println("Sinemaya gidebilirsiniz.");
            } else if (sicaklik>15 && sicaklik<=25) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }else if(sicaklik>=10 && sicaklik<=15){
                System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
            }
        } else if (sicaklik>25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}
