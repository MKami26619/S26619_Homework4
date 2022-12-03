import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Zad4 {public static void main( String args[] ) {
    System.out.print("Wprowadź 2 liczby rzeczywiste i naciśnij ENTER po każdej z nich: " + '\n');
    Scanner sc = new Scanner(System.in);

    System.out.print("Pierwsza liczba : ");
    int rsnum = sc.nextInt();
    System.out.print("Druga liczba : ");
    int renum = sc.nextInt();
    System.out.print("\n" + "Twoj przedzial liczb to : " + "[" + +rsnum + "," + renum + "]" + "\n" + "Teraz system wygeneruje 3 losowe liczby z Twojego przedzialu: ");
    int random1 = ThreadLocalRandom.current().nextInt(rsnum, renum);
    System.out.println("\n"+"Pierwsza Twoja losowa liczba to: " + random1);
    int random2 = ThreadLocalRandom.current().nextInt(rsnum, renum);
    System.out.println("Druga Twoja losowa liczba to: " + random2);
    int random3 = ThreadLocalRandom.current().nextInt(rsnum, renum);
    System.out.println("Trzecia i ostatnie Twoja losowa liczba to: " + random3 + "\n");

    System.out.println("Teraz postaram sie uporzadkowac dane :)" + "\n");
int[] zakres = {random1, random2, random3};
Arrays.sort(zakres);
    System.out.println("Wedlug moich obliczen, tak powinno to wygladac: ");
for(int i=0; i < zakres.length; i++)
    System.out.println(zakres[i]);}}
