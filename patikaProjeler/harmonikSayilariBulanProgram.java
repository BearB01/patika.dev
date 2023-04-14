package Donguler;
import java.util.Scanner;
public class harmonikSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N'yi giriniz:  ");
        int n =inp.nextInt();
        double result=0;

        for(int i=1; i<=n; i++){
            result+=(1.0/i);
        }
        System.out.println("Sonuç: "+ result);



    }
}
