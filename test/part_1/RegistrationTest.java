/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class RegistrationTest {
    
    public RegistrationTest() {
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
     * Test of registerUser method, of class Registration.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String firstName = "";
        String lastName = "";
        String cellPhoneNumber = "";
        Registration instance = new Registration();
        instance.registerUser(username, password, firstName, lastName, cellPhoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submit method, of class Registration.
     */
    @Test
    public void testSubmit() {
        System.out.println("submit");
        String username = "";
        String password = "";
        String firstName = "";
        String lastName = "";
        String cellPhoneNumber = "";
        Registration instance = new Registration();
        instance.submit(username, password, firstName, lastName, cellPhoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Registration.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registration.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Registration.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "Kyle_";
        boolean expResult = true;
        boolean result = Registration.checkUserName(username);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkPasswordComplexity method, of class Registration.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        boolean expResult = true;
        boolean result = Registration.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isCellPhoneValid method, of class Registration.
     */
    @Test
    public void testIsCellPhoneValid() {
        System.out.println("isCellPhoneValid");
        String number = "+27818854996";
        boolean expResult = true;
        boolean result = Registration.isCellPhoneValid(number);
        assertEquals(expResult, result);
        
    }
 
}
