package unit2;
/* (Finans uygulaması: komisyon hesaplama) Kullanıcıdan ara toplam ve komisyon oranını isteyen,
 komisyon miktarı ve toplamı hesaplayıp gösteren bir program yazınız.
 Örneğin, kullanıcı ara toplamı 10 TL ve komisyon oranını 15% olarak girdiğinde program,
  komisyon miktarı 1.5 TL ve toplamı 11.5 TL olarak gösterir.
 */
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen ara toplam değeri giriniz : ");
        double aratoplam = sc.nextDouble();
        System.out.println("lütfen komisyon oranını giriniz : ");
        double komisyon = sc.nextDouble();
        double komisyonmiktari = aratoplam * (komisyon/100.0) ;
        double toplam = komisyonmiktari + aratoplam;
        System.out.println("komisyon miktarı : " + komisyonmiktari);
        System.out.println("toplam miktarı : " + toplam);






    }
}
