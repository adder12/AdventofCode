package org.example;



import org.apache.commons.lang3.Range;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

File file = new File("src/main/resources/input.txt");
        Scanner scan = new Scanner(file);
int count = 0;
int overCount = 0;
        while(scan.hasNextLine()){
            String[] inArr = scan.nextLine().split(",");

String[] arrOne = inArr[0].split("-");
String[] arrTwo = inArr[1].split("-");
int x1 = Integer.parseInt(arrOne[0]);
int x2 = Integer.parseInt(arrOne[1]);
int y1 = Integer.parseInt(arrTwo[0]);
int y2 = Integer.parseInt(arrTwo[1]);


            Range<Integer> rangeOne = Range.between(x1,x2);
            Range<Integer> rangeTwo = Range.between(y1,y2);
            if(rangeOne.contains(y1) && rangeOne.contains(y2)){
            count++;
        }else if(rangeTwo.contains(x1) && rangeTwo.contains(x2)){
                count++;

            }
if((x1 >= y1 && x1 <= y2) ||
        (x2 >= y1 && x2 <= y2) ||
        (y1 >= x1 && y1 <= x2) ||
        (y2 >= x1 && y2 <= x2)){
    overCount++;
        }



    }
        System.out.println("The total count of encompassing pairs is: " + count);
        System.out.println("The total overlapping pairs is: " + overCount);

    }


}


