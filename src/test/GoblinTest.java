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


public class GoblinTest {
    protected Goblin goblinA;

    protected Knight knight;
    protected FireMage fireMage;
    protected Priest priest;
    protected Goblin goblinB;
    protected IceGolem iceGolem;
    protected Undead undead;

    @Before
    public void setUp(){
        //Practice dummy
        goblinA = new Goblin();

        //Attackers
        knight = new Knight("Pepe");
        fireMage = new FireMage("Alexander");
        priest = new Priest("Juan Pablo");
        goblinB = new Goblin();
        iceGolem = new IceGolem();
        undead = new Undead();
    }

    @Test
    public void noNullTest(){
        assertNotNull(goblinA.isAlive());

    }

    @Test
    public void initialValuesTest(){
        double expectedHP = 40;
        assertEquals(expectedHP, goblinA.getHP());
        assertEquals(expectedHP, goblinA.getMaxHP());
        double expectedAP = 4;
        assertEquals(expectedAP, goblinA.getAP());
        assertTrue(goblinA.isAlive());
    }

    @Test
    public void attackedByKnightTest(){
        //knight attacks goblinA
        knight.attack(goblinA);
        goblinA.status();
        //After the attack, goblinA's HP get lower
        double expectedHP = 33.75;
        assertEquals(expectedHP, goblinA.getHP());
    }

    @Test
    public void attackedByPriestTest(){
        //priest attacks goblinA
        priest.attack(goblinA);
        //After the attack, goblinA's HP get lower
        double expectedHP = 40;
        assertEquals(expectedHP, goblinA.getHP());
    }

    @Test
    public void attackedByFireMagetTest(){
        //fireMage attacks goblinA
        fireMage.attack(goblinA);
        //After the attack, goblinA's HP get lower
        double expectedHP = 30;
        assertEquals(expectedHP, goblinA.getHP());
    }

    @Test
    public void attackedByUndeadTest(){
        //undead attacks goblinA
        undead.attack(goblinA);
        //After the attack, goblinA's HP get lower
        double expectedHP = 33;
        assertEquals(expectedHP, goblinA.getHP());
    }

    @Test
    public void attackedByGoblinTest(){
        //goblinB attacks goblinA
        goblinB.attack(goblinA);
        //After the attack, goblinA's HP get lower
        double expectedHP = 40;
        assertEquals(expectedHP, goblinA.getHP());
    }

    @Test
    public void attackedByIceGolemTest(){
        //iceGolem attacks goblinA
        iceGolem.attack(goblinA);
        //After the attack, goblinA's HP get lower
        double expectedHP = 36;
        assertEquals(expectedHP, goblinA.getHP());
    }

}
