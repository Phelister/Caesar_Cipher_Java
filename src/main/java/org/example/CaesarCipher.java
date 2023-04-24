package org.example;

public class CaesarCipher {
    private String name;
    private int key;

    public CaesarCipher(){
        this.name=null;
        this.key =0;
    }

    public CaesarCipher(String name, int key){
        this.name=name;
        this.key =key;
    }

    public CaesarCipher(String name) {
        this.name = name;
    }

    public CaesarCipher(int key) {
        this.key = key;
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
                boolean smallLetter= true;
                if(Character.isUpperCase(current)){
                    smallLetter=false;
                    current=Character.toLowerCase(current);
                }

                int value = (int) current - 97;

                value += key;

                //ensure
                if (value > 25) {
                    value %= 25;
                }
                value += 97;

                current = (char) value;

                if(!smallLetter){
                    current=Character.toUpperCase(current);
                }
            }

            result.append(current);
        }
     return result.toString();
    }

}
