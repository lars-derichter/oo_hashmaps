package woordenteller;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WoordenTeller {
    private String zin;
    private HashMap<String, Integer> woordenTel = new HashMap<>();

    public WoordenTeller() {
        String zin = JOptionPane.showInputDialog("Geef een zin");
        this.zin = zin.replaceAll("[^A-Za-z ]", "").toLowerCase(); // speciale tekens verwijderen en lowercase
    }

    public void verwerkZin() {
        String[] woorden = this.zin.split(" ");
        for (String w : woorden) {
            if (!woordenTel.containsKey(w)) {
                woordenTel.put(w, 1);
            } else {
                int aantal = woordenTel.get(w);
                woordenTel.put(w, aantal + 1);
            }
        }
    }

    public void toonWoordenTel() {
        System.out.println(woordenTel);
    }

    public void verwijderMeestVoorkomend() {
        int voorlopigGrootste = 0;
        //hoogste aantal = hoogste value in de HashMap
        for (int aantal : this.woordenTel.values()) {
            if (aantal > voorlopigGrootste) {
                voorlopigGrootste = aantal;
            }
        }
        //alle keys van de HashMap (=woorden) met als aantal = voorlopigGrootste
        ArrayList<String> alleTeVerwijderenKeys = new ArrayList<>();
        for (String woord : this.woordenTel.keySet()) {
            if (woordenTel.get(woord) == voorlopigGrootste) {
                alleTeVerwijderenKeys.add(woord);
            }
        }
        //ArrayList overlopen, alle paren verwijderen die als key voorkomen
        Iterator it = this.woordenTel.entrySet().iterator();
        //anders dan bij collection :
        //de iterator wijst naar een paar (=key en value)
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            //paar (key/value) moet omgezet worden naar juiste datatype
            if (alleTeVerwijderenKeys.contains(pair.getKey())) {
                it.remove();
                //een volledig paar removen
            }
        }
        System.out.println(alleTeVerwijderenKeys);
    }

    @Override
    public String toString() {
        return "WoordenTeller{" +
                "zin='" + zin + '\'' +
                ", woordenTel=" + woordenTel +
                '}';
    }
}
