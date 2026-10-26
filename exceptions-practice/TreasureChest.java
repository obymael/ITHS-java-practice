/** Skattkistan som kraschar
 * 
 */
public class TreasureChest {
    // Skapa en array med 3 skatter
    int[] treasure = {100, 200, 300};

    public static void main(String[] args) {
        // Skapa ett objekt av klassen TreasureChest
        TreasureChest chest = new TreasureChest();
        // chest.printElementException(); // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        chest.printElement();
        
    }

    // 1. Försök skriva ut elementet på index 5 och kör programmet.
    public void printElementException() {
        // print (skatt)
        System.out.println(treasure[5]);
    }

    // 3. Lägg den riskabla raden i ett try-block.
    // public metod för printElement()
    public void printElement() {
        // Försök skriva ut elementet på index 5
        try {
            System.out.println(treasure[5]);
        } catch (ArrayIndexOutOfBoundsException e) { // 4. Fånga felet med catch (ArrayIndexOutOfBoundsException e).
            // 5. Skriv ut ett eget meddelande och även e.getMessage().
            System.out.println("Fel! Skatten finns inte här.");
            // Skriv ut java fel
            System.out.println(e.getMessage());
        }
    }

    // Fundera: Är detta ett kompileringsfel eller ett fel som uppstår under körning?
    // Det är ett runtime exception så alltså inte ett kompileringsfel
    // Java kan kompilera koden eftersom uttrycket är syntax-giltigt, 
    // felet uppstår när programmet körs och försöker komma åt ett index som inte finns
}
