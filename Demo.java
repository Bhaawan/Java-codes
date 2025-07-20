
interface  A{
    void show();

    void config();
}

/* class B implements A{
    public void show(){
        System.out.println("in B show()");
    }

    public void config(){
        System.out.println("in B config()");
    }
} */

public class Demo{
    public static void main(String args[]){
        
        A obj=new A(){
            public void show(){
                System.out.println("in A show()");
            }

            public void config(){
                System.out.println("in B config()");
            }
        };  


        obj.show();
        obj.config();

    }
}