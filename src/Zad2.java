import java.util.Scanner;

//Utwórz program w Javie, który służy jako prosty kalkulator liczb całkowitych.
// Odczytaj 2 wiersze z konsoli i przekonwertuj dane wejściowe na liczby całkowite.
// Następnie przeczytaj polecenie z konsoli opisujące, co zrobić z tymi wartościami


class Zad2 {
        public static void main(String[] args) {
          double num1, num2, ans;
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

            switch(operacja) {
                case '+':
                    ans = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + ans);
                    break;
                case '-':
                    ans = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + ans);
                    break;
                case '*':
                    ans = num1 * num2;
                    System.out.println(num1 + "*" + num2 + "=" + ans);
                    break;
                case '/':
                    ans = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + ans);
                    break;


        }}}

