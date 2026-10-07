/** Övningar Klasser
 * - Denna klass kommer att:
 *      - skapa en hund och en katt från Djur.java
 *      - skapa två karaktärer från Spelkaraktar.java
 *      - skapa en robot från Robot.java
 */
public class Main {
    public static void main(String[] args) {
        
        Animal dog = new Animal("voff"); // skapa en hund
        Animal cat = new Animal("mjau"); // skapa en katt
        
        dog.makeSound(); // gör ljud: voff
        cat.makeSound(); // gör ljud: mjau

        // skapa karaktär

        // skapa robot
        // försök ändra batteri – vad händer?
    }
}
