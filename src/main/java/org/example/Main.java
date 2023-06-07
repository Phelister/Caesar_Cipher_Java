package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the Key: Should be a number between 1 and 25");
       int key =scan.nextInt();

        System.out.println("Enter the Sentence  which you would like to be encoded or Decoded");
        Scanner inputValue = new Scanner(System.in);
        String input =inputValue.nextLine();


        System.out.println("Enter the Process which you would like to be  put 1 for encoding and 2 for decoding");
        Scanner processValue = new Scanner(System.in);
        int process =inputValue.nextInt();

        CaesarCipher caesar= new CaesarCipher(input,key,process);
        System.out.println("The new String value is "+ caesar.processData(caesar.getName(), caesar.getKey(), caesar.getProcess()));
    }
}