import java.text.DecimalFormat;

public class Lab3_1 {
    public static void main(String[] args) {
        double capital = 14000;
        double firstYear = 1.4 * capital;
        double secondYear = firstYear - 1500;
        double thirdYear = 1.2 * secondYear;
        double zysk = thirdYear - capital;

        System.out.println(thirdYear);
        System.out.println(zysk);

        double x = 1.22e22;
        System.out.println(x);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println(decimalFormat.format(x));

        int dzielna = 10;
        int dzielnik = 3;
        int wynik = dzielna / dzielnik;
        int reszta = dzielna % dzielnik;

        System.out.println(dzielna + " : " + dzielnik + " wynosi " + wynik + "\t" + reszta);
    }
}

