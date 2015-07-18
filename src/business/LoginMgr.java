/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import domain.*;
import services.*;

/**
 *
 * @author wwanless
 */
public class LoginMgr extends ManagerAbs{

    private ILoginService loginService;

    public LoginMgr() throws Exception{
        loginService = (ILoginService)factory.getService(ILoginService.NAME);
    }

    public boolean authenticate(Login login) throws ServiceException {

       return loginService.authenticate(login);
    
    }
}
