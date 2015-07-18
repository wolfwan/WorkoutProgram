package domain;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author wwanless
 */
public class WorkoutTest {

    public WorkoutTest() {
    }

    @Test
    public void testEquals() {
        Workout workout = new Workout();
        Excercise excercise = new Excercise();
        Workout workout2 = new Workout();
        Excercise excercise2 = new Excercise();

        System.out.println("Testing equals");
        System.out.println("Populating");

        workout.setDate("1/28/2015");
        workout.setLength(60);
        excercise.setMinsRan(60);
        excercise.setPushups(20);
        excercise.setSitups(50);
        excercise.setSitups(100);
        excercise.setSquats(40);

        excercise2.setMinsRan(60);
        excercise2.setPushups(20);
        excercise2.setSitups(50);
        excercise2.setSitups(100);
        excercise2.setSquats(40);
        workout.add(excercise);
        workout.add(excercise2);

        System.out.println("asserting false");
        workout2.setDate("1/28/2015");
        assertFalse(workout.equals(workout2));
        workout2.setLength(60);
        assertFalse(workout.equals(workout2));
        workout2.add(excercise);
        assertFalse(workout.equals(workout2));
        workout2.add(excercise2);
        System.out.println("asserting true");
        assertTrue(workout.equals(workout2));
        System.out.println("Test Passed");

    }

    @Test
    public void testValidate() {
        // test validate
        Workout workout = new Workout();
        Excercise excercise = new Excercise();
        Excercise excercise2 = new Excercise();

        System.out.println("Testing validate");
        System.out.println("Populating");

        workout.setDate("1/28/2015");
        assertFalse(workout.validate());
        workout.setLength(60);
        workout.setId(1);
        assertFalse(workout.validate());
        excercise.setMinsRan(60);
        excercise.setPushups(20);
        assertFalse(workout.validate());
        excercise.setSitups(50);
        excercise.setSitups(100);
        assertFalse(workout.validate());
        excercise.setSquats(40);

        excercise2.setMinsRan(60);
        excercise2.setPushups(20);
        assertFalse(workout.validate());
        excercise2.setSitups(50);
        excercise2.setSitups(100);
        assertFalse(workout.validate());
        excercise2.setSquats(40);
        workout.add(excercise);
        workout.add(excercise2);
        System.out.println(workout.toString());
        assertTrue(workout.validate());
        workout.setId(-10);
        assertFalse(workout.validate());
        
        System.out.println("Test Passed");
    }
}