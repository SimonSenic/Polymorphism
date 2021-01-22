package sk.kosickaacademic.simon.polymorphism;

public class B extends A implements I2{
    public B(){
        System.out.println("Constructor B");
    }

    @Override
    public void animal() {
        System.out.println("Rat");
    }

    @Override
    public void print() {
        System.out.println("Class B");
    }

    public void programmingLanguage(){
        System.out.println("Class B loves Java");
    }

    @Override
    public void drink() {
        System.out.println("Absinth");
    }
}
