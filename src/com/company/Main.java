package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("what do you want to call the file? ");

        String userFileName = input.next();
        File file = new File("data/" + userFileName + ".txt");

        //write code functionality


        int randomInt = rand.nextInt(5)+1;

        System.out.println(randomInt);
        int numberOfGuesses = 0;
        boolean isNotDone = true;

        while (isNotDone == true) {
            int userInput = input.nextInt();

            numberOfGuesses++;

            if((userInput - randomInt) == 0){
                isNotDone = false;
            }
        }

        String numberOfGuessesAsString = String.valueOf(numberOfGuesses);

        try {
            //the two arguments are the file, and whether or not you append (true) or don't (nothing)
        FileWriter fw = new FileWriter(file, true);

        //take data from functionality and send it to the file
        fw.append(numberOfGuessesAsString + " "  );
        fw.close();
        } catch (IOException e){
            System.out.println("an error occured");
        }
    }
}
