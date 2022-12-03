import java. util.Scanner;

public class ZAD5 {

    public static void main(String[] args) {
        System.out.println("1 JEN (¥)");
        System.out.println("2 USD ($)");
        System.out.println("3 EUR (€)");

        Scanner sc = new Scanner(System.in);
        System. out.println("Wybierz na jaką walutę mam przeliczyc kwote:");
        int wybor = sc.nextInt();
        System.out.println("Wprowadz kwote w PLN");
        double kwota = sc.nextDouble();
        switch (wybor) {
            case 1:
                PLN_to_JEN(kwota);
                break;
            case 2:
                PLN_to_USD(kwota);
                break;
            case 3:
                PLN_to_EUR(kwota);
                break;
            default:
                System.out.println("Nie ma takiego kursu u nas");
        }
        System.out.println("Dziekujemy za skorzystanie z naszych uslug, polecamy sie na przyszlosc :)");

    }

    private static void PLN_to_EUR(double kwota) {
        int kurs = (int) 4.6850;
        System.out.println("1 EUR = "+ kurs + " PLN");
        System.out.println();
        System.out.println(kwota+" PLN = "+ (kwota / kurs) + " EUR");
    }

    private static void PLN_to_USD(double kwota) {
        int kurs = (int) 4.4492;
        System.out.println("1 USD = "+ kurs + " PLN");
        System.out.println();
        System.out.println(kwota+" PLN = "+ (kwota / kurs) + " USD");
    }

    private static void PLN_to_JEN(double kwota) {
        int kurs = (int) 0.033;
        System.out.println("1 JEN = "+ kurs + " PLN");
        System.out.println();
        System.out.println(kwota+" PLN = "+ (kwota / kurs) + " USD");    }}

