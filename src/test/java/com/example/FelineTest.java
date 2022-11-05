package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensFelineTest(){
        Feline feline = new Feline();
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);

    }
    @Test
    public void getEatMeatTest() throws Exception{
        Feline feline = new Feline();
        List<String>expectedEat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String>actualEat = feline.getFood("Хищник");
        Assert.assertEquals(expectedEat, actualEat);
    }
}
