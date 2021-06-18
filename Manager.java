import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Manager {
    public static void main(String[] args) {
        Map<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Mobile", 5000);
        priceMap.put("Cell", 20000);
        priceMap.put("Bike", 60000);
        priceMap.put("Cycle", 600);
        priceMap.put("Sofa", 7000);


        System.out.println("price map: " + priceMap);

        Set<String> keys = priceMap.keySet();


        System.out.println("keys of Map : " + keys);


    }
}