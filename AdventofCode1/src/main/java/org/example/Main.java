package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


ArrayList<Integer> counts = new ArrayList<Integer>();
ArrayList<String> inputArr = new ArrayList<String>();
try{
    File input = new File("H:\\Java\\Advent of code\\AdventofCode1\\input.txt");
    Scanner fileScanner = new Scanner(input);
    StringBuilder inString = new StringBuilder();

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

    int highElf = 0;
    int highCount = 0;
    for(int i = 0; i< counts.size();i++){
        if(counts.get(i) > highCount){
            highCount = counts.get(i);
            highElf = i;
        }
    }
    System.out.println("The hgihest count was: " + highCount + " and the elf that had this count was " + highElf + 1);
    } catch(FileNotFoundException e){
    System.out.println("an error occurred");
    e.printStackTrace();
    }
}
}