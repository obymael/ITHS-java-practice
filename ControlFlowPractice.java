import java.util.Random;

/** ControlFlowPractice
 * – valde att göra metoder i en klass istället för separata klasser för dessa övningar
 */
public class ControlFlowPractice {

    public static void main(String[] args) {

        System.out.println("\n---------------------------------- i f ----------------------------------\n");
        ifExample();

        System.out.println("\n----------------------------- i f / e l s e -----------------------------\n");
        ifElseExample();

        System.out.println("\n----------------------------- e l s e  i f -----------------------------\n");
        elseIfExample();

        System.out.println("\n------------------------------ s w i t c h ------------------------------\n");
        switchExample();

        System.out.println("\n------------------------- w h i l e  a t t a c k -------------------------\n");
        whileAttackExample();

        System.out.println("\n------------------------ w h i l e  h e a l i n g ------------------------\n");
        whileHealingExample();

        System.out.println("\n---------------------------- d o - w h i l e ----------------------------\n");
        doWhileExample();

        System.out.println("\n---------------------------- f o r - l o o p ----------------------------\n");
        forLoopExample();

        System.out.println("\n------------------------------ b r e a k ------------------------------\n");
        breakExample();

        System.out.println("\n---------------------------- c o n t i n u e ----------------------------\n");
        continueExample();

    }

    /** IF ( s t ö r r e  ä n)
     * – kontrollerar ett villkor & kör kodblocket om villkoret är sant
     * Övning: skriv ut ett meddelande om ett tal är större än 10
     */
    public static void ifExample() {
        int tal = 25;

        if (tal > 10) {
            System.out.println("Talet " + tal + " är större än 10.");
        }
    }

    /** IF/ELSE ( å l d e r s k o n t r o l l )
     * – kör ett kodblock om villkoret är sant, annars kör else-blocket
     * Övning: kontrollera om en person är 18 år eller äldre
     */
    public static void ifElseExample() {

        Random random = new Random();

        int age = random.nextInt(100) + 1; // generera slumpmässig ålder

        if (age >= 18) {
            System.out.println("Du är " + age + " år gammal & räknas som vuxen.");
        } else {
            System.out.println("Du är " + age + " år gammal & räknas som barn.");
        }

    }

    /** ELSE IF ( b a t t e r i )
     * – kontrollerar flera villkor i ordning & kör det första som är sant
     * Övning: skriv ut olika meddelanden beroende på om ett tal är litet, mellan eller stort
     */
    public static void elseIfExample() {

        Random random = new Random();

        int batteryPercentage = random.nextInt(100) + 1; // generera slumpmässig batterinivå
        String batteryStatus;

        if (batteryPercentage <= 20) {
            batteryStatus = "låg";

        } else if (batteryPercentage >= 80) {
            batteryStatus = "hög";

        } else {
            // mellan 21-79 (>= 21 && <= 79)
            batteryStatus = "medium";
        }

        System.out.println("Batterinivå: " + batteryPercentage + "% | Status: " + batteryStatus);

    }

    /** SWITCH ( c u r r e n t  m o o d)
     * – jämför ett värde med flera alternativ & kör det case som matchar
     * Övning: låt tal mellan 1-3 motsvara tre olika alternativ, skriv ut rätt alternativ
     */
    public static void switchExample() {
        Random random = new Random();

        int mood = random.nextInt(3) + 1;
        String description = "";

        /* switch (mood) {
            case 1:
                description = "Thriving!";
                break; // utan break här så går den automatiskt vidare till nästa
            case 2:
                description = "Surviving...";
                break;
            case 3:
                description = "Need coffee.";
                break;
            default:
                description = "Unknown mood"; // körs om inget case matchar
                break;
        } */

        // nyare switch-syntax som förhindrar fall-through därför behövs inte break
        // i.e. med -> körs endast matchande case
        switch (mood) {
            case 1 -> description = "Thriving!";
            case 2 -> description = "Surviving...";
            case 3 -> description = "Need coffee.";
            default -> description = "Unknown mood"; // körs om inget case matchar, exempelvis om vi ändrar bound till 4
        }

        System.out.println("Current mood [" + mood + "]: " + description);

    }

