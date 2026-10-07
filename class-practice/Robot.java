/** Övning 3 – Robot
 * - Skapa en klass Robot med ett public field namn och ett private field batteri.
 * - Sätt värdena med en konstruktor och använd this.
 * - Skapa en metod visaStatus() som skriver ut namn och batteri.
 * - Skapa en robot i Main. Testa vad som händer om du försöker ändra batteri direkt från Main.
 */
public class Robot {
    String name; // eftersom klassen är satt till public behöver inte det specificeras här
    private int battery;

    Robot(String name, int battery) {
        this.name = name;
        this.battery = battery;
    }

    void showStatus() {
        System.out.println("Name: " + name + " | Battery: " + battery);
    }
}
