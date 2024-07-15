package unit2;
/*(Silindirin hacmi) Kullanıcıdan silindirin yarıçap ve yükseklik değerini isteyen
 ve aşağıdaki formüle göre alanını ve hacmini hesaplayan bir program yazınız:
  (alan = yarıçap * yarıçap * pi)
  (hacim = alan * yükseklik)
 */
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("lütfen silindirin yarıçapını ve yüksekliğini giriniz :");
        final double PI = 3.14;
        double yaricap = no.nextDouble();
        double yukseklik1 = no.nextDouble();
        double alan = yaricap * yaricap * PI ;
        double hacim = alan * yukseklik1 ;
        System.out.println("Hacim = " + hacim);
        System.out.println("Alan = " + alan);

    }
}
