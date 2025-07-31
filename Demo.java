import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Demo{
    public static void main(String[] args) throws IOException{
        // 1st way of taking a input in java OLD WAY
        
            System.out.print("hello world enter a number = ");

            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader bf=new BufferedReader(in);

            int num=-999;
            num=Integer.parseInt(bf.readLine());
            
            System.out.println("entered number = "+num);

            bf.close();

        // 2nd way of taking input NEWER WAY

            System.out.print("enter a number = ");

            Scanner sc=new Scanner(System.in);
            int num1=sc.nextInt();

            System.out.println("new entered number = "+num1);

    }
}