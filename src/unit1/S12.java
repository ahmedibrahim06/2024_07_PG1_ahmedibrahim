package unit1;

/** (Kilometre cinsinden ortalama hız) Bir koşucunun 24 mili 1 saat,
 * 40 dakika, 35 saniyede koştuğunu varsayalım.
 * Ortalama hızı km/saat cinsinden gösterecek bir program yazınız. ( 1 mil, 1.6 kilometredir.)
 */
public class S12 {
    public static void main(String[] args) {
        double km = 24 * 1.6;
        double saat = 1.0 + (40.0/60) + (35.0/3600);
        System.out.println("ortalama hızı = " + (km / saat) + "km/saat");
    }
}
