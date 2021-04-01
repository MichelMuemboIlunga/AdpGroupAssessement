/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.adpgroupassementproject;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author CPUT
 */
public class EmployeeTest {
    
   
   private Employee emp_1;
    private Employee emp_2;
    private Employee emp_3;
    
           
    @BeforeEach
    public void setUp() {
        
      emp_1 = new Employee();
      emp_2 = new Employee();    
      emp_3 = emp_1;
              
    }
    @Test 
    public void testEquality(){
    
    assertEquals(emp_3,emp_1);
            
    }
    
    
    @Test
    public void testIdentity(){
        
        assertSame(emp_3,emp_1);
    }
    
    @Test
    public void testfailling(){
        
         assertNotEquals(10,5+4);
         fail("This method will not run because the is a fail problem");
    }
    
  @DisplayName("testing timeout ")
  @Test
  @Timeout(10)
  public void testtimeout() throws Exception {
    
    TimeUnit.SECONDS.sleep(9); 
   
  }
  @Disabled
  @Test
  public void testDisabled(){
      System.out.print("Disabled method");
  }
  
  
  
    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
