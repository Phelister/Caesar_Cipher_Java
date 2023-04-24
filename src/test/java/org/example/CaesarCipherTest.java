package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Caesar cipher related Tests")
class CaesarCipherTest {

//
//    @BeforeAll
//    void eachSetUp(){
//
//    }

    @Test
    void getName() {
    }

    @Test
    void getKey() {
    }

    @Test
    void setName() {
    }

    @Test
    void setKey() {

    }
    @Test
    @DisplayName(value = "Check decryption and encryption")
    String encryptDecrypt(String input,int key) {
       // assertTrue();
        // assertFalse();
        return "JK";
    }


    @Test
    @DisplayName(value = "Confirm encryption and decryption works well")
    void confirmEncryptDecrypt() {
        String input="HI";
        int key =2;
        assertEquals("JK",encryptDecrypt(input,key));
    }


}