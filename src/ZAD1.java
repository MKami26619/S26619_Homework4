import java.util.Scanner;
// Zadeklaruj 2 zmienne typuboolean:czyPadaiczySwieciSlonce i zainicjuj ichdowolnymi wartościami.
// Następnie, wykorzystując instrukcję warunkową if i wyświetl następne stanu pogody w komunikatach:
// ● plucha - gdy pada i nie świeci słońce
// ● tęcza - gdy pada i świeci słońce
// ● słonecznie - gdy świeci słońce i nie pada
// ● pochmurno - gdy nie świeci słońce i nie pada


class ZAD_1 {


        public static void main(String[]args)
        {   double czyPada, czySwieci;
            System.out.println("Witaj uzytkowniku!" + "\n" + "Chcialbym sie dowiedziec jaka masz pogode za oknem" + "\n" +
            "wystarczy ze odpowiesz mi na 2 pytanka ;)" + "\n");
            System.out.println("Odpowiedz wprowadz zgodnie z opisem " + "\n"
            + "gdzie 1 = TAK, a nie 0 = NIE" + "\n");

            Scanner scan = new Scanner(System.in);

            System.out.println("Czy pada obecnie u Ciebie?");
            czyPada = scan.nextInt();
            System.out.println("Czy obecnie swieci u Ciebie slonce?");
            czySwieci = scan.nextInt();

                if (czyPada > czySwieci) {
                     System.out.println("\n" + "Musisz miec za oknem pluche -.-");}
                if (czyPada < czySwieci) {
                    System.out.println("\n" + "Musisz byc u Ciebie slonecznie :D");}
                if (czyPada == 0 && czySwieci == 0) {
                    System.out.println("\n" + "Musisz miec pochmurno na zewnątrz :(");}
                 if (czyPada == 1 && czySwieci == 1) {
                    System.out.println("\n" + "Chyba dostrzezesz tecze za oknem :)");}
        }

        }

