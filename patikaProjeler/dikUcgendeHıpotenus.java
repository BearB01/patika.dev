package Giris;
import java.util.Scanner;
public class dikUcgendeHıpotenus {
    public static void main(String[] args) {

        double kenar1,kenar2,hipotenus;

        Scanner input= new Scanner(System.in);

        System.out.print("Birinci dik kenar uzunluğunu giriniz: ");
        kenar1= input.nextDouble();

        System.out.print("İkinci dik kenar uzunluğunu giriniz: ");
        kenar2= input.nextDouble();

        //Hipotenüs hesaplama : (a^2)+(b^2)=c^2

        hipotenus=Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println("Hipotenüs uzunluğu: "+ hipotenus);







    }
}
