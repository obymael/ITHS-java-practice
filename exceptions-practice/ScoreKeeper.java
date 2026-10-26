public class ScoreKeeper {

    public static void main(String[] args) {

        // Testa giltiga & ogiltiga värden
        // Anropa metoden från main med ett ogiltigt värde.
        testScore(101);
        testScore(-5);

        // Anropa metoden från main med ett giltigt värde.
        testScore(0);
        testScore(75);
        
    }

    // Anropa checkScore och hantera eventuella exceptions
    static void testScore(int score) {
        try {
            System.out.printf("| %3s | Score ", score);
            checkScore(score);

        } catch (IllegalArgumentException e) {
            // Skriv ut errormeddelande
            System.out.println(e.getMessage());
        }
    }

    // Kontrollera om poängen är giltig
    static void checkScore(int score) {
        // Om score är mindre än 0 eller större än 100 ska metoden själv kasta ett IllegalArgumentException.
        if (score < 0 || score > 100) {
            // Använd throw new IllegalArgumentException("...") för att kasta undantaget
            throw new IllegalArgumentException("not approved, score needs to be between 0-100.");
        }

        // Om poängen är giltig ska metoden skriva att poängen godkändes.
        System.out.println("approved.");
    }
}
