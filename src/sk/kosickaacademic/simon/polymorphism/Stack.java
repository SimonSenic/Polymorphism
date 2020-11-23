package sk.kosickaacademic.simon.polymorphism;

import java.util.ArrayList;

public class Stack<T> {
    private int capacity;
    private ArrayList<T> array;

    public Stack (int capacity){
        this.capacity = capacity;
        array = new ArrayList();
    }

    public void push(T value){
        if(isFull())
            System.out.println("Stack is full.");
        else
            array.add(value);
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
        for(T i : array)
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
        Stack<Integer> st = new Stack(5);
        st.push(1);
        st.push(10);
        st.push(-3);
        st.print();
        st.pop();
        st.top();
        st.push(12);
        st.push(20);
        st.push(100);
        st.push(0);
        st.print();
        st.clear();
        st.pop();
    }
}
