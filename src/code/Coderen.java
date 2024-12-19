package code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Anne
 */
public class Coderen {

    private HashMap<Character, Integer> secretMap;

    /**
     * Sleutel Constructor
     *
     */
    public Coderen() {
        secretMap = new HashMap<Character, Integer>();
        fillsecretMap();
    }

    /**
     * Method fillsecretMap
     *
     * Voer tekens en bijbehorende codes in
     *
     */
    private void fillsecretMap() {
        secretMap.put('A', 1);
        secretMap.put('B', 2);
        secretMap.put('C', 3);
        secretMap.put('D', 4);
        secretMap.put('E', 5);
        secretMap.put('F', 6);
        secretMap.put('G', 7);
        secretMap.put('H', 8);
        secretMap.put('I', 9);
        secretMap.put('J', 10);
        secretMap.put('K', 11);
        secretMap.put('L', 12);
        secretMap.put('M', 13);
        secretMap.put('N', 14);
        secretMap.put('O', 15);
        secretMap.put('P', 16);
        secretMap.put('Q', 17);
        secretMap.put('R', 18);
        secretMap.put('S', 19);
        secretMap.put('T', 20);
        secretMap.put('U', 21);
        secretMap.put('V', 22);
        secretMap.put('W', 23);
        secretMap.put('X', 24);
        secretMap.put('Y', 25);
        secretMap.put('Z', 26);
        secretMap.put(' ', 0);
        secretMap.put('.', 27);
    }

    /**
     * Method printSleutel
     *
     * Tekens en bijbehorende codes worden samen op scherm getoond
     *
     */
    public void printSleutel() {
        for (char teken : secretMap.keySet()) {
            int code = secretMap.get(teken);
            System.out.println(teken + "  " + code);
        }
    }

    /* * Voorbeeld: boodschap " Er was eens ... " wordt in code "5 18 0 23 1 19 0
     * 5 5 14 19 0 27 27 27"*/
    public String codeerBoodschap(String boodschap) {
        boodschap = boodschap.trim().toUpperCase();
        String gecodeerdeBoodschap = "";
        for (int i = 0; i < boodschap.length(); i++) {
            char kar = boodschap.charAt(i);
            int code = secretMap.get(kar);
            gecodeerdeBoodschap += " " + code;
        }
        return gecodeerdeBoodschap;
    }

    /**
     * Method decodeerBoodschap
     *
     * @param boodschap in cijfercode
     * @return String boodschap
     *
     * Voorbeeld: boodschap in cijfercode "5 18 0 23 1 19 0 5 5 14 19 0 27 27
     * 27" wordt "ER WAS EENS ..."
     */
    public String decodeerBoodschap(String boodschap) {
        String gedecodeerdeBoodschap = "";
        String[] codeArray = boodschap.split(" ");
        for (String code : codeArray) {

            /*for (char teken : secretMap.keySet()) {
                int c = secretMap.get(teken);
                if ((c+"").equals(code)) {
                    gedecodeerdeBoodschap += teken;

                }
            }*/
            //nadeel van bovenstaande loop : ook al heb je gevonden wat je zoekt
            //de volledige keyset wordt doorlopen
            //oplossing : gebruik NOOIT break om de lus vroegtijdig af te breken,
            //dat leidt tot spaghetticode
            //onderstaande gebruiken is een gestructureerde oplossing
            Iterator iterator = this.secretMap.entrySet().iterator();
            boolean gevonden = false;
            while (iterator.hasNext() && !gevonden) {
                Map.Entry me = (Map.Entry) iterator.next();
                if ((me.getValue()+"").equals(code)) {
                    gedecodeerdeBoodschap += me.getKey();
                    gevonden = true;

                }
            }
        }
        return gedecodeerdeBoodschap;

    }

}
