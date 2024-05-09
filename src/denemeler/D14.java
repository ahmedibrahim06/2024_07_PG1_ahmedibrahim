package denemeler;
//continue örneği
public class D14 {
    public static void main(String[] args) {
        for (int i = 1 ; i < 20 ; i++) {
            if (i == 5 || i == 10 || i == 15 ) {
                continue;
            }
            System.out.println(i);
        }
    }
}
