/** ÖVNING 1 – Djur
 * - Skapa en klass Djur med ett field som heter ljud.
 * - Skapa en konstruktor som tar emot ljudet.
 * - Skapa metoden gorLjud() som skriver ut ljudet.
 * - Skapa en hund och en katt i Main och låt dem göra olika ljud.
 */
public class Animal {
    String sound;

    // Constructor
    Animal(String sound) {
        this.sound = sound;
    }

    // Metod för att skriva ut ljud
    void makeSound() {
        System.out.println(sound);
    }
}
