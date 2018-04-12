package test;

import junit.framework.TestCase;
import org.junit.Before;

//Import attackers
import Tarea1.Knight;
import Tarea1.FireMage;
import Tarea1.Priest;
import Tarea1.Goblin;
import Tarea1.IceGolem;
import Tarea1.Undead;


//Import attackables
import Tarea1.FruitTree;
import Tarea1.Rock;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;


public class FireMageTest {
    protected FireMage fireMageA;

    protected Knight knight;
    protected FireMage fireMageB;
    protected Priest priest;
    protected Goblin goblin;
    protected IceGolem iceGolem;
    protected Undead undead;

    @Before
    public void setUp(){
        //Practice dummy
        fireMageA = new FireMage("Byron");

        //Attackers
        knight = new Knight("Pepe");
        fireMageB = new FireMage("Alexander");
        priest = new Priest("Juan Pablo");
        goblin = new Goblin();
        iceGolem = new IceGolem();
        undead = new Undead();
    }

    @Test
    public void noNullTest(){
        assertNotNull(fireMageA.getName());
        assertNotNull(fireMageA.isAlive());
    }

    @Test
    public void initialValuesTest(){
        double expectedHP = 50;
        assertEquals(expectedHP, fireMageA.getHP());
        assertEquals(expectedHP, fireMageA.getMaxHP());
        double expectedAP = 5;
        assertEquals(expectedAP, fireMageA.getAP());
        String expectedName = "Byron";
        assertEquals(expectedName, fireMageA.getName());
        assertTrue(fireMageA.isAlive());
    }

    @Test
    public void attackedByKnightTest(){
        //knight attacks fireMageA
        knight.attack(fireMageA);
        //After the attack, firemageA's HP get lower
        double expectedHP = 42.5;
        assertEquals(expectedHP, fireMageA.getHP());
    }

    @Test
    public void attackedByPriestTest(){
        //priest attacks fireMageA
        priest.attack(fireMageA);
        //After the attack, fireMage's HP get lower
        double expectedHP = 50;
        assertEquals(expectedHP, fireMageA.getHP());
    }

    @Test
    public void attackedByFireMagetTest(){
        //fireMageB attacks fireMageA
        fireMageB.attack(fireMageA);
        //After the attack, fireMageA's HP get lower
        double expectedHP = 40;
        assertEquals(expectedHP, fireMageA.getHP());
    }

    @Test
    public void attackedByUndeadTest(){
        //undead attacks knightA
        undead.attack(fireMageA);
        //After the attack, knightA's HP get lower
        double expectedHP = 43;
        assertEquals(expectedHP, fireMageA.getHP());
    }

    @Test
    public void attackedByGoblinTest(){
        //goblin attacks fireMageA
        goblin.attack(fireMageA);
        //After the attack, fireMageA's HP get lower
        double expectedHP = 44;
        assertEquals(expectedHP, fireMageA.getHP());
    }

    @Test
    public void attackedByIceGolemTest(){
        //iceGolem attacks fireMageA
        iceGolem.attack(fireMageA);
        //After the attack, fireMageA's HP get lower
        double expectedHP = 46;
        assertEquals(expectedHP, fireMageA.getHP());
    }

}
