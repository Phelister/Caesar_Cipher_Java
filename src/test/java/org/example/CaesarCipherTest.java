package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Caesar cipher related Tests")
class CaesarCipherTest {

    private static CaesarCipher caesarCipher ;

    @BeforeEach
    void eachSetUp(){
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

        caesarCipher.setName("VR");
        assertEquals("VR",caesarCipher.getName());


    }

    @Test
    void setKey() {
        caesarCipher=new CaesarCipher();
        caesarCipher.setKey(5);
        assertEquals(5,caesarCipher.getKey());

    }
    @Test
    @DisplayName(value = "Check encryption and decryption is correct")
    void encryptDecrypt() {
      assertEquals("JK",caesarCipher.encryptDecrypt("HI",2));
      assertEquals("CD",caesarCipher.encryptDecrypt("HI",20));
    }



}