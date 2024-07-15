package unit2;
/* (Geometri: iki nokta arasındaki mesafe) Kullanıcıdan (x1, y1) ve (x2, y2) gibi iki nokta girmesini isteyen
 ve bu iki nokta arasındaki mesafeyi gösteren bir program yazınız.
Mesafeyi hesaplamak için kullanabileceğiniz formül
KÖK[(x2 - x1)^2 + (y2 - y1)^2] . kök hesaplanırken math.pow metodu kullanılır .
 */
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x1 ve y1 değerini giriniz : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("x2 ve y1 değerini giriniz : ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double a = (x2 - x1) ;
        double b = (y2 - y1);
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        double d = Math.sqrt(c);
        System.out.println("iki noktanın arasındaki mesafe = " + d );





    }
}
