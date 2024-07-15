package unit2;
/*(Fizik: ivme) Aşağıdaki formülde gösterildiği gibi,
ortalama ivme hızdaki değişimin zamana bölünmesiyle elde edilir.
a = (v1 - v0) / t
Kullanıcıdan ilk hızı (v0) metre/saniye, son hızı (v1) metre/saniye ve zamanı (t) saniye
olarak alan ve ortalama ivmeyi gösteren bir program yazınız.
 */
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen ilk hızı giriniz : ");
        double ilk = sc.nextDouble();
        System.out.println("lütfen son hızı giriniz: ");
        double son = sc.nextDouble();
        System.out.println("lütfen zamanı giriniz: ");
        double zaman = sc.nextDouble();

        double ivme = (son - ilk) / zaman ;
        System.out.println("ortalama ivme = " + ivme );

    }
}
