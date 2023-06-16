package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmUpTests {

    @Test
    void testSleepIns () {
        assertEquals(true, Warmup1.sleepIn(false, false));
        assertEquals(false, Warmup1.sleepIn(true, false));
        assertEquals(true, Warmup1.sleepIn(false, true));
        assertEquals(true, Warmup1.sleepIn(true, true));
    }

    @Test
    void testStartOz () {
        assertEquals("oz", Warmup1.startOz("ozymandias"));
        assertEquals("z", Warmup1.startOz("bzoo"));
        assertEquals("o", Warmup1.startOz("oxx"));
        assertEquals("", Warmup1.startOz(""));
        assertEquals("oz", Warmup1.startOz("oz"));
    }



}
