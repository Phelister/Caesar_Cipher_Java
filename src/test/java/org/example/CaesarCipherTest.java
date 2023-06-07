package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//RED GREEN REFACTOR
@DisplayName(value = "Caesar cipher related Tests")
class CaesarCipherTest {

    private static CaesarCipher caesarCipher ;

    @BeforeEach
    void eachSetUp(){

        caesarCipher  = new CaesarCipher();
        caesarCipher.setKey(5);
        caesarCipher.setProcess(1);
        caesarCipher.setName("HI");
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
    @DisplayName(value = "Check encoding is correct")
    void encode() {
      assertEquals("JK",caesarCipher.encode("HI",2));
      assertEquals("CD",caesarCipher.encode("HI",20));
    }

    @Test
    @DisplayName(value = "Check decoding is correct")
    void decode() {
        assertEquals("A",caesarCipher.decode("B",1));
        assertEquals("A",caesarCipher.decode("C",2));
    }




}