package Tarea1;
/*
@author: Rodrigo Fuentes
@description: The class Priest is one of the three classes that are subclasses of the abstract
class Human, so it implements all the methods from both interfaces attacker and attackable.
 */

public class Priest extends Humano {
    public Priest(String name) {
        /*
        @description Constructor of the class. Uses the Human constructor.
        @param String name
         */
        super(45, 6, name);
    }

    public void attack(Attackable attackable) {
        /*
        @description Method used to attack other Attackable
        @param Attackable attackable
         */
        if (this.alive) attackable.attackedByPriest(this);
    }

    public void attackedByKnight(Knight attacker) {
        /*
        @description Method used when attacked by a knight
        @param Knight attacker
         */
        System.out.println("Priest doesn't receive damage");
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
        System.out.println("Priest doesn't receive damage");
    }

    public void attackedByGoblin(Goblin attacker) {
         /*
        @description Method used when attacked by a goblin
        @param Goblin attacker
         */
        this.hitPoints -= attacker.attackPoints;
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
        this.hitPoints -= 2 * attacker.attackPoints;
    }

}
