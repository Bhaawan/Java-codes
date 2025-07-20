

enum Status{
    Running, 
    Failed, 
    Pending, 
    Success;
}

public class Demo{
    public static void main(String args[]){
       Status s=Status.Running;
       
       /* if(s==Status.Pending){
        System.out.println("Currently pending task");
       }
       else if(s==Status.Running){
        System.out.println("Now running task");
       }
       else if(s==Status.Success){
        System.out.println("Task success !!!");
       }
       else{
        System.out.println("Task Failed");
       } */

       switch (s) {
           case Pending:
                System.out.println("Currently pending task");
                break;
            case Running:
                System.out.println("Now running task");
                break;
            case Success:
                System.out.println("Task success !!!");
                break;
            case Failed:
                System.out.println("Task Failed");
                break;
           default:
                System.out.println("WRONG STATUS");
       }
    }
}