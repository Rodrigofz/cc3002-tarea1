package Tarea1;
/*
@author Rodrigo Fuentes
@description: FruitTree is one of the entities that is attackable but not attacker. Because of this, it
implements the attackedBy____(attacker) methods, but not attack(attackable). It can report it's, but
it's not really interesting.
 */

public class FruitTree implements Attackable {

    public void status() {
        System.out.println("Class: FruitTree");
        System.out.println("Fruit count: A lot \n");
    }

    public void attackedByKnight(Knight attacker) {
        attacker.hitPoints = (attacker.hitPoints + 0.3 * attacker.maxHitPoints > attacker.maxHitPoints) ? attacker.maxHitPoints : attacker.hitPoints + 0.3 * attacker.maxHitPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        attacker.hitPoints = (attacker.hitPoints + 0.3 * attacker.maxHitPoints > attacker.maxHitPoints) ? attacker.maxHitPoints : attacker.hitPoints + 0.3 * attacker.maxHitPoints;
    }

    public void attackedByPriest(Priest attacker) {
        attacker.hitPoints = (attacker.hitPoints + 0.3 * attacker.maxHitPoints > attacker.maxHitPoints) ? attacker.maxHitPoints : attacker.hitPoints + 0.3 * attacker.maxHitPoints;
    }

    public void attackedByGoblin(Goblin attacker) {
        attacker.hitPoints = (attacker.hitPoints + 0.15 * attacker.maxHitPoints > attacker.maxHitPoints) ? attacker.maxHitPoints : attacker.hitPoints + 0.15 * attacker.maxHitPoints;
    }

    public void attackedByUndead(Undead attacker) {
        System.out.println("Nothing happens");
    }

    public void attackedByIceGolem(IceGolem attacker) {
        System.out.println("Nothing happens");
    }

}