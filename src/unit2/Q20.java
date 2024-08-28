package unit2;
/* (Finans uygulaması: faiz hesaplama) Bakiye ve yıllık faiz oranını biliyorsak aşağıdaki formülü kullanarak
 bir sonraki ay elde edilecek faiz geliri hesap edilebilir.
 faizGetirisi = bakiye * (yillikFaizOrani / 1200)
 Kullanıcıdan, bakiye ve yıllık faiz oranını isteyen ve bir sonraki ay için elde edilecek
  faiz gelirini hesaplayan bir program yazınız.
 */
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bakiyenizi giriniz: ");
        double bakiye = sc.nextDouble();
        System.out.println("yıllık faiz oranını giriniz: ");
        double faiz = sc.nextDouble();
        double gelir = bakiye * (faiz / 1200);
        System.out.println("Bir sonraki ay için elde edilecek faiz geliri = " + gelir);

    }
}
