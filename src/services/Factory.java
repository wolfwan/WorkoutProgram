/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.*;
import java.io.*;

/**
 *
 * @author wwanless
 */
public class Factory {

    public IWorkoutSvc getWorkoutSvc() {

        return new WorkoutSvcSioImpl();

    }
    


    public IService getService(String serviceName) throws Exception {

        
        String implName = getImplName(serviceName);
        Class c = Class.forName(implName); //dynamically loads the class @runtime
        return (IService) c.newInstance();

    }

    private String getImplName(String serviceName) throws Exception {

        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("Factory.properties");
        props.load(fis);
        fis.close();
        return props.getProperty(serviceName);

    }
}
