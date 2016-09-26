package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by emilybutte on 9/26/16.
 */
public class DogTest {

    Pet dog = new Dog();

    @Test
    public void speakTest() {
        String expected = "bark";
        String actual = dog.speak();
        Assert.assertEquals("dog says bark", actual, expected );
    }
}
