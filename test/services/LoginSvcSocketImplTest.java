/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import domain.*;

/**
 *
 * @author wwanless
 */
public class LoginSvcSocketImplTest {
    
    public LoginSvcSocketImplTest() {
    }


    @Test
    public void testPass() {
        ILoginService svc = new LoginSvcSocketImpl();
        Login login = new Login();
        login.setPassword("world");
        login.setUsername("hello");
        boolean valid = false;
        
        try{
        valid = svc.authenticate(login);
        }catch(Exception ex){
           System.out.println("exception = " + ex); 
        }
        assertTrue(valid);
    }
}
