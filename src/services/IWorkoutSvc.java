/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import domain.*;
import java.util.*;

/**
 *
 * @author wwanless
 */
public interface IWorkoutSvc extends IService{
    
    public final String NAME = "IWorkoutSvc";

    public Workout store(Workout workout) throws ServiceException;

    public Workout retrieve(String name) throws ServiceException;
    
    public Workout update(Workout workout) throws ServiceException;
    
    public Workout delete(Workout workout) throws ServiceException;
    
    public List<Workout> getAll() throws ServiceException;
}
