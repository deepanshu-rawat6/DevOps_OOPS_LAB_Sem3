import java.util.HashSet;
class Random {
    String name;
    int value;

    Random(String name,int value){
        this.name = name;
        this.value = value;
    }

    public void display(){
        System.out.println("The randomised objects with their corresponding values : " + this.name + " and " + this.value);
    }
}
class Price{
        private String item;private int price;
        public Price(String itm, int pr){this.item = itm;this.price = pr;
}
    public int hashCode(){
            System.out.println("In hashcode");
            int hashcode = 0;
            hashcode = price*20;
            hashcode += item.hashCode();
            return hashcode;
        }

    public boolean equals(Object obj){
            System.out.println("In equals");
if (obj instanceof Price) {
    Price pp = (Price) obj;
return (pp.item.equals(this.item) && pp.price == this.price);
} else {
    return false;
}
        }
    public String getItem() {
            return item;
        }
    public void setItem(String item) {
            this.item = item;
        }
    public int getPrice() {
            return price;}
        public void setPrice(int price) {
            this.price = price;
        }
        public String toString(){
            return "item: "+item+"  price: "+price;
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
//        copying another HashSet object to HashSet object
        set.addAll(set2);
//        printing the set
        System.out.println(set);
//        deleting all entries from the HashSet object at once
        set2.clear();
        System.out.println("set2 after clearing all entries:" + set2);

//        creating a HashSet for Random objects
        HashSet<Random> randomHashSet = new HashSet<>();
        randomHashSet.add(new Random("Ob1",1));
        randomHashSet.add(new Random("Ob2",2));
        randomHashSet.add(new Random("Ob3",3));
        randomHashSet.add(new Random("Ob4",4));
//        display the randomHashSet
        System.out.println(randomHashSet);
        System.out.println("\nThe HashSet with user-defined objects:");
        for (Random itr : randomHashSet) {
            System.out.println(itr);
        }
//        now checking whether objects lie in the randomHashSet or not
        System.out.println("Checking for values in the randomHashSet:");
        Random ob1 = new Random("Ob1",1);
        Random ob2 = new Random("ObX",10);
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(randomHashSet.contains(ob1));
        System.out.println(randomHashSet.contains(ob2));

//        System.out.println();
//        HashSet<Price> lhs = new HashSet<Price>();
//        lhs.add(new Price("Banana", 20));
//        lhs.add(new Price("Apple", 40));
//        lhs.add(new Price("Orange", 30));
//        for(Price pr:lhs){
//            System.out.println(pr);
//        }
//        System.out.println();
//        Price key = new Price("Banana", 20);
//        System.out.println("Does set contains key? "+lhs.contains(key));
    }
    public static void main(String[] args) {
        Collections_three obx = new Collections_three();
        obx.compute();
    }
}
