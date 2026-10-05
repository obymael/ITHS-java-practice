public class VariablesAndDataTypesPractice {
    public static void main(String[] args) {
        variablesExample();
        declarationAndAssignmentExample();
        variableNamesExample();
        changingVariablesExample();
        finalExample();
        primitiveDataTypesExample();
        typeCastingExample();

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
        System.out.println("Att deklarera en variabel innebär att man skapar den och anger vilken typ den har, tilldelning ger variabeln ett värde.");
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

    public static void changingVariablesExample() {
        // Skapa en int med värdet 10.
        int students = 10;
        
        // Skriv ut variabeln.
        System.out.println(students);

        // Tilldela den sedan värdet 25.
        students = 25;                  // 10 skrivs över & ersätts med 25

        // Skriv ut variabeln igen.
        System.out.println(students);
        System.out.println("När en variabel tilldelas ett nytt värde skrivs det gamla över & ersätts med det nya.");
    }

    public static void finalExample() {
        // Skapa en variabel med final.
        final int students;             // deklarering

        // Tilldela den ett värde.
        students = 10;                  // första tilldelningen

        // Försök därefter ändra värdet.
        //students = 25;                  // andra tilldelningen – detta går inte eftersom students är final

        // Läs felmeddelandet som Java ger dig.
        // Koden går inte att kompilera & ger felmeddelandet: "The final local variable students may already have been assigned"

        System.out.println("Final är användbart för värden som inte ska kunna ändras efter att de tilldelats, exempelvis när man vill förhindra att ett konstant värde ändras av misstag.");
    }

    public static void primitiveDataTypesExample() {
        // Skriv exempel på värden som kan lagras i int, double, boolean och char.
        int age = 33;               // heltal
        double height = 179.4;      // flyttal (decimaltal)
        boolean isFunny = true;     // true eller false
        char letter = 'A';          // ett tecken

        System.out.println("int: " + age);
        System.out.println("double: " + height);
        System.out.println("boolean: " + isFunny);
        System.out.println("char: " + letter);

        // Förklara skillnaden mellan heltal och flyttal.
        System.out.println("Skillnaden mellan heltal och flyttal: int lagrar heltal, double kan lagra tal med decimaler.");
        // Förklara varför 'A' och "A" inte är samma typ.
        System.out.println("'A' är char - ett enskilt tecken som skrivs med enkla citationstecken; dubbla används för text (String).");
    }

    public static void typeCastingExample() {
        // Skapa en variabel av typen byte och tilldela dess värde till en int.
        byte smallNumber = 100; // en byte kan bara innehålla värden från -128 till 127
        int biggerNumber = smallNumber; // implicit casting – detta sker automatiskt

        System.out.println("byte: " + smallNumber);
        System.out.println("byte -> int: " + biggerNumber);

        // Skapa sedan en int och försök tilldela dess värde till en byte.
        int number = 100;
        //byte smallerNumber = number; // FEL: int kan inte automatiskt tilldelas till byte då den kan förlora information
        // "Type mismatch: cannot convert from int to byte"

        // Testa att använda explicit type casting.
        byte smallerNumber = (byte) number;     // explicit casting – talar om för Java att konvertera
        System.out.println("int: " + number);
        System.out.println("int -> byte: " + smallerNumber);

        // Beskriv skillnaden mellan implicit och explicit type casting.
        System.out.println("Implicit casting sker automatiskt när värdet går från en mindre till en större datatyp.");
        System.out.println("Explicit casting måste anges manuellt när värdet går från en större till en mindre datatyp.");
        // Extra: om man tilldelar 200 till variabeln `number` hade `smallerNumber` blivit `-56` just eftersom en byte kan bara innehålla värden från -128 till 127
    }
}
