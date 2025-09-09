
import java.util.*;

class Students implements Comparable<Students>{
    String name;
    int age;

    Students(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return "Student [age = "+age+", name = "+name+"]";
    }

    public int compareTo(Students that){
        if(this.age>that.age){
            return 1;
        }
        
        return -1;
    }
}

public class Demo {
    public static void main(String args[]) {

        Comparator<String> comp=(String s1, String s2)->{
                return (s1.length() - s2.length())*-1;
            };

        List<String> list = new ArrayList<>();
        list.add("bhaawan");
        list.add("kumar");
        list.add("sin");
        list.add("gautam");
        
        System.out.println(list);

        Collections.sort(list, comp);

        System.out.println(list);
    
        List<Students> students = new ArrayList<>();
        students.add(new Students("bhaawan", 20));
        students.add(new Students("kumar", 22));
        students.add(new Students("sin", 21));
        students.add(new Students("gautam", 19));
        
        for(Students s:students){
            System.out.println(s);
        }
        System.out.println();
        
        Collections.sort(students);
        
        for(Students s:students){
            System.out.println(s);
        }
    
    
    }

}