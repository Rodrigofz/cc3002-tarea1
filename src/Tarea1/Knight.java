package Tarea1;
/*
@author: Rodrigo Fuentes
@description: The class Knight is one of the three classes that are subclasses of the abstract
class Human, so it implements all the methods from both interfaces attacker and attackable.
 */

public class Knight extends Humano {


    public Knight(String name) {
        /*
        @description Constructor of the class. Uses the human constructor.
        @param String name
         */
        super(70, 5, name);
    }

    public void attack(Attackable attackable) {
        /*
        @description Method used to attack other Attackable
        @param Attackable attackable
         */
        if (this.alive) attackable.attackedByKnight(this);
    }

    public void attackedByKnight(Knight attacker) {
        /*
        @description Method used when attacked by a knight
        @param Knight attacker
         */
        this.hitPoints -= attacker.attackPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        /*
        @description Method used when attacked by a fireMage
        @param FireMage attacker
         */
        this.hitPoints -= 2 * attacker.attackPoints;
    }

    public void attackedByPriest(Priest attacker) {
        /*
        @description Method used when attacked by a priest
        @param Priest attacker
         */
        System.out.println("Knight doesn't receive damage");
    }

    public void attackedByGoblin(Goblin attacker) {
        /*
        @description Method used when attacked by a goblin
        @param Goblin attacker
         */
        this.hitPoints -= 0.5 * attacker.attackPoints;
    }

    public void attackedByUndead(Undead attacker) {
        /*
        @description Method used when attacked by an undead
        @param Undead attacker
         */
        this.hitPoints -= attacker.attackPoints;
    }

    public void attackedByIceGolem(IceGolem attacker) {
        /*
        @description Method used when attacked by an ice Golem
        @param IceGolem attacker
         */
        this.hitPoints -= 1.5 * attacker.attackPoints;
    }

}
