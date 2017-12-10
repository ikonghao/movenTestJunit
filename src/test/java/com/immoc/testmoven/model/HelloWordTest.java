package com.immoc.testmoven.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWordTest{
    @Test
    public void testHello(){
        String val=new HelloWorld().sayHellow();
        System.out.printf("%s",val);
        Assert.assertEquals("Hello World!",val);
    }
}