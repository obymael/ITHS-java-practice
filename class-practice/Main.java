/** Övningar Klasser
 * - Denna klass kommer att:
 *      - skapa en hund och en katt från Djur.java
 *      - skapa två karaktärer från Spelkaraktar.java
 *      - skapa en robot från Robot.java
 */
public class Main {
    public static void main(String[] args) {
        
        Animal dog = new Animal("voff"); // skapa djur: hund
        Animal cat = new Animal("mjau"); // skapa djur: katt
        
        dog.makeSound(); // gör ljud: voff
        cat.makeSound(); // gör ljud: mjau

        
        Character mage = new Character("Rocilyn", 75); // skapa karaktär: mage
        Character paladin = new Character("Kyreah", 150); // skapa karaktär: paladin

        mage.present();
        paladin.present();

        // skapa robot
        // försök ändra batteri – vad händer?
    }
}
