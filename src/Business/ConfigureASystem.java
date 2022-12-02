/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author riyavirani
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        //Creating Ecosystem
        EcoSystem business = EcoSystem.getInstance();
        Person person = null;
        //Creating sysadmin user account
        UserAccount sysAdmin = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());       
        return business;
    }
}
