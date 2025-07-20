
enum Laptop{
    Macbook(2000), 
    XPS(2500), 
    ThinkPad(1500),
    IdeaPad();

    private int price;

    private Laptop(){
        price=250;
    }

    private Laptop(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }
}

public class Demo{
    public static void main(String args[]){
       
        Laptop lap=Laptop.Macbook;
       
        System.out.println(lap.getClass().getSuperclass());
        System.out.println(lap+" "+lap.getPrice());

        for(Laptop lp:Laptop.values()){
            System.out.println(lp+" "+lp.getPrice());
        }
    }
}