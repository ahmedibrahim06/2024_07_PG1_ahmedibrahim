package unit1;

/**(Nüfus tahmini) ABD Nüfus İdaresi, nüfus tahminlerini aşağıdaki varsayımlara dayanarak yapmaktadır:
 * Her 7 saniyede bir doğum ,Her 13 saniyede bir ölüm , Her 45 saniyede yeni bir göçmen gelmektedir
 * Gelecek beş yıl için, her bir yılın nüfus tahminlerini gösterecek bir program yazınız.
 * Şu an nüfusun 312,032,486 olduğunu ve bir yılın 365 gün olduğunu varsayalım.
 */
public class Q11 {
    public static void main(String[] args) {
        double dogum = 31536000 / 7.0;              // bir gün 86400 saniyedir ve 365 gün 31.557.600 saniye eder.
        double olum = 31536000 / 13.0;
        double gocmen = 31536000 / 45.0;
        double suanki = 312032486.0;
        double artis = (dogum+gocmen)-olum;           // 1 yıl için nüfus artışı
        System.out.println("1. yılın nüfusu = " + ( artis + suanki ));
        System.out.println("2. yılın nüfusu = " + ((artis*2) + suanki));
        System.out.println("3. yılın nüfusu = " + ((artis*3) + suanki));
        System.out.println("4. yılın nüfusu = " + ((artis*4) + suanki));
        System.out.println("5. yılın nüfusu = " + ((artis*5) + suanki));
    }
}
/**
 *    double yildaArtis = (((60*60*24*365) / 7.0) + ((60*60*24*365) / 45.0)) - ((60*60*24*365) / 13.0);
 *         double suanki = 312032486;
 *         System.out.println("1. yılın nüfusu = " + (yildaArtis + suanki));
 *         System.out.println("2. yılın nüfusu = " + ((yildaArtis*2) + suanki));
 *         System.out.println("3. yılın nüfusu = " + ((yildaArtis*3) + suanki));
 *         System.out.println("4. yılın nüfusu = " + ((yildaArtis*4) + suanki));
 *         System.out.println("5. yılın nüfusu = " + ((yildaArtis*5) + suanki));
 *
 */