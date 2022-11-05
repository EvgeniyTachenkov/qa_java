package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

    public class CatTest {

        Feline feline = new Feline();

        @Test
        public void getCatSoundTest(){
            Cat cat = new Cat(feline);
            String expected = "Мяу";
            String actual = cat.getSound();
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void getEatMeatTest() throws Exception{
            Cat cat = new Cat(feline);
            List<String>expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
            List<String>actualEatMeat = cat.getFood();
            Assert.assertEquals(expectedEatMeat, actualEatMeat);
        }
    }
