import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Conducteur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conducteur implements ConducteurItf
{
    // instance variables - replace the example below with your own
    private int x;
    private List<Voiture> voitures = new ArrayList<Voiture>();

    /**
     * Constructor for objects of class Conducteur
     */
    public Conducteur()
    {
        // initialise instance variables
        x = 0;
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

    @Override
    public Boolean conduireVoiture(Voiture voiture){

        if((voiture.getType()).equals(Voiture.typeVoiture.manuelle)) {
            voiture.setConducteur((ConducteurItf) this);
            return true;
        }
        return false;
    }
    
    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }
    
    public List<Voiture> getVoiture() {
        return this.voitures;
    }
    
    public String changeModeleVoiture(String modeleAChanger, String nvxCouleur) {
        for(Voiture v : this.voitures){
            if (v.getModele().equals(modeleAChanger)) {
                v.setCouleur(nvxCouleur);
                return v.getModele();
            }
        }
        return "Le modele saisie ne correspond a aucun de vos vehicule";
    }
}
