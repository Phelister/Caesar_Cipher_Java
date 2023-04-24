package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the Key: Should be a number between 1 and 25");
       int key =scan.nextInt();

        System.out.println("Enter the Sentence  which you would like to be encrypted or Decryptyed");
        Scanner inputValue = new Scanner(System.in);
        String input =inputValue.nextLine();

        CaesarCipher caesar= new CaesarCipher(input,key);
        System.out.println("The new String value is "+ caesar.encryptDecrypt(caesar.getName(), caesar.getKey()));
    }
}