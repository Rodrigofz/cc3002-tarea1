package Tarea1;
/*
@author Rodrigo Fuentes
@description: FruitTree is one of the entities that is attackable but not attacker. Because of this, it
implements the attackedBy____(attacker) methods, but not attack(attackable). It can report it's, but
it's not really interesting.
 */

public class FruitTree implements Attackable {

    public void status() {
        /*
        @description: Prints to the console the status of the object
         */
        System.out.println("Class: FruitTree");
        System.out.println("Fruit count: A lot \n");
    }

    public void attackedByKnight(Knight attacker) {
        /*
        @description: Called when the class is attacked by a knight. In this case, it restores knight's
        life
        @param Knight
         */
        attacker.hitPoints = (attacker.hitPoints + 0.3 * attacker.maxHitPoints > attacker.maxHitPoints) ? attacker.maxHitPoints : attacker.hitPoints + 0.3 * attacker.maxHitPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        /*
        @description: Called when the class is attacked by a fireMage. In this case, it restores fireMage's
        life
        @param FireMage
         */
        attacker.hitPoints = (attacker.hitPoints + 0.3 * attacker.maxHitPoints > attacker.maxHitPoints) ? attacker.maxHitPoints : attacker.hitPoints + 0.3 * attacker.maxHitPoints;
    }

    public void attackedByPriest(Priest attacker) {
        /*
        @description: Called when the class is attacked by a priest. In this case, it restores priest's
        life
        @param Priest
         */
        attacker.hitPoints = (attacker.hitPoints + 0.3 * attacker.maxHitPoints > attacker.maxHitPoints) ? attacker.maxHitPoints : attacker.hitPoints + 0.3 * attacker.maxHitPoints;
    }

    public void attackedByGoblin(Goblin attacker) {
        /*
        @description: Called when the class is attacked by a goblin. In this case, it restores goblin's
        life
        @param Goblin
         */
        attacker.hitPoints = (attacker.hitPoints + 0.15 * attacker.maxHitPoints > attacker.maxHitPoints) ? attacker.maxHitPoints : attacker.hitPoints + 0.15 * attacker.maxHitPoints;
    }

    public void attackedByUndead(Undead attacker) {
        /*
        @description: Called when the class is attacked by an undead. In this case, nothing happens.
        @param Undead
         */
        System.out.println("Nothing happens");
    }


    public void attackedByIceGolem(IceGolem attacker) {
        /*
        @description: Called when the class is attacked by an iceGolem. In this case, nothing happens.
        @param IceGolem
         */
        System.out.println("Nothing happens");
    }

}