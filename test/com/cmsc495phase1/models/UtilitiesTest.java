/*
 * Copyright (C) 2017 Joe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cmsc495phase1.models;

import java.sql.Connection;
import javax.servlet.http.HttpServletRequest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joe
 */
public class UtilitiesTest {
    
    public UtilitiesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isMobile method, of class Utilities.
     */
    @Test
    public void testIsMobile() {
        System.out.println("isMobile");
        HttpServletRequest request = null;
        Boolean expResult = null;
        Boolean result = Utilities.isMobile(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPattern method, of class Utilities.
     */
    @Test
    public void testGetPattern() {
        System.out.println("getPattern");
        int keypadLetterGroup = 0;
        String expResult = "";
        String result = Utilities.getPattern(keypadLetterGroup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectToDatabase method, of class Utilities.
     */
    @Test
    public void testConnectToDatabase() {
        System.out.println("connectToDatabase");
        String dbName = "";
        Connection expResult = null;
        Connection result = Utilities.connectToDatabase(dbName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
