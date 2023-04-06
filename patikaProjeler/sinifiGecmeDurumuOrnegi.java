package Giris;
import java.util.Scanner;
public class sinifiGecmeDurumuOrnegi {
    public static void main(String[] args) {
        double mat,fiz,turk,kim,muz;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turk = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muz = input.nextInt();

        double average = (mat+fiz+turk+kim+muz)/5;

        if (average>=55){
             if((mat<0 || mat>100)){
                System.out.println("Matematiği not ortalamasına koyma.");
                average=(fiz+turk+kim+muz)/4;
                System.out.println(average);
            }else if((fiz<0 || fiz>100)){
                System.out.println("Fiziği not ortalamasına koyma.");
                average=(mat+turk+kim+muz)/4;
                System.out.println(average);
            }else if((turk<0 || turk>100) ){
                System.out.println("Türkçeyi not ortalamasına koyma.");
                average=(fiz+mat+kim+muz)/4;
                System.out.println(average);
            }else if((kim<0 || kim>100)){
                System.out.println("Kimyayı not ortalamasına koyma.");
                average=(fiz+turk+mat+muz)/4;
                System.out.println(average);
            }else if((muz<0 || muz>100) ){
                System.out.println("Müziği not ortalamasına koyma.");
                average=(fiz+turk+kim+mat)/4;
                System.out.println(average);
            }
            System.out.println("Ortalamanız: "+average);
            System.out.println("Sınıfı geçtiniz.:)))");
        } else{
            System.out.println("Ortalamanız: "+average);
            System.out.println("Sınıfta kaldınız.:(((");
        }


    }
}
