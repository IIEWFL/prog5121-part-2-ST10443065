/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bonolodinkoanyane
 */
public class KanBanLoginIT {
    
    public KanBanLoginIT() {
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
     * Test of main method, of class KanBanLogin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        KanBanLogin.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class KanBanLogin.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        boolean expResult = false;
        boolean result = KanBanLogin.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class KanBanLogin.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        boolean expResult = false;
        boolean result = KanBanLogin.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class KanBanLogin.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean status = false;
        String expResult = "";
        String result = KanBanLogin.returnLoginStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayWelcomeMessage method, of class KanBanLogin.
     */
    @Test
    public void testDisplayWelcomeMessage() {
        System.out.println("displayWelcomeMessage");
        KanBanLogin.displayWelcomeMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mainApplication method, of class KanBanLogin.
     */
    @Test
    public void testMainApplication() {
        System.out.println("mainApplication");
        KanBanLogin.mainApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTasks method, of class KanBanLogin.
     */
    @Test
    public void testAddTasks() {
        Task task1 = new Task("Login Feature", "Implement login functionality", "Robyn","Harrison", 8, "To Do");
        Task task2 = new Task("Logout Feature", "Implement logout functionality", "Robyn", "Harrison",5, "To Do");
        KanBanLogin.addTasks(); 
        
        KanBanLogin.tasks.add(task1);
        KanBanLogin.tasks.add(task2);

        Task firstTask = KanBanLogin.tasks.get(0);
        assertEquals "Login Feature", firstTask.getTaskName());
        assertEquals ("Robyn", firstTask.getDeveloperFirstName());
        assertEquals ("Harrison", firstTask.getDeveloperLastName());
        assertEquals(8, firstTask.getDuration());
        assertEquals ("To Do", firstTask.getStatus ()):
        
        Task secondTask = KanBanLogin.tasks.get (1);
        assertEquals ("Logout Feature", secondTask.getTaskName()); assertEquals ("Robyn", secondTask.getDeveloperFirstName()):
        assertEquals ("Harrison", secondTask.getDeveloperLastName());
        assertEquals (5, secondTask•getDuration()) ;
        assertEquals ("To Do", secondTask.getstatus());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class KanBanLogin.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String description = "";
        boolean expResult = false;
        boolean result = KanBanLogin.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
