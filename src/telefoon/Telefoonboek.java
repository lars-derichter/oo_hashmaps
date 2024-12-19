package telefoon;

import java.util.HashMap;

public class Telefoonboek {
    HashMap<String, String> contacts = new HashMap<>();

    public Telefoonboek() {
        contacts.put("Jan", "123");
        contacts.put("Jos", "456");
        contacts.put("Jozef", "789");
    }

    public int telContacten() {
        return contacts.size();
    }

    public String zoekTelefoonnummerOp(String naam) {
        String telefoonnummer = contacts.get(naam);
        if (telefoonnummer != null) {
            return telefoonnummer;
        }
        else {
            return "99999";
        }
    }

    public void plaatsInBoek(String naam, String telefoonnummer) {
        contacts.put(naam, telefoonnummer);
    }

    public boolean komtVoor(String naam){
        return contacts.containsKey(naam);
    }

    public void printAlleNamen() {
        for (String naam : contacts.keySet()) {
            System.out.println(naam);
        }
    }

    public void printAlles() {
        for (String naam : contacts.keySet()) {
            System.out.println(naam + ": " + contacts.get(naam));
        }
    }

    @Override
    public String toString() {
        return "Telefoonboek{" +
                "contacts=" + contacts +
                '}';
    }
}
