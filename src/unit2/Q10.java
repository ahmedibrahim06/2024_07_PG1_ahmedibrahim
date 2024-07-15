package unit2;
/* Belli miktar suyu, başlangıç sıcaklığından belirlenen sıcaklığa
çıkarmak için gerekli enerjiyi hesaplayan bir program yazınız. Programınız kullanıcıdan su miktarını (kilogram),
başlangıç ve son sıcaklığı alacak. Enerjiyi hesaplamak için kullanabileceğiniz formül:
Q = M * (sonSicaklik – ilkSicaklik) * 4184
M kilogram cinsinden suyun ağırlığı, sıcaklık santigrat derece cinsinden,
ve Q joule cinsinden enerjiyi gösterir.
 */
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("su miktarını kg cinsinden giriniz : ");
        int kg = sc.nextInt();
        System.out.println("Baslangıç ısısını giriniz : ");
        int ilk = sc.nextInt();
        System.out.println("son sıcaklığı giriniz ");
        int son = sc.nextInt();

        int enerji = kg * (son - ilk) * 4184 ;
        System.out.println("sıcaklık = " + enerji + " joule");

    }
}
