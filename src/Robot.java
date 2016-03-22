
/**
 * Write a description of class Robot here.
 * Notre robot est un vrai chanteur, il triche mais il chante bien
 * @author Yoan Dunoyer & Saadi Kadri
 * @version 1
 */

import java.lang.*;
import java.io.File;
import java.io.IOException;
import java.lang.String;

public class Robot
{
    // instance variables - replace the example below with your own
    private int idRobot;  
    private String nom;
    private String description;

    /**
     * Constructor for objects of class Robot
     */
    public Robot(int idRobot, String nom, String description)
    {
        // initialise instance variables
        idRobot=idRobot;
        nom=nom;
        description=description;

    }

    public int getIdRobot(){
        return this.idRobot; 
    }
    
     public void setIdRobot(int i){
        this.idRobot=i; 
    }
    
     public void setNom(String nom){
         this.nom=nom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
     public void setDescription(String d){
         this.description=d;
    }
    
      public String getDescription(){
        return this.description;
    }
  
    public void chanter()
    {
        System.out.println("Je chante tu chantes avec moiiiiiiiiiiiiiii");
    }
}
