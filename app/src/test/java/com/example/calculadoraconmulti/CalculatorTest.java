package com.example.calculadoraconmulti;


import org.junit.Assert;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd2Operants(){
        int total = calc.calculate("5+3");
        Assert.assertEquals("X + Y operations not working correctly", 8, total);
        //The message here is displayed if the test fails
    }

    @Test
    public void testAdd1Operant(){
        int total = calc.calculate("4+3+1");
        Assert.assertEquals("+ X operations not working correctly", 8, total);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMult2Operants(){
        int total = calc.calculate("4x2");
        Assert.assertEquals("4 * X operations not working correctly", 8, total);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMultAndAdd2Operants(){
        int total = calc.calculate("4+7x2");
        Assert.assertEquals("X + Y * Z operations not working correctly", 18, total);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMultAndSub2Operants(){
        int total = calc.calculate("4-7x2");
        Assert.assertEquals("X - Y * Z operations not working correctly", -10, total);
        //The message here is displayed if the test fails
    }

    @Test
    public void multipleOperators(){
        int total = calc.calculate("1+2x3-5");
        Assert.assertEquals("X++ operations not working correctly", 2, total);
        //The message here is displayed if the test fails
    }

    @Test
    public void test2SubOperators(){
        int total = calc.calculate("--1");
        Assert.assertEquals("--X operations not working correctly", -1, total);
        //The message here is displayed if the test fails
    }

    @Test
    public void test2AddOperators(){
        int total = calc.calculate("1++");
        Assert.assertEquals("X++ operations not working correctly", -1, total);
        //The message here is displayed if the test fails
    }

    @Test
    public void test2MultOperators(){
        int total = calc.calculate("1xx");
        Assert.assertEquals("X** operations not working correctly", -1, total);
        //The message here is displayed if the test fails
    }
}
