
interface A{
    int sum(int a, int b);
}

/* class B implements A{   // standard way to define a interface functions
    public void show(){
        System.out.println("in B Show()");
    }
} */

public class Demo{
    public static void main(String args[]){

        A obj2= (a,b) -> {
            System.out.println("in A sum()");
            return (a+b);
        };

        A obj3=(a,b)->a+b;

        int res=obj2.sum(5,10);
        int res1=obj3.sum(51, 49);
        System.out.println("res = "+res+" res1 = "+res1);
    }
}