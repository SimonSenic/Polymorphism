package sk.kosickaacademic.simon.polymorphism;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        System.out.println("Enter count of numbers: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        try{
            ArrayList<Integer> arr = new ArrayList(count);
            for(int i=0; i<count; i++){
                Random random = new Random();
                int num = random.nextInt(100)+1;
                arr.add(num);
                System.out.print(arr.get(i) +" ");
            }
            System.out.println();
            System.out.println("Enter number check: ");
            Scanner scX = new Scanner(System.in);
            int numX = scX.nextInt();
            if(arr.contains(numX)) System.out.println("Number " +numX +" is in array. ");
            else System.out.println("Number " +numX +" is not in array. ");
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
