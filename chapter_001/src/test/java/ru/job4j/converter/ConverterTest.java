package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void rubleTodollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void euro1ToRubles() {
        int in = 3;
        int expected = 210;
        int out = Converter.euro1ToRuble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void dollar1ToRubles() {
        int in = 6;
        int expected = 360;
        int out = Converter.dollar1ToRuble(in);
        Assert.assertEquals(expected, out);

    }
}






