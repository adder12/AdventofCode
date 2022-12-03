package org.example;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Part2 {

    File file;

    Scanner scan;

    public Part2(String file) throws FileNotFoundException {
        this.file = new File(file);
        this.scan = new Scanner(this.file);
    }


     void findGroupItems(){
       int priorityCount = 0;
    boolean found = false;
         while(scan.hasNextLine()){
             found = false;
       String[] arrOne = this.scan.nextLine().split("");

         String[] arrTwo = this.scan.nextLine().split("");

         String[] arrThree = this.scan.nextLine().split("");


         for(int i  = 0;i< arrOne.length;i++){
             for(int j = 0;j< arrTwo.length;j++){
                 for(int k = 0; k< arrThree.length;k++){
                     if(arrOne[i].equals(arrTwo[j]) && arrTwo[j].equals(arrThree[k]) && found == false){
found = true;
                         if(Character.isUpperCase(arrOne[i].charAt(0))){
                             priorityCount += (Character.toLowerCase((arrOne[i].charAt(0)))-70);
                         } else{
                             priorityCount += (Character.toLowerCase((arrOne[i].charAt(0)))-96);

                         }


                     }
                 }
             }
         }


    }

         System.out.println("Total priority count: " + priorityCount);
    }


}
