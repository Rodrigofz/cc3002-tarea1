package test;

import Tarea1.*;
import org.junit.Before;

//Import attackers


//Import attackables

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FruitTreeTest {
    //Rock
    protected FruitTree fruitTree;

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
        fruitTree = new FruitTree();

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
        //Knight needs to lose life
        for (int i=0; i<3; i++){
            fireMage.attack(knight);
        }

        //Expected life after recovering
        double expected = 61;
        //Knight attacks fruitTree
        knight.attack(fruitTree);
        fruitTree.status();
        //The knight recovers life
        assertEquals(expected, knight.getHP());
    }

    @Test
    public void attackedByPriestTest(){
        //Priest needs to lose life
        for (int i=0; i<2; i++){
            fireMage.attack(priest);
        }

        double expected = 38.5;
        //Priest attacks fruitTree
        priest.attack(fruitTree);
        //The priest recovers life
        assertEquals(expected, priest.getHP());
    }

    @Test
    public void attackedByFireMagetTest(){
        //FireMage needs to lose life
        for (int i=0; i<2; i++){
            fireMage.attack(fireMage);
        }

        double expected = 45;
        //FireMage attacks fruitTree
        fireMage.attack(fruitTree);
        //The fireMage recovers life
        assertEquals(expected, fireMage.getHP());
    }

    @Test
    public void attackedByUndeadTest(){
        double expected = 30;
        //Undead attacks fruitTree
        undead.attack(fruitTree);
        //Nothing happens
        assertEquals(expected, undead.getHP());
    }

    @Test
    public void attackedByGoblinTest(){
        //Goblin needs to lose life
        for (int i=0; i<2; i++){
            fireMage.attack(goblin);
        }

        double expected = 26;
        //Goblin attacks fruitTree
        goblin.attack(fruitTree);
        //The goblin recovers life
        assertEquals(expected, goblin.getHP());
    }

    @Test
    public void attackedByIceGolemTest(){
        double expected = 90;
        //IceGolem attacks fruitTree
        iceGolem.attack(fruitTree);
        //Nothing happens
        assertEquals(expected, iceGolem.getHP());
    }
}
