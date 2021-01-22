package sk.kosickaacademic.simon.polymorphism;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Names {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set = readNamesFromFile(set);
        printNames(set);
        printNamesByAlphabeticalOrder(set);
        printLongestName(set);
        printMostUsedName();
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
            fr.close();
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

    public static void printNamesByAlphabeticalOrder(Set<String> set){
        System.out.print("Names by alphabetical order: ");
        Set<String> result = new TreeSet<>();
        for(String temp : set){
            result.add(temp);
        }
        for(String temp : result){
            System.out.print(temp +" ");
        }
        System.out.println();
    }

    public static void printLongestName(Set<String> set){
        String longestName="";
        for(String temp : set){
            if(temp.length()>longestName.length()) longestName=temp;
        }
        System.out.println("Longest name is: " +longestName);
    }

    public static void printMostUsedName(){
        ArrayList<String> arr = new ArrayList<>();
        int index=0;
        BufferedReader read;
        try{
            FileReader fr = new FileReader("resources/names.txt");
            read = new BufferedReader(fr);
            String name = read.readLine();
            while(name!=null){
                arr.add(name);
                name = read.readLine();
            }
            for(int i=0; i<arr.size(); i++){
                int count=0, temp=0;
                for(int j=i+1; j<arr.size(); j++) if(arr.get(i).equals(arr.get(j))) count++;
                if(count>temp){ temp=count; index=i; }
            }
            System.out.println("Most used name is: " +arr.get(index));
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
