
class BhaawanException extends Exception{

    public BhaawanException(String str){
        super(str);
    }
}

public class Demo{
    public static void main(String args[]){

        int a=10, res=-1, b=20;

        try {
            res=a/b;
            if(res==0){
                throw new BhaawanException( "I dont want result to be 0 :) setting res=a");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        catch (BhaawanException bh) {
            res=a;
            System.out.println("Bhaawan Exception recieved "+bh);
        }
        catch(Exception e){
            System.out.println("SOME WEIRD ANOMLY "+e);
        }

        System.out.println("division successful res = "+res);
    }
}