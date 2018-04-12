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


public class KnightTest {
    protected Knight knightA;
    protected Knight knightB;
    protected FireMage fireMage;
    protected Priest priest;
    protected Goblin goblin;
    protected IceGolem iceGolem;
    protected Undead undead;

    @Before
    public void setUp(){
        //Practice dummy
        knightA = new Knight("Byron");

        //Attackers
        knightB = new Knight("Pepe");
        fireMage = new FireMage("Alexander");
        priest = new Priest("Juan Pablo");
        goblin = new Goblin();
        iceGolem = new IceGolem();
        undead = new Undead();
    }

    @Test
    public void noNullTest(){
        assertNotNull(knightA.getName());
        assertNotNull(knightA.isAlive());
    }

    @Test
    public void initialValuesTest(){
        double expectedHP = 70;
        assertEquals(expectedHP, knightA.getHP());
        assertEquals(expectedHP, knightA.getMaxHP());
        double expectedAP = 5;
        assertEquals(expectedAP, knightA.getAP());
        String expectedName = "Byron";
        assertEquals(expectedName, knightA.getName());
        assertTrue(knightA.isAlive());
    }

    @Test
    public void attackedByKnightTest(){
        //knightB attacks knightA
        knightB.attack(knightA);
        knightA.status();
        //After the attack, knightA's HP get lower
        double expectedHP = 65;
        assertEquals(expectedHP, knightA.getHP());
    }

    @Test
    public void attackedByPriestTest(){
        //priest attacks knightA
        priest.attack(knightA);
        //After the attack, knightA's HP get lower
        double expectedHP = 70;
        assertEquals(expectedHP, knightA.getHP());
    }

    @Test
    public void attackedByFireMagetTest(){
        //fireMage attacks knightA
        fireMage.attack(knightA);
        //After the attack, knightA's HP get lower
        double expectedHP = 60;
        assertEquals(expectedHP, knightA.getHP());
    }

    @Test
    public void attackedByUndeadTest(){
        //undead attacks knightA
        undead.attack(knightA);
        //After the attack, knightA's HP get lower
        double expectedHP = 63;
        assertEquals(expectedHP, knightA.getHP());
    }

    @Test
    public void attackedByGoblinTest(){
        //knightB attacks knightA
        goblin.attack(knightA);
        //After the attack, knightA's HP get lower
        double expectedHP = 68;
        assertEquals(expectedHP, knightA.getHP());
    }

    @Test
    public void attackedByIceGolemTest(){
        //knightB attacks knightA
        iceGolem.attack(knightA);
        //After the attack, knightA's HP get lower
        double expectedHP = 67;
        assertEquals(expectedHP, knightA.getHP());
    }

}
