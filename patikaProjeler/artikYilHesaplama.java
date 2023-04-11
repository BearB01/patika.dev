package Giris;
import java.util.Scanner;
public class artikYilHesaplama {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Yılı giriniz: ");
        year = input.nextInt();

        if(year%4==0 && year%100!=0 ){
            System.out.println("Girdiğiniz yıl artık yıldır.");
        }else if(year%4==0 && year%100==0 && year%400==0){
            System.out.println("Girdiğiniz yıl artık yıldır.");
        }else{
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }




    }
}
