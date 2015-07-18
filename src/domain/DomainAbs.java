/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.*;

/**
 *
 * @author wwanless
 */
public abstract class DomainAbs implements Serializable{
    
    private int id;
    
    
    public boolean validate(){
        if (id < 0)return false; 
        return true;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof DomainAbs)){
            return false;
        }
        
        DomainAbs da = (DomainAbs)obj;
        
        if(id != da.id){
            return false;
        }
        return true;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
