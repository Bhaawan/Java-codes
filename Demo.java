public class Demo{
    public static void main(String args[]){

        int a=10, res=-1, b=100;

        try {
            res=a/b;
            if(res==0){
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e) {
            if(b==0){
                System.out.println("Cannot divide by 0");
            }
            else if(res==0){
                res=a;
                System.out.println("res can't be zero");
            }
        }
        catch(Exception e){
            System.out.println("SOME WEIRD ANOMLY "+e);
        }

        System.out.println("division successful res = "+res);
    }
}