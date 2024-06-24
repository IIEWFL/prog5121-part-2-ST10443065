/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bonolodinkoanyane
 */
public class TaskIT {
    
    public TaskIT() {
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
     * Test of getDescription method, of class Task.
     */
    @Test
    public void testGetTaskDescription() {
        System.out.println("getDescription");
        Task instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(True, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Task.
     */
    @Test
    public void testTotalHoursAccumulated() {
        Task task1 = new Task("Task1", "Description", "Dev", "One", 10, "To Do");
        Task task2 = new Task("Task2", "Description", "Dev", "Two", 12, "To Do");
        Task task3 = new Task("Task3", "Description", "Dev", "Three", 55, "To Do");
        Task task4 = new Task("Task4", "Description", "Dev", "Four", 11, "To Do");
        Task task5 = new Task("Task5", "Description", "Dev", "Five", 1, "To Do");

        Task[] tasks = {task1, task2, task3, task4, task5};
        int totalDuration = 0;
        for (Task task : tasks) {
            totalDuration += task.getDuration();
        }

        assertEquals(89, totalDuration);
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        Task instance = null;
        boolean expResult = false;
        boolean result = instance.checkTaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskNumber method, of class Task.
     */
    @Test
    public void testGetTaskNumber() {
        System.out.println("getTaskNumber");
        Task instance = null;
        int expResult = 0;
        int result = instance.getTaskNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskID method, of class Task.
     */
    @Test
    public void testGetTaskID() {
        System.out.println("getTaskID");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testTaskID() {
        Task task1 = new Task("Add Feature", "Description", "Robyn", "Harrison", 5, "To Do");
        assertEquals("AD:0:SON", task1.getTaskID());

        Task task2 = new Task("Create Feature", "Description", "Mike", "Smith", 3, "Done");
        assertEquals("CR:1:ITH", task2.getTaskID());

        Task task3 = new Task("Create Feature", "Description", "Edward", "Blake", 2, "Doing");
        assertEquals("CR:2:AKE", task3.getTaskID());

        Task task4 = new Task("Create Feature", "Description", "Nathan", "Smith", 4, "To Do");
        assertEquals("CR:3:ITH", task4.getTaskID()); 
    }
}
