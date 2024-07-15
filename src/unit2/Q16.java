package unit2;
/*Kullanıcıdan altıgenin kenar uzunluğunu isteyen ve alanını hesaplayıp gösteren bir program yazınız.
 Altıgenin alanını hesaplamak için kullanılacak formül:
 area = (3 karekök 3 / 2) * s^2      s = kenar uzunluğu
  */

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("altıgenin kenar uzunluğunu giriniz : ");
        double s = sc.nextDouble();
        double a = ((3 * Math.sqrt(3)) / 2 ) * Math.pow(s,2) ;
        System.out.println(a);



    }
}
