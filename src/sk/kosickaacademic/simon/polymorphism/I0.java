package sk.kosickaacademic.simon.polymorphism;

public interface I0 {
    public void animal();
    default public void wildAnimal(){
        System.out.println("Leopard");
    }
}
