import java.util.*;

public class Demo {
    public static void main(String args[]) {

        List<Integer> nums=Arrays.asList(4,7,5,8,9,6,2);

        // 1st way of doing this

        int sum=0;
        for(int i:nums){
            if(i%2==0){
                i*=2;
                sum+=i;
            }
        }

        System.out.println("value of sum = "+sum);

    }

}