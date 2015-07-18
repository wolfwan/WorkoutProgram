/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wwanless
 */
public class ExcerciseTest {

    public ExcerciseTest() {
    }

    @Test
    public void testValidate() {
        Excercise excercise = new Excercise();
        System.out.println("Populating");
        excercise.setMinsRan(60);
        excercise.setPushups(20);
        excercise.setSitups(50);

        System.out.println("Testing validate");
        assertFalse(excercise.validate());
        excercise.setSquats(40);
        assertTrue(excercise.validate());
        System.out.println("Test Passed");
    }

    @Test
    public void testEquals() {
        Excercise excercise = new Excercise();
        Excercise excercise2 = new Excercise();
        System.out.println("Populating");
        excercise.setMinsRan(60);
        excercise.setPushups(20);
        excercise.setSitups(50);
        excercise.setSquats(40);

        excercise2.setMinsRan(60);
        excercise2.setPushups(20);
        excercise2.setSitups(50);
        excercise2.setSquats(1000);//different
        System.out.println("Testing equals");
        assertFalse(excercise.equals(excercise2));
        excercise2.setSquats(40);
        assertTrue(excercise.equals(excercise2));
        System.out.println("Test Passed");
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testGetPushups() {
    }

    @Test
    public void testSetPushups() {
    }

    @Test
    public void testGetSitups() {
    }

    @Test
    public void testSetSitups() {
    }

    @Test
    public void testGetSquats() {
    }

    @Test
    public void testSetSquats() {
    }

    @Test
    public void testGetMinsRan() {
    }

    @Test
    public void testSetMinsRan() {
    }
}
