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
        for(int i=array.size()-1; i>=0; i--)
            System.out.println(array.get(i));
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
        Queue<String> q = new Queue(5);
        q.push("Jozef");
        q.push("Pavol");
        q.push("Borat");
        q.push("Miken");
        q.push("Astatoro");
        q.pop();
        q.pop();
        q.top();
        q.print();
    }
}
