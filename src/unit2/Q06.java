package unit2;
/* 0 ve 1000 aralığında bir tam sayı alan ve
 basamak değerlerinin toplamını gösteren bir program yazınız.
  Örneğin Girilen tam sayı  932, ise basamak değeri toplamı 14’tür.
  İpucu:  % operatörünü kullanarak basamak değerlerini elde edebilir,
  operatörü ile değeri elde edilen basamağı kaldırabilirsiniz. Örneğin, 932 % 10 = 2 ve 932 / 10 = 93.
 */
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                         // input.close(); ne için kullanılır
        System.out.print("0 ve 1000 arasında bir tam sayı girin: ");
        int sayi = sc.nextInt();
        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yuzlerBasamagi = (sayi / 100) % 10;

        int basamakToplami = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;

        System.out.println("Girilen sayının basamakları toplamı " + basamakToplami +"'dir");


    }
}
