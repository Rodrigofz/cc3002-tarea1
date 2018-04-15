package Tarea1;
/*
@author: Rodrigo Fuentes
@description: The class Priest is one of the three classes that are subclasses of the abstract
class Human, so it implements all the methods from both interfaces attacker and attackable.
 */

public class Priest extends Humano {
    public Priest(String name) {
        super(45, 6, name);
    }

    public void attack(Attackable attackable) {
        if (this.alive) attackable.attackedByPriest(this);
    }

    public void attackedByKnight(Knight attacker) {
        System.out.println("Priest doesn't receive damage");
    }

    public void attackedByFireMage(FireMage attacker) {
        this.hitPoints -= 2 * attacker.attackPoints;
    }

    public void attackedByPriest(Priest attacker) {
        System.out.println("Priest doesn't receive damage");
    }

    public void attackedByGoblin(Goblin attacker) {
        this.hitPoints -= attacker.attackPoints;
    }

    public void attackedByUndead(Undead attacker) {
        this.hitPoints -= attacker.attackPoints;
    }

    public void attackedByIceGolem(IceGolem attacker) {
        this.hitPoints -= 2 * attacker.attackPoints;
    }

}
