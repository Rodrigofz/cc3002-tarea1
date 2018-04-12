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

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;


public class PriesTest {
    protected Priest priestA;

    protected Knight knight;
    protected FireMage fireMage;
    protected Priest priestB;
    protected Goblin goblin;
    protected IceGolem iceGolem;
    protected Undead undead;

    @Before
    public void setUp(){
        //Practice dummy
        priestA = new Priest("Byron");

        //Attackers
        knight = new Knight("Pepe");
        fireMage = new FireMage("Alexander");
        priestB = new Priest("Juan Pablo");
        goblin = new Goblin();
        iceGolem = new IceGolem();
        undead = new Undead();
    }

    @Test
    public void noNullTest(){
        assertNotNull(priestA.getName());
        assertNotNull(priestA.isAlive());
    }

    @Test
    public void initialValuesTest(){
        double expectedHP = 45;
        assertEquals(expectedHP, priestA.getHP());
        assertEquals(expectedHP, priestA.getMaxHP());
        double expectedAP = 6;
        assertEquals(expectedAP, priestA.getAP());
        String expectedName = "Byron";
        assertEquals(expectedName, priestA.getName());
        assertTrue(priestA.isAlive());
    }

    @Test
    public void attackedByKnightTest(){
        //knight attacks priestA
        knight.attack(priestA);
        //After the attack, knightA's HP get lower
        double expectedHP = 45;
        assertEquals(expectedHP, priestA.getHP());
    }

    @Test
    public void attackedByPriestTest(){
        //priestB attacks priestA
        priestB.attack(priestA);
        //After the attack, priestA's HP get lower
        double expectedHP = 45;
        assertEquals(expectedHP, priestA.getHP());
    }

    @Test
    public void attackedByFireMagetTest(){
        //fireMage attacks priestA
        fireMage.attack(priestA);
        //After the attack, priestA's HP get lower
        double expectedHP = 35;
        assertEquals(expectedHP, priestA.getHP());
    }

    @Test
    public void attackedByUndeadTest(){
        //undead attacks priestA
        undead.attack(priestA);
        //After the attack, priestA's HP get lower
        double expectedHP = 38;
        assertEquals(expectedHP, priestA.getHP());
    }

    @Test
    public void attackedByGoblinTest(){
        //goblin attacks priestA
        goblin.attack(priestA);
        //After the attack, priestA's HP get lower
        double expectedHP = 41;
        assertEquals(expectedHP, priestA.getHP());
    }

    @Test
    public void attackedByIceGolemTest(){
        //iceGolem attacks priestA
        iceGolem.attack(priestA);
        //After the attack, priestA's HP get lower
        double expectedHP = 41;
        assertEquals(expectedHP, priestA.getHP());
    }

}
