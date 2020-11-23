package sk.kosickaacademic.simon.polymorphism;

import java.util.ArrayList;

public class Queue<T> {
    private int capacity;
    private ArrayList<T> array;

    public Queue (int capacity){
        this.capacity = capacity;
        array = new ArrayList();
    }

    public void push(T value){
        if(isFull())
            System.out.println("Stack is full.");
        else
            array.add(0, value);
    }

    public void pop(){
        if(isEmpty())
            System.out.println("Stack is empty.");
        else{
            System.out.println(array.get(array.size()-1));
            array.remove(array.size()-1);
        }
    }

    public void top(){
        if(isEmpty())
            System.out.println("Stack is empty.");
        else
            System.out.println(array.get(array.size()-1));
    }

    public void print(){
        for(T i:array)
            System.out.println(i);
    }

    public void clear(){
        array.clear();
    }

    public boolean isEmpty(){
        return array.isEmpty();
    }

    public boolean isFull(){
        return capacity==array.size();
    }

    public static void main(String[] args) {
        Stack<String> st = new Stack(5);
        st.push("Jozef");
        st.push("Pavol");
        st.push("Borat");
        st.push("Miken");
        st.push("Astatoro");
        st.pop();
        st.pop();
        st.top();
        st.print();
    }
}
