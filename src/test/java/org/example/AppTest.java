package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test(){
        //assemble
        var cut = new App();
        cut.test();
        Assertions.assertEquals( 0,0);
    }

}
