
import java.util.*;


public class Demo {
    public static void main(String args[]) {

        Map<String, Integer> marks=new HashMap<>();
        
        marks.put("bhaawan", 97);
        marks.put("sachin", 98);
        marks.put("rahul", 99);
        marks.put("sachin", 100); // it will update the value of key "sachin"

        for(String key: marks.keySet()){
            System.out.println(key+" -> "+marks.get(key));
        }
        
        System.out.println(marks.get("abcd"));

        System.out.println(marks.keySet());

        marks.remove("sachin");

        System.out.println(marks);



    }
}