/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.UserHelper;
import pojos.User;

/**
 *
 * @author Ren
 */
public class testUser1 {
    public static void main(String[] args) {
        UserHelper helper = new UserHelper();
        User cari = helper.cariUser("puspa@usd.ac.id");
        String pass = cari.getPassword();
        System.out.println("Password:"+pass);
        
        
    }
}
