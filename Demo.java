public class Demo{
    public static void main(String args[]){

        int a=10, res=-1, b=5;

        int arr[]=new int[10];
        int index=2;

        String str=null;

        try {
            res=a/b;
            System.out.println(arr[index]);
            System.out.println("length of string = "+str.length());
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Requested index "+index+" is out of bounds for array of size "+arr.length);
        }
        catch(Exception e){
            System.out.println("SOME WEIRD ANOMLY "+e);
        }

        System.out.println("division successful res = "+res);
    }
}