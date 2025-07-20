

enum Status{
    Running, 
    Failed, 
    Pending, 
    Success;
}

public class Demo{
    public static void main(String args[]){
       Status s=Status.Running;
       System.out.println(s);   

       Status s1=Status.Pending;
       System.out.println(s1.ordinal());

       Status arr[]=Status.values();
       for(Status st:arr){
            System.out.println(st+" "+st.ordinal());
       } 
    }
}