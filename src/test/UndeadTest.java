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


public class UndeadTest {
    protected Undead undeadA;

    protected Knight knight;
    protected FireMage fireMage;
    protected Priest priest;
    protected Goblin goblin;
    protected IceGolem iceGolem;
    protected Undead undeadB;

    @Before
    public void setUp(){
        //Practice dummy
        undeadA = new Undead();

        //Attackers
        knight = new Knight("Pepe");
        fireMage = new FireMage("Alexander");
        priest = new Priest("Juan Pablo");
        goblin = new Goblin();
        iceGolem = new IceGolem();
        undeadB = new Undead();
    }

    @Test
    public void noNullTest(){
        assertNotNull(undeadA.isAlive());
    }

    @Test
    public void initialValuesTest(){
        double expectedHP = 30;
        assertEquals(expectedHP, undeadA.getHP());
        assertEquals(expectedHP, undeadA.getMaxHP());
        double expectedAP = 7;
        assertEquals(expectedAP, undeadA.getAP());
        assertTrue(undeadA.isAlive());
    }

    @Test
    public void attackedByKnightTest(){
        //knight attacks undeadA
        knight.attack(undeadA);
        undeadA.status();
        //After the attack, knightA's HP get lower
        double expectedHP = 25;
        assertEquals(expectedHP, undeadA.getHP());
    }

    @Test
    public void attackedByPriestTest(){
        //priest attacks undeadA
        priest.attack(undeadA);
        //After the attack, undeadA's HP get lower
        double expectedHP = 0;
        assertEquals(expectedHP, undeadA.getHP());
    }

    @Test
    public void attackedByFireMagetTest(){
        //fireMage attacks undeadA
        fireMage.attack(undeadA);
        //After the attack, undeadA's HP get lower
        double expectedHP = 27.5;
        assertEquals(expectedHP, undeadA.getHP());
    }

    @Test
    public void attackedByUndeadTest(){
        //undeadB attacks undeadA
        undeadB.attack(undeadA);
        //After the attack, undeadA's HP get lower
        double expectedHP = 30;
        assertEquals(expectedHP, undeadA.getHP());
    }

    @Test
    public void attackedByGoblinTest(){
        //goblin attacks undeadA
        goblin.attack(undeadA);
        //After the attack, knightA's HP get lower
        double expectedHP = 30;
        assertEquals(expectedHP, undeadA.getHP());
    }

    @Test
    public void attackedByIceGolemTest(){
        //iceGolem attacks undeadA
        iceGolem.attack(undeadA);
        //After the attack, knightA's HP get lower
        double expectedHP = 26;
        assertEquals(expectedHP, undeadA.getHP());
    }

}
