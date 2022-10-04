package com.company;

public class BinaryParser {
    public static int parseInput(String input) {

        int result = 0;
        int power = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int currentCharacter = Integer.parseInt(String.valueOf(input.charAt(i)));
            result = result + (currentCharacter * (int) Math.pow(2.0, power));
            power++;
        }
        return result;
    }

    public static boolean checkInput(String input){
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0' && input.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}
