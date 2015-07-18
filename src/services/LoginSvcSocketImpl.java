/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.net.*;
import java.io.*;
import domain.*;


/**
 *
 * @author wwanless
 */
public class LoginSvcSocketImpl implements ILoginService {

    
    @Override
    public boolean authenticate(Login login) {
        System.out.println("lets send some credents");
        try {
            InetAddress address = InetAddress.getLocalHost();
            int socketNumber = 8000;
            Socket socket = new Socket(address, socketNumber); //just repeats wating for a connection request
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            String sentLogin = login.toString();
            oos.writeObject(sentLogin);
            oos.flush();
            Boolean valid = (Boolean) ois.readObject();
            System.out.println(valid);
            socket.close();
            return valid;
        } catch (Exception ex) {
            System.out.println("LoginImpl authenticate exception: " + ex.getMessage());
            return false;
            
        }
    }
}
