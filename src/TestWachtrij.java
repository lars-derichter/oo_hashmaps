public class TestWachtrij {
    public static void main(String[] args) {
        Wachtrij wachtrij = new Wachtrij();
        System.out.println("--- Wachtrij ---");
        System.out.println(wachtrij);
        System.out.println("\n--- voegToe ---");
        wachtrij.voegToe("Fabricio");
        wachtrij.voegToe("Abdulla");
        System.out.println(wachtrij);
        System.out.println("\n--- bediend ---");
        wachtrij.bediend("Fabricio");
        System.out.println(wachtrij);
        System.out.println("\n--- overzicht ---");
        System.out.println(wachtrij.overzicht());
        System.out.println("\n--- aantallen ---");
        System.out.println(wachtrij.aantallen());
        System.out.println("\n--- verwijderBediend ---");
        wachtrij.verwijderBediend();
        System.out.println(wachtrij);
    }
}
