package com.minimoviles;

import org.junit.Assert;
import org.junit.Test;


public class TestSuite1{

    @Test
    public void prueba(){
        int a = 2;
        int b = 2;
        Assert.assertEquals("Prueba", a, b);
    }

}