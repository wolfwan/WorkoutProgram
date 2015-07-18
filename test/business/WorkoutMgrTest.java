/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import org.junit.Test;
import static org.junit.Assert.*;
import domain.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.ServiceException;

/**
 *
 * @author wwanless
 */
public class WorkoutMgrTest {

    public WorkoutMgrTest() {
    }

    @Test
    public void testAll() throws Exception {

        WorkoutMgr workoutMgr = new WorkoutMgr();
        Workout workout = new Workout();
        Excercise excercise = new Excercise();
        Excercise excercise2 = new Excercise();


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


        System.out.println("Testing create");

        Workout result = workoutMgr.create(workout);
        assertEquals(result, workout);

        System.out.println("Testing retreive");

        Workout result2 = workoutMgr.retrieve(workout.getDate());
        assertEquals(result2, workout);

        System.out.println("Testing delete");

        Workout result3 = workoutMgr.delete(workout);
        assertEquals(workout, result3);

        System.out.println("Done!");

    }

    @Test
    public void testRetrieveAll() throws Exception{

        WorkoutMgr workoutMgr = new WorkoutMgr();
        Workout workout = new Workout();
        Workout workout2 = new Workout();
        Excercise excercise = new Excercise();
        Excercise excercise2 = new Excercise();

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
        workout2.setDate("3/26/15");
        workout2.setLength(50);
        workout2.add(excercise);

        
        try {
            workoutMgr.create(workout2);
            workoutMgr.create(workout);
        } catch (ServiceException ex) {
            Logger.getLogger(WorkoutMgrTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Testing retrieve all");
        
        List<Workout> results = new ArrayList<Workout>();
        results = workoutMgr.retrieveAll();
        
        assertEquals( workout2, workoutMgr.retrieve("3/26/15") );
        
        assertNotNull(results);
        
        System.out.println("Done!");
        
    }
}
