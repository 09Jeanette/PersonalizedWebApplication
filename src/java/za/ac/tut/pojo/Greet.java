/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pojo;

/**
 *
 * @author Jeanette
 */
public class Greet {
    
     public String greet(String gender) {
       
        String title = "";
        
        if(gender.equals("F"))
        {
            title = "Ms";
        }
        else
        {
            title = "Mr";
        }
        
        return title;
    }
    
}
