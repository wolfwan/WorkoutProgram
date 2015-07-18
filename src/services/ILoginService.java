/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import domain.*;
/**
 *
 * @author wwanless
 */
public interface ILoginService extends IService{
    
    public final String NAME = "ILoginService";
    
    public boolean authenticate(Login login) throws ServiceException; 
    
    
}
