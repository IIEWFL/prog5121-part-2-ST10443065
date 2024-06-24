/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.demo.createkanbanaccount;

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
public class CreateKanbanAccountIT {
    
    public CreateKanbanAccountIT() {
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
     * Test of main method, of class CreateKanbanAccount.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CreateKanbanAccount.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUsername method, of class CreateKanbanAccount when correctly formatted.
     */
    @Test
    public void testCheckUsernameCorrectlyFormatted() {
        System.out.println("checkUsername");
        String username = "kyl_1";
        boolean expResult = true;
        boolean result = CreateKanbanAccount.checkUsername(username);
        assertEquals(expResult, result);   
    } 
    /*
        Test of checkUsername method, of class CreateKanbanAccount when incorrectly formatted.
    */
@Test
    public void testCheckUsernameIncorrectlyFormatted() {
        System.out.println("checkUsername");
        String username = "kyle!!!!!!!”";
        boolean expResult = false;
        boolean result = CreateKanbanAccount.checkUsername(username);
        assertEquals(expResult, result);    
    }
    /**
     * Test of true checkPasswordComplexity method, of class CreateKanbanAccount.
     */
    @Test
    public void testCheckPasswordComplexityCorrectlyFormatted() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = CreateKanbanAccount.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    } 
    /**
     * Test of false checkPasswordComplexity method, of class CreateKanbanAccount.
     */
    @Test
    public void testCheckPasswordComplexityIncorrectFormat() {
        System.out.println("checkPasswordComplexity");
        String password = "password";
        boolean expResult = false;
        boolean result = CreateKanbanAccount.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }
    
}
