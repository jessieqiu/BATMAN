//test
//test
//
/*
sfsdfsdd
*/



package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KeyPadPressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KeyPadPressTest
{
    KeyPad kp ;
    
    /**
     * Default constructor for test class KeyPadPressTest
     */
    public KeyPadPressTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        kp = new KeyPad() ;
    }


    @Test
    public void testOne()
    {
        // Press 1

    	
        // Assertion (Replace with appropriate test)
    	assertEquals("1",kp.getKey(1,1));
    }

   @Test
    public void testTwo()
    {
        // Press 2
	   
        // Assertion (Replace with appropriate test)
	   assertEquals("2",kp.getKey(2,1));
    }

   @Test
    public void testThree()
    {
        // Press 3

        // Assertion (Replace with appropriate test)
	   assertEquals("3",kp.getKey(3,1));
    }

   @Test
    public void testFour()
    {
        // Press 4

        // Assertion (Replace with appropriate test)
	   assertEquals("4",kp.getKey(1,2));
    }

   @Test
    public void testFive()
    {
        // Press 5

        // Assertion (Replace with appropriate test)
	   assertEquals("5",kp.getKey(2,2));
    }

   @Test
    public void testSix()
    {
        // Press 6

        // Assertion (Replace with appropriate test)
	   assertEquals("6",kp.getKey(3,2));
    }

   @Test
    public void testSeven()
    {
        // Press 7

        // Assertion (Replace with appropriate test)
	   assertEquals("7",kp.getKey(1,3));
    }

   @Test
    public void testEight()
    {
        // Press 8

        // Assertion (Replace with appropriate test)
	   assertEquals("8",kp.getKey(2,3));
    }

   @Test
    public void testNine()
    {
        // Press 9

        // Assertion (Replace with appropriate test)
	   assertEquals("9",kp.getKey(4,3));
    }

   @Test
    public void testZero()
    {
        // Press 0

        // Assertion (Replace with appropriate test)
	   assertEquals("0",kp.getKey(2,4));
    }

   @Test
    public void testBackspace()
    {
        // Press Backspace

        // Assertion (Replace with appropriate test)
	   assertEquals("X",kp.getKey(3,4));
    }

   @Test
    public void testNoKey()
    {
        // Press Empty Key

        // Assertion (Replace with appropriate test)
	   assertEquals(" ",kp.getKey(1,4));
    }


    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
