import java.util.InputMismatchException;
import java.util.Scanner;

/** Den säkra miniräknaren
 * Ett litet program där användaren skriver in två heltal och programmet dividerar det första med det andra.
 * - använder Scanner för inmatningen
 * - fångar olika typer av exceptions
 *      - ArithmeticException om användaren försöker dividera med 0.
 *      - InputMismatchException om användaren skriver något som inte är ett heltal.
 */
public class SafeCalculator {

    public static void main(String[] args) {
        // Skapa en scanner för att läsa användarens inmatning
        Scanner scanner = new Scanner(System.in);

        boolean success = false;

        while (!success) {
            try {
                System.out.println("\n=== d e n  s ä k r a  m i n i r ä k n a r e n ===");
                // Prompta användaren att ange ett heltal
                System.out.print("Ange första heltalet: ");
                // Läs input
                int firstNum = scanner.nextInt();

                // Prompta användaren att ange ett andra heltal
                System.out.print("Ange andra heltalet: ");
                // Läs input
                int secondNum = scanner.nextInt();

                // Beräkna resultat
                int result = firstNum / secondNum;
                // Skriv ut resultat
                System.out.println(firstNum + " / " + secondNum + " = " + result);

                success = true;
                

            } catch (ArithmeticException e) {
                System.out.println("Det går inte att dividera med 0. (Java: " + e.getMessage() + ")");
            } catch (InputMismatchException e) {
                System.out.println("Du måste ange ett heltal. (Java: " + e.getMessage() + ")");

                // Rensa felaktig inmatning
                scanner.nextLine();
            } 

        }

        // Stäng scanner
        scanner.close();
    }
}
