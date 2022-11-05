package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    Feline feline = new Feline();
    private final String sex;
    private final boolean expected;

    public LionParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getGenderLionTest(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},

        };
    }

    @Test
    public void lionTest() throws Exception{

        Lion lion = new Lion(sex,feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
    }
}