package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by emilybutte on 9/26/16.
 */
public class GuineaPigTest {

    Pet guineaPig = new GuineaPig("bob");

    @Test
    public void speakTest() {
        String expected = "squeak";
        String actual = guineaPig.speak();
        Assert.assertEquals("guinea pigs says squeak", actual, expected );
    }
}
