package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by emilybutte on 9/26/16.
 */
public class CatTest {

    Pet cat = new Cat();

    @Test
    public void speakTest() {
        String expected = "meow";
        String actual = cat.speak();
        Assert.assertEquals("cat says meow", actual, expected );
    }
}
