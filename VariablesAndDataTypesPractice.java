public class VariablesAndDataTypesPractice {
    public static void main(String[] args) {
        variablesExample();
        declarationAndAssignmentExample();
        variableNamesExample();

    }

    public static void variablesExample() {
        // Skapa en variabel av typen String som innehåller ditt namn.
        String name = "Elin";

        // Skapa en int som innehåller din ålder.
        int age = 33;

        // Skapa en double som innehåller din längd.
        double height = 179.4;

        // Skapa en char som innehåller en valfri bokstav.
        char gender = 'F';

        // Skapa en boolean som innehåller true eller false.
        boolean isFunny = true;

        System.out.println("Name: " + name + " | Age: " + age + " | Height: " + height + " | Gender: " + gender + " | Funny: " + isFunny);
    }

    public static void declarationAndAssignmentExample() {
        // Deklarera först en variabel utan att ge den ett värde.
        int age;

        // Tilldela sedan variabeln ett värde på nästa rad.
        age = 33;

        // Skriv ut värdet.
        System.out.println(age);

        // Förklara skillnaden mellan deklarering och tilldelning.
        System.out.println("Att deklarera en variabel innebär att man skapar den och anger vilken typ den har, tilldelning ger variablen ett värde.");
    }

    public static void variableNamesExample() {
        int x = 3;                      // Man ser värdet, men inte vad det representerar
        String a = "obymael";           // Man ser texten, men inte vad den används till
        boolean test = true;            // Man vet att något är true, men inte vad som testats

        int loginAttempts = 3;          // Tydligt att värdet representerar antal inloggningsförsök
        String userName = "obymael";    // Tydligt att texten representerar ett användarnamn
        boolean hasPassedTest = true;   // Tydligt vad true/false representerar

        System.out.println("Tydliga variabelnamn är viktiga eftersom de gör koden lättare att läsa, förstå och underhålla.");
    }
}