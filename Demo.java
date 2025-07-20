interface A{
    void show();
    void config();
}

interface X{
    void hello();
    void abcd();
}

class B implements A,X{
    public void show(){
        System.out.println("in show()");
    }

    public void config(){
        System.out.println("in config()");
    }

    public void hello(){
        System.out.println("in hello()");
    }

    public void abcd(){
        System.out.println("in abcd()");
    }
}


public class Demo{
    public static void main(String args[]){
        A obj=new B();
        obj.show();
        obj.config();
        
        X obj1=new B();
        obj1.hello();

        obj1.abcd();
    }
}