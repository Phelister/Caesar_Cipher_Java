package org.example;

public class CaesarCipher {
    private String name;
    private int key;



    private int process;

    public CaesarCipher(){
        this.name=null;
        this.key =0;
        this.process=0;
    }

    public CaesarCipher(String name, int key, int process){
        this.name=name;
        this.key =key;
        this.process= process;
    }

    public CaesarCipher(String name) {
        this.name = name;
    }

    public CaesarCipher(int key) {
        this.key = key;
    }
//    public CaesarCipher(int process) {
//        this.process = process;
//    }

    public String getName(){
        return this.name;
    }

    public int getKey(){
        return this.key;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }
    public String setName(String name){
        return this.name=name;
    }
    public int setKey(int key){
        return this.key=key;
    }

//encode
    public String encode(String input, int key){
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


//decode
    public String decode(String input, int key){
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

                value -= key;

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


    public String processData(String name, int key, int process){
      if(process ==1){
         return  encode(name, key);
      }
      else if(process ==2){
          return  decode(name, key);
        }
      return " :error:  process is invalid put 1 for encoding and 2 for decoding";
    }

}
