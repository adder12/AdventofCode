package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
     File file = new File("H:\\Java\\Advent of code 2015\\AdventofCode3\\input.txt");
        Scanner scan = new Scanner(file);
        int count = 0;
       ArrayList<Character> results = new ArrayList<>();
       int countTotal = 0;
            while(scan.hasNextLine()){
                count++;
boolean found = false;
        String inString  = scan.nextLine();
        String temp = inString.substring(0,(inString.length()/2));
       String[] arrOne = temp.split("");
       temp = inString.substring((inString.length()/2));
       String[] arrTwo = temp.split("");
       for(int i=0;i< arrOne.length;i++){
            for(int j=0;j< arrTwo.length;j++){
                    if(arrOne[i].equals(arrTwo[j]) && found == false){
                        results.add(arrOne[i].charAt(0));
                        found = true;
                    }
            }
        }
              if(Character.isUpperCase(results.get(count-1))){
                 countTotal += (Character.toLowerCase(results.get(count-1))-70);
              } else{
                  countTotal += (Character.toLowerCase(results.get(count-1))-96);
              }
           //     System.out.println("Repeated item for line: "+ count + " is: " + results.get(count-1));
            }
        System.out.println("total count of priority is: " +  countTotal);




            Part2 part2 = new Part2("H:\\Java\\Advent of code 2015\\AdventofCode3\\input.txt");

            part2.findGroupItems();

    }
}