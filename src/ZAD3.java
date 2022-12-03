import java.util.Scanner;

// Utwórz program w Javie, który służy jako prosty kalkulator liczb całkowitych.
// Odczytaj 2 wiersze z konsoli i przekonwertuj dane wejściowe na liczby całkowite.
// Następnie przeczytaj polecenie z konsoli opisujące, co zrobić z tymi wartościami
// W przypadku wyniku ujemnego, wartosc musi być calkowita, tzn. dodatnia

class Zad3 {
    public static void main(String[] args) {
        double num1, num2, ans, ctr, ansF;
        ctr = (-1);
        char operacja;
        Scanner SCAN = new Scanner(System.in);
        System.out.print("Podaj dwie cyfry" + "\n");
        num1 = SCAN.nextDouble();
        num2 = SCAN.nextDouble();

        System.out.print("Wybierz dzianie jakie chcesz wykonac" + "\n" +
                " + dla dodawanie, " + "\n" +
                " - dla odejmowanie," + "\n" +
                " / dla dzielenie, " + "\n" +
                " * dla mnozenia");
        operacja = SCAN.next().charAt(0);

        SCAN.close();

        switch (operacja) {
            case '+':
                ans = num1 + num2;
                ansF = ans * ctr;
                if (ans < 0) {
                    System.out.println("Twoj wynik przy zachowaniu wartosci dodatnich to: " + (ansF));}
                else {System.out.println("Twoj wynik to: " + ans);
                }
                break;
            case '-':
                ans = num1 - num2;
                ansF = ans * ctr;
                if (ans < 0) {
                    System.out.println("Twoj wynik przy zachowaniu wartosci dodatnich to: " + (ansF));}
                else {System.out.println("Twoj wynik to: " + ans);
                }
                break;
            case '*':
                ans = num1 * num2;
                ansF = ans * ctr;
                if (ans < 0) {
                    System.out.println("Twoj wynik przy zachowaniu wartosci dodatnich to: " + (ansF));}
                else {System.out.println("Twoj wynik to: " + ans);
                }
                break;
            case '/':
                ans = num1 / num2;
                ansF = ans * ctr;
                if (ans < 0) {
                    System.out.println("Twoj wynik przy zachowaniu wartosci dodatnich to: " + (ansF));}
                else {System.out.println("Twoj wynik to: " + ans);
                }
                break;

    }}}