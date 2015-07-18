/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import domain.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author wwanless
 */
public class WorkoutSvcSioImpl implements IWorkoutSvc {

    private List<Workout> workouts = new ArrayList<Workout>();
    private static final String FILENAME = "workouts.sio";

    public void WorkoutSvcSIOImpl() {
        readFile();

    }

    private void readFile() {
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(FILENAME));
            workouts = (List<Workout>) ois.readObject();
            ois.close();

        } catch (Exception e) { //exceptions need to be defined declared thrown and caught
            workouts = new ArrayList<Workout>();
            System.out.println("file read error");
        }
    }

    private void writeFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME));
            oos.writeObject(workouts);
            oos.close();

        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
            System.out.println("file write error");

        }
    }

    @Override
    public Workout store(Workout workout) throws ServiceException {
        try {
            workouts.add(workout);
            writeFile();
            return workout;
        } catch (Exception e) {
            System.out.println("error on service layer");
            throw new ServiceException(e.getMessage());
        }
        /*
        FileOutputStream fos = new FileOutputStream(FILENAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(workout);
        oos.flush();
        oos.close();
        fos.close();
        return workout;
         */

    }

    @Override
    public Workout retrieve(String name) throws ServiceException {
        try {
            //search for the item with "name" in the cache
            readFile();
            for (int i = 0; i < workouts.size(); i++) {
                Workout workout = workouts.get(i);
                if (workout.getDate().equals(name)) {
                    return workout;
                }
            }
            return null;
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }
    /*
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME));
    workout = (Workout) ois.readObject();
    ois.close();
    return workout;
     */

    @Override
    public Workout update(Workout workout) throws ServiceException {
        readFile();
        for (int i = 0; i < workouts.size(); i++) {
            Workout w = workouts.get(i);
            if (w.equals(workout)) {
                workouts.remove(i);
                workouts.add(workout);
                writeFile();
                return workout;
            }
        }
        throw new ServiceException("not implemented");
        //return workout;
    }

    @Override
    public Workout delete(Workout workout) throws ServiceException {
        readFile();
        for (int i = 0; i < workouts.size(); i++) {
            Workout w = workouts.get(i);
            if (w.equals(workout)) {
                workouts.remove(i);
                writeFile();
                return workout;
            }
        }
        throw new ServiceException("not implemented");
    }

    @Override
    public List<Workout> getAll() throws ServiceException {
        return workouts;
    }
}
