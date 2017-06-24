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

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joe
 */
public class DataAccessTest {
    
    public DataAccessTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of selectAllMedications method, of class DataAccess.
     */
    @Test
    public void testSelectAllMedications_0args() {
        System.out.println("selectAllMedications");
        ArrayList<Medications> expResult = null;
        ArrayList<Medications> result = DataAccess.selectAllMedications();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAllMedications method, of class DataAccess.
     */
    @Test
    public void testSelectAllMedications_int() {
        System.out.println("selectAllMedications");
        int keypadLetterGroup = 0;
        ArrayList<Medications> expResult = null;
        ArrayList<Medications> result = DataAccess.selectAllMedications(keypadLetterGroup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectMedicationsByGenericName method, of class DataAccess.
     */
    @Test
    public void testSelectMedicationsByGenericName() {
        System.out.println("selectMedicationsByGenericName");
        ArrayList<Medications> expResult = null;
        ArrayList<Medications> result = DataAccess.selectMedicationsByGenericName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectMedicationDetails method, of class DataAccess.
     */
    @Test
    public void testSelectMedicationDetails() {
        System.out.println("selectMedicationDetails");
        int medID = 0;
        Medications expResult = null;
        Medications result = DataAccess.selectMedicationDetails(medID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAllConditions method, of class DataAccess.
     */
    @Test
    public void testSelectAllConditions_0args() {
        System.out.println("selectAllConditions");
        ArrayList<Conditions> expResult = null;
        ArrayList<Conditions> result = DataAccess.selectAllConditions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAllConditions method, of class DataAccess.
     */
    @Test
    public void testSelectAllConditions_int() {
        System.out.println("selectAllConditions");
        int keypadLetterGroup = 0;
        ArrayList<Conditions> expResult = null;
        ArrayList<Conditions> result = DataAccess.selectAllConditions(keypadLetterGroup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectConditionDetails method, of class DataAccess.
     */
    @Test
    public void testSelectConditionDetails() {
        System.out.println("selectConditionDetails");
        int conID = 0;
        Conditions expResult = null;
        Conditions result = DataAccess.selectConditionDetails(conID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectMedicationsInCondition method, of class DataAccess.
     */
    @Test
    public void testSelectMedicationsInCondition() {
        System.out.println("selectMedicationsInCondition");
        int conID = 0;
        ArrayList<Medications> expResult = null;
        ArrayList<Medications> result = DataAccess.selectMedicationsInCondition(conID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
