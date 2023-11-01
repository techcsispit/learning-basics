import java.util.Scanner;

public class printdata {
    void display(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.println(j+"\t");
            }
        }
    }
    void display(int m){
        while(m!=0){
            int dig=m%10;
            System.out.println(Math.sqrt(dig+0.0));
            m/=10;
        }
    }

    //Methods that have same name and same type and different no.of parameters are called overloaded methods

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printdata ob=new printdata();
        System.out.println("Please enter your choice: \n1.Print pattern \n 2.Print sqrt of each digit of given number");
        int ch=sc.nextInt();
        switch (ch) {
            case 1: ob.display();
                    break;
        
            case 2: ob.display();
        }
    }    
}
