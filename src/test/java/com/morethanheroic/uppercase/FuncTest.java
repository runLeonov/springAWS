package com.morethanheroic.uppercase;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class FuncTest {
    JsonFunction function = new JsonFunction();
    @Test
    public void getJsonWithoutKeyMessage() {
        Assert.assertEquals(Map.of("error", "Field message can not be null or empty"),
                function.apply(Map.of("something", "Some message")));
    }

    @Test
    public void getJsonWithKeyMessage() {
        Assert.assertEquals(Map.of("message", "Msae"),
                function.apply(Map.of("message", "Message")));
    }

}
