package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("H:\\Java\\Advent of code 2022\\AdventofCode2\\input.txt");
        Scanner scanner = new Scanner(file);
int myPoints = 0;
int oppPoints  = 0;

int myPoints2 = 0;
int oppPoints2 = 0;
int count = 0;
        while(scanner.hasNextLine()){
            String[] inArray = scanner.nextLine().split(" ");
            count++;
                switch(inArray[0]){


                    case "A":
                        switch(inArray[1]){
                            case "X":
                               myPoints+= Choice.ROCK.getPoints() + Result.DRAW.getPoints();
                               oppPoints+= Choice.ROCK.getPoints() + Result.DRAW.getPoints();

                               //-------------------------------------------------------------
                                myPoints2+= Choice.SCISSORS.getPoints()+ Result.LOSE.getPoints();

                               break;
                            case "Y":
                                myPoints +=  Choice.PAPER.getPoints() + Result.WIN.getPoints();
                                oppPoints+= Choice.ROCK.getPoints() + Result.LOSE.getPoints();;
                                //-----------------------------------------------------------
                                myPoints2+= Choice.ROCK.getPoints()+ Result.DRAW.getPoints();
                                break;
                            case "Z":
                                myPoints+= Choice.SCISSORS.getPoints() + Result.LOSE.getPoints();;
                                oppPoints+=  Choice.ROCK.getPoints() + Result.WIN.getPoints();
                                //-----------------------------------------------------------
                                myPoints2+= Choice.PAPER.getPoints()+ Result.WIN.getPoints();
                                break;
                        }
break;
                    case "B":
                        switch(inArray[1]){
                            case "X":
                                myPoints+= Choice.ROCK.getPoints() + Result.LOSE.getPoints();;
                               oppPoints+=Choice.PAPER.getPoints() + Result.WIN.getPoints();

                               //-----------------------------------------------------------

                                myPoints2+= Choice.ROCK.getPoints()+ Result.LOSE.getPoints();
                                break;
                            case "Y":
                                myPoints +=Choice.PAPER.getPoints() + Result.DRAW.getPoints();
                                oppPoints += Choice.PAPER.getPoints() + Result.DRAW.getPoints();
                                //-----------------------------------------------------------
                                myPoints2+= Choice.PAPER.getPoints()+ Result.DRAW.getPoints();
                                break;
                            case "Z":
                                myPoints+=Choice.SCISSORS.getPoints() + Result.WIN.getPoints();
                                oppPoints+=Choice.PAPER.getPoints() + Result.LOSE.getPoints();
                                //-----------------------------------------------------------
                                myPoints2+= Choice.SCISSORS.getPoints()+ Result.WIN.getPoints();
                                break;
                        }
break;
                    case "C":
                        switch(inArray[1]){
                            case "X":
                               myPoints+= Choice.ROCK.getPoints()  + Result.WIN.getPoints();
                               oppPoints+=Choice.SCISSORS.getPoints() + Result.LOSE.getPoints();
                               //----------------------------------------------------------
                                myPoints2+= Choice.PAPER.getPoints()+ Result.LOSE.getPoints();
                                break;
                            case "Y":
                                myPoints+=Choice.PAPER.getPoints() + Result.LOSE.getPoints();
                             oppPoints+=Choice.SCISSORS.getPoints() + Result.WIN.getPoints();
                                //-----------------------------------------------------------
                                myPoints2+= Choice.SCISSORS.getPoints()+ Result.DRAW.getPoints();
                                break;
                            case "Z":
                                myPoints += Choice.SCISSORS.getPoints() + Result.DRAW.getPoints();
                                oppPoints += Choice.SCISSORS.getPoints() + Result.DRAW.getPoints();
                                //-----------------------------------------------------------
                                myPoints2+= Choice.ROCK.getPoints()+ Result.WIN.getPoints();
                                break;
                        }
                        break;
                }



        }

        System.out.println("my total score was: " + myPoints);
        System.out.println("my opponents total score was: " + oppPoints);
        System.out.println("Lines: "+ count);

        System.out.println("Part 2 score was: " + myPoints2);
    }
}

 enum Choice{
    ROCK (1),PAPER(2), SCISSORS(3);
    private int points;
    Choice(int points){
        this.points = points;
    }
    public int getPoints(){
        return this.points;
    }


}
enum Result{
    WIN(6),DRAW(3),LOSE(0);
    private int points;

    Result(int points){
        this.points = points;
    }
    public int getPoints(){
        return this.points;
    }

}