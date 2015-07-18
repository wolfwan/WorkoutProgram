/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import org.junit.Test;
import static org.junit.Assert.*;
import domain.*;

/**
 *
 * @author wwanless
 */
public class WorkoutSvcSioImplTest {

    public WorkoutSvcSioImplTest() {
    }


    @Test
    public void testCRUD() throws Exception {
        System.out.println("Testing crud");
        System.out.println("instantiating");
        Workout workout = new Workout();
        Excercise excercise = new Excercise();
        Workout workout2 = new Workout();
        Excercise excercise2 = new Excercise();
        Workout workout3 = new Workout();
        Excercise excercise3 = new Excercise();

        System.out.println("populating");
        workout.setDate("1/28/2015");
        workout.setLength(60);
        excercise.setMinsRan(70);
        excercise.setPushups(20);
        excercise.setSitups(50);
        excercise.setSitups(100);
        excercise.setSquats(40);
        workout.add(excercise);
        
        workout2.setDate("1/29/2015");
        workout2.setLength(70);
        excercise2.setMinsRan(80);
        excercise2.setPushups(20);
        excercise2.setSitups(22);
        excercise2.setSitups(11);
        excercise2.setSquats(40);
        workout2.add(excercise2);
        
        workout3.setDate("1/30/2015");
        workout3.setLength(80);
        excercise3.setMinsRan(23);
        excercise3.setPushups(76);
        excercise3.setSitups(50);
        excercise3.setSitups(34);
        excercise3.setSquats(47);
        workout3.add(excercise3);

        IWorkoutSvc svc = new WorkoutSvcSioImpl();
        

        System.out.println("storing");
        workout = svc.store(workout);
        workout2 = svc.store(workout2);
        workout3 = svc.store(workout3);       
        
        System.out.println("retrieving");
        Workout workoutTest = new Workout();
        workoutTest = svc.retrieve("1/29/2015");
        assertSame(workoutTest, workout2);
        workoutTest = svc.retrieve("1/30/2015");
        assertSame(workoutTest, workout3);
        
        System.out.println("deleting");
        workoutTest = svc.delete(workout);
        assertNotNull(workoutTest);
        workout = svc.retrieve("1/28/2015");
        assertNull(workout);
        
        System.out.println("Test Passed");

    }
}
