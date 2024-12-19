package woordenteller;

public class TestWoordenTeller {
    public static void main(String[] args) {
        WoordenTeller wt = new WoordenTeller();

        System.out.println("--- verwerkZin ---");
        wt.verwerkZin();
        System.out.println(wt);

        System.out.println("\n--- toonWoordenTel ---");
        wt.toonWoordenTel();

        System.out.println("\n--- verwijderMeestVoorkomend ---");
        wt.verwijderMeestVoorkomend();
        System.out.println(wt);
    }
}
