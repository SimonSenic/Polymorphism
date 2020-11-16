package sk.kosickaacademic.simon.polymorphism;

public class Main {
    public static void main(String[] args) {
        B p1 = new B(); //Constructor A, B
        p1.print(); //print() from class B
        p1.programmingLanguage(); //programmingLanguage() from class B
        System.out.println();

        A p2 = new C(); //Constructor A, B, C
        p2.print(); //print() from class C
        p2.animal(); //animal() from class B
        ((C)p2).programmingLanguage(); //programmingLanguage() from class B (type cast required)
        System.out.println();

        A p3 = new A(); //Constructor A
        p3.wildAnimal(); //wildAnimal() from I1->I0
        System.out.println();

        I1 p4 = new B(); //Constructor A, B
        p4.wildAnimal(); //wildAnimal() from I1->I0
        ((A)p4).print(); //print() from class B (type cast required, B() cant be object of interface)
        System.out.println();

        B p5 = new C(); //Constructor A, B, C
        p5.wildAnimal(); //wildAnimal() from I1->I0
    }
}
