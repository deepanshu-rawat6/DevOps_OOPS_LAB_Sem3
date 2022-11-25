import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collections_one {
    public void compute() {
        ArrayList<Integer> list = new ArrayList<>();
//        adding elements into the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        Printing the list
        System.out.println("The list elements are:");
        System.out.println(list);
//        Creating iterator instance of the list
        Iterator<Integer> iter = list.iterator();
//        now displaying the list elements by using iterator
        System.out.println("The list elements by using the iterator() instance:");
        while (iter.hasNext()) {
            System.out.print(iter.next() +" ");
        }

        ArrayList<?> duplicate = new ArrayList<>();
        duplicate = (ArrayList<?>)list.clone();

        System.out.println("\nThe duplicate instance of the already created list:");
        //        printing the cloned list
        System.out.println(duplicate);

//        reversing the cloned ArrayList
        Collections.reverse(duplicate);
        System.out.println("The reversed ArrayList:");
//        printing the reversed ArrayList
        System.out.println(duplicate);
    }
    public static void main(String[] args) {
        Collections_one obx = new Collections_one();
        obx.compute();
    }
}
