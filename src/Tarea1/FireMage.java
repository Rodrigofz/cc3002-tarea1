package Tarea1;
/*
@author: Rodrigo Fuentes
@description: The class FireMage is one of the three classes that are subclasses of the abstract
class Human, so it implements all the methods from both interfaces attacker and attackable.
 */

public class FireMage extends Humano {
    public FireMage(String name) {
        super(50, 5, name);
    }

    public void attack(Attackable attackable) {
        if (this.alive) attackable.attackedByFireMage(this);
    }

    public void attackedByKnight(Knight attacker) {
        this.hitPoints -= 1.5 * attacker.attackPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        this.hitPoints -= 2 * attacker.attackPoints;
    }

    public void attackedByPriest(Priest attacker) {
        System.out.println("FireMage doesn't receive damage");
    }

    public void attackedByGoblin(Goblin attacker) {
        this.hitPoints -= 1.5 * attacker.attackPoints;
    }

    public void attackedByUndead(Undead attacker) {

        this.hitPoints -= attacker.attackPoints;
    }

    public void attackedByIceGolem(IceGolem attacker) {
        this.hitPoints -= 2 * attacker.attackPoints;
    }

}
