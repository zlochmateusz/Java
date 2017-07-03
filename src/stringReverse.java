import java.util.Scanner;

class Apps {

}
public class stringReverse {
    public static void main (String[] args) {
        String text;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj text do odwrócenia");

        text = odczyt.nextLine();

        String odw = new StringBuilder(text).reverse().toString();


        System.out.println("Odwórcony text to: " + odw);


    }
}
