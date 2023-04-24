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


    public String encryptDecrypt (String input, int key){
        if(input ==null || input.length()==0){
            return "Error: Please provide a valid input to proceed encrypting the String";
        }
        int size =input.length();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<size; i++){
            char current = input.charAt(i);

            if(Character.isLetter(current)) {
                //a is 97
                int value = (int) current - 97;
                value += key;
                //ensure
                if (value > 25) {
                    value -= 25;
                }
                value += 97;
                current = (char) value;
            }

            result.append(current);
        }
     return result.toString();
    }

}
