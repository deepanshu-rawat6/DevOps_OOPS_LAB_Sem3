import java.util.HashSet;

class Custom_Class {
    Custom_Class() {
    }
}

public class Collections_three {
    public void compute() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        System.out.println("Copying another HashSet object to HashSet object");
//        copying another HashSet object to HashSet object
        set.addAll(set2);
//        printing the set
        System.out.println(set);

        System.out.println("\nDeleting all entries from the HashSet object at once");
//        deleting all entries from the HashSet object at once
        set2.clear();
        System.out.println("set2 after clearing all entries:" + set2);


        System.out.println("\nSearch for user defined objects in hashset");
//        creating a HashSet for Random objects
        HashSet<Custom_Class> hashSet = new HashSet<>();
        Custom_Class ob1 = new Custom_Class();
        Custom_Class ob2 = new Custom_Class();
        Custom_Class ob3 = new Custom_Class();
        hashSet.add(ob1);
        hashSet.add(ob2);

//        search for user defined objects in hashset
        if (hashSet.contains(ob1)){
            System.out.println("Ob1 is present in the hashSet");
        } else {
            System.out.println("Ob1 is not present in the hashSet");
        }

        if (hashSet.contains(ob3)) {
            System.out.println("Ob3 is present in the hashSet");
        } else {
            System.out.println("Ob3 is not present in the hashSet");
        }
    }
    public static void main(String[] args) {
        Collections_three obx = new Collections_three();
        obx.compute();
    }
}
