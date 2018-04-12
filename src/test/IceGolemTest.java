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


public class IceGolemTest {
    protected IceGolem iceGolemA;

    protected Knight knight;
    protected FireMage fireMage;
    protected Priest priest;
    protected Goblin goblin;
    protected IceGolem iceGolemB;
    protected Undead undead;

    @Before
    public void setUp(){
        //Practice dummy
        iceGolemA = new IceGolem();

        //Attackers
        knight = new Knight("Pepe");
        fireMage = new FireMage("Alexander");
        priest = new Priest("Juan Pablo");
        goblin = new Goblin();
        iceGolemB = new IceGolem();
        undead = new Undead();
    }

    @Test
    public void noNullTest(){
        assertNotNull(iceGolemA.isAlive());
    }

    @Test
    public void initialValuesTest(){
        double expectedHP = 90;
        assertEquals(expectedHP, iceGolemA.getHP());
        assertEquals(expectedHP, iceGolemA.getMaxHP());
        double expectedAP = 2;
        assertEquals(expectedAP, iceGolemA.getAP());
        assertTrue(iceGolemA.isAlive());
    }

    @Test
    public void attackedByKnightTest(){
        //knight attacks iceGolemA
        knight.attack(iceGolemA);
        iceGolemA.status();
        //After the attack, iceGolemA's HP get lower
        double expectedHP = 87.5;
        assertEquals(expectedHP, iceGolemA.getHP());
    }

    @Test
    public void attackedByPriestTest(){
        //priest attacks iceGolemA
        priest.attack(iceGolemA);
        //After the attack, iceGolemA's HP get lower
        double expectedHP = 90;
        assertEquals(expectedHP, iceGolemA.getHP());
    }

    @Test
    public void attackedByFireMagetTest(){
        //fireMage attacks iceGolemA
        fireMage.attack(iceGolemA);
        //After the attack, iceGolemA's HP get lower
        double expectedHP = 65;
        assertEquals(expectedHP, iceGolemA.getHP());
    }

    @Test
    public void attackedByUndeadTest(){
        //undead attacks iceGolemA
        undead.attack(iceGolemA);
        //After the attack, iceGolemA's HP get lower
        double expectedHP = 90;
        assertEquals(expectedHP, iceGolemA.getHP());
    }

    @Test
    public void attackedByGoblinTest(){
        //goblin attacks iceGolemA
        goblin.attack(iceGolemA);
        //After the attack, iceGolemA's HP get lower
        double expectedHP = 90;
        assertEquals(expectedHP, iceGolemA.getHP());
    }

    @Test
    public void attackedByIceGolemTest(){
        //iceGolemB attacks iceGolemA
        iceGolemB.attack(iceGolemA);
        //After the attack, iceGolemA's HP get lower
        double expectedHP = 88;
        assertEquals(expectedHP, iceGolemA.getHP());
    }

}
