import java.util.*;

public class Iterators1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<Integer>();
        System.out.print("Please enter the size of the array:");
        int s=sc.nextInt();
        System.out.println();
        for(int i=0;i<s;i++) {
            System.out.print("Please enter a number=");
            arr.add(sc.nextInt());
            System.out.println();
        }
        Iterator<Integer> it= arr.iterator(); //Creating an iterator object to iterate through arr
        int sum=0;
        while (it.hasNext()){
            sum+=it.next();
        }
        System.out.println("Sum="+sum);
    }
}
