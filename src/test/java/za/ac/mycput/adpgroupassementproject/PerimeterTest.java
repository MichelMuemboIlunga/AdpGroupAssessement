/*
    Siyanda Mthimkhulu ADP261 
    220148279
 */
package za.ac.mycput.adpassessmentproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;



public class PerimeterTest {
    
    public PerimeterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of perimeterG method, of class Perimeter.
     */
    @Test
    public void testPerimeterG() {
          double length = 3 ;
          double width = 2;
          
          Perimeter test = new Perimeter();
          
          double result = test.perimeterG(length , width);
         // assertEquals(12,result); fails because expected is 10.0 
         assertEquals(10,result);
   
    }
        @Test
        @Disabled ("disabled to show meet the requirements of the assignment")
    public void testAreaG() {
          double length1 = 4 ;
          double width1 = 3;
          
          Perimeter test = new Perimeter();
          
          double result = test.areaG(length1 , width1);
          assertEquals(12,result);
    }
    @Test
    public void testStringsG(){
       String str1 = "fufu";
       String str2 = str1;
       String str3 = "fefe";
       
       Perimeter test = new Perimeter();
       
       assertSame(str1,str2); //test should pass
     //  assertSame(str1,str3); //test should fail
       
    }
     @Test
    public void testFailingG(){
       fail("nothing implemented yet ");
    }
    
    @Test
    @Timeout(10)
        public void timeoutG() throws InterruptedException {
        Thread.sleep(9000);//should pass because 9seconds is less than 10seconds
    }
}


