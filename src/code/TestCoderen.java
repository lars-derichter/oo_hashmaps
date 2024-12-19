package code;

public class TestCoderen {
    public static void main(String[] args) {
        Coderen coderen = new Coderen();
        System.out.println("--- printSleutel ---");
        coderen.printSleutel();

        System.out.println("\n--- codeerBoodschap ---");
        System.out.println("'Er was eens een meisje met een rood jasje' wordt");
        System.out.println(coderen.codeerBoodschap("Er was eens een meisje met een rood jasje"));

        System.out.println("\n--- decodeerBoodschap ---");
        System.out.println("code wordt:");
        System.out.println(coderen.decodeerBoodschap("5 18 0 23 1 19 0 5 5 14 19 0 5 5 14 0 13 5 9 19 10 5 0 13 5 20 0 5 5 14 0 18 15 15 4 0 10 1 19 10 5"));
    }
}
