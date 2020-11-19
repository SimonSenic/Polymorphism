package sk.kosickaacademic.simon.polymorphism;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Names {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set = readNamesFromFile(set);
        printNames(set);
    }

    public static Set<String> readNamesFromFile(Set<String> set){
        BufferedReader read;
        try{
            FileReader fr = new FileReader("resources/names.txt");
            read = new BufferedReader(fr);
            String name = read.readLine();
            while(name!=null){
                set.add(name);
                name = read.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return set;
    }

    public static void printNames(Set<String> set){
        System.out.println("File contains " +set.size() +" names.");
        for(String temp : set){
            System.out.print(temp +" ");
        }
        System.out.println();
    }
}
