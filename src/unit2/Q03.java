package unit2;
/*(Feet – metre dönüşümü) Kullanıcıdan feet değerini alan ve bunun metre karşılığını
 hesaplayıp gösteren bir program yazınız. Bir feet 0.305 metredir.
 */
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("lütfen feet değerini giriniz :");
        double feet = no.nextDouble();
        double metre = feet / 0.305;
        System.out.println(feet + " feet = " + metre + "metredir");

    }
}
