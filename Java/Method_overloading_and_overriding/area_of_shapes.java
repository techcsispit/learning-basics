import java.util.*;

public class area_of_shapes {
    double area(int side){
        return side*side;
    }
    double area(int length,int breadth){
        return length*breadth;
    }
    double area(int s1,int s2,int s3){
        int semi_p=(s1+s2+s3)/2;
        double area=Math.sqrt(semi_p*(semi_p-s1)*(semi_p-s2)*(semi_p-s3));
        return area;
    }

    //Methods that have same name but different number of parameters are called overloaded methods.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        area_of_shapes ob=new area_of_shapes();
        System.out.println("Find: \n 1.Area of square \n 2.Area of rectangle \n 3.Area of triangle");
        int ch=sc.nextInt();
        switch(ch){
            case 1: System.out.println("Please enter side: ");
            int s=sc.nextInt();
            System.out.println("Area is :" +ob.area(s));
            break;
            
            case 2: System.out.println("Please enter length and breadth: ");
            int l=sc.nextInt(),b=sc.nextInt();
            System.out.println("Area is :"+ob.area(l,b));
            break;

            case 3: System.out.println("Please enter the three sides of traingle: ");
            int s1=sc.nextInt(),s2=sc.nextInt(),s3=sc.nextInt();
            System.out.println("Area is :" + ob.area(s1,s2,s3));
        }
    }
}
