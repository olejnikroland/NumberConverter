package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Write binary number to convert to decimal:" );
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (!BinaryParser.checkInput(userInput)) {
            System.out.println("User input is not a binary number");
            return;
        }
        System.out.println(BinaryParser.parseInput(userInput));
    }
}
