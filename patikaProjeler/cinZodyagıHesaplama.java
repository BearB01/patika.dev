package Giris;
import java.util.Scanner;
public class cinZodyagıHesaplama {
    public static void main(String[] args) {
        int birthDate;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum tarihinizi giriniz: ");
        birthDate = input.nextInt();

        int zodyak = birthDate%12;

        switch (zodyak){
            case 0:
                if(zodyak == 0) {
                    System.out.println("Çin zodyağına göre burcunuz: MAYMUN");
                }
                break;

            case 1:
                if(zodyak==1){
                System.out.println("Çin zodyağına göre burcunuz: HOROZ");
            }
                break;

            case 2:
                if(zodyak==2){
                    System.out.println("Çin zodyağına göre burcunuz: KÖPEK");
                }
                break;

            case 3:
                if(zodyak==3){
                    System.out.println("Çin zodyağına göre burcunuz: DOMUZ");
                }
                break;

            case 4:
                if(zodyak==4){
                    System.out.println("Çin zodyağına göre burcunuz: FARE");
                }
                break;

            case 5:
                if(zodyak==5){
                    System.out.println("Çin zodyağına göre burcunuz: ÖKÜZ");
                }
                break;

            case 6:
                if(zodyak==6){
                    System.out.println("Çin zodyağına göre burcunuz: KAPLAN");
                }
                break;

            case 7:
                if(zodyak==7){
                    System.out.println("Çin zodyağına göre burcunuz: TAVŞAN");
                }
                break;

            case 8:
                if(zodyak==8){
                    System.out.println("Çin zodyağına göre burcunuz: EJDERHA");
                }
                break;

            case 9:
                if(zodyak==9){
                    System.out.println("Çin zodyağına göre burcunuz: YILAN");
                }
                break;

            case 10:
                if(zodyak==10){
                    System.out.println("Çin zodyağına göre burcunuz: AT");
                }
                break;

            case 11:
                if(zodyak==11){
                    System.out.println("Çin zodyağına göre burcunuz: KOYUN");
                }
                break;



        }
    }
}
