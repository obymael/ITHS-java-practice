/** ÖVNING 2 – Spelkaraktär
 * - Skapa en klass Spelkaraktar med fields för namn och liv.
 * - Skapa en konstruktor som sätter namn och liv.
 * - Skapa en metod presentera() som skriver ut karaktärens namn och liv.
 * - Skapa två olika karaktärer i Main.
 */
public class Character {
    String name; // deklarera en variabel av typen string
    int hp; // deklarera en variabel av typen int

    // Konstruktor 1
    Character(String name, int hp) { // två parametrar; namn, hp
        this.name = name; // initiera fielden name (this.name syftar på OBJEKTETS field, medans name syftar på parametern)
        this.hp = hp; 
    }

    // Konstruktor 2
    Character(String name) { // en parameter; namn (detta innebär att man kan skapa en karaktär med bara namn)
        this.name = name;
        // eftersom hp inte är en parameter så behöver man inte specificera hp
        // det blir istället default; 0 – om man inte specificerar en annan default här

        // prova köra nästa rad:
        // this.hp = 100; // denna rad specificerar default hp istället för 0
    }

    // Konstruktor 3
    Character(int hp) { // möjliggör att skapa en karaktär med bara hp (namn blir null)
        // om vi inte ändrar default name så blir det null
        // prova köra nästa rad:
        // this.name = "Elin"; // specificera namn
        this.hp = hp;
    }

    // METOD som vi sedan ropar på från Main för att skriva ut karaktärsinformationen
    void present() {
        System.out.println("Character: " + name + " | HP: " + hp);
    }
}
