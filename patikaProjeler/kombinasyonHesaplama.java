package Donguler;
import java.util.Scanner;
public class kombinasyonHesaplama {
    public static void main(String[] args) {

        int n,r,c,nf=1,rf=1;
        int cf = 1;
       
        Scanner inp = new Scanner(System.in);

        System.out.print("N yi giriniz: ");
        n=inp.nextInt();

        System.out.print("R yi giriniz: ");
        r=inp.nextInt();

        


        for(int i=1; i<=n; i++){
            nf*=i;
        }

        for(int i=1; i<=r; i++){
            rf*=i;
        }

        for(int i=1; i<=(n-r); i++){
            cf*=i;
        }
        
        int sonuc;
        sonuc=nf/(rf*cf);

        System.out.println("Kombinasyon hesabı: "+ sonuc);

    }

    }

