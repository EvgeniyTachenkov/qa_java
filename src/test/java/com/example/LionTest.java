package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedKittensCount = 0;
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFoodLionTest() throws Exception{
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String>actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getVeganTest() throws Exception{
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getFood()).thenReturn(Arrays.asList("Трава", "Различные растения"));
        List<String>expectedVeganFood = List.of("Трава", "Различные растения");
        List<String>actualFood = lion.getFood();
        Assert.assertEquals(expectedVeganFood, actualFood);
    }
}
