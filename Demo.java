

interface Computer{
    void show();
}

class Laptop implements Computer{
    public void show(){
        System.out.println("using laptop");
    }
}

class Desktop implements Computer{
    public void show(){
        System.out.println("using desktop");
    }
}

class Programmer{
    void code(Computer lp){
        lp.show();
    }
}

public class Demo{
    public static void main(String args[]){
        
        Computer lp=new Laptop();
        Computer desk=new Desktop();

        Programmer p=new Programmer();

        p.code(desk);

    }
}