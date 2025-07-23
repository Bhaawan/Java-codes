
interface A{
    void show();
}

/* class B implements A{   // standard way to define a interface functions
    public void show(){
        System.out.println("in B Show()");
    }
} */

public class Demo{
    public static void main(String args[]){
       A obj=new A(){   // another way using anonymus inner class
            public void show(){
                System.out.println("in A Show()");
            }
       };

       // using lambda expression
       A obj1= ()->{System.out.println("in obj1 A show()");}; 

       A obj2= ()->System.out.println("in obj2 A show()");


       obj.show();
       obj1.show();
       obj2.show();
    }
}