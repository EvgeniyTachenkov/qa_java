package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


    @RunWith(MockitoJUnitRunner.class)
    public class LionTest {

    Lion lion;

    @Mock
    Feline feline;

    @Test
    public void lionGetKittenTestPositive() throws Exception {

        String sex = "Самец";
        lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());

    }

    @Test
    public void lionUnknownAnimalTest() {

        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("неизвестный",feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());

    }

    @Test
    public void lionGetFoodMeat() throws Exception {

        String sex = "Самка";
        Lion lion = new Lion(sex,feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные, Птицы, Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(List.of("Животные, Птицы, Рыба"), actual);

    }

}
