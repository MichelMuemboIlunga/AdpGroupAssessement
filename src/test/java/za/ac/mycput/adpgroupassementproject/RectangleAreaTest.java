/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.adpgroupassementproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Lonwabo Mshudulu (215181689)
 * This class tests the area of a rectangle class
 */
public class RectangleAreaTest {
    
    private RectangleArea obj1;
    private RectangleArea obj2;
    
    // Testing Object Equality (test status: passed)
    
    @Test
    public void testObjectEquality() {
        assertEquals(obj1, obj2);
    }
    
    // Testing Object Identity (test status: passed)
    
    @Test
    public void testObjectIdentity() {
        assertSame(obj1, obj2);
    }
    
    // Testing Failing Test
    
    @Test
    void testCalculateSideFailing(){
        assertEquals(100, 35 + 25 + 25 + 15 , "correct");
        // make the test fail
        fail("Sorry You Have to fail for the purpose of testing this method");
    }
    
    // Testing timeout (test status: passed)
    
    @Test
    public void testTimeOutOne() throws InterruptedException {
        Thread.sleep(30);
        System.out.println("First time test method");
    }
    
    public void testTimeOutTwo() throws InterruptedException {
        Thread.sleep(50);
        System.out.println("Second time test method");
    }
    
    // Testing disabling
    
    @Disabled
    @Test
    public void testWillBeSkipped() {
        System.out.println("This method will be skipped");
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
