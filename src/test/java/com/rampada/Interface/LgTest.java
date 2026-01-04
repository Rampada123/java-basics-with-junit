package com.rampada.Interface;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LgTest {

    private Remote remote;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        remote = new Lg();   // implementation under test
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() { 
        System.setOut(originalOut);
    }

    @Test
    public void testOn() {
        remote.on();
        assertEquals(
            "Switch on the remote" + System.lineSeparator(),
            outContent.toString()
        );
    }

    @Test
    public void testOff() {
        remote.off();
        assertEquals(
            "Switch off the remote" + System.lineSeparator(),
            outContent.toString()
        );
    }


}

