import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println(hashMap);

        hashMap.put("aap", 1);
        hashMap.put("beer", 2);
        hashMap.put("chihuahua", 2);
        hashMap.put("dromedaris", 4);
        hashMap.put("dromedaris", 5);
        System.out.println(hashMap);

        final Set<String> keys = hashMap.keySet();
        System.out.println(keys);

        final Collection<Integer> values = hashMap.values();
        System.out.println(values);

        final Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        System.out.println(entries);
        for (Map.Entry entry: entries) {
            System.out.println(entry.getKey() + " ----- " + entry.getValue());
        }
    }
}
