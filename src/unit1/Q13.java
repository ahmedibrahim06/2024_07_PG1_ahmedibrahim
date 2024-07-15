package unit1;
/*(Cebir:  2 x 2 doğrusal denklem sistemi çözümü)
 2×2 doğrusal denklem sisteminin çözümü için Cramer kuralını kullanabilirsiniz.
(ax + by) = e         x = (ed - bf) / (ad - bc)
(cx + dy) = f         y = (af - ec) / (ad - bc)
 denklemi çözüp x ve y’nin değerlerini gösteren bir program yazınız:
     3.4x + 50.2y = 44.5
     2.1x + 0.55y = 5.9
 */

public class Q13 {
    public static void main(String[] args) {
        double a,b,c,d,e,f,x,y ;
        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = 0.55;
        e = 44.5;
        f = 5.9;
        x = (e*d - b*f) / (a*d - b*c);
        y= (a*f - e*c) / (a*d - b*c);
        System.out.println("x = " +x );
        System.out.println("y = " +y );

       /* double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double x = (e*d - b*f) / (a*d - b*c);
        double y= (a*f - e*c) / (a*d - b*c);
        System.out.println("x = " +x );
        System.out.println("y = " +y );
       */

    }
}
