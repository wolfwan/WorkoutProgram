package domain;

import java.util.*;


/**
 *
 * @author wwanless
 */
public class Workout extends DomainAbs  {

    private String date = "";
    private int length = -1;
    private List<Excercise> exercises = new ArrayList();
    

    public void add(Excercise exercise) {
        exercises.add(exercise);
    }

    public List getExercises() {
        return exercises;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", length: " + getLength() + ", exercises: " + exercises + ".";
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Workout)) {
            return false;
        }
        Workout workout = (Workout) obj;
        
        if (!date.equals(workout.date)) {
            return false;
        }
        if (length != workout.length) {
            return false;
        }

        if (exercises.size() != workout.exercises.size()) {
            return false;
        }

        for (int i = 0; i < exercises.size(); i++) {
            if (!exercises.get(i).equals(workout.exercises.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean validate() {
        
        if ("".equals(date)) {
            return false;
        }
        if (length == -1) {
            return false;
        }
        //if (exercises.isEmpty() == true) {
           // return false;
        //}
        if(!super.validate()){
            return false;
        }
        return true;


    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }


}
