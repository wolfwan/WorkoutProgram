/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import domain.*;
import services.*;
import java.util.*;

/**
 *
 * @author wwanless
 */
public class WorkoutMgr extends ManagerAbs {

    private IWorkoutSvc workoutSvc;

    public WorkoutMgr() throws Exception{
         workoutSvc = (IWorkoutSvc)factory.getService(IWorkoutSvc.NAME);
    }

    public Workout create(Workout w) throws ServiceException {
        return workoutSvc.store(w);

    }

    public Workout retrieve (String date) throws ServiceException {
        return workoutSvc.retrieve(date);

    }

    public Workout delete (Workout w) throws ServiceException {
        return workoutSvc.delete(w);
        //return factory.getWorkoutSvc().delete(w);

    }

    public List<Workout> retrieveAll() throws ServiceException {

        return workoutSvc.getAll();

    }

}
