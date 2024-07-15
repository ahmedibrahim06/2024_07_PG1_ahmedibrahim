package unit2;
/*Vucüt Kitle İndeksi (VKİ) ideal kilonun hesaplanması için kullanılır. Kilogram olarak ağırlığınızın,metre cinsinden
 boy uzunluğunun karesine bölünmesiyle elde edilir. Kullanıcıdan ağırlığını pound ve boyunu inch olarak girmesini isteyen
 ve VKİ değerini gösteren bir program yazınız. Bir pound 0.45359237 kilogram ve bir inch 0.0254 metredir.
 vki = (kg / m*m)
 */
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pound değerini giriniz : ");
        double pound = sc.nextDouble();
        System.out.println("inch değerini giriniz ");
        double inch = sc.nextDouble();
        double kg = pound * 0.45359237;
        double m = inch * 0.0254;
        double vki = (kg / m*m) ;
        System.out.println("Vucüt kitle indeksi değeri = " + vki );


    }
}
