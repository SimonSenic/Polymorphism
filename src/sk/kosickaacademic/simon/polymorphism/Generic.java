package sk.kosickaacademic.simon.polymorphism;

import java.util.Random;

public class Generic {
    public <T> void random(T a, T b){
        int index = new Random().nextInt((int)a);
        String temp="";
        for(int i=((String)b).length()-1; i>=0; i--){
            temp+=((String)b).charAt(i);
        }
        System.out.println(index +" " +temp);

    }

    public static void main(String[] args) {
        Generic g = new Generic();
        int a=20; String b="asfAsf";
        g.random(a, b);
    }
}
