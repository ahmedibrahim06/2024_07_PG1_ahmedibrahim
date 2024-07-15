package unit2;
/*(Pound-kilogram dönüşümü) Poundu kilograma dönüştüren bir program yazınız.
  Program, kullanıcıdan pound değerini alır ve sonucu kilograma dönüştürüp gösterir.
  Bir pound 0.454 kilogramdır.
 */
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen pound değerini giriniz :");
        double pound = sc.nextDouble();
        double kg = pound * 0.454;
        System.out.println(pound +" Pound =" +kg + " KG'dır");

    }
}
