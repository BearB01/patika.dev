package Giris;

import java.util.Scanner;

public class burcBulmaIfElse {
    public static void main(String[] args) {

        int ay, gun;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        System.out.print("Doğduğunuz ayı giriniz: ");
        ay = input.nextInt();


        if (ay == 1 && gun <= 21) {
            System.out.println("Oğlak burcusunuz.");
        } else if (ay == 1 && gun >= 22) {
            System.out.println("Kova burcusunuz.");
        }

        if (ay == 2 && gun <= 19) {
            System.out.println("Kova burcusunuz.");
        } else if (ay == 2 && gun >= 20) {
            System.out.println("Balık burcusunuz.");
        }

        if (ay == 3 && gun <= 20) {
            System.out.println("Balık burcusunuz.");
        } else if (ay == 3 && gun >= 21) {
            System.out.println("Koç burcusunuz.");
        }

        if (ay == 4 && gun <= 20) {
            System.out.println("Koç burcusunuz.");
        } else if (ay == 1 && gun >= 21) {
            System.out.println("Boğa burcusunuz.");
        }

        if (ay == 5 && gun <= 21) {
            System.out.println("Boğa burcusunuz.");
        } else if (ay == 1 && gun >= 22) {
            System.out.println("İkizler burcusunuz.");
        }

        if (ay == 6 && gun <= 22) {
            System.out.println("İkizler burcusunuz.");
        } else if (ay == 1 && gun >= 23) {
            System.out.println("Yengeç burcusunuz.");
        }

        if (ay == 7 && gun <= 22) {
            System.out.println("Yengeç burcusunuz.");
        } else if (ay == 1 && gun >= 23) {
            System.out.println("Aslan burcusunuz.");
        }

        if (ay == 8 && gun <= 21) {
            System.out.println("Aslan burcusunuz.");
        } else if (ay == 1 && gun >= 23) {
            System.out.println("Başak burcusunuz.");
        }

        if (ay == 9 && gun <= 22) {
            System.out.println("Başak burcusunuz.");
        } else if (ay == 1 && gun >= 23) {
            System.out.println("Terazi burcusunuz.");
        }

        if (ay == 10 && gun <= 22) {
            System.out.println("Terazi burcusunuz.");
        } else if (ay == 1 && gun >= 23) {
            System.out.println("Akrep burcusunuz.");
        }

        if (ay == 11 && gun <= 21) {
            System.out.println("Akrep burcusunuz.");
        } else if (ay == 1 && gun >= 22) {
            System.out.println("Yay burcusunuz.");
        }

        if (ay == 12 && gun <= 21) {
            System.out.println("Yay burcusunuz.");
        } else if (ay == 1 && gun >= 22) {
            System.out.println("Oğlak burcusunuz.");
        }


    }
}
