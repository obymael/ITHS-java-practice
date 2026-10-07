/** Övningar Klasser
 * - Denna klass kommer att:
 *      - skapa en hund och en katt från Djur.java
 *      - skapa två karaktärer från Spelkaraktar.java
 *      - skapa en robot från Robot.java
 */
public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("voff"); // skapa en instans av Animal: hund
        Animal cat = new Animal("mjau"); // skapa en instans av Animal: katt

        dog.makeSound(); // gör ljud: voff
        cat.makeSound(); // gör ljud: mjau


        // skapa m.h.a. konstruktor 1
        Character mage = new Character("Rocilyn", 75); // skapa karaktär: mage
        Character paladin = new Character("Kyreah", 150); // skapa karaktär: paladin
        
        Character warlock = new Character("Zola"); // använder konstruktor 2
        Character warrior = new Character(114); // använder konstruktor 3

        mage.present();
        paladin.present();
        warlock.present();
        warrior.present();

        Robot robot = new Robot("Wall-E", 82); // skapa robot
        Robot starWars = new Robot("R2-D2"); // använder den andra konstruktorn som ger 100% battery som default

        robot.showStatus();
        starWars.showStatus();

        // försök ändra batteri – vad händer?
        // eftersom battery är private kan main inte komma åt det direkt och därför kompileras inte koden
        // robot.battery = 100; // "The field Robot.battery is not visible"
    }
}
