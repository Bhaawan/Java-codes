
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo{
    public static void main(String args[]) throws IOException{
        //InputStreamReader in=new InputStreamReader(System.in);
        
        // 1st way of using try with finally for resources the long way
        
            BufferedReader bf=null;

            int num=0;
            System.out.println("enter a number = ");

            try{
                bf=new BufferedReader(new InputStreamReader(System.in));
                num=Integer.parseInt(bf.readLine());
                System.out.println("number entered = "+num);
            }
            finally{
                bf.close();    // mostly used to close resources...
            }
        
        // 2nd way of using a shorter way

            int num1=0;
            System.out.println("enter a new number = ");

            try(BufferedReader bf1=new BufferedReader(new InputStreamReader(System.in))){
                num1=Integer.parseInt(bf1.readLine());
                System.out.println("new number entered = "+num1);
            }
    }
}