

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The test class VoitureTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VoitureTest
{
    private Voiture voiture1;
    private Voiture voiture2;
    private Conducteur conducte1;

    /**
     * Default constructor for test class VoitureTest
     */
    public VoitureTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        List<Voiture> voitures = new ArrayList<Voiture>();
        conducte1 = new Conducteur();
        voiture1 = new Voiture();
        voiture1.setCouleur("noir");
        voiture1.setModele("BMW");
        voiture1.setConducteur(conducte1);
        voitures.add(voiture1);
        voiture2 = new Voiture();
        voiture2.setCouleur("rouge");
        voiture2.setModele("Audi");
        voiture2.setConducteur(conducte1);
        voitures.add(voiture2);
        conducte1.setVoitures(voitures);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testChangeCouleur()
    {
        Voiture voiture2 = newVoiture();
        assertEquals("audi", voiture2.changeCouleur("jaune"));
        assertEquals("jaune", voiture2.getCouleur());
        assertEquals(conducte1, voiture2.getConducteur());
    }

    @Test
    public void testChangeModele()
    {
        Voiture voiture2 = newVoiture();
        assertEquals("BMW", voiture2.changeModele("BMW"));
        assertEquals("noir", voiture2.getCouleur());
        assertEquals(conducte1, voiture2.getConducteur());
    }

    private Voiture newVoiture() {
        Voiture voiture2 = new Voiture();
        voiture2.setModele("audi");
        voiture2.setCouleur("noir");
        conducte1 = new Conducteur();
        voiture2.setConducteur(conducte1);
        return voiture2;
    }

    @Test
    public void testSetConducteur() {
        Conducteur conducte2 = new Conducteur();
        assertEquals(conducte2, voiture1.setConducteur(conducte2));
        assertNotNull(conducte2);
    }

    @Test
    public void testChangeModeleVoiture()
    {
        assertEquals("BMW", conducte1.changeModeleVoiture("BMW","bleu"));
        assertEquals("Audi", conducte1.changeModeleVoiture("Audi","vert"));
    }
}





