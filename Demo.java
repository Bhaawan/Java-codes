
import java.util.*;


public class Demo {
    public static void main(String args[]) {

        // HASHSET- unsorted unique
        Set<Integer> set = new HashSet<Integer>();

        set.add(5);
        set.add(10);
        set.add(25);
        set.add(10);
        set.add(3);
        set.add(25);

        for (int i : set) {
            System.out.println(i);
        }

        // TREESET- sorted unique
        System.out.println("\n");
        Set<Integer> set1 = new TreeSet<Integer>();

        set1.add(5);
        set1.add(10);
        set1.add(25);
        set1.add(10);
        set1.add(3);
        set1.add(25);

        for (int i : set1) {
            System.out.println(i);
        }

        // ITERABLE
        System.out.println("\n");
        Iterator<Integer> values=set1.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

    }
}