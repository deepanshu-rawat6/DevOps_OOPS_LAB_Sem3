import java.util.*;

public class Collections_two {
    public void compute() {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Cpp");
        map.put(3,"Python");
        map.put(4,"Rust");
        map.put(5,"JavaScript");
        map.put(6,"HTML CSS");
//        printing the entries of the HashMap
        System.out.println(map);
//        finding whether this Key is present in the HashMap
        System.out.println("\nFinding whether 2 exists in the map: " + map.containsKey(2));
        System.out.println("\nFinding whether 7 exists in the map: " + map.containsKey(7));
//        finding whether this Value is present in the HashMap
        System.out.println("\nFinding whether Rust exists in the map: " + map.containsValue("Rust"));
        System.out.println("\nFinding whether Dart exists in the map: " + map.containsValue("Dart"));

//        printing the keys of the map
        System.out.println("\nThe keys of the map : ");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.print(key + " ");
        }
        System.out.println();

//        printing the values of the map
        System.out.println("\nThe values of the map :");
        Collection<String> values = map.values();
        for(String value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

//        printing the key-value pairs of the map
        System.out.println("\nThe key-value pairs as Entry Objects :");
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> ent : entries) {
            System.out.println(ent.getKey() + " ==> " + ent.getValue());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Collections_two obx = new Collections_two();
        obx.compute();
    }
}
