// Parent class A1
class A1 {
    // Method in class A1
    public void show(){
        System.out.println("in A");
    }
}

// Child class B
class B extends A1 {
    // Overriding method in class B
    public void show(){
        System.out.println("in B");
    }
}

// Child class C
class C extends A1 {
    // Overriding method in class C
    public void show(){
        System.out.println("in C");
    }
}


public class OverridingMethod {
    public static void main(String[] args) {
        // Runtime polymorphism - Creating object of class B using reference of class A1
        A1 obj = new B();
        // Method invocation - Resolved at runtime
        obj.show(); // which show method to call will be decided at runtime only

        // Dynamic method dispatch - Changing the reference to class C
        obj = new C();
        // Method invocation - Changes with the object to which the reference is pointing
        obj.show(); // dynamic method dispatch [ In order to achieve this we need Runtime polymorphism
    }
}
