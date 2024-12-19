import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Wachtrij {
    enum toestand {
        WACHTEND,
        BEDIEND
    }
    private HashMap<String, toestand> rij = new HashMap<>();

    public Wachtrij() {}

    public void voegToe(String naam) {
        rij.put(naam, toestand.WACHTEND);
    }

    public void bediend(String naam) {
        rij.put(naam, toestand.BEDIEND);
    }

    public String overzicht(){
        ArrayList<String> wachtenden = new ArrayList<>();
        ArrayList<String> bedienden = new ArrayList<>();
        String overzicht = "";
        for (String naam : rij.keySet()) {
            if (rij.get(naam).equals(toestand.WACHTEND)) {
                wachtenden.add(naam);
            }
            else if (rij.get(naam).equals(toestand.BEDIEND)) {
                bedienden.add(naam);
            }
        }
        overzicht += "Wachtend:\n";
        for (String naam : wachtenden) {
            overzicht += "\t- " + naam + "\n";
        }
        overzicht+= "\nBediend:\n";
        for (String naam : bedienden) {
            overzicht += "\t- " + naam + "\n";
        }
        return overzicht;
    }

    public String aantallen() {
        int aantalWachtenden = 0;
        int aantallBedienden = 0;

        for (String naam : rij.keySet()) {
            if (rij.get(naam).equals(toestand.WACHTEND)) {
                aantalWachtenden++;
            }
            else if (rij.get(naam).equals(toestand.BEDIEND)) {
                aantallBedienden++;
            }
        }
        return "Wachtenden: " + aantalWachtenden + " - Bedienden: " + aantallBedienden;
    }

    public void verwijderBediend() {
        Iterator it = rij.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (rij.get(pair.getKey()).equals(toestand.BEDIEND)) {
                it.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "Wachtrij{" +
                "rij=" + rij +
                '}';
    }
}
