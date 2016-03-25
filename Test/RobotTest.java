

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * The test class RobotTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RobotTest
{
    private List<Robot> MesRobots;
    private Programmeur Einstein;

    /**
     * Default constructor for test class RobotTest
     */
    public RobotTest()
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
        MesRobots = new ArrayList<Robot>();

        MesRobots.add(new Robot(1, "Jul", "Chanteur"));
        MesRobots.add(new Robot(2, "SOX", "Danseuse"));


        Einstein = new Programmeur();

        Einstein.setRobot(MesRobots);

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
    public void TestChangerNom()
    {
        Robot MonRobot = new Robot(1, "Jul", "Chanteur");
        assertNotEquals("Jul", MonRobot.getNom());

    }



    @Test
    public void TestChangerDescription()
    {
        String description1 = "Boxeur";
        String description2 = "Twerk";

        Einstein.changerDescription(0, description1);
        assertEquals(MesRobots.get(0).getDescription(), "Boxeur");

        Einstein.changerDescription(1, description2);
        assertEquals(MesRobots.get(1).getDescription(), "Twerk");
    }

    @Test
    public void TestconduireVoiture() {
        Voiture  voiture1 = new Voiture();
        voiture1.setCouleur("noir");
        voiture1.setModele("BMW");
        voiture1.setType(Voiture.typeVoiture.automatique);
        Robot monRobot = new Robot(1, "Jul", "Chanteur");

        assertTrue(monRobot.conduireVoiture(voiture1));

    }

    @Test
    public void TestconduireVoitureFalse() {
        Voiture  voiture1 = new Voiture();
        voiture1.setCouleur("noir");
        voiture1.setModele("BMW");
        voiture1.setType(Voiture.typeVoiture.manuelle);
        Robot monRobot = new Robot(1, "Jul", "Chanteur");

        assertFalse(monRobot.conduireVoiture(voiture1));

    }

    /*@Test
    public void TestChangerDescription()
    {
        Einstein.changerDescription("Danseur");
 
    }*/
}



