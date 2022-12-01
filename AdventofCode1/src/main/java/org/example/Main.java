package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

ArrayList<Integer> counts = new ArrayList<Integer>();
ArrayList<String> inputArr = new ArrayList<String>();
try{
    File input = new File("H:\\Java\\Advent of code\\AdventofCode1\\input.txt");
    Scanner fileScanner = new Scanner(input);

    while(fileScanner.hasNextLine()) {
        inputArr.add(fileScanner.nextLine());
    }
    int count = 0;
    for(int i = 0; i< inputArr.size();i++){
        if(inputArr.get(i) != ""){
            count+= Integer.parseInt(inputArr.get(i));
        }else{
            counts.add(count);
            System.out.println(count);
            count = 0;
        }
    }
    int highCount = 0;
int small;
    for(int i = 0; i < counts.size()-1;i++){
        small = i;
        for(int j = 0; j< counts.size();j++){
            if(counts.get(j)< counts.get(small)){
                small = j;

                int temp = counts.get(i);
                counts.set(i,counts.get(small));
                counts.set(small, temp);
            }
        }
    }
    highCount = counts.get(0);
    System.out.println("The highest count was: " + highCount);
    highCount = counts.get(0) + counts.get(1) + counts.get(2);
    System.out.println("The highest three counts were: " + highCount);

    } catch(FileNotFoundException e){
    System.out.println("an error occurred");
    e.printStackTrace();
    }
}
}