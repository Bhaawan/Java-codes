public class Demo{
    public static void main(String args[]){

        int a=10;
        int res=-1;
        int b=(int)(Math.random()*10);

        try {
            res=a/b;
        } catch (Exception e) {
            System.out.println("division NOT successful as deno is 0");
        }

        System.out.println("division successful res = "+res);
    }
}