package unit2;
/* (Santigrat Fahrenhayt Dönüşümü)
 Konsoldan double türünde Santigrat değerini alan
 ve bunu Fahrenhayt olarak gösteren bir program yazınız. Dönüşüm için aşağıdaki formülü kullanabilirsiniz:
 fahrenhayt = (9 / 5) * santigrat + 32
 İpucu: Java’da 9 / 5 işleminin sonucu 1’dir ama 9.0 / 5 işleminin sonucu 1.8’dir.
*/

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("lütfen santigrat değerini giriniz :");
        double santigrat = no.nextDouble();
        double fahrenhayt = (9.0 / 5.0) * santigrat +32 ;
        System.out.println(santigrat+ " santigrat = " + fahrenhayt + " fahrenhayt'tir");
    }
}