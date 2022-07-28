package com.sava.githubaction;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppMethodsTest {

    @Test
    public void convertByteArrayToIntTest(){
        int actualResult = AppMethods.convertByteArrayToInt(new byte[]{1,2});
        int expectedResult = 258;
        assertThat("byte array to int convert correctly",
                actualResult,
                is(equalTo(expectedResult)));
        assertEquals(actualResult, expectedResult);
        assertTrue(actualResult==expectedResult);
    }

    @Test
    public void convertHexToIntTest(){
        long actualResult = AppMethods.convertHexToInt("0a10");
        long expectedResult = 2576;
        assertThat("byte hex to int convert correctly",
                actualResult,
                is(equalTo(expectedResult)));
        assertTrue(actualResult==expectedResult);
    }
}
