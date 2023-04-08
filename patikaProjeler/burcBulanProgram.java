package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;
public class burcBulanProgram {
    public static void main(String[] args) {
        int ay,gun;


        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        switch(ay){
            case 1:
                if(gun<22){
                    System.out.println("Oğlak burcusunuz.");
                }else if(gun>21){
                    System.out.println("Kova burcusunuz.");
                }
                break;

            case 2:
                if(gun<20){
                    System.out.println("Kova burcusunuz.");
                }else if(gun>19){
                    System.out.println("Balık burcusunuz.");
                }
                break;

            case 3:
                if(gun<21){
                    System.out.println("Balık burcusunuz.");
                } else if (gun>20) {
                    System.out.println("Koç burcusunuz.");
                }
                break;

            case 4:
                if(gun<21){
                    System.out.println("Koç burcusunuz.") ;
                } else if (gun>20) {
                    System.out.println("Boğa burcusunuz.");
                }
                break;

            case 5:
                if(gun<=21){
                    System.out.println("Boğa burcusunuz.");
                } else if (gun>=22) {
                    System.out.println("İkizler burcusunuz.");
                }
                break;

            case 6:
                if(gun<=22){
                    System.out.println("İkizler burcusunuz.");
                } else if (gun>=23) {
                    System.out.println("Yengeç burcusunuz.");
                }
                break;

            case 7:
                if(gun<=22){
                    System.out.println("Yengeç burcusunuz.");
                } else if (gun>=23) {
                    System.out.println("Aslan burcusunuz.");
                }
                break;

            case 8:
                if(gun<=22){
                    System.out.println("Aslan burcusunuz.");
                } else if (gun>=23) {
                    System.out.println("Başak burcusunuz.");
                }
                break;

            case 9:
                if(gun<=22){
                    System.out.println("Başak burcusunuz.");
                } else if (gun>=23) {
                    System.out.println("Terazi burcusunuz.");
                }
                break;

            case 10:
                if(gun<=22){
                    System.out.println("Terazi burcusunuz.");
                } else if (gun>=23) {
                    System.out.println("Akrep burcusunuz.");
                }
                break;

            case 11:
                if(gun<=21){
                    System.out.println("Akrep burcusunuz.");
                } else if (gun>=22) {
                    System.out.println("Yay burcusunuz.");
                }
                break;

            case 12:
                if(gun<=21){
                    System.out.println("Yay burcusunuz.");
                } else if (gun>=22) {
                    System.out.println("Oğlak burcusunuz.");
                }
                break;



        }
    }
}
