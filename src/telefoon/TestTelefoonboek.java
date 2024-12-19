package telefoon;

public class TestTelefoonboek {
    public static void main(String[] args) {
        Telefoonboek telefoonboek = new Telefoonboek();

        System.out.println("--- Telefoonboek ---" );
        System.out.println(telefoonboek);
        System.out.println("\n--- telContacten ---");
        System.out.println(telefoonboek.telContacten());
        System.out.println("\n--- zoekTelefoonnummerOp (Jan) ---");
        System.out.println(telefoonboek.zoekTelefoonnummerOp("Jan"));
        System.out.println("\n--- zoekTelefoonnummerOp (onbestaand) ---");
        System.out.println(telefoonboek.zoekTelefoonnummerOp("onbestaand"));
        System.out.println("\n--- plaatsInBoek ---");
        telefoonboek.plaatsInBoek("Lars", "234");
        System.out.println("Aantal nummers: " + telefoonboek.telContacten());
        System.out.println("\n--- komtVoor ---");
        System.out.println("Jan komt voor? " + telefoonboek.komtVoor("Jan"));
        System.out.println("Onbekend komt voor? " + telefoonboek.komtVoor("Onbekend"));
        System.out.println("\n--- printAlleNamen ---");
        telefoonboek.printAlleNamen();
        System.out.println("\n--- printAlles ---");
        telefoonboek.printAlles();
    }
}
