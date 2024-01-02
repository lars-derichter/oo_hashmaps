import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashmap {
    public static void main(String[] args) {
        //maak een lege hashmap met key String en value Integer
        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println(hashMap); // lege hashmap

        //zet een aantal key-value pairs in de hashmap
        hashMap.put("aap", 1);
        hashMap.put("beer", 2);
        hashMap.put("chihuahua", 2);
        hashMap.put("dromedaris", 4);

        //er wordt geen nieuwe dromedaris toegevoegd: de waarde 4 wordt overschreven.
        //elke key kan altijd maar 1 keer voorkomen
        hashMap.put("dromedaris", 5);
        System.out.println(hashMap);

        //de verzameling van de keys is een SET
        // -- dat wil zeggen dat elk element maar 1 keer kan voorkomem
        // Een Set is altijd een verzameling van unieke elementen
        final Set<String> keys = hashMap.keySet();
        System.out.println(keys);

        //de verzameling van values is een gewone Collection
        final Collection<Integer> values = hashMap.values();
        System.out.println(values);

        //we kunnen met een for-loop over de elementen van de key-set loopen
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }

        //je kan ook de verzameling van alle key-value pairs opvragen
        //we kunnen met een for-loop over deze verzameling loopen
        final Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        System.out.println(entries);
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + " ----- " + entry.getValue());
        }
    }
}
