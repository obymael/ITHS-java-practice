/** ÖVNING 2 – Spelkaraktär
 * - Skapa en klass Spelkaraktar med fields för namn och liv.
 * - Skapa en konstruktor som sätter namn och liv.
 * - Skapa en metod presentera() som skriver ut karaktärens namn och liv.
 * - Skapa två olika karaktärer i Main.
 */
public class Character {
    String name;
    int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void present() {
        System.out.println("Character: " + name + " | HP: " + hp);
    }
}
