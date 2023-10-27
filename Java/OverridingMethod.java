
class A1 {
    public void show(){
        System.out.println("in A");
    }
}

class B extends A1{
    public void show(){
        System.out.println("in B");
    }
}

class C extends A1{
    public void show(){
        System.out.println("in C");
    }
}

public class OverridingMethod {
    public static void main(String[] args) {
//compile time and runtime
        A1 obj = new B(); //Runtime polymorphism
        obj.show();//which show methd to call will be decided at runtime only

        //we are calling it dym meth disp because it changes on changing the object
         obj =new C(); //dynamic method dispatch [ Inorder to achieve this we need Runtime polymorphism
        obj.show();
    }
}
