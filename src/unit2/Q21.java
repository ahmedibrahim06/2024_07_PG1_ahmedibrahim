package unit2;
/* (Finans uygulaması: Yatırımın geri dönüş değeri) Kullanıcıdan yatırım miktarı, yıllık faiz oranı ve yıl sayısını isteyen
 ve aşağıdaki formülü kullanarak yatırımın geri dönüş değerini hesaplayıp gösteren bir program yazınız.
yatiriminGeriDonusDegeri = yatirimMiktari * (1 + yillikFaizOrani)^(yilSayisi*12)
Örneğin, miktar 1000, yıllık faiz oranı %3.25 ve yıl sayısı 1 olarak girilirse yatırımın getirisi 1032.98 olacaktır.

 */
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yatırım miktarını giriniz: ");
        double yatirimMiktari = sc.nextDouble();
        System.out.println("Yıllık faiz oranını yüzde olarak giriniz: ");
        double faizOrani = sc.nextDouble();
        System.out.println("Yıl sayısını giriniz: ");
        double yilSayisi = sc.nextDouble();
        double geriDonusDegeri = yatirimMiktari * Math.pow((1 + faizOrani), (yilSayisi*12));
        System.out.println("Yatırımın geri dönüş değeri = " + geriDonusDegeri );

    }
}
