/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.adpgroupassementproject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Lonwabo Mshudulu (215181689)
 */
public class RectangleAreaTest {
    
    private RectangleArea obj1;
    private RectangleArea obj2;
    private RectangleArea obj3;
    
    @BeforeEach
    public void setUp() {
        System.out.println("Setup");
        obj1 = obj2;
        obj3 = new RectangleArea();
    }
    
    // Testing Object Equality (test status: passed)
    
    @DisplayName ("Testing object equality")
    @Test
    public void testObjectEquality() {
        assertEquals(obj1, obj2);
    }
    
    // Testing getResponse Equality (test status: passed)
    
    @DisplayName ("Testing getResponse() equality")
    @Test
    public void testGetEquality() {
        assertEquals("ADP is cool!", RectangleArea.getResponse());
    }
    
    // Testing RectangleArea() (test status: failed)
    
    @DisplayName("Testing ReactangleArea() Inequality")
    @Test
    public void testRectangleArea(){
        /* this test will fail because the expected result is 12.0 but because we are testing
          the inequality it will be false instead of true */
        System.out.println("The test should fail.");
        assertNotEquals(30.0, 5 * 5);
    }
    
    // Testing Object Identity on the getResponse() (test status: passed)
    
    @DisplayName ("Testing object in the getResponse()")
    @Test
    public void testGetResponseIdentity() {
        Assertions.assertSame("ADP is cool!", RectangleArea.getResponse());
    }
    
    // Testing Failing Test
    
    @DisplayName("Testing Failing Test in calculateSides()")
    @Test
    void testCalculateSideFailing(){
        Assertions.assertEquals(100, 35 + 25 + 25 + 15 , "correct");
        // make the test fail
        fail("Sorry You Have to fail for the purpose of testing this method");
    }
    
    // Testing timeout (test status: passed)
    
    @Test
    public void testTimeOut() {
        assertTimeout(Duration.ofSeconds(10), () -> testSecondTimeout(5));
    }
    
    //method to test timeout
    public void testSecondTimeout(int second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
        }
    }
    
    // Testing disabling
    
    @Disabled ("Disable this method until the debug is complete")
    @Test
    public void disabling() {
        Assertions.assertNotNull(this.obj3, "This object is not null");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("teardown");
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
