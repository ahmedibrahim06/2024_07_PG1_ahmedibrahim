/**(Nüfus tahmini) ABD Nüfus İdaresi, nüfus tahminlerini aşağıdaki varsayımlara dayanarak yapmaktadır:
 * Her 7 saniyede bir doğum ,Her 13 saniyede bir ölüm , Her 45 saniyede yeni bir göçmen gelmektedir
 * Gelecek beş yıl için, her bir yılın nüfus tahminlerini gösterecek bir program yazınız.
 * Şu an nüfusun 312,032,486 olduğunu ve bir yılın 365 gün olduğunu varsayalım.
 */
package unit1;public class S111 {
    public static void main(String[] args) {
        double yildaArtis = (((60*60*24*365) / 7.0) + ((60*60*24*365) / 45.0)) - ((60*60*24*365) / 13.0);
        double suanki = 312032486;
        System.out.println("1. yılın nüfusu = " + (yildaArtis + suanki));
        System.out.println("2. yılın nüfusu = " + ((yildaArtis*2) + suanki));
        System.out.println("3. yılın nüfusu = " + ((yildaArtis*3) + suanki));
        System.out.println("4. yılın nüfusu = " + ((yildaArtis*4) + suanki));
        System.out.println("5. yılın nüfusu = " + ((yildaArtis*5) + suanki));
    }
}