    /** WHILE ( a t t a c k )
     * – upprepar ett kodblock så länge ett villkor är sant
     * Övning: skriv ut talen 5-1 med en while-loop
     */
    public static void whileAttackExample() {
        int hp = 5; // startvärde

        while (hp > 0) { // villkor
            System.out.println("Current HP: " + hp);
            hp = hp - 1; // attack (minskar spelarens HP så länge spelaren har HP kvar)
        }

        System.out.println("Game over! 💀");
    }

    /** WHILE ( h e a l i n g )
     * – upprepar ett kodblock så länge ett villkor är sant
     * Övning: skriv ut talen 1-5 med en while-loop
     */
    public static void whileHealingExample() {
        int hp = 1; // startvärde

        while (hp <= 5) { // villkor
            System.out.println("Current HP: " + hp);
            hp = hp + 1; // återställer HP, 1 åt gången
        }

        System.out.println("Full health! ♥️");
    }


    /** DO-WHILE ( s k a t t k i s t a )
     * – kör kodblocket minst en gång & fortsätter sedan så länge villkoret är sant
     * Övning: skriv ut ett meddelande minst en gång med en do-while-loop
     */
    public static void doWhileExample() {
        Random random = new Random(); // används för att slumpa vilken nyckel som är rätt
        int correctKey = random.nextInt(3) + 1;
        int currentKey = 1;
        boolean chestOpen = false;

        System.out.println("Du har hittat en låst skattkista & tre nycklar att testa!");
        do { // testa nycklar tills skattkistan öppnas
            System.out.println("\n🗝️ Testar nyckel " + currentKey + "...");
            if (currentKey == correctKey) {
                chestOpen = true;
                System.out.println("✨ Klick! Låset öppnas!");
            } else {
                System.out.println("Den passar inte...");
                currentKey++;
            }
        } while (!chestOpen); // fortsätt så länge kistan INTE är öppen

        System.out.println("\nSkattkistan är fylld med guldmynt! 💰 Woohoo!");
    }

    /** FOR-LOOP ( c o u n t i n g )
     * – upprepar ett kodblock ett bestämt antal gånger
     * Övning: skriv ut talen 1-10 med en for-loop
     */
    public static void forLoopExample() {

        for (int i = 1; i <= 10; i++) { // räkna från 1 till 10
            System.out.println(i);
        }

    }

    /** BREAK ( c o r r e c t  d o o r )
     * – avbryter en loop direkt även om loopens villkor fortfarande är sant
     * Övning: loop som avbryts när räknaren når ett visst tal
     */
    public static void breakExample() {
        Random random = new Random();
        // Öppna dörrar, när korrekt dörr öppnas, avbryt loop
        int correctDoor = random.nextInt(10) + 1;

        System.out.println("Du letar efter din vän som har gömt sig bakom en av dörrarna i en lång korridor...");
        System.out.println("DEBUG: Rätt dörr: " + correctDoor);
        for (int door = 1; door <=10; door++) { // öppna dörrar
            System.out.println("🚪 Öppnar dörr nummer " + door + "...");

            if (door == correctDoor) { // tills rätt dörr hittas
                System.out.println("BU! 👻 Din vän hoppar fram!");
                break; // avbryt loopen
            }
        }
    }

    /** CONTINUE ( l e v e l s )
     * – hoppar över resten av det aktuella varvet & fortsätter med nästa
     * Övning: loop som hoppar över ett visst tal
     */
    public static void continueExample() {
        // Gå igenom nivåerna 1-10 men hoppa över nivå 7
        for (int level = 1; level <= 10; level++) {

            if (level == 7) {
                System.out.println("Nivå 7 är trasig! Hoppar över...");
                continue; // hoppa över nivå 7 – DEBUG: prova köra utan detta :)
            }

            System.out.println("Spelar nivå " + level);
        }
    }
}
