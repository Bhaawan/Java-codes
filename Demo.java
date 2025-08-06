
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Demo{
    public static void main(String args[]){
        // taking input from a file
        File file=new File("./input.txt");
        try {
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found "+e);
        }

        // taking input from a string
        String str="123 78 5896 147";
        try {
            Scanner sc=new Scanner(str);
            while(sc.hasNextLine()){
                int num=sc.nextInt();
                System.out.println(num);
            }
            
        } catch (Exception e) {
            System.out.println("A weird exception "+e);
        }
    }
}