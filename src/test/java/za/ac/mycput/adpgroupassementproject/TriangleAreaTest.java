 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author MICHEL MUEMBO ILUNGA
 * student number 218303335
 * This class test the area of a triangle class program
 */
package za.ac.mycput.adpgroupassementproject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

/**
 *
 *
 * @author MICHEL MUEMBO ILUNGA
 * student number 218303335
 * This class test the area of a triangle class program
 */
public class TriangleAreaTest {
     private TriangleArea obj1;
     private TriangleArea obj2;
     private TriangleArea obj3;
     
    
    @BeforeEach
    public void setUp() {
       System.out.println("setup");
        obj1 = obj2;
        obj3 = new TriangleArea();
    }
    
    // objects equality (test status: passed)
    
    @DisplayName("testing objects equality")
    @Test
    void testObjectEquality(){
        assertEquals(obj1, obj2);
    }
    
    // testing getresponse equality (test status: passed)
    @DisplayName("testing getResponse method equality")
    @Test
    void testgetResponse(){
        assertEquals("Welcome to TDD With Junit 5", TriangleArea.getResponse());
    }
    
    // testing findearea method(test status: failed)
    @DisplayName("test findarea() Inequality")
    @Test
    void testfindarea(){
        /* this test will failed because the expected is 12.0 but because we are testing
          the inequality it will became false instead of true */
        System.out.println("I make you failed ");
        assertNotEquals(12.0, (5*5)/2);
    }
    
    // testing object Identity (test status: passed)
    
    @DisplayName("testing object identity between obj1 and obj2")
    @Test
    void testIdentity(){
        assertSame(obj1,obj2);
    }
    
    // testing object not identique (test status: passed)
    @DisplayName("testing object identity between obj1 and obj2")
    @Test
    void testNotIdentity(){
        assertNotSame(obj1, obj3);
    }
    
    // testing object identity on the getResponse method (test status: passed)
    @DisplayName("testing object in the getResponse method")
    @Test
    void testgetResponseIndentity(){
        Assertions.assertSame("Welcome to TDD With Junit 5", TriangleArea.getResponse());
    }
    
    // failing test
    @DisplayName("testing failing test in findarea method")
    @Test
    void testSideCalcFailing(){
        Assertions.assertEquals(50, 10 + 20 + 20 , "correct");
        // make the test fail
        fail("Sorry You Have to failed for the purpose of testing this method");
    }
    
    // timeout testing (test status: passed)
    @Test
    void testtimeout() {
       // testing the timeout using lambda function
        assertTimeout(Duration.ofSeconds(10), () -> testSecondtimeout(5)); 
    }
    
     // this method will help to test timeout
    
     void testSecondtimeout(int second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
        }
    }
     
     // testing disabling (test status: passed)
     
    @Disabled("Disabled This method until the debug is complete!")
    @Test
    void testDisabling() {
        Assertions.assertNotNull(this.obj3, "This object is not null");
    }
    
    
    
    @AfterEach
    public void tearDown() {
        System.out.println("teardown");
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
