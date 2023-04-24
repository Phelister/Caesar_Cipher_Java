package org.example;

public class Caesar {
    private String name;
    private int key;

    public Caesar(){
        this.name=null;
        this.key =0;
    }

    public Caesar(String name,int key){
        this.name=name;
        this.key =key;
    }

    public String getName(){
        return this.name;
    }

    public int getKey(){
        return this.key;
    }
    public String setName(String name){
        return this.name=name;
    }
    public int setKey(int key){
        return this.key=key;
    }


    public String encrypt (String input, int key){
        if(input ==null || input.length()==0){
            return "Error: Please provide a valid input to proceed encrypting the String";
        }

    }


    public String decrypt (String input, int key){
        if(input ==null || input.length()==0){
            return "Error: Please provide a valid input to proceed decrypting the String";
        }

    }
}
