


public class Demo{
    public static void main(String args[]){
        try {
            a();
            b();
        } catch (ArithmeticException e) {
            System.out.println("deno cant be zero "+e);
        }
    }

    public static void a() throws ArithmeticException{
        int i=(int)(Math.random()*10);
        int x=10/i;

        System.out.println("value of x = "+x);
    }

    public static void b() throws ArithmeticException{
        int i=0;
        int y=10/i;

        System.out.println("value of y = "+y);
    }
}