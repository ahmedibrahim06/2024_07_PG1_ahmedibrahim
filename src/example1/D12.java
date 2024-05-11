package example1;
// Break örneği
public class D12 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 20 ; i++) {
            if (i == 10 || i == 15) {
                break;
            }
            System.out.println(i);
        }
    }
}
