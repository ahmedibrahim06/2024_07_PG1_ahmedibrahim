package udemycours;

import java.util.Scanner;

public class calısma3 {
    public static void main(String[] args) {
        Scanner sayi= new Scanner(System.in);
        System.out.println(" lütfen 3 sayı giriniz : ");
        double sayi1= sayi.nextDouble();
        double sayi2= sayi.nextDouble();
        double sayi3= sayi.nextDouble();

        double ortalama = (sayi1 + sayi2 + sayi3) / 3 ;
        System.out.println("girmiş olduğunuz 3 sayının ortalaması = " + ortalama);
    }
}
