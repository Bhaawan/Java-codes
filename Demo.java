
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Demo{
    public static void main(String args[]){
        
        List<Integer> list=new ArrayList<Integer>();

        list.add(5);
        list.add(10);
        list.add(25);
        list.add(14);
        list.add(3);

        for(int i:list){
            System.out.println(i);
        }

        System.out.println("\n"+list.get(2)); // use List to get methods like get() to fetch ny index value

        System.out.println("\nIndex of "+list.get(3)+" is "+list.indexOf(14));

        /*System.out.println("\n");

        Collection list1=new ArrayList();

        list1.add(5);
        list1.add(10);
        list1.add(25);
        list1.add("bhaawan");   // will not give compile time error but will give exception at run-time

        for(Object i:list1){
            int num=(Integer)i;
            System.out.println(num*2);
        }*/
    }
}