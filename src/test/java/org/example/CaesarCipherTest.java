package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Caesar cipher related Tests")
class CaesarCipherTest {

    private static CaesarCipher caesarCipher ;

    @BeforeAll
    static void eachSetUp(){
    caesarCipher  = new CaesarCipher("HI",5);
    }

    @Test
    @DisplayName(value = "Get input String details")
    void getName() {
        assertEquals("HI",caesarCipher.getName());
    }

    @Test
    @DisplayName(value = "Get input key details")
    void getKey() {
        assertEquals(5,caesarCipher.getKey());
    }

    @Test
    void setName() {
    }

    @Test
    void setKey() {

    }
    @Test
    @DisplayName(value = "Check decryption and encryption")
    void encryptDecrypt(String input,int key) {
       // assertTrue();
        // assertFalse();
        input="HI";
        key =2;
//        assertEquals("JK",encryptDecrypt(input,key));
        //return "JK";
    }


    @Test
    @DisplayName(value = "Confirm encryption and decryption works well")
    void confirmEncryptDecrypt() {

    }


}