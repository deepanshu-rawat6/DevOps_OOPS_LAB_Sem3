package Collections;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        String str = null;
//      creating instances of array
        int[] arr = new int[]{1,2,3,4};
//        creating a Vector object v
        Vector<Integer> v = new Vector<>();
//        creating a Hashtable object h
        Hashtable<Integer,String> h = new Hashtable<>();

//        adding value into the vector
        v.addElement(1);
        v.addElement(2);

//        adding key value pair into the hashtable
        h.put(1,"one");
        h.put(2,"two");

//        accessing the value of array,vector,hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

//        creating a Stack object stack
        Stack<Integer> stack = new Stack<>();
//        pushing elements into the stack
        stack.push(1);
        stack.push(2);
//        printing the last entered value of the stack
        System.out.println(stack.peek());
        stack.pop();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5 ; i++) {
            list.add(i);
        }

        System.out.println(list);

        list.remove(3);

        System.out.println(list);

        for (int i = 0; i < 4; i++) {
            System.out.print("\n" + list.get(i) + " ");
        }

        System.out.println();
        for(int i:list) {
            System.out.print(i + " ");
        }


    }
}
