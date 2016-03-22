import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

/**
 * Write a description of class Programmeur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Programmeur
{
    // instance variables - replace the example below with your own
    private int x;
    private List<Robot> mesRobots;

    /**
     * Constructor for objects of class Programmeur
     */
    public Programmeur()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     *
     * @param x
     * @param d
     */
    public void changerDescription(int x, String d){

        this.mesRobots.get(x).setDescription(d);
    }

    /**
     * Accesseur affecter un programmeur à une liste de robot
     * @param MesRobots
     */
    public void setRobot(List<Robot> MesRobots){
        this.mesRobots=MesRobots;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
