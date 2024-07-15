package unit2;
/*(Kaç yıl) Kullanıcıdan dakika olarak giriş yapılmasını isteyen (ör. 1 000 000) ve buna karşılık gelen yıl,
 gün ve dakikayı gösteren bir program yazınız. Her zaman bir yılın 365 gün olduğunu varsayın.
*/
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen dakikayı giriniz : ");
        long dakika = sc.nextLong();
        int yil = (int)(dakika / (365*24*60)) ;
        int gun =(int) ((dakika % (365*24*60)) / (60*24)) ;
        int kalanDakika =(int) ((dakika % (60 * 24)) % 60);
        System.out.println(yil + " yıl, " + gun + " gün ve " + kalanDakika + " dakikaya eşittir.");
    }
}
