package example2;
import java.util.Scanner;

/** (Santigrat Fahrenhayt Dönüşümü) Konsoldan double türünde Santigrat değerini
 * alan ve bunu Fahrenhayt olarak gösteren bir program yazınız.
 * Dönüşüm için aşağıdaki formülü kullanabilirsiniz:
 * fahrenhayt = (9 / 5) * santigrat + 32
 */
public class E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit", celsius, fahrenheit);

    }
}
