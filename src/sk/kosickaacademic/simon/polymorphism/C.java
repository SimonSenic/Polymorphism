package sk.kosickaacademic.simon.polymorphism;

public class C extends B{
    public C(){
        System.out.println("Constructor C");
    }

    @Override
    public void print() {
        System.out.println("Class C");
    }
}
