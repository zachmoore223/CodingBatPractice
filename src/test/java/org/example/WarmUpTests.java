package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmUpTests {

    @Test
    void testSleepIns () {
        assertEquals(true, Warmups.sleepIn(false, false));
        assertEquals(false, Warmups.sleepIn(true, false));
        assertEquals(true, Warmups.sleepIn(false, true));
        assertEquals(true, Warmups.sleepIn(true, true));
    }

    @Test
    void testStartOz () {
        assertEquals("oz", Warmups.startOz("ozymandias"));
        assertEquals("z", Warmups.startOz("bzoo"));
        assertEquals("o", Warmups.startOz("oxx"));
        assertEquals("", Warmups.startOz(""));
        assertEquals("oz", Warmups.startOz("oz"));
    }

    @Test
    void testStringMatch () {
       assertEquals(3,  Warmups.stringMatch("xxcaazz", "xxbaaz"));
       assertEquals(2,Warmups.stringMatch("abc", "abc"));
       assertEquals(0,Warmups.stringMatch("abc", "axc"));
    }



}
