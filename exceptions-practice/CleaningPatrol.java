import java.util.InputMismatchException;
import java.util.Scanner;

/** Städpatrullen – Inkluderar en finally
 * Ett litet program där användaren skriver in två heltal och programmet dividerar det första med det andra.
 * - använder Scanner för inmatningen
 * - fångar olika typer av exceptions
 *      - ArithmeticException om användaren försöker dividera med 0.
 *      - InputMismatchException om användaren skriver något som inte är ett heltal.
 */
public class CleaningPatrol {

    public static void main(String[] args) {
        // Skapa en scanner för att läsa användarens inmatning
        Scanner scanner = new Scanner(System.in);

        try {
                System.out.println("\n=== s t ä d p a t r u l l e n ===");
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

            } catch (ArithmeticException e) {
                System.out.println("Det går inte att dividera med 0. (Java: " + e.getMessage() + ")");
            } catch (InputMismatchException e) {
                System.out.println("Du måste ange ett heltal. (Java: " + e.getMessage() + ")");
            } finally {
                System.out.println("Programmet är klart!");
                /* Testa minst tre gånger:
                 * - korrekt inmatning
                 * - division med 0
                 * - fel typ av inmatning
                 * 
                 * När körs finally?
                 * - finally körs alltid efter try-blocket oavsett om ett exception uppstår eller inte
                 *      - om ett exception har fångats körs först catch sedan finally
                 *      - om inget exception uppstår körs finally direkt efter try
                 */
            }

        // Stäng scanner
        scanner.close();
    }
}
