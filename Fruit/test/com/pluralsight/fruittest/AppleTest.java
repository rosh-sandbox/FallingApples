package com.pluralsight.fruittest;

import com.pluralsight.fruit.Apple;
import org.junit.Assert;
import org.junit.Test;

public class AppleTest {

    @Test
    public void AppleHasCorrectName(){
        Apple apple = new Apple();
        Assert.assertEquals("Apple", apple.getName());
    }

}
