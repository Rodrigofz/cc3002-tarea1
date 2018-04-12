package test;

import org.junit.Before;

//Import attackers
import Tarea1.Knight;
import Tarea1.FireMage;
import Tarea1.Priest;
import Tarea1.Goblin;
import Tarea1.IceGolem;
import Tarea1.Undead;


//Import attackables
import Tarea1.Rock;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class RockTest {
    //Rock
    protected Rock rock;

    //Attackers
    protected Knight knight;
    protected FireMage fireMage;
    protected Priest priest;
    protected Goblin goblin;
    protected IceGolem iceGolem;
    protected Undead undead;

    @Before
    public void setUp(){
        //Practice dummy
        rock = new Rock();

        //Attackers
        knight = new Knight("Pepe");
        fireMage = new FireMage("Alexander");
        priest = new Priest("Juan Pablo");
        goblin = new Goblin();
        iceGolem = new IceGolem();
        undead = new Undead();
    }

    @Test
    public void attackedByKnightTest(){
        double expected = 65;
        //Knight attacks rock
        knight.attack(rock);
        rock.status();
        //The knight losses life
        assertEquals(expected, knight.getHP());
    }

    @Test
    public void attackedByPriestTest(){
        double expected = 39;
        //Priest attacks rock
        priest.attack(rock);
        //The priest losses life
        assertEquals(expected, priest.getHP());
    }

    @Test
    public void attackedByFireMagetTest(){
        double expected = 45;
        //FireMage attacks rock
        fireMage.attack(rock);
        //The fireMage losses life
        assertEquals(expected, fireMage.getHP());
    }

    @Test
    public void attackedByUndeadTest(){
        double expected = 30;
        //Undead attacks rock
        undead.attack(rock);
        //Nothing happens
        assertEquals(expected, undead.getHP());
    }

    @Test
    public void attackedByGoblinTest(){
        double expected = 40;
        //Goblin attacks rock
        goblin.attack(rock);
        //Nothing happens
        assertEquals(expected, goblin.getHP());
    }

    @Test
    public void attackedByIceGolemTest(){
        double expected = 90;
        //IceGolem attacks rock
        iceGolem.attack(rock);
        //Nothing happens
        assertEquals(expected, iceGolem.getHP());
    }
}
