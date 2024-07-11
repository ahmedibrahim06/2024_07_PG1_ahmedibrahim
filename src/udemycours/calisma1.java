package udemycours;

public class calisma1 {
    public static void main(String[] args) {
        // Genişletme işlemi
        int no1 = 100;
        double no2 = no1;
        System.out.println("no2 (double): " + no2);

        // daraltma işlemi
        double no3 = 99.99;
        int no4 = (int) no3;
        System.out.println("no4 (int): " + no4);

        // final
        final int MAXSCOURE = 100;                  // bu değer değişemez
        System.out.println("MAXSCOURE (int): " + MAXSCOURE);

    }
}
