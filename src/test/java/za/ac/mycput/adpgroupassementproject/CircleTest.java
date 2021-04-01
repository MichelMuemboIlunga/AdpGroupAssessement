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
 * @author NomthaMquqo
 */
public class CircleTest {
    
    private Circle arr1;
    private Circle arr2;
    private Circle arr3;
    private Circle arr4;
    
    
    public CircleTest() {
    }
  
   
    @Test
    public void setUp() {
        
        arr1 =new Circle();
        arr2 = new Circle();
        arr3=arr4;
        
    }
    
     @Test
    public void testEquality() {
        assertEquals(arr1,arr2);
    }

    @Test
    public void testIdentity() {
        assertSame(arr3,arr4);
    }

    @Test
    public void failTest() {
        try {
           
            fail("Make it fail");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }
 
    @Test
    public void testSomeMethod() {
        
        fail("The test case is a prototype.");
    }
   @Test
    public void testInfiniteTametakingLoop2() throws InterruptedException
    {
        while (true)
        {
            Thread.currentThread().sleep(5000);
        }
    }
    
    @Disabled
    @Test
    public void xMethod() {

        System.out.println("Stop method");
    }
}
