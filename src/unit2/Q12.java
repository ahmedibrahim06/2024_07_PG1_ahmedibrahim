package unit2;
/* İvmesi a ve iniş anındaki hızı v olan bir uçak için gerekli en az
 pist mesafesini hesaplamak için aşağıdaki formülü kullanabilirsiniz :
 * lenght = v^2 / 2a
 Kullanıcıdan hızı v (metre/saniye) ve ivmeyi a (metre/saniye kare) alan ve gerekli en az pist
  mesafesini hesaplayan bir program yazınız.
 */

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen hızı giriniz : ");
        double hiz = sc.nextDouble();
        System.out.println("lütfen ivmeyi giriniz : ");
        double ivme = sc.nextDouble();

        Double pist = (hiz * hiz) / (ivme * 2) ;
        System.out.println("Bu uçak icin gereken minimum pist mesafesi : " +pist);
    }
}