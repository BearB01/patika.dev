package Giris;
import java.util.Scanner;

public class hesapMakinesiSwitchCase {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input= new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n1=input.nextInt();

        System.out.print("İkinci sayıyı giriniz:");
        n2=input.nextInt();

        System.out.println("Yapacağınız işlemi seçin: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select=input.nextInt();

        switch(select){
            case 1:
                System.out.println("Toplama: "+(n1+n2));
                break;
            case 2:
                if(n1>n2){
                    System.out.println("Çıkarma: "+(n1-n2));
                }else{
                    System.out.println("Çıkarma: "+ (n2-n1));
                }
                break;
            case 3:
                System.out.println("Çarpma: "+ (n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("Bölme: "+ (n1/n2));
                }else{
                    System.out.println("Bölme işlemi paydanın 0 olması nedeniyle yapılamıyor.:(((((");
                }
                break;
            default:
                System.out.println("Geçersiz işleme tıkladınız.Lütfen tekrar deneyiniz.:)");
        }
    }
}
