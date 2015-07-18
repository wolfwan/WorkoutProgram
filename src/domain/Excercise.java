package domain;

import java.io.*;

/**
 *
 * @author wwanless
 */
public class Excercise implements Serializable {

    private int pushups = -1;
    private int situps = -1;
    private int squats = -1;
    private int minsRan = -1; //# of minutes ran

    @Override
    public String toString() {
        return "pushups: " + pushups + ", situps: " + situps + ", minsRan: " + minsRan;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Excercise)) {
            return false;
        }
        Excercise excercise = (Excercise) obj;
        if (pushups != excercise.pushups) {
            return false;
        }
        if (situps != excercise.situps) {
            return false;
        }
        if (squats != excercise.squats) {
            return false;
        }
        if (minsRan != excercise.minsRan) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validate() {
        if (pushups == -1) {
            return false;
        } else if (situps == -1) {
            return false;
        } else if (squats == -1) {
            return false;
        } else if (minsRan == -1) {
            return false;
        }
        return true;
    }

    /**
     * @return the pushups
     */
    public int getPushups() {
        return pushups;
    }

    /**
     * @param pushups the pushups to set
     */
    public void setPushups(int pushups) {
        this.pushups = pushups;
    }

    /**
     * @return the situps
     */
    public int getSitups() {
        return situps;
    }

    /**
     * @param situps the situps to set
     */
    public void setSitups(int situps) {
        this.situps = situps;
    }

    /**
     * @return the squats
     */
    public int getSquats() {
        return squats;
    }

    /**
     * @param squats the squats to set
     */
    public void setSquats(int squats) {
        this.squats = squats;
    }

    /**
     * @return the minsRan
     */
    public int getMinsRan() {
        return minsRan;
    }

    /**
     * @param minsRan the minsRan to set
     */
    public void setMinsRan(int minsRan) {
        this.minsRan = minsRan;
    }
}