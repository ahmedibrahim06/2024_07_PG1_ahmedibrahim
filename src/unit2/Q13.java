package unit2;
/* Yıllık %5 faiz oranıyla hesabınızda her ay 100 TL biriktirdiğinizi varsayalım.
Bu durumda aylık faiz oranı 0.05/12 = 0.00417
 İlk ayın sonunda hesabınızdaki miktar   : 100 * (0 + 0.00417) = 100.417
 İkinci ayın sonunda hesabınızdaki miktar: (100 + 100.417) * (0 + 0.00417) = 201.252
 Üçüncü ayın sonunda hesabınızdaki miktar: (100 + 201.252) * (0 + 0.00417) = 302.507
Kullanıcıdan aylık biriktirdiği para miktarını alan ve altı ay sonra
 hesabının durumunu gösteren bir program yazınız.
(Soru 5.30’da, bu kodu basitleştirmek için döngü kullanıyor olacaksınız
 ve hesabın durumunu aylık olarak göstereceksiniz.)
 */
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Aylık biriktidiğiz para miktarını giriniz : ");
        double a = sc.nextDouble();
        double aylikFaiz = a * (0.05 / 12) ;
        double ilkAy = a * aylikFaiz;
        double ikinciAy = (a + ilkAy) * aylikFaiz;
        double ucuncuAy = (a + ikinciAy) * aylikFaiz;
        double dorduncuAy = (a + ucuncuAy) * aylikFaiz;
        double besinciAy = (a + dorduncuAy) * aylikFaiz;
        double altinciAy = (a + besinciAy) * aylikFaiz;
        System.out.println("Altıncı aydan sonra hesaptaki miktar = " + altinciAy );
    }
}
