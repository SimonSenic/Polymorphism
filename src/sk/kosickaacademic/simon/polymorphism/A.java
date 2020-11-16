package sk.kosickaacademic.simon.polymorphism;

public class A implements I1{
    public A(){
        System.out.println("Constructor A");
    }

    @Override
    public void animal() {
        System.out.println("Dog");
    }

    public void print(){
        System.out.println("Class A");
    }
}
