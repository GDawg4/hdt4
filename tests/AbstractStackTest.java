/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrea Elías
 * @author Rodrigo Garoz
 */
public class AbstractStackTest {
    
    public AbstractStackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pop method, of class AbstractStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        AbstractStack instance = new AbstractStackImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class AbstractStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        AbstractStack instance = new AbstractStackImpl();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class AbstractStack.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        AbstractStack instance = new AbstractStackImpl();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class AbstractStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AbstractStack instance = new AbstractStackImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractStackImpl extends AbstractStack {

        public E pop() {
            return null;
        }

        public E peek() {
            return null;
        }
    }
    
}
